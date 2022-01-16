<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%--Import all the necessary classes --%>
   <%@ page import="java.util.*" %>
   <%@ page import="java.io.PrintWriter" %>
   
   <%@page import="demo.hogwarts.House" %>
   <%@page import="demo.hogwarts.HouseFacade" %>
   
   <%
   		//Get parameter value from link
   		// User request.getParameter()
   		//It is similar pratice from the Servlet.
   		int houseId = Integer.parseInt(request.getParameter("id"));
   		
   		
   		// Wrap into House
   		HouseFacade houseFacade = new HouseFacade();
   		List<House> houseList = new ArrayList<House>();
   		
   		PrintWriter printWriter = response.getWriter();
   		
   		String houseName = "";
   		String houseFounder = "";
   		String houseColor = "";
   		String houseMascot ="";
   		
   		// Get house. Use HouseFacade
   	
   		for(House house: houseFacade.getHouses())
   		{
   			if(houseId == house.getHouseId())
   			{
   				houseName = house.getName();
   				houseFounder = house.getFounder();
   				houseColor = house.getColor();
   				houseMascot = house.getMascot();
   			}
   			
   		}
   		
   		
   		
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br>
	<b>Details Information Of System</b><br><br>
	
	<b>Name   : </b><%=houseName %><br><br>
	<b>Founder: </b><%=houseFounder %><br><br>
	<b>Color  :</b><%=houseColor %><br><br>
	<b>Mascot :</b><%=houseMascot %><br><br>

</body>


	<!-- Include footer menu -->
	<br><br>
	Click <a href="houses.jsp">here</a> to return to list of Hogwarts's Houses
	<jsp:include page="footerMenu.html"></jsp:include>

</html>