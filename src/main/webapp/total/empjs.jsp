<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*" errorPage="error.jsp"%>
<%
	//1. 오라클에 있는 데이터 읽어 오기 
	EmpDao dao=new EmpDao();
	ArrayList<EmpVo> list =dao.empListDate(); // list안에 있는 데이토를 화면에 출력 
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="table.css" >
<style type="text/css">
#container{

 width: 100%;
 margin-top: 30px;
 
}
table {
	margin: 0px auto;
	width: 900px;
	
}
h1 {
	text-align: center;
}

</style>
</head>
<body>
	<div id="container">
	  <h1>사원목록</h1>
	  <table class="table_content">
	    <tr>
	      <th>사원</th>
	      <th>이름</th>
	      <th>직위</th>
	      <th>사수</th>
	      <th>입사일</th>
	      <th>급여</th>
	      <th>성과급</th>
	      <th>부서명</th>
	      <th>근무지</th>
	      <th>급여등급</th>
	    </tr>
	    <%
	    	for(EmpVo vo:list)
	    	{
	    		
	    		
	    	
	    %>
	    		<!-- 여기에 html 코딩  -->
	    		<tr>
	    		  <td align="center"><%=vo.getEmpno() %></td>
	    		  <td align="center"><%=vo.getEname()%></td>
	    		  <td align="center"><%=vo.getJob() %></td>
	    		  <td align="center"><%=vo.getMgr()%></td>
	    		  <td align="center"><%=vo.getHiredate().toString() %></td>
	    		  <td align="center"><%=vo.getSal() %></td>
	    		  <td align="center"><%=vo.getComm()%></td>
	    		  <td align="center"><%=vo.getDvo().getDname() %></td>
	    		  <td align="center"><%=vo.getDvo().getLoc()%></td>
	    		  <td align="center"><%=vo.getSvo().getGrade() %></td>
	    		  
	    		  
	    	<%--<td align="center"><%= %></td> --%>
	    		  
	    		  
	    		</tr>
	    <%
	    
	    	}
	    %>
	  </table>
	</div>

</body>
</html>