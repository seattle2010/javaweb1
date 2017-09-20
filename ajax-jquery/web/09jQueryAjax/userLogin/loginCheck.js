// alert($);

$(function () {
$("#btn1").click(function () {
	var usernameText = $(":input[name = username]").val();
	var passwordText = $(":input[name = password]").val();
	console.info(usernameText, passwordText);

	$.post("/jQueryLoginCheckServlet",{username:usernameText,password:passwordText},function (data) {
		// contentType:"application/x-www-form-urlencoded";
		console.info(data);
		if(data.success){
			window.location.href = "/index.jsp";练习
		}else {
			$("#msg").text(data.msg);
		}
	},"json")
})
});

/*
document.getElementById("btn1").onclick = function () {
    // alert("1");
    var usernameText = document.getElementById("username").value;
    var passwordText = document.getElementById("password").value;
    //引入ajax请求
    var ajax = new XMLHttpRequest();
    ajax.open("post","/LoginCheckServlet",true)

    //设置请求头 要不然就会形成不了传递 key value形式 而是 username=tom&password=123
    // jsp中写  获得 <form action="" enctype="application/x-www-form-urlencoded"></form>
    ajax.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    ajax.onreadystatechange = function () {
        if(ajax.readyState == 4 && ajax.status == 200){
            window.location.href = "/index.jsp";
        }
    }
    ajax.send("username=" + usernameText + "&password=" + passwordText);
}*/
