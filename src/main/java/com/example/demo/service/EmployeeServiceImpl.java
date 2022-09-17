package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEployeeService{


    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee addEmployee(Employee employee) {
        if(employee!=null)
        {
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public Employee updateEmployee(String uid, Employee employee) {
        if(employee!=null)
        {
            Employee employee1 = employeeRepository.getById(uid);
            if(employee1!=null)
            {
                employee1.setName(employee.getName());
                employee1.setAddress(employee1.getAddress());

                return employeeRepository.save(employee1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteEmployee(String id) {
        if(id!=null)
        {
            Employee employee = employeeRepository.getById(id);
            if(employee!=null)
            {
                employeeRepository.delete(employee);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getOneEmployee(String uid) {
        return employeeRepository.getById(uid);
    }
}
