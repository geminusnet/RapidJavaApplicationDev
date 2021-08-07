<HTML>
<HEAD>
<TITLE>
ComputeFactorial
</TITLE>
</HEAD>
<BODY>
<%@ page import ="java.text.*" %>
<%@ page errorPage = "FactorialInputError.jsp" %>

<%  NumberFormat format = NumberFormat.getNumberInstance();
    int number = Integer.parseInt(request.getParameter("number")); %>
Factorial of <%= number %> is
<%= format.format(computeFactorial(number)) %> <br>

<%! private long computeFactorial(int n) {
      if (n == 0)
        return 1;
      else
        return n*computeFactorial(n-1);
    }
%>
</BODY>
</HTML>