package com.caihao.springbootdemo.service.impl;

import com.caihao.springbootdemo.entity.CopyEmp;
import com.caihao.springbootdemo.mapper.CopyEmpMapper;
import com.caihao.springbootdemo.service.CopyEmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 13:38
 */
@Service
public class CopyEmpServiceImpl implements CopyEmpService {

  @Autowired
  private CopyEmpMapper copyEmpMapper;

  @Override
  public PageInfo<CopyEmp> getCopyEmpList(Integer pageNum) {
    PageHelper.startPage(pageNum, 10);
    List<CopyEmp> copyEmpList = copyEmpMapper.selectCopyEmpList();
    return new PageInfo<>(copyEmpList);
  }
}
