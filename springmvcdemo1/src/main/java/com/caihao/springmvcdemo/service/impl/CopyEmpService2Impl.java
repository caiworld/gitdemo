package com.caihao.springmvcdemo.service.impl;

import com.caihao.springmvcdemo.entity.CopyEmp2;
import com.caihao.springmvcdemo.mapper.CopyEmpMapper2;
import com.caihao.springmvcdemo.service.CopyEmpService2;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 16:33
 */
@Service
public class CopyEmpService2Impl implements CopyEmpService2 {

  @Autowired
  private CopyEmpMapper2 copyEmpMapper2;

  @Override
  public PageInfo<CopyEmp2> getCopyEmpList(Integer pageNum) {
    PageHelper.startPage(pageNum,10);
    List<CopyEmp2> copyEmpList = copyEmpMapper2.selectCopyEmpList();
    PageInfo<CopyEmp2> pageInfo = new PageInfo<>(copyEmpList);
    for (CopyEmp2 copyEmp2 : pageInfo.getList()) {
      System.out.println(copyEmp2);
    }
    return pageInfo;
  }
}
