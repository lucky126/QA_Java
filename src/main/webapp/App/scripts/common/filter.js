(function () {
    var app = angular.module('MyFilters', []);

    // 时间过滤器：YYYY-MM-DD HH:mm:ss
    app.filter('formatDate', function () {
        return function (m) {
            var inputDate = new Date(moment(m));
            return moment(inputDate).format('YYYY-MM-DD HH:mm:ss');
        };
    });

    // 时间过滤器：YYYY-MM-DD HH:mm
    app.filter('formatDateNoSs', function () {
        return function (m) {
            var inputDate = new Date(moment(m));
            return moment(inputDate).format('YYYY-MM-DD HH:mm');
        };
    });

    // 时间过滤器：第一行为日期，第二行为时间; 需要使用ng-bind-html指令
    app.filter('formatLineDate', ['$sce', function ($sce) {
        return function (m) {
            var inputDate = new Date(moment(m)),
                date = moment(inputDate).format('YYYY-MM-DD'),
                time = moment(inputDate).format('HH:mm');

            return $sce.trustAsHtml(date + '<br />' + time);
        };
    }]);

    // 数组过滤器：过滤掉从首条开始的N条数据
    app.filter('formatUnFirst', function () {
        return function (items, number) {
            var res = [];
            for (var i = number; i < items.length; i++) {
                res.push(items[i]);
            }
            return res;
        }
    });

    // 秒钟过滤器：X分X秒
    app.filter('formatSecond', function () {
        return function (m) {
            return m / 60 == 0
                ? Math.floor(m % 60) + '秒'
                : Math.floor(m / 60) + '分' + Math.floor(m % 60) + '秒';
        };
    });

    // 过长字符串处理：加...
    app.filter('formatLongStr', function () {
        return function (m) {
            return m.length > 10
                ? m.substr(0, 9) + '...'
                : m;
        };
    });
})();