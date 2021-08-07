<HTML>
<HEAD>
<jsp:useBean id="dBBeanId" scope="session" 
  class="jspdemo.DBBean" >
</jsp:useBean>
<jsp:setProperty name="dBBeanId" property="*" />
<TITLE>DBLoginInitialization</TITLE>
</HEAD>
<BODY>

<%-- Connect to the database --%>
<% dBBeanId.initializeJdbc(); %>

<% if (dBBeanId.getConnection() == null) { %>
     Error: Login failed. Try again.
<% }
   else {%>
     <jsp:forward page="Table.jsp" />
<% } %>
</BODY>
</HTML> 