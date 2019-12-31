package com.csie.contorller;

import com.csie.pojo.Employee;
import com.csie.service.EmployeeService;
import com.csie.utils.CSIEJSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wangzh
 * Date: 2019-12-31
 * Time: 10:29
 *
 * @author wangzh
 */
@Api(value = "员工", tags = {"员工相关的api接口"})
@RestController
@RequestMapping("employee")
public class EmployeeController {

  private Logger logger = LoggerFactory.getLogger(EmployeeController.class);
  private final EmployeeService employeeService;

  public EmployeeController(EmployeeService employeeService) {
    this.employeeService = employeeService;
  }
  @ApiOperation(value = "根据id获取员工信息", notes = "根据id获取员工信息", httpMethod = "GET")
  @ApiImplicitParam(name = "id",value = "用户id")
  @GetMapping("/getEmployee/{id}")
  public CSIEJSONResult getEmployee(@PathVariable int id) {
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
//    return employeeService.getEmployee(id);
    return CSIEJSONResult.ok(employeeService.getEmployee(id));
  }
  @ApiOperation(value = "根据id获取员工信息", notes = "根据id获取员工信息", httpMethod = "GET")
  @ApiImplicitParam(name = "id",value = "用户id")
  @GetMapping("/getEmployees/{id}")
  public Employee getEmployees(@PathVariable int id) {
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
//    return employeeService.getEmployee(id);
    return employeeService.getEmployee(id);
  }

}
