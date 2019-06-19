package com.teachersapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teachersapp.model.Teacher;
import com.teachersapp.service.TeacherService;

@Controller
@RequestMapping("/teacher")
public class TeachersController {

	@Autowired
	TeacherService service;

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("teachers", this.service.getTeachers());
		return "list";
	}
	
	@GetMapping("/detail/{idTeacher}")
	public String detais(@PathVariable("idTeacher") int id, Model model) {
		
		return "detail";
	}
	
	@GetMapping("/form")
	public String form(Model model) {
		
		Teacher teacher = new Teacher();
		model.addAttribute("teacherForm", teacher);
		return "form";
	}
	
	@PostMapping("/addTeacher")
	public String submit(@Valid @ModelAttribute("teacherForm") Teacher teacher, 
			BindingResult result, Model model) {
		if(result.hasErrors()) 
			return "form";
		else {
			this.service.insertTeacher(teacher);
			model.addAttribute("teachers", this.service.getTeachers());
			return "list";
		}
			
	}
	@GetMapping("/delete/{idTeacher}")
	public String delete(@PathVariable("idTeacher") int id, Model model) {
		this.service.deleteTeacher(id);
		model.addAttribute("teachers", this.service.getTeachers());
		return "list";
	}
	
}
