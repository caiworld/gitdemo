package com.caihao.springmvcdemo.entity;

import java.util.Date;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 15:36
 */
public class CopyEmp2 {
  /**
   * 员工编号
   */
  private Integer empno;
  /**
   * 员工姓名
   */
  private String ename;
  /**
   * 职位
   */
  private String job;
  /**
   * 上司
   */
  private Integer mgr;
  /**
   * 入职时间
   */
  private Date hiredate;
  /**
   * 工资
   */
  private Double sal;
  /**
   * 奖金
   */
  private Double comm;
  /**
   * 部门编号
   */
  private Integer deptno;

  public CopyEmp2() {
  }

  public CopyEmp2(Integer empno, String ename, String job, Integer mgr, Date hiredate,
      Double sal, Double comm, Integer deptno) {
    this.empno = empno;
    this.ename = ename;
    this.job = job;
    this.mgr = mgr;
    this.hiredate = hiredate;
    this.sal = sal;
    this.comm = comm;
    this.deptno = deptno;
  }

  public Integer getEmpno() {
    return empno;
  }

  public void setEmpno(Integer empno) {
    this.empno = empno;
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

  public Integer getMgr() {
    return mgr;
  }

  public void setMgr(Integer mgr) {
    this.mgr = mgr;
  }

  public Date getHiredate() {
    return hiredate;
  }

  public void setHiredate(Date hiredate) {
    this.hiredate = hiredate;
  }

  public Double getSal() {
    return sal;
  }

  public void setSal(Double sal) {
    this.sal = sal;
  }

  public Double getComm() {
    return comm;
  }

  public void setComm(Double comm) {
    this.comm = comm;
  }

  public Integer getDeptno() {
    return deptno;
  }

  public void setDeptno(Integer deptno) {
    this.deptno = deptno;
  }

  @Override
  public String toString() {
    return "CopyEmp2{" +
        "empno=" + empno +
        ", ename='" + ename + '\'' +
        ", job='" + job + '\'' +
        ", mgr=" + mgr +
        ", hiredate=" + hiredate +
        ", sal=" + sal +
        ", comm=" + comm +
        ", deptno=" + deptno +
        '}';
  }
}
