package lk.ac.vau.fas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lk.ac.vau.fas.Service.GenericService;

public abstract class GenericController<T, K> {
	@Autowired
	private GenericService<T, K> service;
	
	@GetMapping
	public List<T> getAllEntities(){
		return service.getAll();
	}
	
	@GetMapping("{id}")
	public T getEntity(@PathVariable("id") K id) {
		return service.getEle(id);
	}
	
	@PostMapping
	public T addEntity(@RequestBody T t) {
		return service.addEle(t);
	}
	
	@PutMapping("{id}")
	public String updateEntity(@PathVariable("id")K id, @RequestBody T t) {
		return service.updateEle(t, id);
	}
	
	@DeleteMapping("{id}")
	public String deleteEntity(@PathVariable("id")K id, @RequestBody T t) {
		return service.deleteEle(t, id);
	}
	

}
