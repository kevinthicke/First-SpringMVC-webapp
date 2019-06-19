package com.teachersapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teachersapp.dao.TeacherDao;
import com.teachersapp.model.Teacher;

@Service
public class TeacherService {
	
	@Autowired
	private TeacherDao teacherDao;

	public List<Teacher> getTeachers() {
		return this.teacherDao.findAll();
	}
	
	public Teacher getTeacherById(int id) {
		return this.teacherDao.findById(id);
	}
	
	public void insertTeacher(Teacher teacher) {
		this.teacherDao.insert(teacher);
	}
	
	public void deleteTeacher(int id) {
		this.teacherDao.delete(id);
	}
}
