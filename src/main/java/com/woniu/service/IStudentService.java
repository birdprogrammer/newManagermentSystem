package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Student;

public interface IStudentService {
	List<Student> findAll();
	Student findOne(Integer id);
	void upd(Student student);
	void save(Student student);
	List<Student> findAllByCid(Integer cid);
}
