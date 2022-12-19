<DOCTYPE html>
<html>
	<head>
		<title>adminHome</title>
	</head>
	<body>
		<table>
			<tr>
				<th>FirstName</th>
				<td>${sessionScope.AUTH_ADMIN.firstName }</td>
			</tr>
			<tr>
				<th>LastName</th>
				<td>${sessionScope.AUTH_ADMIN.lastName }</td>
			</tr>
			<tr>
				<th>EmailId</th>
				<td>${sessionScope.AUTH_ADMIN.emailId }</td>
			</tr>
			<tr>
				<th>password</th>
				<td>${sessionScope.AUTH+ADMIN.password }</td>
			</tr>
			<tr>
				<th>MobileNumber</th>
				<td>${sessionScope.AUTH_ADMIN.mobileNumber }</td>
			</tr>
			<tr>
				<td colspan="2">
					
				</td>
			</tr>
		</table>
	</body>
</html>