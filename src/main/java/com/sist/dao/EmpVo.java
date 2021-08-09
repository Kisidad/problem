package com.sist.dao;
import java.util.*;
import java.util.Date;
import java.sql.*;
//emp table 에  있는 컬럼 목록 


public class EmpVo {
	private int empno,mgr,sal,comm,deptno ;
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	private String ename,job;
	private Date hiredate;
	private DeptVo dvo=new DeptVo();
	private SalgradeVo svo=new SalgradeVo();
	// 조인 => 포함 클래스  이용한다 => mybatis
	
	
	public int getEmpno() {
		return empno;
	}
	public DeptVo getDvo() {
		return dvo;
	}
	public void setDvo(DeptVo dvo) {
		this.dvo = dvo;
	}
	public SalgradeVo getSvo() {
		return svo;
	}
	public void setSvo(SalgradeVo svo) {
		this.svo = svo;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getComm() {
		return comm;
	}
	public void setComm(int comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	

}
