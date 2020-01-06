<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<h3>审核记录</h3>
	<form action="update">
		关键字 <input type="text" name="guan" value="${y.guan }">
		描述 <input type="text" name="desc" value="${y.desc }"><br>
		编号<input type="text" name="id" value="${y.id }">
		公司名称<input type="text" name="name" value="${name }"><br>
		主营生产<input type="text" name="goods" value="${y.goods }">
		地址<input type="text" name="addr" value="${y.addr }">
		注册资本（万元）<input type="text" name="res" value="${y.res }">
		成立时间<input type="text" name="ctime" value="${y.ctime }"><br>
		年检日期<input type="date" name="ydate">
		年检状态<select name="tai">
		<option value="通过">通过</option>
		<option value="未通过">未通过</option>
		<option value="待定">待定</option>
		</select>
		年检备注<input type="area" name="bei">
		<input type="submit" value="提交">
	</form>
	
</body>
</html>