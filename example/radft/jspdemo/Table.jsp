<jsp:useBean id="dBBeanId" scope="session" 
  class="jspdemo.DBBean" >
</jsp:useBean>
<HTML>
<HEAD>
<TITLE>Table</TITLE>
</HEAD>
<BODY>
<% String[] tables = dBBeanId.getTables();
   if (tables == null) { %>
     No tables
<% }
   else { %>
     <FORM method="post" action="BrowseTable.jsp">
     Select a table <select name="tablename" size="1">
     <% for (int i=0; i<tables.length; i++) { %>
       <option><%= tables[i] %>
<%   }
   } %>
          </select><BR><BR><BR>
<INPUT TYPE="SUBMIT" NAME="Submit" VALUE="Browse Table Content">
<INPUT TYPE="RESET" VALUE="Reset">
</FORM>
</BODY>
</HTML> 