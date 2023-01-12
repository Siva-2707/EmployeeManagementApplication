package com.siva.goal.repository;

import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @AfterEach
    void tearDown() {
        employeeRepository.deleteAll();
    }
    /*
    @Test
    void searchFilterShouldWork() {
        //given
        Employee employee = new Employee();
        String firstName = "Siva";
        employee.setFirstName(firstName);
        employee.setLastName("Rajesh");
        employee.setEmail("b.siva@gmail.com");
        employeeRepository.save(employee);
        //when
        boolean doesfirstNameExist = employeeRepository.findByName(new String[] { "Siva" }).isEmpty();
        boolean doesLastNameExist = employeeRepository.findByName(new String[] { "Rajesh" }).isEmpty();
        //then
        assertEquals(true, doesfirstNameExist);
        assertEquals(true, doesLastNameExist);
    }
    
    @Test
    void searchFilterShouldNotWork() {
        //given
        String[] firstName = { "Siva" };
        //when
        boolean firstNamedoesNotExist = employeeRepository.findByName(firstName).isEmpty();
        //then
        assertEquals(true, firstNamedoesNotExist);
    }
    
    */
}
