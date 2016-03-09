(function () {
    var service = angular.module('MyInterceptors', []);

    service.factory('myInterceptor', ['$q', function ($q) {
        var methods = {
            // 拦截请求
            //request: function () {
            //    var deferred = $q.defer();
            //    someAsyncService.doAsyncOperation().then(function () {
            //        // Asynchronous operation succeeded, modify config accordingly
            //        // ...
            //        deferred.resolve(config);
            //    }, function () {
            //        // Asynchronous operation failed, modify config accordingly
            //        // ...
            //        deferred.resolve(config);
            //    });
            //     return deferred.promise;
            //},
            // 拦截响应
            //response: function () {
            //    var deferred = $q.defer();
            //    someAsyncService.doAsyncOperation().then(function () {
            //        // Asynchronous operation succeeded, modify response accordingly
            //        // ...
            //        deferred.resolve(response);
            //    }, function () {
            //        // Asynchronous operation failed, modify response accordingly
            //        // ...
            //        deferred.resolve(response);
            //    });
            //    return deferred.promise;
            //},
            // 拦截请求异常
            //requestError: function (response) {
                
            //},
            // 拦截响应异常
            responseError: function (response) {
                if (response.status == 401) {
                    window.location.href = 'AdminLogin';
                } else if (response.status === 404) {

                }
            }
        };

        return methods;
    }]);
})();
