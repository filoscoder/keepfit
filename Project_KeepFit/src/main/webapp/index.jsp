<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<title>Home | Keep Fit</title>
</head>
<body>
	<h3>
		Let's Keep Fit!
		</h1>
		<h5>just be you
	</h3>

	<hr />
	<hr />

	<h1 align="center">TEST : 로그인</h1>
	<form action="login.do" method="get">
		<ul>
			<li>이메일 <input type="text" name="member_email">
			<li>비밀번호 <input type="text" name="member_pass">
			<li><input type="submit" value="TEST : login">
		</ul>
	</form>

	<hr />
	<hr />
	<h1 align="center">TEST : 회원가입</h1>
	<form action="signup.do">
		<ul>
			<li>회원 번호 <input type="text" name="member_id">
			<li>이메일 <input type="text" name="member_email">
			<li>비밀번호 <input type="text" name="member_pass">
			<li>NICKNAME <input type="text" name="member_nick">
			<li><input type="submit" value="TEST : signup">
		</ul>
	</form>
	<hr />
	<hr />

	<h1 align="center">TEST : 댓글</h1>
	<form action="insertComment.do" method="get">
		<ul>
			<li>게시물 번호 <input type="text" name="post_id">
			<li>댓글 번호 <input type="text" name="comment_id">
			<li>작성자 <input type="text" name="comment_writer">
			<li>댓글 <input type="text" name="comment_content">
			<li><input type="submit" value="TEST : 댓글작성">
		</ul>
	</form>
	<hr />
	
	<div>
		<a href="getCommentList.do">TEST : 댓글 모두 조회</a>
	</div>
	<hr />	<hr />
	
	<div>
		<a href="newPost.jsp">TEST : 새 게시물 작성</a>
	</div>
	<hr />	<hr />

</body>
</html>
