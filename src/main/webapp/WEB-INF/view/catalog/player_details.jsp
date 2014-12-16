<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1>
		<c:out value="${player.producerName} ${player.versionName}" />
	</h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${player.producerName}" />
				<c:out value="${player.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left"
					class="img-thumbnail"
					alt="<c:out value="${player.producerName} ${player.versionName}" />"
					src="<s:url value="${player.imgUrl}" />">
				<s:message code="details.item.producer.name" text="details.item.producer.name" />&#58;
				<c:out value="${player.producerName}" />
				<br />
				<s:message code="details.item.version.name" text="details.item.version.name" />&#58;
				<c:out value="${player.versionName}" />
				<br />
				<s:message code="details.item.length" text="details.item.length" />&#58;
				<c:out value="${player.length} mm" />
				<br />
				<s:message code="details.item.width" text="details.item.width" />&#58;
				<c:out value="${player.width} mm" />
				<br />
				<s:message code="details.item.thickness" text="details.item.thickness" />&#58;
				<c:out value="${player.thickness} mm" />
				<br />
				<s:message code="details.item.weight" text="details.item.weight" />&#58;
				<c:out value="${player.weight} gm" />
				<br />
				<s:message code="details.item.price" text="details.item.price" />&#58;
				<c:out value="${player.price} $" />
				<a class="btn btn-primary" href="#">
					<s:message code="details.item.order" text="details.item.order" />&raquo;
				</a>
			</div>
			<div class="well">
				<p><c:out value="${player.description}" /></p>
			</div>
		</div>
	</div>
</div>