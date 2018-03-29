<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ID 검사</title>
<script type="text/javascript">
	function work_close(){
		//id의 값을 가져오기
		var userid = document.getElementById("id").value;
		opener.document.getElementById("userid").value = userid;
		opener.document.getElementById("isIdCheck").value = true;
		self.close();
	}
</script>
</head>
<body>
<%
	String id = request.getParameter("id");
%>
ID check
<form action="" method="post">
	아이디<input type="text" name="id" value="<%=id%>" id="id">
	<input type="submit" value="아이디확인">
	<!-- 
		search_id.jsp로 연결하여
		user만 사용가능하고 admin은 사용불가능하도록 결정한 후
		사용여부를 id_check.jsp에 전달하여 참고하도록 한다.
	 -->
	<button onclick="work_close()">아이디사용하기</button>
</form>
</body>
</html>