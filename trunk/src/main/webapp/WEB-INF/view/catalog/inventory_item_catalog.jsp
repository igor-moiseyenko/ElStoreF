<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1><c:out value="${catalogName}" /></h1>
</div>

<c:forEach items="${inventoryItemList}" var="item">
	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-default">
				<div class="panel-heading">
					<c:out value="${item.producerName}" />
					<c:out value="${item.versionName}" />
				</div>
				<div class="panel-body">
					<img class="img-thumbnail" alt="<c:out value="${item.producerName} ${item.versionName}" />" src="<s:url value="${item.imgUrl}" />">
					<c:out value="${item.price}" />
					<a class="btn btn-primary" href="">View details &raquo;</a>
					<div class="well">
						<p><c:out value="${item.description}" /></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</c:forEach>
