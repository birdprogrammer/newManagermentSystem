package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IClassesDao;
import com.woniu.dao.IStudentDAO;
import com.woniu.pojo.Student;
import com.woniu.service.IStudentService;
@Service
@Transactional
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentDAO sd;
	@Autowired
	IClassesDao Icd;
	@Override
	public List<Student> findAll() {
		List<Student> stu = sd.findAll();
		return stu;
	}
	@Override
	public Student findOne(Integer id) {
		
		return sd.findOne(id);
	}
	@Override
	public void upd(Student student) {
		// TODO Auto-generated method stub
		sd.upd(student);
	}
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		sd.save(student);
	}
	@Override
	public List<Student> findAllByCid(Integer cid) {
		// TODO Auto-generated method stub
		return sd.findAllByCid(cid);
	}
	

}
