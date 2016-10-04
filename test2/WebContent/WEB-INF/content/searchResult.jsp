<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<title>书目查询系统</title>
	<link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box">
	<div class="cent-box-header">
		<h1 class="main-title hide">lab2</h1>
		<h2 class="sub-title">樊昱才lab2 - BookDB System</h2>
	</div>

	<div class="cont-main clearfix">
		<div class="index-tab">
			<div class="index-slide-nav">
				<a class="active">查询</a>
				<a >添加</a>
				<a >编辑</a>
				<div class="slide-bar"></div>				
			</div>
		</div>


<!-- 这里加入显示的作者的全部图书 -->



<!-- 这里加入显示的作者的全部图书 -->

		<div class="login form">
			<div class="group">
				<div class="group-ipt authorsName">
					<input type="text" name="authorsName" id="authorsName" class="ipt">
				</div>
			</div>
		</div>

		<div class="button">
			<button type="submit" class="login-btn register-btn" id="button">查询该作者的图书</button>
		</div>
	</div>
</div>


<!-- background -->
<div class="footer">
	<p>lab2 - 樊昱才 1140320213</p>
</div>
<script src='js/particles.js' type="text/javascript"></script>
<script src='js/background.js' type="text/javascript"></script>
<script src='js/jquery.min.js' type="text/javascript"></script>
<script src='js/layer/layer.js' type="text/javascript"></script>
<script src='js/index.js' type="text/javascript"></script>

</body>
</html>