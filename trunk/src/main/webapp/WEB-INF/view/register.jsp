<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="jumbotron">
	<h1>Sign up</h1>
</div>

<sf:form cssClass="form-signin" modelAttribute="account" action="${pageContext.request.contextPath}/account/doSignUp" method="post">
	<h2 class="form-signin-heading">Please sign up</h2>
	
	<sf:input path="username" cssClass="form-control" placeholder="Username" onfocus="true" />
	<sf:errors path="username" cssClass="error" />
	
	<sf:input path="email" cssClass="form-control" placeholder="Email address" />
	<sf:errors path="email" cssClass="error" />
	
	<sf:password path="password" id="password" cssClass="form-control" placeholder="Password" />
	<sf:errors path="password" cssClass="error"/>
	
	<label class="checkbox">
		<input type="checkbox" value="remember-me"> Remember me
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign up</button>
</sf:form>
 