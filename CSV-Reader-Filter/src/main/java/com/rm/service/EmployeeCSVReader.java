package com.rm.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rm.model.Employee;

@Service
public class EmployeeCSVReader {
	//@Autowired
	private IEmployeeFilter empFilter;
	
	
	//@Autowired 
	public EmployeeCSVReader(IEmployeeFilter empFilter) {
		this.empFilter=empFilter;
	}

	
	public List<Employee> readCSVFile() throws Exception{
		List<Employee> empList=new ArrayList<>();
		
		FileReader fr=new FileReader("Employee.csv");
		BufferedReader br=new BufferedReader(fr);
		
		String empRow=br.readLine();
		
		while (empRow != null) {
			String[] s=empRow.split(",");
			
			String id=s[0];
			String name=s[1];
			String salary=s[2];
			
			Employee emp=new Employee();
			
			emp.setEmpId(Integer.parseInt(id));
			emp.setEmpName(name);
			emp.setEmpSal(Double.parseDouble(salary));
			
			empList.add(emp);
			
			empRow=br.readLine();
		}
		br.close();
		return empFilter.empDataFilter(empList);
	}
}













