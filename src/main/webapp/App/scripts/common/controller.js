(function () {
    // 注意JS的绑定顺序，第一组绑定的文件可以用angular.module('MyControllers', []);，后续的文件只能用angular.module('MyControllers')
    var controller = angular.module('MyControllers', []);

    controller.controller('confirmmModal', ['$scope', '$modalInstance', 'items', function ($scope, $modalInstance, items) {
        var methods = {
            ok: function () {
                $modalInstance.close(true);
            },
            cancel: function () {
                $modalInstance.dismiss('cancel');
            },
            text: items
        };
        $.extend($scope, methods);
    }]);

    controller.controller('errorModal', ['$scope', '$modalInstance', 'error', function ($scope, $modalInstance, error) {
        var methods = {
            cancel: function () {
                $modalInstance.dismiss('cancel');
            },
            report: function () {
                $modalInstance.close(true);
            }
        };
        angular.extend($scope, methods, error);
    }]);

})()
