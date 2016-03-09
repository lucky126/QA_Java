(function () {
    var app = angular.module('App', ['ngRoute', 'ui.bootstrap', 'MyControllers', 'MyServices', 'MyFilters', 'MyDirectives', 'MyInterceptors']);

    app.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {
        //路由配置
        var route = $routeProvider;
        route.when('/', { redirectTo: '/examSite/info' });

        // home
        route.when('/manager/list', { templateUrl: 'manager-list' });


        // route.when('/demo/list', { controller: 'demos', templateUrl: 'demo-list' });
        route.otherwise({ templateUrl: 'utils-404' });

        // 注册全局拦截器
        $httpProvider.interceptors.push('myInterceptor');
    }]);
})();
