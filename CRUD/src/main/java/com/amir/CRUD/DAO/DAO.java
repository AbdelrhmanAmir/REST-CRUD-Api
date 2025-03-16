package com.amir.CRUD.DAO;

import com.amir.CRUD.Entity.Employee;

import java.util.List;

public interface DAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee add(Employee employee);
    void delete(int id);

}
