package com.teachersapp.dao;

import java.util.List;

import com.teachersapp.model.Teacher;

public interface TeacherDao {
	public List<Teacher> findAll();
	public Teacher findById(int id);
	public void insert(Teacher teacher);
	public void delete(int id);
}
