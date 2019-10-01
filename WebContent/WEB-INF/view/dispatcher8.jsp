<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="com.myCompany.web.dto.Counter"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>dispatcher8.jsp</h4>
	
	
	
	<!-- How1 --> <!-- 받았찌만 렌더링 하지마라 -->
	<%-- How1 --%> <!-- 아예 클라이언트로 보내지 않음 --> 
	<%Counter applicationCounter = (Counter)application.getAttribute("applicationCounter"); %>
	applicationCounter : <%=applicationCounter.getValue() %> <br/>
	
	<%Counter sessionCounter = (Counter)session.getAttribute("sessionCounter"); %>
	sessionCounter : <%=sessionCounter.getValue() %> <br/>
	
	<%Counter requestCounter = (Counter)request.getAttribute("requestCounter"); %>
	requestCounter : <%=requestCounter.getValue() %> <br/><br/>
	
	<%-- How2(Expression Language) --%>
	applicationCounter :  ${applicationCounter.value} <br/>
	sessionCounter :  ${sessionCounter.value} <br/>
	requestCounter :  ${requestCounter.value} <br/><br/>
	<%-- EL이기 때문에 필드로 접근하지 못한다(즉 필드가 아니다), value = getValue()랑 같은 의미임 , setValue, getValue가 있어야 이게 됨--%>
	<%-- request -> session -> application으로 올라가면서 키를 찾아라--%>
	
	
</body>
</html>
