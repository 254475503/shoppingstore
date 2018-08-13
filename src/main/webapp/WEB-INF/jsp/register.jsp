<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
 <meta charset="utf-8"/>
 <base href="<%=basePath %>"/>
<title>注册-DIY会员</title>
<meta name="keywords"  content="KEYWORDS..." />
<meta name="description" content="DESCRIPTION..." />
<meta name="author" content="HZIT" />
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name='apple-touch-fullscreen' content='yes'>
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta name="format-detection" content="telephone=no">
<meta name="format-detection" content="address=no">
<link rel="icon" href="../../images/icon/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" sizes="57x57" href="../../images/icon/apple-touch-icon-57x57-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="120x120" href="../../images/icon/apple-touch-icon-120x120-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="196x196" href="../../images/icon/apple-touch-icon-196x196-precomposed.png">
<meta name="viewport" content="initial-scale=1, width=device-width, maximum-scale=1, user-scalable=no">
<link rel="stylesheet" type="text/css" href="../../css/style.css" />
<script src="../../js/jquery.js"></script>
<script>
$(document).ready(function(){
   $(".formarea li:last input[type='button']").click(function(){
	   alert("测试跳转效果，程序对接予以删除!");
	   location.href="login.jsp";
	   });	
});
</script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>注册</h1>
</header>
<mark class="formMark">这里可以放置提示性语句！</mark>
<ul class="formarea">
 <li>
  <label class="lit">账号：</label>
  <input type="tel" placeholder="手机号码" class="textbox" placeholder="HZIT"/>
 </li>
 <li style="padding:0;"><a class="checkCode">获取手机校验码</a></li>
 <li>
  <label class="lit">校验码：</label>
  <input type="number" placeholder="输入六位校验码" class="textbox"/>
 </li>
 <li class="liLink">
  <a href="article.jsp" class="fl">《用户协议》</a>
  <a href="login.jsp" class="fr">已有账号，登录</a>
 </li>
 <li>
  <input type="button" value="立即注册"/>
 </li>
</ul>
<!--fixedNav:footer-->
<div style="height:1.2rem;"></div>
<nav>
 <a href="index.jsp" class="homeIcon">首页</a>
 <a href="category.jsp" class="categoryIcon">分类</a>
 <a href="cart.jsp" class="cartIcon">购物车</a>
 <a href="user.jsp" class="userIcon">我的</a>
</nav>
</body>
</html>
