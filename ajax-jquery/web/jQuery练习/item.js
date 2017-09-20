$(function(){
    $("#addMoreItem").click(function () {
	    var copy = $("#productTbody tr:first").clone();
	    copy.appendTo($("#productTbody"));
    })
})