<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<style>
    .operator {
        width: 40px;
        height: 20px;
        background-color: aqua;
    }

    label {
        border: 1px;
    }
</style>
<body>
<h1>Calculator</h1>
<form id="calculator" method="get" action="maytinh">
    <table>
        <tr>
            <td><label>Số thứ nhất: </label></td>
            <td><input type="text" name="firstOperand" value="${firstOperand}"></td>
        </tr>
        <tr>
            <td><label>Số thứ hai: </label></td>
            <td><input type="text" name="secondOperand" value="${secondOperand}"></td>
        </tr>
    </table>
    <input type="submit" class="operator" name="operator" value="+">
    <input type="submit" class="operator" name="operator" value="-">
    <input type="submit" class="operator" name="operator" value="*">
    <input type="submit" class="operator" name="operator" value="/"><br>
    <span>Result ${operator}:${result}</span>
</form>
</body>
</html>