<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>TEST-login</title>
</head>
<body>


<hr/><hr/><hr/><hr/>

<c:set var="logged" value="${logged}" />

<c:choose>
    <c:when test="${logged eq '1'}">
        <h1 align="center"> ${member.member_email} 님 : 로그인 TEST 성공!! </h1>
    </c:when>

    <c:when test="${logged eq '0'}">
         <h1 align="center"> ${member.member_email} 님 : email 또는 pw 가 일치하지 않습니다.. </h1>
    </c:when>
    <c:otherwise>
        사람이 없습니다 ㅜㅜ
    </c:otherwise>
</c:choose>





<hr/><hr/><hr/><hr/>

</body>
</html>