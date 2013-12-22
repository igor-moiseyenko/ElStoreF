<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>

<div class="masthead">
	<h3 class="text-muted">
		<s:message code="project.name" text="project.name" />
	</h3>
	<ul class="nav nav-justified">
		<li class="active">
			<a href="<s:url value="/home" />">
				<s:message code="menu.home" text="menu.home" />
			</a>
		</li>
		<li>
			<a href="<s:url value="/catalog" />">
				<s:message code="menu.catalog" text="menu.catalog" />
			</a>
		</li>
		<li>
			<a href="<s:url value="/account/signin" />">
				<s:message code="menu.sign.in" text="menu.sign.in" />
			</a>
		</li>
		<li>
			<a href="<s:url value="/account/signup" />">
				<s:message code="menu.sign.up" text="menu.sign.up" />
			</a>
		</li>
		<li>
			<a href="#">
				<s:message code="menu.shopping.cart" text="menu.shopping.cart" />
			</a>
		</li>
		<li>
			<a href="<s:url value="/about" />">
				<s:message code="menu.about" text="menu.about" />
			</a>
		</li>
	</ul>
</div>
