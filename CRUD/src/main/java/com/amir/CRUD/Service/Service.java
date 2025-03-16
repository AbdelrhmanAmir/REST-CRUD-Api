package com.amir.CRUD.Service;

import com.amir.CRUD.Entity.Employee;

import java.util.List;

public interface Service {
    List<Employee> findAll();
    Employee findById(int id);
    Employee add(Employee employee);
    void delete(int id);
}
