package com.fonyou.demo.store;

import com.fonyou.demo.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeStore extends CrudRepository<Employee, Long> {
}
