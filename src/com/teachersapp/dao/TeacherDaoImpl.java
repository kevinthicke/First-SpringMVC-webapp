package com.teachersapp.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.teachersapp.model.Teacher;

@Component
public class TeacherDaoImpl implements TeacherDao {

	private List<Teacher> teachers;
	
	public TeacherDaoImpl() {
		this.teachers = new ArrayList<Teacher>();
		
		this.teachers.add(new Teacher("Jack Shepard", "jackshepard@lost.com"));
		this.teachers.add(new Teacher("Kate Austen", "kateausten@lost.com"));
		this.teachers.add(new Teacher("Hugo Reyes", "hugoreyes@lost.com"));
		this.teachers.add(new Teacher("Claire Litleton", "clairelitleton@lost.com"));
		
	}
	
	@Override
	public List<Teacher> findAll() {
		return this.teachers;
	}

	@Override
	public Teacher findById(int id) {
		return this.teachers.get(id);
	}

	@Override
	public void insert(Teacher teacher) {
		this.teachers.add(teacher);
	}
	
	@Override
	public void delete(int id) {
		this.teachers.remove(this.findById(id));
	}

}
