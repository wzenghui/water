package com.csie.service;

import com.csie.pojo.Employee;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wangzh
 * Date: 2019-12-31
 * Time: 10:25
 */
public interface EmployeeService {

  Employee getEmployee(int id);

  void saveEmployee();

  void updateEmployee(int id);

  void deleteEmployee(int id);
}
