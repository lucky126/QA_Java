(function () {
    var app = angular.module('ManageApp', ['ngRoute', 'ui.bootstrap', 'MyControllers', 'MyServices', 'MyFilters', 'MyDirectives', 'MyInterceptors']);

    app.config(['$routeProvider', '$httpProvider', function ($routeProvider, $httpProvider) {
        //路由配置
        var route = $routeProvider;
        route.when('/', { redirectTo: '/examSite/info' });

        // home
        route.when('/manager/list', { templateUrl: 'manager-list' });

        // examSite
        route.when('/examSite/info', { controller: 'siteController', templateUrl: 'examSite-info' });

        // examPlan
        route.when('/examPlan/list', { controller: 'planController', templateUrl: 'examPlan-list' });
        route.when('/examPlan/detail', { controller: 'planDetailController', templateUrl: 'examPlan-detail' });

        // examRoom
        route.when('/examRoom/list/:id/:name', { controller: 'roomController', templateUrl: 'examroom-list' });
        route.when('/examRoom/setting/:id/:roomName/:planId/:planName', { controller: 'roomSetingController', templateUrl: 'examRoom-setingRoom' });

        // examMonitor
        route.when('/examMonitor/planList', { controller: 'monitorController', templateUrl: 'exammonitor-planList' });
        route.when('/examMonitor/detail', { controller: 'monitorDetailController', templateUrl: 'exammonitor-detail' });

        // examReport
        route.when('/examReport/planList', { controller: 'reportPlanController', templateUrl: 'examReport-planList' });
        route.when('/examReport/tradExamList', { controller: 'reportTradExamController', templateUrl: 'examReport-tradExamList' });
        route.when('/examReport/freeExamList', { controller: 'reportFreeExamController', templateUrl: 'examReport-freeExamList' });
        route.when('/examReport/freeExamGenerated', { controller: 'reportFreeExamGeneratedController', templateUrl: 'examReport-freeExamGenerated' });

        // unExpected
        route.when('/unExpected/planList', { controller: 'unExpectedController', templateUrl: 'unExpected-planList' });
        route.when('/unExpected/control', { controller: 'unExpectedControlController', templateUrl: 'unExpected-control' });

        // process
        route.when('/process/planList', { controller: 'processController', templateUrl: 'process-planList' });

        // photo
        route.when('/photo/planList', { controller: 'photoPlanController', templateUrl: 'photo-planlist' });
        route.when('/photo/list', { controller: 'photoController', templateUrl: 'photo-list' });

        // Randomtestlist
        route.when('/Randomtestlist/Randomtestlist', { controller: 'ExamineeService', templateUrl: 'Randomtestlist-Randomtestlist' });

        // SignIn
        route.when('/signIn/planList', { controller: 'signInPlanController', templateUrl: 'signIn-planList' });
        route.when('/signIn/list', { controller: 'signInController', templateUrl: 'signIn-list' });

        // route.when('/demo/list', { controller: 'demos', templateUrl: 'demo-list' });
        route.otherwise({ templateUrl: 'utils-404' });

        // 注册全局拦截器
        $httpProvider.interceptors.push('myInterceptor');
    }]);
})();
