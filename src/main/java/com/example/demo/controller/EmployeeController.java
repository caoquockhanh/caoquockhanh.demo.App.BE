package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.IEployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEployeeService iEployeeService;

    //API add employee
    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return iEployeeService.addEmployee(employee);
    }

    //API update employee
    @PutMapping("/update")
    public Employee updateEmployee(@RequestParam("uid") String uid, @RequestBody Employee employee)
    {
        return iEployeeService.updateEmployee(uid, employee);
    }

    //API delete Employee
    @DeleteMapping("/delete{uid}")
    public boolean deleteEmployee(@PathVariable("uid") String uid)
    {
        return iEployeeService.deleteEmployee(uid);
    }

    //API lay danh sach
    @GetMapping("/list")
    public List<Employee> getAllEmployee()
    {
        return iEployeeService.getAllEmployee();
    }
}
