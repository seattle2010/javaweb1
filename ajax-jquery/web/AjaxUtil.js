function ajax(url,fnSuccess,fnFail) {
    var httpRequest = new XMLHttpRequest();

    httpRequest.open("GET",url, true);

    httpRequest.send();
    httpRequest.onreadystatechange = function () {
        if(httpRequest.readyState == 4){
            if(httpRequest.status == 200){
                fnSuccess(httpRequest.responseText);
            }else {
                if(fnFail){
                    fnFail();
                }
            }
        }
    }
}