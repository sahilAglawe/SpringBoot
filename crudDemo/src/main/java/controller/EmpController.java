package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import entity.Employee;
import service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    // POST - Add Employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return empService.saveEmployee(employee);
    }

    // GET - Get All Employees
    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return empService.getAllEmployees();
    }
}
