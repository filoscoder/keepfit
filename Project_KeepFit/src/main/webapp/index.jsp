<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>Home | Keep Fit</title>
</head>
<body>
<h1>
	Let's Keep Fit!  
</h1>
<h3> just be you</h3>

<hr/><hr/><hr/>

<h1 align="center">TEST : 로그인</h1>
<form action="login.do" method="get">
<ul>
<li>이메일 <input type="text" name="member_email">
<li>비밀번호  <input type="text" name="member_pass">

<li><input type="submit" value="TEST : login">
</ul>
</form>

<hr/><hr/><hr/>

<form action="signup.fit">
<ul>
<li>회원 번호 <input type="text" name="member_id">
<li>이메일 <input type="text" name="member_email">
<li>비밀번호  <input type="text" name="member_pass">
<li>NICKNAME  <input type="text" name="member_nick">

<li><input type="submit" value="TEST : signup">
</ul>
</form>
<hr/><hr/><hr/>

<h1 align="center">TEST : 댓글</h1>
<a href="comment.do">TEST : 댓글</a>



</body>
</html>
