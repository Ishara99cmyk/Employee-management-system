package lk.ac.vau.fas.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lk.ac.vau.fas.models.Department;
@Repository
public interface DepartmentRepo extends GenericRepo<Department, Integer> {
	@Query("select count(*) from Employee where department.id = ?1")
	public int employeeCount(int did);
	
	@Query("select department from Employee group by department.id order by count(*) desc limit 1 ")
	//select department_id ,count(*) from employee group by department_id order by count(*) desc limit 1;
	public Department maxEmployeeDepartment();
}
