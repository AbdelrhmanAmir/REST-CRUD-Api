package com.amir.CRUD.Rest;

import com.amir.CRUD.Entity.Employee;
import com.amir.CRUD.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
    private EmployeeService employeeService;

    public RestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id){
        return employeeService.findById(id);
    }
    @PostMapping("/employees")
    public Employee save(@RequestBody Employee employee){
        employee.setId(0);
        employeeService.add(employee);
        return employee;
    }
    @PutMapping("/employees")
    public Employee update(@RequestBody Employee employee){
        employeeService.add(employee);
        return employee;
    }
    @DeleteMapping("/employees/{id}")
    public Employee delete(@PathVariable int id){
        Employee deleted = employeeService.findById(id);
        employeeService.delete(id);
        return deleted;
    }
}
