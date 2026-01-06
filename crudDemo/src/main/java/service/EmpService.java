package service;

import java.util.List;

import entity.Employee;

public interface EmpService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
}