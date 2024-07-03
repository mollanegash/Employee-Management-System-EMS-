package com.EmployeeApi;

import java.util.List;

public interface employeedata {
	List<Employee> getEmpData();
	Employee postEmpData();
	Employee SaveEmpData();
	void deleteEmpData();
	

}
