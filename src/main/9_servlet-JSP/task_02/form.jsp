<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<h2>Registration Form</h2>

<form action="result.jsp" method="post">

    Full Name:
    <input type="text" name="fullName" />
    <br><br>

    Password:
    <input type="password" name="password" />
    <br><br>

    Age:
    <input type="text" name="age" />
    <br><br>

    <!-- Address (Radio Buttons) -->
    Address (Radio):
    <br>
    <input type="radio" name="addressRadio" value="Cairo"> Cairo
    <input type="radio" name="addressRadio" value="Alex"> Alex
    <input type="radio" name="addressRadio" value="Menofia"> Menofia
    <br><br>

    <!-- Address (Select) -->
    Address (Select):
    <select name="addressSelect">
        <option value="Cairo">Cairo</option>
        <option value="Alex">Alex</option>
        <option value="Menofia">Menofia</option>
    </select>
    <br><br>

    <input type="submit" value="Submit" />

</form>

</body>
</html>
