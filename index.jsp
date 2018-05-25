<%--
  Created by IntelliJ IDEA.
  User: fred
  Date: 15.05.18
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Prog.kiev.ua</title>
  </head>
  <body>
  <form action="Quetions" method="POST">
    <p><strong>What is your name?</strong></p>

    <p><input maxlength="25" size="40"  name="name" value=" "></p>

      </br>
    Do you like Kiev?
    <br/><input type="radio" name="question1" value="yes"/>Yes
    <br/><input type="radio" name="question1" value="no"/>No
    <br/>Do you like Spain?
    <br/><input type="radio" name="question2" value="yes"/>Yes
    <br/><input type="radio" name="question2" value="no"/>No
    <br/><input type="submit" value="Send">

    </form>

  </body>
</html>
