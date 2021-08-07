<HTML>
<HEAD>
<TITLE>
DBLogin
</TITLE>
</HEAD>
<BODY>
<FORM method="post" action="DBLoginInitialization.jsp">
JDBC Driver
  <select name="driver" size="1">
    <option>sun.jdbc.odbc.JdbcOdbcDriver
    <option>oracle.jdbc.driver.OracleDriver
  </select><BR>
<BR>JDBC URL
  <select name="url" size="1">
    <option>jdbc:odbc:LiangBookDB_MDB
    <option>jdbc:oracle:thin:@localhost:1521:liangy
  </select><BR>
<BR>Username <INPUT NAME="username"><BR>
<BR>Password <INPUT type="password" NAME="password"><BR><BR>
<INPUT TYPE="SUBMIT" NAME="Submit" VALUE="Login">
<INPUT TYPE="RESET" VALUE="Reset">
</FORM>
</BODY>
</HTML> 
