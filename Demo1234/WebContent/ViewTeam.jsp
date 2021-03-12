<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import ="java.util.*,com.ltts.model.*,com.ltts.DAO.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
TeamDao pd=new TeamDao();
List<team> li=pd.getAllTeams();
%>
<table>
<tr>
<th>Team Number</th>
<th>Team Name</th>
<th>Owner Name</th>
<th>Coach Name</th>
<th>Player Id</th>
<th></th>
</tr>
<%
for(team p1:li){
%>
<tr>
<td><%=p1.getTeam_id() %></td>
<td><%=p1.getTeamname() %></td>
<td><%=p1.getOwnername() %></td>
<td><%=p1.getCoachname() %></td>

</tr>
<%} %>
</table>

</body>
</html>