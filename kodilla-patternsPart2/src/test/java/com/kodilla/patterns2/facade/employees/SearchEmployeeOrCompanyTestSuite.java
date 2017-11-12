package com.kodilla.patterns2.facade.employees;

import com.kodilla.patterns2.facade.employees.dao.CompanyDao;
import com.kodilla.patterns2.facade.employees.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchEmployeeOrCompanyTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testSearchCompanyByFragmentName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");
        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);
        //When
        List<Company> companyByFragmenName = searchFacade.findCompany("dat");
        //Then
        Assert.assertEquals(1, companyByFragmenName.size());
        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testSearchEmployeeByFragmentLastname() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Klarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
        //When
        List<Employee> employeesByLastname = searchFacade.findEmployees("k");
        //Then
        Assert.assertEquals(2, employeesByLastname.size());
        //CleanUp
        employeeDao.deleteAll();
        companyDao.deleteAll();
    }
}
