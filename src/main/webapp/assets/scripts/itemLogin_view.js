/**
 * 登录页
 * @param  {[type]} $) {                           String.prototype.fmt [description]
 * @return {[type]}    [description]
 */
$(function () {
    $(document).ready(function () {
        $('.items-login').height($(window).height());
    });
    $("body").keydown(function () {
        if (event.keyCode == "13") {//keyCode=13是回车键
            $("#loginBtn").click();
        }
    });
});
