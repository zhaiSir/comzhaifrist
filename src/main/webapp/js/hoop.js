//Html元素点击事件触发后，再禁用点击事件
$("#id").click(function(){

    $("#id").css({"pointer-events":"none"});

}); 

//判断是否只选中了一个，如果只有一个就赋给对象
function isOnlyOne(){
    var selectArr = [];
    $(".user-checkbox").each(function(index,ele){//index当前行 从0 开始
        if($(this).is(":checked")){
            selectArr.push(index);     //循环列表，选中的加入到数组
        }
    });
}
