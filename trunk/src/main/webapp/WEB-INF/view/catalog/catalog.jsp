<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1>Catalog</h1>
</div>

<c:forEach items="${categoryNameList}" var="categoryName">
	<div class="row">
		<div class="col-lg-4">
			<h2><c:out value="${categoryName.name}" /></h2>
			<c:forEach items="${categoryName.inventoryItemNames}" var="inventoryItemName">
				<a href="<s:url value="/catalog/${inventoryItemName.mappingUrl}" />"><c:out value="${inventoryItemName.name}" /></a>
			</c:forEach>
		</div>
	</div>
</c:forEach>
