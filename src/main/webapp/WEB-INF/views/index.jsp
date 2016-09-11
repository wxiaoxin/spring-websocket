<%@ page contentType="text/html; utf-8" %>
<%
    request.setAttribute("path", request.getContextPath());
%>
<html>
<head>
    <meta charset="utf-8" />
    <title>Spring WebSocket测试</title>
</head>

<body>

<h2>Hello World!</h2>

<script type="text/javascript" src="${path}/resources/js/sockjs.js"></script>
<script type="text/javascript">

//    sockjs
    var url = "http://localhost:8080/spring-websocket/ws/macro";
    var sock = new SockJS(url);

    sock.onopen = function () {
        console.log("打开");
        sayMacro();
    };
    
    sock.onmessage = function (e) {
        console.log("接收：" + e.data);
        sayMacro();
    };

    sock.onclose = function () {
        console.log("关闭");
    };


//    spring websocket
//    var url = "ws://localhost:8080/spring-websocket/ws/macro";
//
//    if("WebSocket" in window) {
//        var sock = new WebSocket(url);
//
//        sock.onopen = function() {
//            console.log("打开")
//            sayMacro();
//        };
//
//        sock.onmessage = function (e) {
//            console.log("接收：" + e.data);
//            setTimeout(function(){
//                sayMacro()
//            }, 2000);
//        };
//
//        sock.onclose = function() {
//            console.log("关闭");
//        };

        function sayMacro() {
            console.log("Sending Marcro!");
            sock.send("Marcro!");
        }

//    }

</script>


</body>
</html>
