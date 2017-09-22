var ajax = new XMLHttpRequest();
ajax.open("get", "/LinkAjaxServlet", true);
ajax.onreadystatechange = function () {
	if(ajax.readyState == 4 && ajax.status == 200){
		console.info(ajax.responseText);
		                                     // !!!              +=
		document.getElementById("provinceSelectId").innerHTML += ajax.responseText;
	}
}
ajax.send();
// ======================================
document.getElementById("provinceSelectId").onchange = function () {
	var pid = this.value;
	// alert(pid);
	var ajax = new XMLHttpRequest();
	ajax.open("get", "/LinkAjaxCityServlet?pid="+pid, true);
	ajax.onreadystatechange = function () {
		if(ajax.readyState == 4 && ajax.status == 200){
			console.info(ajax.responseText);
			document.getElementById("citySelectId").innerHTML = ajax.responseText;
		}
	}
	ajax.send();
}