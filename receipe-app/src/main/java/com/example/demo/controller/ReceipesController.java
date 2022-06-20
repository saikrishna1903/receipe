package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Receipes;
import com.example.demo.service.service;

import java.util.List;

@Controller
public class ReceipesController {
	@Autowired
	service ser;
	
	
	@RequestMapping("/add")
	public String addd(Receipes r) {
		System.out.println("gasss");
		ser.save(r);
		return "Homepage";
	}
	@RequestMapping("/")
	public ModelAndView getall(ModelAndView mv) {
		List<Receipes> R= ser.findall();
		mv.addObject("R",R);
		mv.setViewName("Home");
		return mv;
	}
	@RequestMapping("/s")
	public String gat() {
		return "delete";
	}
	
	@RequestMapping("/delete")
	public String deletebyid(@RequestParam int id) {
		ser.delete(id);
		return "Home";
	}
	@RequestMapping("/update")
	public String updatevalue(@RequestParam Receipes r,int id) {
		ser.update(r,id);
		return "Home";
	}
	
}
