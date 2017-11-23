<%-- 
    Document   : favoritos
    Created on : 23-nov-2017, 11:48:31
    Author     : luis
--%>

<%@page import="paquetefavoritos.CrearHTML"%>
<%@page import="paquetefavoritos.Favorito"%>
<%@page import="paquetefavoritos.AccesoBD"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%
            ArrayList<Favorito> lista_favoritos=AccesoBD.recuperarFavoritos();
            String html_lista=CrearHTML.crearLista(lista_favoritos);
            %>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de favoritos:</h1>
        <%=html_lista%>
    </body>
</html>
