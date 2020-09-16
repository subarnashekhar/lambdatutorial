package com.subarna.lambda.runner;

import com.subarna.lambda.functions.MyPredicate;
import com.subarna.lambda.model.Employee;

public class EmployeeRunner {

    public static void main(String[] args){

        MyPredicate<Employee> employeeMyPredicate = new MyPredicate<Employee>() {
            @Override
            public boolean predicateTest(Employee employee) {
                return employee.getName().length() > 10 ;
            }
        };

        Employee emp = new Employee(10,"SaritGaine1" , 1000);
        System.out.println(employeeMyPredicate.predicateTest(emp));

        MyPredicate<Employee> employeeMyPredicate1 = (Employee e ) -> {
            System.out.println(e);
            return e.getName().length() > 10 ;
        };

        MyPredicate<Employee> employeeMyPredicate2 = e -> e.getName().length() > 10 ;

        System.out.println(employeeMyPredicate2.predicateTest(new Employee(20, "sarit", 1000)));

    }
}
