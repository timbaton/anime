<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="../../front/styles/categoriesStyles.css" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
</head>
<body>

<link rel="stylesheet" href="../../front/styles/navBarStyles.css" type="text/css"/>

<#include "nav_bar.ftl">

<table class="table">
    <tr>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item1.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item2.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item3.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item4.jpg" onclick="show('block')" width="150"></a>
        </td>
    </tr>
    <tr>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item1.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item2.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item3.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item4.jpg" onclick="show('block')" width="150"></a>
        </td>
    </tr>
    <tr>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item1.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item2.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item3.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item4.jpg" onclick="show('block')" width="150"></a>
        </td>
    </tr>
    <tr>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item1.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item2.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item3.jpg" onclick="show('block')" width="150"></a>
        </td>
        <td style="width: 150px"><a href="#"><img src="../../front/src/item4.jpg" onclick="show('block')" width="150"></a>
        </td>
    </tr>
</table>

<div id="window">
    <form class="form-containerLogin">
        <div class="form-titleLogin">Владыка Вермилиона: Король алого лотоса / Lord of Vermilion: Guren no Ou<h2></h2>
        </div>
        <img onclick="show('none')" src="../../front/src/close.png" class="closePic">
        Жанр: приключения, фэнтези</br>
        Дата выхода: c 14.07.2018</br>
        Длительность: 25мин.</p>
        Описание: Случилось это в Токио, 29 января 2030 года. Высокочастотный резонанс наблюдается в окрестностях Токио,
        и красный туман движется в город. Те, кто слышит звук, как люди, так и животные, теряют сознание. Все
        закрывается в Токио, полагая, что туман несет неизвестный вирус, который вызывает эпидемию. Однако через шесть
        дней, после инцидента, люди просыпаются, как ни в чем не бывало. После этого изолированные городские районы
        Токио постепенно нормализуются. Однако из-за высокочастотного резонанса начинают происходить некоторые
        «причудливые события», и люди оказываются втянутыми в более загадочные тайны. Между тем молодые люди начинают
        осознавать себя и освобождать свою силу, спрятанную в их крови, открывая себя как «сосуд мудрости». Вместе,
        руководствуясь чем-то неизвестным, они встречаются, общаются и сталкиваются с неизбежным кругом судьбы, жертвуя
        своей жизнью.

    </form>
</div>

<script>
    //Функция показа
    function show(state) {
        document.getElementById('window').style.display = state;
        document.getElementById('gray').style.display = state;
    }
</script>

</body>
</html>