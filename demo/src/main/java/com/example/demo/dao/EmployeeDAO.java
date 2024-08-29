package com.example.demo.dao;
import java.util.*;

import com.example.demo.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll(); 
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}

