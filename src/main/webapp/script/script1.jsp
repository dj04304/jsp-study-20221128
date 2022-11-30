<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
String[] name = new String[5];
String[] email = new String[5];

String madeName(String name) {
	return name + "님";
}

String madeEmail(String email) {
	return email + "@google.com";
}
%>

<%
	name[0] = "홍길동1";
	email[0] = "aaaa";
	name[1] = "홍길동2";
	email[1] = "bbbb";
	name[2] = "홍길동3";
	email[2] = "cccc";
	name[3] = "홍길동4";
	email[3] = "dddd";
	name[4] = "홍길동5";
	email[4] = "eeee";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	<table>
		<thead>
		 <tr>
		 	<th>번호</th>
		 	<th>이름</th>
		 	<th>이메일</th>
		 </tr>
		</thead>
		<tbody>
		<%
			for(int i = 0; i < name.length; i++) {
		%>
			<tr>			
				<td><%=i + 1 %></td>
				<td><%= madeName(name[i]) %></td>
				<td><%= madeEmail(email[i]) %></td>				
			</tr>
		<%
			}
		%>
		</tbody>
	</table>

</body>
</html>