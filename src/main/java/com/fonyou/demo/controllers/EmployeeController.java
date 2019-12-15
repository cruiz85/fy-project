package com.fonyou.demo.controllers;

import com.fonyou.demo.models.Employee;
import com.fonyou.demo.services.EmployeeManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fonyou/api/employees")
public class EmployeeController {


    @Autowired
    private EmployeeManagerService service;

    @PostMapping(value = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Employee create(@RequestBody Employee employee) {

        return service.save(employee);
    }
}
