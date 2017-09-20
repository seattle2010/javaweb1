$(function () {
	//添加用户
	$("#btn_submit").click(function () {
		var username = $("input[name = username]").val();
		var email = $("input[name = email]").val();
		var tel = $("input[name = tel]").val();
		var id = new Date().getTime();

		var tr = "<tr id="+id+">\n" +
			"<td>" + username + "</td>\n" +
			"<td>" + email + "</td>\n" +
			"<td>" + tel + "</td>\n" +
			"<td><a href='javascript:deleteUser("+id+")'>删除</a></td>\n" +
			"</tr>";

		$("#userTbody").append(tr);
	});

	//删除所有
	$("#btn_removeAll").click(function () {
		$("#userTbody").remove();
	});
});

function deleteUser(id) {
	// console.info(id);
	$("#" + id).remove();
}





/*//添加操作
document.getElementById("btn_submit").onclick = function () {
    //获取文本框对象
    var usernameText = document.getElementById("username").value;
    var emailText = document.getElementById("email").value;
    var telText = document.getElementById("tel").value;
    // console.log(usernameText, emailText, telText);

    //创建tr td 并且设置内容 建立上下级关系
// <tr>
//     <td>貂蝉</td>
//     <td>123@163.com</td>
//     <td>12345</td>
//     <td><a href="#">删除</a></td>
//     </tr>
var trEL = document.createElement("tr");
var usernameTd = document.createElement("td");
var emailTd = document.createElement("td");
var telTd = document.createElement("td");
    trEL.appendChild(usernameTd);
    trEL.appendChild(emailTd);
    trEL.appendChild(telTd);

    var id = new Date().getTime();
    trEL.id = id;

var delTd = document.createElement("td");
    trEL.appendChild(delTd);

    document.getElementById("userTbody").appendChild(trEL);

    usernameTd.innerHTML = usernameText;
    emailTd.innerHTML = emailText;
    telTd.innerHTML = telText;


    delTd.innerHTML = "<a href='javascript:deleteUser("+id+");'>删除</a>";

}

//删除所有
document.getElementById("btn_removeAll").onclick = function () {
    document.getElementById("userTbody").innerHTML = "";
}
//删除单个
function deleteUser(id) {
    // alert(id);
    var current = document.getElementById(id);
    current.parentNode.removeChild(current);
}*/
