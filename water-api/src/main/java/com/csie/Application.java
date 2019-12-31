package com.csie;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wangzh
 * Date: 2019-12-31
 * Time: 9:43
 *
 * @author wangzh
 */
@SpringBootApplication
/**
 *扫描 mybatis 通用 mapper 所在的包
 */
@MapperScan(basePackages = "com.csie.mapper")
//// 扫描所有包以及相关组件包
//@ComponentScan(basePackages = {"com.csie"})
@EnableSwagger2
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
