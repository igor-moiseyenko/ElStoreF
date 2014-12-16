<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>

<div class="jumbotron">
	<h1>
		<c:out value="${laptop.producerName} ${laptop.versionName}" />
	</h1>
</div>

<div class="row">
	<div class="col-sm-12">
		<div class="panel panel-default">
			<div class="panel-heading">
				<c:out value="${laptop.producerName}" />
				<c:out value="${laptop.versionName}" />
			</div>
			<div class="panel-body">
				<img style="float:left"
					class="img-thumbnail"
					alt="<c:out value="${laptop.producerName} ${laptop.versionName}" />"
					src="<s:url value="${laptop.imgUrl}" />">
				<s:message code="details.item.producer.name" text="details.item.producer.name" />&#58;
				<c:out value="${laptop.producerName}" />
				<br />
				<s:message code="details.item.version.name" text="details.item.version.name" />&#58;
				<c:out value="${laptop.versionName}" />
				<br />
				<s:message code="details.item.length" text="details.item.length" />&#58;
				<c:out value="${laptop.length} mm" />
				<br />
				<s:message code="details.item.width" text="details.item.width" />&#58;
				<c:out value="${laptop.width} mm" />
				<br />
				<s:message code="details.item.thickness" text="details.item.thickness" />&#58;
				<c:out value="${laptop.thickness} mm" />
				<br />
				<s:message code="details.item.weight" text="details.item.weight" />&#58;
				<c:out value="${laptop.weight} gm" />
				<br />
				<s:message code="details.item.price" text="details.item.price" />&#58;
				<c:out value="${laptop.price} $" />
				<a class="btn btn-primary" href="#">
					<s:message code="details.item.order" text="details.item.order" />&raquo;
				</a>
			</div>
			<div class="well">
				<p>
					<c:out value="${laptop.description}" />
				</p>
			</div>
		</div>
	</div>
</div>