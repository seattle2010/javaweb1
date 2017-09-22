var provinceSelect = document.getElementById("provinceSelectId");
var ajax = new XMLHttpRequest();
ajax.open("get", "/JSONLinkAjaxServlet", true);
ajax.onreadystatechange = function () {
	if(ajax.readyState == 4 && ajax.status == 200){
		//接受服务端响应的json字符串
		console.info(ajax.responseText);
		var jsonStr = ajax.responseText;
		//把json字符串转换成json对象
		var jsonArray = eval("(" + jsonStr + ")");
		console.info(jsonArray);
		//每一个json对象对应一个<option>元素
		for(var index in jsonArray){
		    console.debug(jsonArray[index]);
			var jsonObject = jsonArray[index];
			var optionEL = document.createElement("option");
			optionEL.value = jsonObject.id;
			optionEL.innerHTML = jsonObject.name;
			provinceSelect.appendChild(optionEL);
		}
	}
}
ajax.send();
// ======================================
provinceSelect.onchange = function () {
	var pid = this.value;
	// alert(pid);
	var ajax = new XMLHttpRequest();
	ajax.open("get", "/JSONLinkAjaxCityServlet?pid="+pid, true);
	ajax.onreadystatechange = function () {
		if(ajax.readyState == 4 && ajax.status == 200){
			//接受服务端响应的json字符串
			console.info(ajax.responseText);
			var jsonStr = ajax.responseText;
			//把json字符串转换成json对象
			var jsonArray = eval("(" + jsonStr + ")");
			console.info(jsonArray);
			//每一个json对象对应一个<option>元素
			for(var index in jsonArray){
				console.debug(jsonArray[index]);
				var jsonObject = jsonArray[index];
				var optionEL = document.createElement("option");
				optionEL.value = jsonObject.id;
				optionEL.innerHTML = jsonObject.name;
				document.getElementById("citySelectId").appendChild(optionEL);
			}
		}
	}
	ajax.send();
}