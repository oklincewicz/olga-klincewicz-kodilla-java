package com.kodilla.patterns2.facade.employees;

//import com.kodilla.patterns2.facade.employees.dao.CompanyDao;
//import com.kodilla.patterns2.facade.employees.dao.EmployeeDao;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class EmployeesTestSuite {
//    @Autowired
//    private CompanyDao companyDao;
//    @Autowired
//    private EmployeeDao employeeDao;

//    @Test
//    public void testSearchCompanyByFragmentName() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        companyDao.save(softwareMachine);
//        companyDao.save(dataMaesters);
//        companyDao.save(greyMatter);
//
//        employeeDao.save(johnSmith);
//        employeeDao.save(stephanieClarckson);
//        employeeDao.save(lindaKovalsky);
//
//        String fragmentOfCompanyName = new Company().setFragmentOfCompanyName(String "at");
//
//        //When
//        List<Company> companyByFragmenName = companyDao.retrieveCompanyByFragmenName(fragmentOfCompanyName);
//
//        //Then
//        Assert.assertEquals(2, companyByFragmenName.size());
//
//        //CleanUp
//        employeeDao.deleteAll();
//        companyDao.deleteAll();
//
//    }
//
//    @Test
//    public void testNamedQueriesForCompanyAndEmployee() {
//        //Given
//        Employee johnSmith = new Employee("John", "Smith");
//        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
//        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
//
//        Company softwareMachine = new Company("Software Machine");
//        Company dataMaesters = new Company("Data Maesters");
//        Company greyMatter = new Company("Grey Matter");
//
//        softwareMachine.getEmployees().add(johnSmith);
//        dataMaesters.getEmployees().add(stephanieClarckson);
//        dataMaesters.getEmployees().add(lindaKovalsky);
//        greyMatter.getEmployees().add(johnSmith);
//        greyMatter.getEmployees().add(lindaKovalsky);
//
//        johnSmith.getCompanies().add(softwareMachine);
//        johnSmith.getCompanies().add(greyMatter);
//        stephanieClarckson.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(dataMaesters);
//        lindaKovalsky.getCompanies().add(greyMatter);
//
//        companyDao.save(softwareMachine);
//        companyDao.save(dataMaesters);
//        companyDao.save(greyMatter);
//
//        employeeDao.save(johnSmith);
//        employeeDao.save(stephanieClarckson);
//        employeeDao.save(lindaKovalsky);
//
//        String fragmentOfEmplyeeLastName = new Employee().setFragmentOfEmplyeeLastName(String "k"););
//
//        //When
//        List<Employee> employeesLastName = employeeDao.retrieveEmplyeeByFragmenLastName("fragmentOfEmplyeeLastName");
//
//
//        //Then
//        Assert.assertEquals(2, employeesLastName.size());
//
//        //CleanUp
//        employeeDao.deleteAll();
//        companyDao.deleteAll();
//
//    }

//}
