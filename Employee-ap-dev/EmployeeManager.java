package com.EmployeeApi;

import java.util.Arrays;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ch.qos.logback.classic.Logger;

@Service
public class EmployeeManager implements employeedata {

	@Override
	public List<Employee> getEmpData() {
		
		List<Employee>emList= Arrays.asList(new Employee(123,"sami","abe","samiabe@gmail.com","Developer");
		em
		                                  
		
		return emList;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postEmpData(@RequestBody Employee em) {
		Logger loger =LoggerFactory.getLogger(EmployeeManager.class);
		Logger.INFO_INT("posted data",em.getEmployee_id(),em.getFirst_name(),em.getLast_name(),em.getEmail(),em.getTitle());
		
		
		
		
	}

	@Override
	public void SaveEmpData() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmpData() {
		// TODO Auto-generated method stub

	}

}
