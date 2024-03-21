package com.academy.web.service;

import com.academy.web.model.domain.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> getEmployees();
  Employee getEmployee(Integer id);
}
