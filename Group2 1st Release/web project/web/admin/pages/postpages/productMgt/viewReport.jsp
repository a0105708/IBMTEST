<%-- 
    Document   : ViewReport
    Created on : Apr 5, 2015, 8:02:13 PM
    Author     : Administrator
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <%-- start web service invocation --%><hr/>
    <%
    try {
        
        java.lang.String reportName = request.getParameter("reportName");
        
        Runtime   rt   =   Runtime.getRuntime();   
        rt.exec("cmd   /c   start   "   +  "d:\\"+reportName+".pdf");

        
	response.sendRedirect("../../report_general.jsp");
    } catch (Exception ex) {
	// TODO handle custom exceptions here
        out.println(ex);
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>

