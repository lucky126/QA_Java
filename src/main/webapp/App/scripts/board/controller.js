(function () {
    var myApp = angular.module('MyControllers');

    // 配置所需控制器
    myApp.controller('loginController', ['$scope', '$http', '$modal', 'configService', 'utils', function ($scope, $http, $modal, service, utils) {
        var srv = service.loginSrv;

        $scope.login = function () {
            if ($('form#loginForm').valid()) {

                $scope.loadingState = true;
                srv.login($scope.username, $scope.password).success(function (data) {
                    $scope.loadingState = false;

                    if (data.ResultType == ResultType.Success) {
                        if (data.isHaveCurApp) {
                            //utils.notify('登录成功，等待跳转！', 'success');
                            window.location.href = 'AdminHome';
                        } else {
                            $scope.siteId = data.siteId;

                            utils.notify('没有获取到当前主办方！', 'warning');
                            // 没有当前主办方弹出设置界面
                            $scope.curAppConfig();
                        }
                    } else {
                        utils.notify('考点代码或者考点密码错误！', 'warning');
                    }
                });
            }
        }

        $scope.examSiteConfig = function () {
            $modal.open({
                templateUrl: 'app/views/Config/ExamSiteConfig.html',
                controller: 'configSteps',
                backdrop: 'static',
                keyboard: false,
                resolve: {
                    params: function () {
                        return 0;
                    }
                }
            });
        };

        $scope.curAppConfig = function () {
            $modal.open({
                templateUrl: 'app/views/Config/CurAppConfig.html',
                controller: 'curAppConfig',
                backdrop: 'static',
                keyboard: false,
                resolve: {
                    params: function () {
                        return $scope.siteId;
                    }
                }
            });
        };

        $scope.$root.$on('login', function (event, data) {
            if (data) {
                if (data.code) {
                    $scope.username = data.code;
                    $('#username').val(data.code);
                }
                if (data.pwd) {
                    $scope.password = data.pwd;
                    $('#password').val(data.pwd);
                }
            }

            $scope.login();
        });
    }]);

    // 配置考点控制器
    myApp.controller('configSteps', ['$scope', '$routeParams', '$modalInstance', 'configService', 'utils', 'params', '$filter', function ($scope, $routeParams, $modalInstance, service, utils, params, $filter) {
        var srv = service.configSrv;

        var methods = {
            connectTest: function () {
                if ($('form#configForm #ServerUrl').valid()) {
                    $scope.loadingState = true;

                    var countdown = 5;
                    $scope.linkText = countdown + '...';

                    var interval = window.setInterval(function () {
                        $scope.$apply($scope.linkText = --countdown + '...');

                        if (countdown === 0) {
                            window.clearInterval(interval);
                            utils.notify('连接失败，请检查服务器地址！', 'warning');
                            $scope.$apply($scope.linkText = '测试连接');
                            $scope.$apply($scope.loadingState = false);
                            return;
                        }
                    }, 1000);

                    srv.connectTest($scope.serverUrl).success(function (data) {
                        window.clearInterval(interval);

                        if (data) {
                            $scope.connSuccess = true;
                            $scope.linkText = '';
                        } else {
                            utils.notify('连接失败，请检查服务器地址！', 'warning');
                            $scope.linkText = '测试连接';
                        }
                        $scope.loadingState = false;
                    });
                }
            },
            resetTest: function () {
                $scope.linkText = '测试连接';
                $scope.connSuccess = false;
            },
            save: function () {
                // 第一步提交
                if ($scope.firstStep) {
                    if ($('form#configForm #ServerUrl').valid()) {
                        $scope.loadingState = true;

                        var countdown = 5;
                        $scope.linkText = countdown + '...';
                        var interval = window.setInterval(function () {
                            $scope.linkText = --countdown + '...';

                            if (countdown === 0) {
                                window.clearInterval(interval);
                                utils.notify('连接失败，请检查服务器地址！', 'warning');
                                $scope.linkText = '测试连接';
                                $scope.loadingState = false;
                                return;
                            }
                        }, 1000);

                        srv.connectTest($scope.serverUrl).success(function (data) {
                            window.clearInterval(interval);

                            if (data) {
                                $scope.connSuccess = true;
                                $scope.linkText = '';

                                if ($('form#configForm').valid()) {
                                    srv.verification($scope.serverUrl, $scope.validateCode).success(function (data) {
                                        if (data.ResultType == ResultType.Success) {
                                            $scope.app = data.app;
                                            $scope.site = data.site;

                                            $scope.firstStep = false;
                                            $scope.firstForm = false;

                                            $scope.submitText = '完成';
                                        } else {
                                            utils.notify(data.Message, 'warning');
                                        }

                                        $scope.loadingState = false;
                                    });
                                }
                            } else {
                                utils.notify('连接失败，请检查服务器地址！', 'warning');
                                $scope.linkText = '测试连接';
                            }
                            $scope.loadingState = false;
                        });
                    }
                }

                    // 第二步提交
                else {
                    if ($('form#setPwdForm').valid()) {
                        $scope.loadingState = true;

                        srv.setExamSite($scope.app, $scope.site).success(function (data) {
                            if (data.ResultType == ResultType.Success) {
                                $scope.close();

                                $scope.$emit('login', { code: $scope.site.ExamSiteCode, pwd: $scope.site.SitePwd });
                            } else {
                                utils.notify(data.Message, 'warning');
                            }

                            $scope.loadingState = false;
                        });
                    }
                }
            },
            close: function () {
                $modalInstance.close(true);
            }
        };
        angular.extend($scope, methods);
    }]);

    // 设置当前主办方控制器
    myApp.controller('curAppConfig', ['$scope', '$routeParams', '$modalInstance', 'configService', 'utils', 'params', '$filter', function ($scope, $routeParams, $modalInstance, service, utils, params, $filter) {
        var srv = service.setCurSrv, siteId = params;

        var methods = {
            init: function () {
                srv.getAppList(siteId).success(function (data) {
                    data.unshift({ AppID: 0, AppName: '请选择一个主办方' });

                    $scope.list = data;
                    $scope.curApp = data[0];
                });
            },
            save: function () {
                $scope.loadingState = true;

                var id = $scope.curApp.AppID;
                if (!id) {
                    utils.notify('请选择一个主办方！', 'warning');
                } else {
                    srv.setCurApp(id).success(function (data) {
                        if (data.ResultType == ResultType.Success) {
                            $scope.close();
                            utils.notify('成功设置主办方！', 'success');

                            $scope.$emit('login');
                        } else {
                            utils.notify(data.Message, 'warning');
                        }
                    });
                }
                $scope.loadingState = false;
            },
            close: function () {
                $modalInstance.close(true);
            }
        };
        angular.extend($scope, methods);

        $scope.init();
    }]);
})();