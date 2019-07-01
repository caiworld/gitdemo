package com.caihao.springbootdemo.controller;

import com.caihao.springbootdemo.entity.CopyEmp;
import com.caihao.springbootdemo.service.CopyEmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 12:09
 */
@RestController
@RequestMapping("/copy_emp")
public class CopyEmpController {

  @Autowired
  private CopyEmpService copyEmpService;

  @GetMapping("/get_copy_emp_list")
  public Object getCopyEmpList(@RequestParam(defaultValue = "1") Integer pageNum) {
    PageInfo<CopyEmp> pageInfo = copyEmpService.getCopyEmpList(pageNum);
    for (CopyEmp copyEmp : pageInfo.getList()) {
      System.out.println(copyEmp);
    }
    return pageInfo.getList().size();
  }
}
