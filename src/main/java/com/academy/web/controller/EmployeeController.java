package com.academy.web.controller;

import com.academy.web.model.domain.Employee;
import com.academy.web.model.repository.EmployeeRepository;
import com.academy.web.service.EmployeeService;
import com.academy.web.service.impl.EmployeeServiceImpl;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class EmployeeController {
  private final EmployeeService employeeService;

  @GetMapping("/employee")
  public String getEmployees(Model model) {
    List<Employee> employees = employeeService.getEmployees();
    model.addAttribute("employees", employees);

    return "employee";
  }
}
