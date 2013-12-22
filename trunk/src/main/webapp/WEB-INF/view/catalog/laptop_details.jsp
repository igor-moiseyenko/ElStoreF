<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1><c:out value="${laptop.producerName} ${laptop.versionName}" /></h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${laptop.producerName}" />
				<c:out value="${laptop.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left" class="img-thumbnail" alt="<c:out value="${laptop.producerName} ${laptop.versionName}" />" src="<s:url value="${laptop.imgUrl}" />">
				Producer name: <c:out value="${laptop.producerName}" /><br />
				Version name: <c:out value="${laptop.versionName}" /><br />
				Length: <c:out value="${laptop.length} mm" /><br />
				Width: <c:out value="${laptop.width} mm" /><br />
				Thickness: <c:out value="${laptop.thickness} mm" /><br />
				Weight: <c:out value="${laptop.weight} gm" /><br />
				Price: <c:out value="${laptop.price} $" />
				<a class="btn btn-primary" href="#">Order</a>
			</div>
			<div class="well">
				<p><c:out value="${laptop.description}" /></p>
			</div>
		</div>
	</div>
</div>