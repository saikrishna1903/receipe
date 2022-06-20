package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.Repo;
import com.example.demo.model.Receipes;

@Component
public class service {
	
	@Autowired
	Repo repo;
	
	public void save(Receipes r) {
		repo.save(r);
	}
	
	public List<Receipes> findall() {
		return (List<Receipes>) repo.findAll();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	public void update(Receipes r,int id) {
		repo.save(r);
	}

}
