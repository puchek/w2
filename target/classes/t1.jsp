<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Книги</title>

    <link rel="stylesheet" href="css/blueprint/screen.css" type="text/css" media="screen, projection">
    <link rel="stylesheet" href="css/blueprint/print.css" type="text/css" media="print">

    <link rel="stylesheet" href="css/deb.css" type="text/css" media="screen">

</head>

<body>

<div class="container">

    <div class="span-24 last">
        <h1>Книги</h1>
        <h2>Выбирай и читай</h2>
    </div>

    <div id="navigate" class="span-24  last">
        <div id="indexBooks" class="span-8">
            <a href="#">Перечень книг</a>
        </div>

        <div id="loginInfo" class="span-16 last">
            <a href="#">Войти</a>
        </div>
    </div>

    <div id="content" class="span-16 colborder ">
        <h3>Content</h3>

        <c:forEach var="p" items="${productList}">

            <div class="book span-16 last">
            <h4>${p.productName}</h4>
            <div class="span-4 bookPic"><img src="${p.imageFile}" class="pic"></div>
            <div class="span-8 bookDesc">
                ${p.productDescription}
            </div>
            <div class="span-4 last bookPrice">${p.price}</div>
        </div>
        <hr>

        </c:forEach>


    </div>

    <div id="sidebar" class="span-7 last">
        <h3>Корзина</h3>

        <table cellspacing="0" cellpadding="0" border="0" summary="Корзина покупок">
            <!--<caption>-->
                <!--<em>Выбраны книги</em>-->
            <!--</caption>-->
            <thead>
            <tr>
                <th class="span-5">Название</th>
                <th class="span-2 last">Цена</th>
            </tr>
            </thead>

            <tbody>
            <tr>
                <td><a href="#"> Java EE 7. Основы lklsdjaf sdlkfj lksjdf lkjsdf lkjlk lkjsadf </a></td>
                <td>360</td>
            </tr>
            <tr>
                <td><a href="#">TD One</a></td>
                <td>TD Two</td>
            </tr>
            </tbody>

            <tfoot>
            <tr>
                <td ><em>Итого</em></td>
                <td >123</td>
            </tr>
            </tfoot>
        </table>

    </div>

</div>


</body>

</html>