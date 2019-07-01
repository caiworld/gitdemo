package com.caihao.springbootdemo.service;

import com.caihao.springbootdemo.entity.CopyEmp;
import com.github.pagehelper.PageInfo;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 12:10
 */
public interface CopyEmpService {

  PageInfo<CopyEmp> getCopyEmpList(Integer pageNum);

}
