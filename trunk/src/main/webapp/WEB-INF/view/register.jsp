<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<div class="jumbotron">
	<h1>Register</h1>
</div>

<sf:form cssClass="form-signin" modelAttribute="account" action="<s:url value='/register/doRegister' />" method="post">
	<h2 class="form-signin-heading">Please sign in</h2>
	<sf:input path="username" cssClass="form-control" placeholder="Username" onfocus="true" />
	<sf:input path="email" cssClass="form-control" placeholder="Email address" />
	<sf:password path="password" id="password" cssClass="form-control" placeholder="Password" />
	<label class="checkbox">
		<input type="checkbox" value="remember-me"> Remember me
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</sf:form>
 