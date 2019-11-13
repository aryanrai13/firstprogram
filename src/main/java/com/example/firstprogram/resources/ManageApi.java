package com.example.firstprogram.resources;

import com.example.firstprogram.models.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
@RestController
@RequestMapping("/employee")
public class ManageApi {

    List<Employee>  employees = Arrays.asList(
            new Employee("Deepak","India",100),
            new Employee("Taruna","India",1000)
    );


    @RequestMapping("/{id}")
    public Employee  getEmployee(@PathVariable("id") Integer id) {

        return new Employee( "Deepak", "India", id);
    }


         @RequestMapping("/getemployee")
         public List<Employee>  getEmployee() {

             return employees;
         }

    @RequestMapping(value = "/addemployee", method = RequestMethod.POST)
       public List<Employee>  addEmployee(@RequestBody Employee employee) {

        Employee emp = new Employee(employee);
        employees.add();
        return employees;
    }
}
*/