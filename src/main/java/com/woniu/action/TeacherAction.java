package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Teacher;
import com.woniu.service.ITeacherService;

@Controller
public class TeacherAction {
	@Autowired
	ITeacherService ts;
	private List<Teacher> teachers;


	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public String teacherFindAll() {
		teachers = ts.getAll();
		return "success";
	}
}
