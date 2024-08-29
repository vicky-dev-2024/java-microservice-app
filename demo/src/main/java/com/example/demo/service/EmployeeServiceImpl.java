package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entity.Employee;

import jakarta.transaction.Transactional;
@Repository
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {
       return employeeDAO.findAll();
    }
    @Override
    public Employee findById(int theId) {
       return employeeDAO.findById(theId);
    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
       return employeeDAO.save(theEmployee);
    }
    @Transactional
    @Override
    public void deleteById(int theId) {
         employeeDAO.deleteById(theId);;
    }
    
}
