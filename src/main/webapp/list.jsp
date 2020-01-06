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
	<form action="query" method="post">
		关键字 <input type="text" name="guan">
		描述 <input type="text" name="desc">
		公司名称 <input type="text" name="name">
		<br>
		注册资本 <input type="text" name="g1">- <input type="text" name="g2">
		成立时间<input type="date" name="t1">- <input type="date" name="t2">
		<input type="submit" value="查询">
	</form>
	<table>
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>描述</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本（万元）</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>年检备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${plist.list }" var="aa">
			<tr>
			<td>${aa.id }</td>
			<td>${aa.guan }</td>
			<td>${aa.desc }</td>
			<td>${aa.name }</td>
			<td>${aa.goods }</td>
			<td>${aa.addr }</td>
			<td>${aa.res }</td>
			<td>${aa.ctime }</td>
			<td>${aa.ydate }</td>
			<td>${aa.tai }</td>
			<td>${aa.bei }</td>
			<td><a href="check?id=${aa.id }">年检审核</a></td>
		</tr>
		
		</c:forEach>
		<tr>
			<td colspan="12">
				${plist.total }/${plist.pages }
				<form action="query">
					<input type="text" name="pageNum">页
					<input type="submit" value="转跳">
				</form>
			</td>
		</tr>
		
	</table>
	
	
</body>
</html>