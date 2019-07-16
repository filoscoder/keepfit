<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>POST | Keep Fit</title>
</head>
<body>

	<hr />
	<hr />

	<h1 align="center">TEST : 새 게시물</h1>
	<form action="insertPost.do" method="get">
		<ul>
			<li>작성자<input type="text" name="post_writer">
<!-- 			<li>날짜 선택<input type="date" name="selected_date"> -->
			<li>상태 선택
			<select name="post_mood">
					<option selected value="Happy">Happy</option>
					<option value="Passionate">Passionate</option>
					<option value="Excited">Excited!</option>
			</select>
			<li>운돟 선택
			<select name="sport_name">
					<option selected value="축구">축구</option>
					<option value="풋살">풋살</option>
					<option value="조기축구">조기축구</option>
			</select>
			<li>위치 선택<input type="button" name="selectLocation" value="찾기">
			<li>Privacy<input type="range" min="0" max="1" name="privacy">
			<li>내용<input type="text" name="content">
			
			<li><input type="submit" value="TEST : post">
		</ul>
	</form>


	<hr />
	<hr />


</body>
</html>