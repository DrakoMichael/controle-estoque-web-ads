<%-- 
    Document   : menu
    Created on : 21 de mai. de 2025, 18:26:51
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/menu_style.css">
    </head>
    <body>
        <div id="menu">
            <ul>
              <li><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
              <li><a href="${pageContext.request.contextPath}/views/adicionar.jsp">adicionar</a></li>
              <li><a href="${pageContext.request.contextPath}/views/editar.jsp">Editar</a></li>
              <li><a href="${pageContext.request.contextPath}/views/exemplo01.jsp">Exemplo</a></li>
              <li><a href="${pageContext.request.contextPath}/views/listar.jsp">Listar</a></li>
            </ul>
</div>
    </body>
</html>
