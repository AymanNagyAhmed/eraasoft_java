<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
    
    public String concatIdAndName(int id, String name) {
        return id + " - " + name;
    }
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 

Integer id = 10;
String name = "ayman";

String result = concatIdAndName(id,name);
out.print(result);

%>
<h1>ID: <%= id %></h1>
<h1>NAME: <%= name %></h1>

<h1>test concat function: <%= concatIdAndName(id,name) %></h1>


</div>




</body>
</html>