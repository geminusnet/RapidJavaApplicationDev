<HTML>
<HEAD>
<jsp:useBean id="countBeanId" scope="application"
  class="jspdemo.CountBean" >
</jsp:useBean>
<jsp:setProperty name="countBeanId" property="*" />
<TITLE>TestBeanScope</TITLE>
</HEAD>
<BODY>
<H3>
Testing Bean Scope in JSP
</H3>
<% countBeanId.increaseCount(); %>
You are visitor number
<jsp:getProperty name="countBeanId" property="count" />
</FORM>
</BODY>
</HTML>