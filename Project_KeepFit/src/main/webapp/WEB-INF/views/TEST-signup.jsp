<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<form action="signup.do">

<input type="hidden" name="member_email" value=request.getParameter('email')>
<input type="hidden" name="member_pass" value=request.getParameter(pass)>
<ul>
<li>nickname: <input type="text" name="member_nick">
<li>present weight :<input type="text" name="now_weight">
<li>goal weight :<input type="text" name="goal_weight">
<li>sport1 :<input type="text" name="sport1">
<li>sport2 :<input type="text" name="sport2">
<li>sport3 :<input type="text" name="sport3">

<li><input type="submit" value="TEST : signup" >
</ul>
</form>

</body>
</html>