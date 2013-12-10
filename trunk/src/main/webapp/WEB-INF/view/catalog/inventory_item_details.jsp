<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1><c:out value="${item.producerName} ${item.versionName}" /></h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${item.producerName}" />
				<c:out value="${item.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left" class="img-thumbnail" alt="<c:out value="${item.producerName} ${item.versionName}" />" src="<s:url value="${item.imgUrl}" />">
				Producer name: <c:out value="${item.producerName}" /><br />
				Version name: <c:out value="${item.versionName}" /><br />
				Length: <c:out value="${item.length} mm" /><br />
				Width: <c:out value="${item.width} mm" /><br />
				Thickness: <c:out value="${item.thickness} mm" /><br />
				Weight: <c:out value="${item.weight} gm" /><br />
				Price: <c:out value="${item.price} $" />
			</div>
			<div class="well">
				<p><c:out value="${item.description}" /></p>
			</div>
		</div>
	</div>
</div>