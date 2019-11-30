<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

</head>
<body>
	<jsp:include page="home.jsp"></jsp:include>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-md-4"></div>
			<div class="col-md-4">

				<form action="registerprocess" method="post">
					<div class="form-row">
						<div class="form-group col-md-6">
							<label>Name</label> <input type="name" class="form-control"
								id="name" name="name" placeholder="Enter Name">
						</div>
						<div class="form-group col-md-6">
							<label>Username</label> <input type="name" class="form-control"
								id="uname" name="uname" placeholder="Enter Username">
						</div>
					</div>
					<div class="form-group">
						<label>Email</label> <input type="email" class="form-control"
							id="email" name="email" placeholder="Enter Email-ID">
					</div>
					<div class="form-group">
						<label>Mobile No.</label> <input type="text" class="form-control"
							id="mob" name="mob" placeholder="Enter Mobile Number">
					</div>
					<div class="form-group">
						<label>Password</label> <input type="text" class="form-control"
							id="pswd" name="pswd" placeholder="Enter Password">
					</div>

					<button type="submit" class="btn btn-primary">Register</button>
				</form>


			</div>
		</div>
	</div>


</body>
</html>