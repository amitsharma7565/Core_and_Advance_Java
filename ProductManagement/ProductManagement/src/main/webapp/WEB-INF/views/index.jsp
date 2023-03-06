<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body>
	<div class="container mt-5">
	<h1 class="text-center">Product Details</h1>
		<form action="addProduct" method="get">
			<div class="form-group">
				<label for="exampleInputname">Product name</label> <input
					type="text" class="form-control" 
					 placeholder="Enter product name" name="pname"> 
			</div>
			<div class="form-group">
				<label for="exampleInputbrand">Product brand</label> <input
					type="text" class="form-control" id="exampleInputbrand"
					 placeholder="Enter brand" name="pbrand"> 
			</div>
			<div class="form-group">
				<label for="exampleInputprice">Price</label> <input
					type="number" class="form-control" id="exampleInputprice"
					placeholder="Product price" name="pprice">
			</div>
			<div class="form-group">
				<label for="exampleInputprice">Rating</label> <input
					type="number" class="form-control" id="exampleInputrating"
					placeholder="Product Rating" name="prating">
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		    <a href="/ProductManagement/getAll" class="btn btn-primary">View
				All Products</a>
		</form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>