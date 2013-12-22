<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="jumbotron">
	<h1>Sign up</h1>
</div>

<sf:form cssClass="form-signin" modelAttribute="account" action="${pageContext.request.contextPath}/account/signup" method="post">
	<h2 class="form-signin-heading">
		<s:message code="sign.up.form.sign.up" text="sign.up.form.sign.up" />
	</h2>
	
	<s:message code="sign.up.form.username" text="sign.up.form.username" var="username" />
	<sf:input 
		path="username"
		cssClass="form-control"
		placeholder="${username}"
		onfocus="true" />
	<sf:errors path="username" cssClass="error" />
	
	<s:message code="sign.up.form.email" text="sign.up.form.email" var="email" />
	<sf:input 
		path="email"
		cssClass="form-control"
		placeholder="${email}" />
	<sf:errors path="email" cssClass="error" />
	
	<s:message code="sign.up.form.password" text="sign.up.form.password" var="password" />
	<sf:password 
		path="password"
		id="password"
		cssClass="form-control"
		placeholder="${password}" />
	<sf:errors path="password" cssClass="error" />
	
	<label class="checkbox">
		<input type="checkbox" value="remember-me">
		<s:message code="sign.up.form.remember.me" text="sign.up.form.remember.me" />
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">
		<s:message code="sign.up.form.sign.up" text="sign.up.form.sign.up" />
	</button>
</sf:form>
 