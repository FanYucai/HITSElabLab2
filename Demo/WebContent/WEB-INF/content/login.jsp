<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登入界面</title>
</head>
<body>
	<form action="login.action" method="post">
		<table align="center">
			<caption>
				<h3>用户登入</h3>
			</caption>
			<tr>
				<td>用户名：<input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>密&nbsp;&nbsp;码:<input type="text" name="password" /></td>
			</tr>
			<tr align="center">
				<td><input type="submit" value="登录" /><input type="reset"
					value="重填" /></td>
			</tr>
		</table>
	</form>

</body>
</html>