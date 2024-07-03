package com.EmployeeApi;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager implements employeedata{

	


	@Override
	public List<Employee> getEmpData() {
		List<Employee>emList= Arrays.asList(new Employee(123,"sami","abe","samiabe@gmail.com","Developer"));
	
		
		return emList;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee postEmpData() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee SaveEmpData() {
		List<Employee>emList= Arrays.asList(new Employee(1234,"dani","abe","daniabe@gmail.com","Developer"));
		// TODO Auto-generated method stub
		return (Employee) emList;
		
	}

	@Override
	public void deleteEmpData() {
		// TODO Auto-generated method stub
		
	}

}
