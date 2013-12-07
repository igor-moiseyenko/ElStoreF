<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="jumbotron">
	<h1>Register</h1>
</div>

<sf:form cssClass="form-signin" modelAttribute="account" action="${pageContext.request.contextPath}/account/doSignUp" method="post">
	<h2 class="form-signin-heading">Please sign in</h2>
	<sf:input path="username" cssClass="form-control" placeholder="Username" onfocus="true" />
	<sf:input path="email" cssClass="form-control" placeholder="Email address" />
	<sf:password path="password" id="password" cssClass="form-control" placeholder="Password" />
	<label class="checkbox">
		<input type="checkbox" value="remember-me"> Remember me
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</sf:form>
 