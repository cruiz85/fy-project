package com.fonyou.demo.services;

import com.fonyou.demo.models.Employee;
import com.fonyou.demo.store.EmployeeStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagerImpl implements EmployeeManagerService {

    @Autowired
    private EmployeeStore employeeStore;

    @Override
    public Employee save(Employee employee) {
        return employeeStore.save(employee);
    }
}
