package com.csie.service.impl;

import com.csie.mapper.EmployeeMapper;
import com.csie.pojo.Employee;
import com.csie.service.EmployeeService;
import tk.mybatis.mapper.entity.Example;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: wangzh
 * Date: 2019-12-31
 * Time: 10:25
 *
 * @author wangzh
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

  private final EmployeeMapper employeeMapper;

  public EmployeeServiceImpl(EmployeeMapper employeeMapper) {
    this.employeeMapper = employeeMapper;
  }

  @Transactional(propagation = Propagation.REQUIRED)
  @Override
  public Employee getEmployee(int id) {
    Example example = new Example(Employee.class);
    Example.Criteria criteria = example.createCriteria();
    criteria.andEqualTo("id", id);
    return employeeMapper.selectOneByExample(example);
//    return employeeMapper.selectByPrimaryKey(id);
  }

  @Override
  public void saveEmployee() {

  }

  @Override
  public void updateEmployee(int id) {

  }

  @Override
  public void deleteEmployee(int id) {

  }
}
