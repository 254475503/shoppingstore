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
  <title>合众饰品专卖</title>
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
  <script src="../../js/swiper.min.js"></script>
  <script>
    var v;
    $(document).ready(function(){
      var mySwiper = new Swiper('.slide',{
        autoplay:5000,
        visibilityFullFit : true,
        loop:true,
        pagination : '.pagination'
      });
      //飞入动画，具体根据实际情况调整
      $(".addToCart").click(function(){
        v=$(this);
        $.post("putcart",{goodsid:$(this).attr("title")},function(data){
          if(data=="success"){
            feiru(v);
          }else{
            alert("添加失败")
          }
        });

      });
    });

    function feiru(obj) {
      $(".hoverCart a").html(parseInt($(".hoverCart a").html()) + 1);
      /*测试+1*/
      var shopOffset = $(".hoverCart").offset();
      var cloneDiv = obj.parent().siblings(".goodsPic").clone();
      var proOffset = obj.parent().siblings(".goodsPic").offset();
      cloneDiv.css({"position": "absolute", "top": proOffset.top, "left": proOffset.left});
      obj.parent().siblings(".goodsPic").parent().append(cloneDiv);
      cloneDiv.animate({
        width: 0,
        height: 0,
        left: shopOffset.left,
        top: shopOffset.top,
        opacity: 1
      }, 1000, function () {
        $(this).remove();
      })
    }

  </script>
</head>
<body>
<!--header-->
<header>
  <a href="location.jsp" class="location">深圳市</a>
  <h1>合众饰品专卖</h1>
  <a href="search.jsp" class="rt_searchIcon">&#37;</a>
</header>
<!--slide-->
<div class="slide">
  <div class="swiper-wrapper">
      <%--循环顶部图片--%>
      <c:forEach items="${advlist}" var="b">
    <div class="swiper-slide">
      <a href="${b.advLinkUrl}">
        <img src="${b.advPicUrl}"/>
      </a>
    </div>
      </c:forEach>

  </div>
  <div class="pagination"></div>
</div>
<!--Tab:productList-->
<dl class="tab_proList">
  <dd>
    <ul>
      <c:forEach items="${goodslist}" var="g">
      <li>
        <div class="productArea">
          <a href="goodsinfo${g.goodsId}" class="goodsPic">
            <img src="upload/${g.goodsImage}"/>
          </a>
          <div class="goodsInfor">
            <h2>
              <a href="product.jsp">${g.goodsName}</a>
            </h2>
            <p>
              <del>${g.goodsPrice}</del>
            </p>
            <p>
              <strong class="price">${g.goodsSellPrice}</strong>
            </p>
            <a class="addToCart" title="${g.goodsId}">&#126;</a>
          </div>
        </div>
        <aside>
          <a class="like_icon">${g.thumbsUpNum}</a>
          <a class="comment_icon">${g.commentNum}</a>
          <a class="deal_icon">${g.goodsCollectNum}</a>
        </aside>
      </li>
      </c:forEach>
    </ul>
  </dd>
</dl>
<!--floatCart-->
<div class="hoverCart">
  <a href="cart.jsp">0</a>
</div>
<!--fixedNav:footer-->
<div style="height:1.2rem;"></div>
<nav>
  <a href="index.jsp" class="homeIcon">首页</a>
  <a href="category" class="categoryIcon">分类</a>
  <a href="cart.jsp" class="cartIcon">购物车</a>
  <a href="user.jsp" class="userIcon">我的</a>
</nav>
</body>
</html>

