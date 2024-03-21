<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>

</head>
<body>

<c:forEach items="${employees}" var="employee">
    ${employee.id} - ${employee.name} - ${employee.year} - ${employee.salary}
</c:forEach>
</body>
</html>