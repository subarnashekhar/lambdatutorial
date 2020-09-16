package com.subarna.lambda.runner;


import com.subarna.lambda.model.Employee;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Consumer;


/*
@FunctionalInterface
public interface Predicate<T> {

 boolean test(T t);
}


@FunctionalInterface
public interface Supplier<T> {

    T get();
            }
}


@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);

    }

    @FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

 }
 */
public class EmployeeRunnerLambda {

    public static void main(String[] args){

        Predicate<Employee> employeePredicate = emp -> emp.getName().length() > 10 ;

        System.out.println(employeePredicate.test(new Employee(10, "sair" , 200)));

        Predicate<String> stringPredicate = str -> str.length() > 10 ;

        Supplier<Employee> employeeSupplier = () -> {
            System.out.println("Inside lambda supplier");
            Employee emp = new Employee(20, "sar" , 300);
            return emp;
        };

        Supplier<Employee> employeeSupplier1 = () -> new Employee(10,"sar" , 2000);

        System.out.println(employeeSupplier1.get());

        Function<Employee , String> employeeStringFunction = (Employee emp ) ->
        {
            System.out.println("it is a function");
            return emp.getName() + "_ dept";
        };


        System.out.println(employeeStringFunction.apply(new Employee(30 , "SaritGaine" , 2000)));

        Consumer<Employee> employeeConsumer = (Employee emp ) -> {
            System.out.println("Employee name : " +   emp.getName() +   "employee salry" + (emp.getSalary() + 200)) ;
        };

        Consumer<Employee> employeeConsumer1 = emp -> System.out.println(emp);

        Employee sarir = new Employee(20, "Sarir", 30000);
        employeeConsumer1.accept(sarir);

    }
}
