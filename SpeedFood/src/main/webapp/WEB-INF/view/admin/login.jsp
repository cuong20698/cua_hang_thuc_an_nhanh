<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin - Login</title>

<!-- Custom fonts for this template-->
<link
	href="<c:url value='/template/admin/vendor/fontawesome-free/css/all.min.css' />"
	type="text/css" rel="stylesheet">

<!-- Custom styles for this template-->
<link href="<c:url value='/template/admin/css/sb-admin.css'/>"
	type="text/css" rel="stylesheet">
</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-login mx-auto mt-5">
			<div class="card-header">Login</div>
			<div class="card-body">
				<form:form action="login" method="POST" commandName="tk">
					<div class="form-group">
						<div class="form-label-group">
							<form:input path="username" id="inputEmail" class="form-control"
								placeholder="Email address" required="required"
								autofocus="autofocus" />
							<label for="inputEmail">Email address</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<form:password path="password" id="inputPassword"
								class="form-control" placeholder="Mật khẩu" required="required"
								autofocus="autofocus" />
							<label for="inputPassword">Password</label>
						</div>
					</div>
					<div class="form-group">
						<div class="checkbox">
							<label style="color: red;"> ${thongbao} </label>

						</div>
					</div>
					<input type="submit" value="Login"
						class="btn btn-primary btn-block">
				</form:form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/SpeedFood/dangky">Register
						an Account</a> <a class="d-block small" href="/learn/forgot-password">Forgot
						Password?</a>
				</div>

			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script
		src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
	<script
		src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>
</body>

</html>
