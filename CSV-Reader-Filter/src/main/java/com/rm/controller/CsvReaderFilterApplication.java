package com.rm.controller;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.rm.model.Employee;
import com.rm.service.EmployeeCSVReader;

@SpringBootApplication
@ComponentScan(basePackages = "com.rm")
public class CsvReaderFilterApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext ctx=SpringApplication.run(CsvReaderFilterApplication.class, args);
		System.out.println("CsvReaderFilterApplication.main()-1");
		EmployeeCSVReader empReader=ctx.getBean(EmployeeCSVReader.class);
		System.out.println("CsvReaderFilterApplication.main()-2");
		List<Employee> empListFilter=empReader.readCSVFile();
		empListFilter.forEach(System.out::println);
	}

}
