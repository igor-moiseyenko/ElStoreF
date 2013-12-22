<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1><c:out value="${player.producerName} ${player.versionName}" /></h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${player.producerName}" />
				<c:out value="${player.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left" class="img-thumbnail" alt="<c:out value="${player.producerName} ${player.versionName}" />" src="<s:url value="${player.imgUrl}" />">
				Producer name: <c:out value="${player.producerName}" /><br />
				Version name: <c:out value="${player.versionName}" /><br />
				Length: <c:out value="${player.length} mm" /><br />
				Width: <c:out value="${player.width} mm" /><br />
				Thickness: <c:out value="${player.thickness} mm" /><br />
				Weight: <c:out value="${player.weight} gm" /><br />
				Price: <c:out value="${player.price} $" />
				<a class="btn btn-primary" href="#">Order</a>
			</div>
			<div class="well">
				<p><c:out value="${player.description}" /></p>
			</div>
		</div>
	</div>
</div>