<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div class="jumbotron">
	<h1>Login</h1>
</div>

<form class="form-signin" action="<s:url value="/account/doSignIn" />" method="post">
	<h2 class="form-signin-heading">Please sign in</h2>
	<input name="username" type="text" class="form-control" placeholder="Username" autofocus />
	<input name="password" type="password" class="form-control" placeholder="Password">
	<label class="checkbox">
		<input type="checkbox" value="remember-me"> Remember me
	</label>
	<button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
</form>
