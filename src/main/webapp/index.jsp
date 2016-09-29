<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Index page</title>
</head>
<script>
	function submitA() {
		//alert(1111);
		document.go.action = "home?111";
		document.go.submit();
	}
</script>
<body>
	<h2>Welcome home!</h2>
	<div>
		<a href="home">HOME</a>
		<form name="go" action="home">
			<br> <input type="submit" value="GoHOME" /> <br> <br>
			<input type="button" value="GoHOME-S" onclick="submit()" /> <br>
			<br> <input type="button" value="GoHOME-A" onclick="submitA()" />
		</form>
	</div>
</body>
</html>
