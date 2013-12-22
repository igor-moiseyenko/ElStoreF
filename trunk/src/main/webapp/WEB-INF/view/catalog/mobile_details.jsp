<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1><c:out value="${mobile.producerName} ${mobile.versionName}" /></h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${mobile.producerName}" />
				<c:out value="${mobile.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left" class="img-thumbnail" alt="<c:out value="${mobile.producerName} ${mobile.versionName}" />" src="<s:url value="${mobile.imgUrl}" />">
				Producer name: <c:out value="${mobile.producerName}" /><br />
				Version name: <c:out value="${mobile.versionName}" /><br />
				Length: <c:out value="${mobile.length} mm" /><br />
				Width: <c:out value="${mobile.width} mm" /><br />
				Thickness: <c:out value="${mobile.thickness} mm" /><br />
				Weight: <c:out value="${mobile.weight} gm" /><br />
				Price: <c:out value="${mobile.price} $" />
				<a class="btn btn-primary" href="#">Order</a>
			</div>
			<div class="well">
				<p><c:out value="${mobile.description}" /></p>
			</div>
		</div>
	</div>
</div>