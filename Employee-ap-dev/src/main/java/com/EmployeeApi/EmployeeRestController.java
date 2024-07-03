package com.EmployeeApi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeRestController {
	@Autowired
	
	EmployeeManager empservice;
	@RequestMapping("/")

	String getAllEmpData(int arr[]) {
		//int arr[] = {11,23,15,22,5,34};
		
		
		return "hello world";

	}

	@GetMapping("/employees")
	List<Employee>  getAllEmp() {
		
		return empservice.getEmpData();

	}
	@PostMapping("/employees")
	Employee saveEmpData(@RequestBody Employee employees) {
		return empservice.SaveEmpData();
	
	}

}
