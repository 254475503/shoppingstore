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
<title>点评-合众饰品专卖</title>
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
  var goodsID;
  function addComment(gid){

   url="commentinfo"+gid;
   var li=$(".model")
   $post(url,function(data){
       for(var i=0;i<data.length;i++){
           goodsID=data[i].goodsId;
           li.find(".user_infor").find("span:eq(0)").find("img").attr("src","upload/"+data[i].scommMemberavatar);
           li.find(".user_infor").find("span:eq(1)").find("em").html(data[i].scommMembername);
           li.find(".user_infor").find("span:eq(1)").find("time").html(data[i].createTime);
           li.find(".comment_cont_txt").html(data[i].scommContent);
          $(".comment_cont ul").append("<li>"+li.html()+"</li>");
       }
   })
  }

 </script>
</head>
<body>
<!--header-->
<header>
 <a href="javascript:history.go(-1);" class="iconfont backIcon">&#60;</a>
 <h1>点评</h1>
</header>
<div class="comment_input">
 <textarea placeholder="输入评论内容..." name="context"></textarea>
 <input type="button" value="评论" onclick="location.href='addComment?=${goodsID}'"/>
</div>
<div class="comment_cont">
 <ul>
  <li class="model">
   <div class="user_infor">
    <span class="user_pic"><img src="${c.scommMemberavatar}"/></span>
    <span class="rt_infor">
     <em>${c.scommMembername}</em>
     <time>${c.createTime}</time>
    </span>
   </div>
   <div class="comment_cont_txt">${c.scommContent}</div>
  </li>
 </ul>
</div>

</body>
</html>
