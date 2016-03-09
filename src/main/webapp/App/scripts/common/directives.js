'use strict';
(function () {
    var app = angular.module('MyDirectives', []);

    app.directive('dateFormat', ['$filter', function ($filter) {
        var dateFilter = $filter('formatDate');
        return {
            require: '?ngModel',
            link: function (scope, elm, attrs, ctrl) {
                function formatter(value) {
                    return dateFilter(value); //format
                }

                function parser() {
                    return ctrl.$modelValue;
                }

                ctrl.$formatters.push(formatter);
                ctrl.$parsers.unshift(parser);
            }
        };
    }]);

})();