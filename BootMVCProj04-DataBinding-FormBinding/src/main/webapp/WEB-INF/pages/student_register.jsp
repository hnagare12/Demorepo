<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<h1 style="color:red;text-align:center">student registration page</h1>

<form action="register" method="post">
<table align="center " bgcolor="cyan">
<tr>
<td>student number</td>
<td><input type="text" name="sno"></td>
</tr>

<tr>
<td>student name</td>
<td><input type="text" name="snname"></td>
</tr>

<tr>
<td>student address</td>
<td><input type="text" name="sadd"></td>
</tr>

<tr>
<td>student avg </td>
<td><input type="text" name="avg"></td>
</tr>
<tr>

<td colspan="2"><input type="submit" name="Register"></td>
</tr>
</table>
</form>