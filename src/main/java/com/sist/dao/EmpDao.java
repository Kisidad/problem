package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpDao {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc.oracle.thin:@211.238.142.186:1521:XE";//211.238.142.186
// 드라이버 등록 
	public EmpDao()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		} catch (Exception e) {}
	}
	// 연결
	
	private void getConnection()
	{
		try 
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			
		} catch (Exception e) {}
		
	}
	// 헤제
	private void disConnection()
	{
		try 
		{
			if(ps!=null)ps.close();
			if(conn!=null)conn.close();
		} 
		catch (Exception e) {}
	}
	
	// 데이터 베이스에서 읽기 
	 public ArrayList<EmpVo>empListDate()
	 {
		 ArrayList<EmpVo> list = new ArrayList<EmpVo>();
		 try 
		 {
			 getConnection();
			 String sql ="SELECT empno,ename,job,mgr,hiredate,sal,comm,dname,loc,grade "
			 		+ "FROM emp,dept,slagrade "
			 		+ "WHERE emp.deptno=dept.deptno "
			 		+ "AND sal BETWEEN losal AND hisal";
			 // 오라클로 전송 
			 ps=conn.prepareStatement(sql);
			 // 결과값 받기 
			 ResultSet rs=ps.executeQuery();
			 
			 while(rs.next())
			 {
				 EmpVo vo= new EmpVo();
				 vo.setEmpno(rs.getInt(1));
				 vo.setEname(rs.getString(2));
				 vo.setJob(rs.getString(3));
				 vo.setMgr(rs.getInt(4));
				 vo.setHiredate(rs.getDate(5));
				 vo.setSal(rs.getInt(6));
				 vo.setComm(rs.getInt(7));
				 vo.getDvo().setDname(rs.getString(8));
				 vo.getDvo().setLoc(rs.getString(9));
				 vo.getSvo().setGrade(rs.getInt(10));
				 
				 list.add(vo);
			 }
			
		 }catch (Exception e) 
		 {
			e.printStackTrace();
		 }
		finally 
		{
			disConnection();
		}
		 return list;
		 
	 }
	 
	
	

}
