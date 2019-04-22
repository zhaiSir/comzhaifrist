/*ajax请求
数据data数组方式*/

function deletexpert(expertId,expertName){
    if(confirm("确认取消")+expertName+"的专家资格？"){
        var param = {};
        param["expertId"] = expertId;
        param["operateType"] = "delExpert";
        $.ajax({
            type:'post',
            data:'params',
            async:false,
            url:'/gcbase/apps/purchase/jsp/dataprocess.jsp',
            success:function (data) {
                data = data.replace(/(^\s+)|(\s+$)/g,"");    //去掉前后空格
                if(data == '1'){
                    alert("删除成功");
                    goSearch();
                }
            }
        });
    }
}



/*checkBox处理*/
$("selectAll").click(function(){
    if(this.checked){
        $(".checkone").attr("check","checked");
    }else{
        $(".checkone").removeAttr("checked");
    }
});


//文件上传图片校验
var picType = ["jpg","png"];
$("uploadFile").change(function () {
    var file,img;
    if(file = this.file[0]){          //this.file[0]获得文件对象，不为空即true
        var fileName = file.name;
        var nameSpli = fileName.substring((fileName.lastIndexOf(".")+1),fileName.length);
        if(picType.indexOf(nameSpli) == -1){
            alert("只支持上传jpg、png格式文件");
            $("uploadFile").val();
            return;
        }else{
            img = new Image();
            _URL = window.URL || window.webkitURL;
            img.src = _URL.createObjectURL(file);
           // $("img").attr("src", window.URL.createObjectURL(files[0]));   与上一样
            img.onload = function(){
                limitImage(this.width,this.height,file.size);  //当前this是图片对象
            }
        }
    }
});