package lk.ac.vau.fas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.Service.DepartmentService;
import lk.ac.vau.fas.models.Department;

@RestController
@RequestMapping("/dept")
public class DepartmentController extends GenericController<Department, Integer> {
	@Autowired
	private DepartmentService service;
	
	@GetMapping("/{id}/countemp")
	public int getNoOfEmployees(@PathVariable("id") int id) {
		return service.countEmployees(id);
	}
	
	@GetMapping("/maxemp")
	public Department maxEmployeeDepartment() {
		return service.maxEmployee();
	}

}
