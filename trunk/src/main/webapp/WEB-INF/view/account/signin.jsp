<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="jumbotron">
	<h1>
		<s:message code="sign.in.header" text="sign.in.header" />
	</h1>
</div>

<form class="form-signin" action="<s:url value="/account/signin" />" method="post">
	<h2 class="form-signin-heading">
		<s:message code="sign.in.form.header" text="sign.in.form.header" />
	</h2>
	<input 
		name="username"
		type="text"
		class="form-control"
		placeholder="<s:message code="sign.in.form.username" text="sign.in.form.username" />"
		autofocus />
	<input 
		name="password"
		type="password"
		class="form-control"
		placeholder="<s:message code="sign.in.form.password" text="sign.in.form.password" />">
	<label class="checkbox">
		<input type="checkbox" value="remember-me">
		<s:message code="sign.in.form.remember.me" text="sign.in.form.remember.me" />
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">
		<s:message code="sign.in.form.sign.in" text="sign.in.form.sign.in" />
	</button>
</form>
