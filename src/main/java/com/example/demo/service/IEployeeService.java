package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface IEployeeService {
    //Ham them nhan vien
    public Employee addEmployee(Employee employee);

    //Ham chinh sua thong tin nhan vien
    public Employee updateEmployee(String uid, Employee employee);

    //Ham xoa nhan vien
    public boolean deleteEmployee(String uid);

    //Ham lay ra danh sach nhan vien
    public List<Employee> getAllEmployee();

    //Ham lay ra mot nhan vien
    public Employee getOneEmployee(String uid);
}
