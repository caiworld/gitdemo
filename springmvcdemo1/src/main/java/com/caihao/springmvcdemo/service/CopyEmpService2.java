package com.caihao.springmvcdemo.service;

import com.caihao.springmvcdemo.entity.CopyEmp2;
import com.github.pagehelper.PageInfo;
import java.util.List;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 15:36
 */
public interface CopyEmpService2 {

  PageInfo<CopyEmp2> getCopyEmpList(Integer pageNum);
}
