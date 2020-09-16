package com.subarna.lambda.stream;

import com.subarna.lambda.model.Employee;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {

    public static void main(String[] args) {
        Employee e1 = new Employee(10 , "John1111111" , 100);
        Employee e2 = new Employee(20 , "John2333" , 200);
        Employee e3 = new Employee(30 , "John33336" , 30);
        Employee e4 = new Employee(40 , "John4876" , 400);

        List<Employee> employeeList = Arrays.asList(e1,e2,e3,e4);
        Stream<Employee> stream = employeeList.stream();
        Stream<Employee> employeeStream = Stream.of(e1, e2, e3, e4);

        Consumer<Employee> employeeConsumer = emp -> System.out.println("emp name:" + emp.getName());
        employeeList.stream()
                .forEach(employeeConsumer);

        employeeList
                .stream()
                .forEach( e -> System.out.println(e.getName()));




        Function<Employee , String> employeeStringFunction = emp -> emp.getName();
        List<String> collect = employeeList.stream()
                .map(employeeStringFunction)
                .collect(Collectors.toList());

        System.out.println(collect);

        employeeList.stream()
                .map(e ->
                        e.getName())
                .forEach( e -> System.out.println(e));

        List<Integer> collect1 = employeeList.stream()
                .map(e -> e.getName())
                .map(e -> e.length())
                .collect(Collectors.toList());

        System.out.println(collect1);


        employeeList.stream()
                .filter( e -> e.getSalary() >= 10)
                .forEach( e -> System.out.println(e));



    }

}
