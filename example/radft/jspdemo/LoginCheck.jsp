<HTML>
<HEAD>
<TITLE>
LoginCheck
</TITLE>
</HEAD>
<BODY>
<%  String username = request.getParameter("username");
    String password = request.getParameter("password");

    StringBuffer sbuf = new StringBuffer(username);

    if (sbuf.reverse().toString().equals(password)) {%>
      Login successful!<p>
    <% } else { %>
      Login failed!<p>
    <% } %>

Remote client name: <%= request.getRemoteHost() %><BR>
Server name: <%= request.getServerName() %><BR>
Locale: <%= request.getLocale() %><BR>
Session ID: <%= session.getId() %><BR>
Session max interactive interval:
  <%= session.getMaxInactiveInterval() %> Milliseconds
</BODY>
</HTML>