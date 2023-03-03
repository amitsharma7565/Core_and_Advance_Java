<!doctype html>
<html lang="en"><%@page isELIgnored="false"%><head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
 
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
 
<script>
	window.onload = function() {
		var checkboxes = document.getElementsByName("insurance");
		var currentCheckbox = null;
		function uncheckCheckbox() {
			for (var i = 0; i < checkboxes.length; i++) {
				checkboxes[i].checked = false;
			}
		}
		function checkCheckbox() {
			currentCheckbox.checked = true;
		}
		for (var i = 0; i < checkboxes.length; i++) {
			checkboxes[i].addEventListener("click", function() {
				currentCheckbox = this;
				uncheckCheckbox();
				checkCheckbox();
			});
		}
	};
</script>
<title>Registration Form!</title>
</head>
<body>
	<div class="container mt-5">
		<h1 class="text-center">Employee Registration Form</h1>
		<form action="addUser" method="post">
			<div class="form-group">
				<label for="exampleInputEmail1">Employee name</label><input
					type="text" class="form-control" placeholder="Enter user name"
					name="name">
			</div>
			<div class="form-group">
				<label for="exampleInputEmail1">Enter email</label><input
					type="email" class="form-control" id="exampleInputEmail1"
					aria-describedby="emailHelp" placeholder="Enter email" name="email">
			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Enter Salary</label><input
					type="text" class="form-control" id="salary" placeholder="salary"
					name="salary">
			</div>

			<div class="form-group">
				<label for="exampleInputPassword1">Enter phoneNumber</label><input
					type="text" class="form-control" id="pnumber" placeholder="phone"
					name="phoneNumber">
			</div>

			<div class="form-group">
				<label for="gender">Select Gender</label> <br> <input
					type="radio" id="gender" name="gender" value="Male">   <label
					for="html">Male</label><br> <input type="radio" id="gender"
					name="gender" value="Female">   <label for="html">Female</label><br>
				<input type="radio" id="gender" name="gender" value="Other">
				  <label for="html">Other</label><br>
			</div>

			<div class="form-group">
				<label for="dept">Choose a Department:</label> <select name="dept"
					id="dept">
					<option value="Select">Select</option>
					<option value="Developer">Developer</option>
					<option value="Testing">Testing</option>
					<option value="HR">Hr</option>
				</select>
			</div>

			<div class="form-group">
				<div class="form-group">
					<p>Select Insurance is Available or not :</p>
					<label> <input type="checkbox" name="insurance" id="yes"
						value="Yes" onclick="uncheckNoCheckbox()"> Yes
					</label> <br> <label> <input type="checkbox" name="insurance"
						id="no" value="No" onclick="uncheckYesCheckbox()"> No
					</label>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>