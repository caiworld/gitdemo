package com.caihao.springbootdemo.entity;

import java.util.Date;
import lombok.Data;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 12:10
 */
@Data
public class CopyEmp {

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

  @Override
  public String toString() {
    return "CopyEmp{" +
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
