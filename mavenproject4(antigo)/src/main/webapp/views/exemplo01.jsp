<%-- 
    Document   : exemplo01
    Created on : 17 de mai. de 2025, 16:30:15
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo de página mostrando data</title>
    </head>
    <body>
        
        
        <!--
        JSP = Tecnologia Java que deixa a gente usar Java em página HTML
        todo arquivo tem que ter a extensão .jsp
        pode referenciar arquivo javascript e css
        
        abaixo um codigo em JSP pra linkar e mostrar uma outra página html
        -->
        <jsp:include page="util/menu.jsp" />
        
        <!--
        com o JSP da pra adicionar codigo java mais complexo no meio do HTML também 
        lá no começo da página ele importa duas coisas do Java pra adicionar data
        -->
        <%
            java.util.Date DataAtual = new java.util.Date();
            String strData = new SimpleDateFormat("dd/MM/yyyy").format(DataAtual);
        %>
        
        
        <h2>Exemplo de página JSP escrita no netBeans</h2><br> 
        <h2>Data atual: <%= strData %></h2>
        <!-- da também pra usar no meio das TAGS HTML, como logo acima -->
    </body>
</html>
