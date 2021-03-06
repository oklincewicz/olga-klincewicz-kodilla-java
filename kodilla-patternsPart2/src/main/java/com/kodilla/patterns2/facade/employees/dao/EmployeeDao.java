package com.kodilla.patterns2.facade.employees.dao;

import com.kodilla.patterns2.facade.employees.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    @Query
    List<Employee> searchEmployeeByLastname(@Param("fragmentOfEmplyeeLastName") String lastname);
}
