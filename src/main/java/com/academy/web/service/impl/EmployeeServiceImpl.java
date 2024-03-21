package com.academy.web.service.impl;

import com.academy.web.model.domain.Employee;
import com.academy.web.model.repository.EmployeeRepository;
import com.academy.web.service.EmployeeService;
import com.academy.web.service.SalaryService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;
  private final SalaryService salaryService;
  @Override
  public List<Employee> getEmployees() {
    int salary = salaryService.getSalary(1);

    return employeeRepository.findAll();
  }

  @Override
  public Employee getEmployee(Integer id) {
    return employeeRepository.getReferenceById(id);
  }
}
