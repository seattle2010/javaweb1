	document.getElementById("btn1").onclick = function () {
		// alert(this);
		//创建一个ajax对象
		var ajax = new XMLHttpRequest();
		//ajax的open方法 相当于启动ajax请求
		var url = "/fromTimeServlet";
		ajax.open("get", url, true);
		ajax.send();
		//取得回调函数
		ajax.onreadystatechange = function () {
			if(ajax.readyState == 4 && ajax.status == 200) {
				document.getElementById("span1").innerHTML = ajax.responseText;
			}else {
			document.getElementById("span1").innerHTML = "系统维护中";
			}
		}


	}
