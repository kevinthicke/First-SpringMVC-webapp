<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-light bg-light">
			<span class="navbar-brand mb-0 h1">New teacher</span> <a
				class="btn btn-success" href="./../">Back</a>
		</nav>
		<form:form class="m-5"  autocomplete="off" method="POST" action="addTeacher"
			modelAttribute="teacherForm">
			<div class="form-group row">
				<form:label class="col-sm-2 col-form-label" path="name">Name</form:label>
				<div class="col-sm-10">
					<form:input path="name" class="form-control" />
				</div>
			</div>
			<div class="form-group row">
				<form:label path="email" class="col-sm-2 col-form-label">Email</form:label>
				<div class="col-sm-10">
					<form:input path="email" class="form-control" />
				</div>
			</div>
			<div class="d-flex justify-content-end">
				<button class="btn btn-primary" type="submit" value="Submit">Save!</button>
			</div>
			<div class="form-group row m-1">
				<form:errors class="alert alert-danger mb-1 w-100" role="alert" path="name" />
				<form:errors class="alert alert-danger mb-1 w-100" role="alert" path="email" />
			</div>
		</form:form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>
</body>
</html>