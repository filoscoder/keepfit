<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TEST | comment</title>
</head>
<body>

	<hr />	<hr />	<hr />
	
	<c:set var="commentStatus" value="${commentStatus}" />
	<c:choose>
		<c:when test="${commentStatus eq 'insert1'}">
			<h2>[ 회원정보 ]</h2>
			<table>
			<tr>
				<td colspan="2">POST NUMBER: ${commentList.post_id}</td>
				</tr>
				<tr>
					<th>WRITER</th>
					<th>CONTENT</th>
				</tr>
				<c:forEach items="${commentList}">
					<tr>
						<td>${commentList.comment_writer}</td>
						<td>${commentList.comment_content}</td>
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:when test="${commentStatus eq 'insert0'}">
			<h1 align="center">댓글이 없습니다 ㅜㅜ</h1>
		</c:when>
		<c:otherwise>
        댓글이 없습니다 ㅜㅜ
    </c:otherwise>
	</c:choose>

	<hr />	<hr />	<hr />

</body>
</html>