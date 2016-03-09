/**
 * 在线考试
 * @param  {[type]} $                         
 */
$(function () {
    //绑定菜单事件
    $('.left-menu-hed').click(function () {
        initmenu();
        $(this).siblings("div.list-group").hide();
        $(this).next("div.list-group").show();
        $(this).find('span').addClass('span-selected');
        if ($(this).attr("data-value") == 0) {
            $(this).find('img').attr('src', 'asset/images/itemsbank/1.png');
        } else if ($(this).attr("data-value") == 1) {
            $(this).find('img').attr('src', 'asset/images/itemsbank/2.png');
        } else if ($(this).attr("data-value") == 2) {
            $(this).find('img').attr('src', "asset/images/itemsbank/3.png");
        } else if ($(this).attr("data-value") == 3) {
            $(this).find('img').attr('src', 'asset/images/itemsbank/4.png');
        }
    });
    //绑定菜单下的a标签事件
    $('.list-group').delegate('a', 'click', function () {
        $('.list-group-item').removeClass('selected');
        $(this).addClass('selected');
    });
    //菜单属性初始化
    function initmenu() {
        $('.left-menu-hed').eq(0).find('img').attr('src', 'asset/images/itemsbank/1-1.png');
        $('.left-menu-hed').eq(1).find('img').attr('src', 'asset/images/itemsbank/2-2.png');
        $('.left-menu-hed').eq(2).find('img').attr('src', 'asset/images/itemsbank/3-3.png');
        $('.left-menu-hed').eq(3).find('img').attr('src', 'asset/images/itemsbank/4-4.png');
        $('.left-menu-hed').find('span').removeClass('span-selected');
    }
});