<!DOCTYPE html>
<html lang="en">
<%@ include file="/common/taglib.jsp"%>
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin - Register</title>

<!-- Custom fonts for this template-->
<link
	href="<c:url value='/template/admin/vendor/fontawesome-free/css/all.min.css'/>"
	type="text/css" rel="stylesheet">
<!-- Custom styles for this template-->
<link href="<c:url value='/template/admin/css/sb-admin.css'/>"
	type="text/css" rel="stylesheet">
</head>

<body class="bg-dark">

	<div class="container">
		<div class="card card-register mx-auto mt-5">
			<div class="card-header">Register an Account</div>
			<div class="card-body">
				<form:form action="dangky" method="POST" commandName="tk">

					<div class="form-group">
						<div class="form-label-group">
							<form:input path="Username" id="inputUsername"
								class="form-control" placeholder="Username" required="required" />
							<label for="inputUsername">Username</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-label-group">
							<form:input path="email" id="inputEmail" class="form-control"
								placeholder="Email address" required="required" />
							<label for="inputEmail">Email address</label>
						</div>
					</div>
					<div class="form-group">
						<div class="form-row">
							<div class="col-md-6">
								<div class="form-label-group">
									<form:password path="password" id="inputPassword"
										class="form-control" placeholder="Password"
										required="required" />
									<label for="inputPassword">Password</label>
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-label-group">
									<input type="password" id="confirmPassword"
										class="form-control" placeholder="Confirm password"
										required="required"> <label for="confirmPassword">Confirm
										password</label>
								</div>
							</div>
						</div>
					</div>
					<input type="submit" class="btn btn-primary btn-block"
						value="Register">
				</form:form>
				<div class="text-center">
					<a class="d-block small mt-3" href="/SpeedFood/home">Login Page</a>
					<a class="d-block small" href="#">Forgot Password?</a>
				</div>
			</div>
		</div>
	</div>

	<script
		src="<c:url value='/template/admin/vendor/jquery/jquery.min.js'/>"></script>
	<script
		src="<c:url value='/template/admin/vendor/bootstrap/js/bootstrap.bundle.min.js'/>"></script>
	<!-- Core plugin JavaScript-->
	<script
		src="<c:url value='/template/admin/vendor/jquery-easing/jquery.easing.min.js'/>"></script>
</body>

</html>