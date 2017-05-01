<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<head>
<title>FirstSpringMVC</title>
</head>
<body>
	<c:forEach items="${list}" var="user" varStatus="vs">
		<tr>
			<td><s:property value="#vs.index+1" /></td>
			<td align="center">${user}</td>
		</tr>
		<br>
	</c:forEach>
</body>
</html>