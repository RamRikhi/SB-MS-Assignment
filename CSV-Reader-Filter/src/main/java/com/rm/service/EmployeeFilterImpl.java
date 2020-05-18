package com.rm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rm.model.Employee;

@Service
public class EmployeeFilterImpl implements IEmployeeFilter {

	@Override
	public List<Employee> empDataFilter(List<Employee> empList) {
		
		return empList.stream()
		                             .filter(emp -> emp.getEmpSal() >= 5000.00)
		                             .collect(Collectors.toList());
	}

}
