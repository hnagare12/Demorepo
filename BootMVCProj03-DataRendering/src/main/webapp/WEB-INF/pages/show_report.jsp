<%-- 
<%@page isELIgnored="false"%>
<b>model is </b><br>

<b>name::${name }</b><br>
<b>age::${age }</b><br>
<b>add::${add }</b><br>
--%>


<%-- 
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<b> Model data (Array,collections) is ::</b><br>
favourite colors(aray)::
<c:if test="${!empty fevColors }">
<c:forEach var="color" items="${fevColors }">
${color },
</c:forEach>
</c:if>
<br>
nickName(List Collection)::
<c:if test="${ !empty nickName}">
<c:forEach var="name" items="${nickName }">
${ name},
</c:forEach>
</c:if>
<br>
phonNumber(Set Collection)::
<c:if test="${ !empty phonNumber}">
<c:forEach var="phon" items="${phonNumber }">
${ phon },
</c:forEach>
</c:if>
<br>
idDetails(Map Collection(only value by taking keys))::
<c:if test="${ !empty idDetails}">
${idDetails.aadhar},
${idDetails.voterid},
${idDetails.panNo},
</c:if>
<br>
idDetails(map Collection(both value  and keys))::
<c:if  test="${!empty idDetails }">
<c:forEach var="id"  items="${idDetails }">
${id.key }<---> ${id.value } <br>
</c:forEach>
</c:if>
--%>
<%--
<b>Modal data is</b> <br>
  <c:if test="${ !empty prodData}">
product is::${prodData.pid }<br>
product name ::${prodData.pname } <br>
product price :: ${prodData.price } <br>
product  qty ::${prodData. qty } 
</c:if>
 --%>
 <%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <c:choose>
<c:when test="${!empty prodList}">
<table align ="center" border="1">
<tr>
<th>PID</th> <th>PNAME</th> <th>PRICE</th> <th>QTY</th>
</tr>
<c:forEach var="prod" items="${prodList }">
<tr>
<td>${prod.pid }</td>
<td>${prod.pname }</td>
<td>${prod.price }</td>
<td>${prod.qty }</td>
</tr>
</c:forEach>
</table>
</c:when>

<c:otherwise>
<h1 style="color:red;text-align:center">No record found</h1>
</c:otherwise>
</c:choose>