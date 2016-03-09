'use strict';
(function () {
    // 注意JS的绑定顺序，第一组绑定的文件可以用angular.module('MyControllers', []);，后续的文件只能用angular.module('MyControllers')
    var service = angular.module('MyServices');

    service.factory('configService', ['$http', function (http) {
        var methods = {
            loginSrv: {
                // 登录
                login: function (username, password) {
                    return http.post('Manager/Login/Login/', { username: username, password: password });
                }
            },

            configSrv: {
                // 测试连接
                connectTest: function (url) {
                    return http.post('Manager/Login/ConnectTest/', { serverUrl: url });
                },
                // 验证网考服务器的Url及Code
                verification: function (url, code) {
                    return http.post('Manager/Login/Verification/', { serverUrl: url, validateCode: code });
                },
                // 设置考点信息
                setExamSite: function (app, site) {
                    return http.post('Manager/Login/SetExamSite/', { app: app, site: site });
                },
                // 修改考点密码
                updatePwd: function (site) {
                    return http.post('Manager/Login/UpdatePwd/', site);
                }
            },

            setCurSrv: {
                // 获取网考服务器列表
                getAppList: function (siteId) {
                    return http.post('Manager/Login/GetAppList/', { siteId: siteId });
                },
                // 设置当前网考主办方
                setCurApp: function (appId) {
                    return http.post('Manager/Login/SetCurApp/', { appId: appId });
                }
            }
        };
        return methods;
    }]);
})();