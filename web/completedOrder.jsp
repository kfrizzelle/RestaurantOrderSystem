<%-- 
    Document   : completedOrder
    Created on : Feb 14, 2013, 1:06:54 AM
    Author     : Owner
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ken'sLittleItaly : Confirmation</title>
    </head>
    <body>
        <h1>Your order has been confirmed!</h1>
        <p> Thank you <%out.println(request.getAttribute("name"));%>.<br />  Your order of:<br />
            <%
            String[] items = (String[])request.getAttribute("items");
            for(String item:items){
                out.println(item + "<br />");
            }

            
            //String items = request.getAttribute("items");
            //StringTokenizer st = new StringTokenizer(request.getAttribute("items")), ",");
            //while (st.hasMoreElements()) {
			//out.println(st.nextElement() + ", $" + request.getAttribute("price"));S
		//}
      %><br />
            Subtotal: $<% out.println(request.getAttribute("subTotal")); %><br />
            Tax: $<% out.println(request.getAttribute("tax")); %><br />
            Total: $<% out.println(request.getAttribute("total")); %><br />
            Suggested Tip: $<% out.println(request.getAttribute("tip")); %><br />
            Your order will be ready for pickup in approximately 20 minutes.</p>
    </body>
</html>
