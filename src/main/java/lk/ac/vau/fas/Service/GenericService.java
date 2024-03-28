package lk.ac.vau.fas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import lk.ac.vau.fas.repo.GenericRepo;

public class GenericService<T,K> {
	@Autowired
	private GenericRepo<T, K> repo;
	
	//get all
	public List<T> getAll(){
		return repo.findAll();
	}
	
	//get a element
	public T getEle(K id) {
		return repo.findById(id).get();
	}
	
	//add element
	public T addEle(T t) {
		return repo.save(t);
	}
	
	//update element
	public String updateEle(T t, K id) {
		if(repo.findById(id).isEmpty()) {
			return "404 Element not found";
		}
		else {
			repo.save(t);
			return "Updated";
		}
	}
	
	//delete element
		public String deleteEle(T t, K id) {
			if(repo.findById(id).isEmpty()) {
				return "404 Element not found";
			}
			else {
				repo.deleteById(id);
				return "Deleted";
			}
		}
	

}
