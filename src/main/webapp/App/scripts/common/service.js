(function () {
    var service = angular.module('MyServices', []);

    service.factory('utils', ['$http', '$modal', function ($http, $modal) {
        var data = [];

        var methods = {
            // 注册一个confirm弹出框
            confirm: function (text) {
                return $modal.open({
                    templateUrl: 'app/views/utils/confirmModal.html',
                    backdrop: 'static',
                    controller: 'confirmmModal',
                    resolve: {
                        items: function () {
                            return text;
                        }
                    }
                });
            },

            // 注册一个提示框
            notify: function (content, type) {
                $.notify(content, { type: type, delay: 1000, z_index: 1000000, placement: { from: 'top', align: 'center' } });
            },

            // 注册删除功能通用的确认框
            remove: function (list, item, fn) {
                angular.forEach(list, function (i, v) {
                    if (fn ? (fn(i, item)) : (i.$$hashKey === item.$$hashKey)) {
                        list.splice(v, 1);
                        return false;
                    }
                    return true;
                });
            },

            inArray: function (val, array, fn) {
                var has = false;
                angular.forEach(array, function (v) {
                    if (fn && fn(val, v) || val === v) {
                        has = true;
                        return false;
                    }
                    return true;
                });
                return has;
            },

            // 将时间戳加一秒
            addSecond: function (timeStamp) {
                var second = timeStamp.replace('/Date(', '').replace(')/', '');
                return '/Date(' + (parseInt(second) + 1000) + ')/';
            },

            getData: function (key) {
                return data[key];
            },
            setData: function (newData) {
                $.extend(true, data, newData);
            },
            encrypt: function (parameter) {
                return $http.post('Manager/Utils/Encrypt/', { str: parameter });
            },
            decrypt: function (parameter) {
                return $http.post('Manager/Utils/Decrypt/', { str: parameter });
            },

            // yyyy-MM-dd HH:mm
            formatDate: function (timestamp) {
                timestamp = timestamp.replace('/Date(', '').replace(')/', '');
                timestamp = timestamp.length == 10 ? parseInt(timestamp) * 1000 : parseInt(timestamp);

                var now = new Date(timestamp);

                return now.getFullYear()
                    + '-'
                    + (now.getMonth() + 1)
                    + '-'
                    + now.getDate()
                    + ' '
                    + now.getHours()
                    + ':'
                    + now.getMinutes();
            },

            // 获取系统时间
            getServiceTime: function () {
                return $http.post('Manager/Utils/GetTime');
            }
        };

        return methods;
    }]);
})();
