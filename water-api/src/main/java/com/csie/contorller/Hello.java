package com.csie.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wangzh
 * Date: 2019-12-31
 * Time: 9:47
 * @author wangzh
 */
@RestController
public class Hello {

  @GetMapping("/hello")
  public Object hello() {
    return "Hello World";
  }
}
