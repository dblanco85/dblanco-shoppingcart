package db.evaluation.springboot.service;

import java.util.List;

public interface ICrud<T> {

	T save(T obj);
	
	T update(T obj);
	
	List<T> getAll();
	
	T getById(Integer id);
	
	boolean delete(Integer id);
	
}
