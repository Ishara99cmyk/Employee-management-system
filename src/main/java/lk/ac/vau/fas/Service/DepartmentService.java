package lk.ac.vau.fas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.ac.vau.fas.models.Department;
import lk.ac.vau.fas.repo.DepartmentRepo;

@Service
public class DepartmentService extends GenericService<Department, Integer> {
	@Autowired
	private DepartmentRepo repo;
	
	public int countEmployees(int id) {
		return repo.employeeCount(id);
	}
	
	public Department maxEmployee() {
		return repo.maxEmployeeDepartment();
	}

}
