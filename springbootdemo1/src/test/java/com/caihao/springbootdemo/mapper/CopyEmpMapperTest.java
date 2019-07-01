package com.caihao.springbootdemo.mapper;

import com.caihao.springbootdemo.entity.CopyEmp;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.Validate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * TODO
 *
 * @author caihao
 * @date 2019/7/1 14:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
//@Slf4j
public class CopyEmpMapperTest {

  @Autowired
  private CopyEmpMapper copyEmpMapper;

  @Test
  public void selectCopyEmpList() {
    List<CopyEmp> copyEmpList = copyEmpMapper.selectCopyEmpList();
    Validate.isTrue(copyEmpList.size() > 0, "查询不到数据");
    for (CopyEmp copyEmp : copyEmpList) {
//      log.info(copyEmp.toString());
      System.out.println(copyEmp);
    }
    System.out.println(copyEmpList.size());
//    log.info(copyEmpList.size()+"");
  }
}