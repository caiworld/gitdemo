package com.caihao.springmvcdemo.controller;


import com.caihao.springmvcdemo.service.CopyEmpService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 15:03
 */
@RestController
@RequestMapping("/copy_emp")
public class CopyEmpController2 {

  @Autowired
  private CopyEmpService2 copyEmpService2;

  @GetMapping("/get_list")
  public Object getCopyEmpList(@RequestParam(defaultValue = "1") Integer pageNum) {
    return copyEmpService2.getCopyEmpList(pageNum).getList().size() + "";
  }

}
