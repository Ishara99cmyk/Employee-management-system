package lk.ac.vau.fas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.models.Employee;

@RestController
@RequestMapping("/emp")
public class EmployeeController extends GenericController<Employee, String> {

}
