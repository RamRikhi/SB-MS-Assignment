package com.rm.service;

import java.util.List;

import com.rm.model.Employee;

public interface IEmployeeFilter {
	public List<Employee> empDataFilter(List<Employee> listEmployee);
}
