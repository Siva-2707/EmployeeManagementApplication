package com.siva.goal.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.siva.goal.model.Employee.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
    // @Query(value = "select * from employee where FIRST_NAME  IN (?1) OR LAST_NAME  IN (?1)", nativeQuery = true)
    // public List<Employee> findByName(String[] names);

}
