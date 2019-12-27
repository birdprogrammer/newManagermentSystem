package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ITeacherDAO;

import com.woniu.pojo.Teacher;
import com.woniu.service.ITeacherService;
@Service
@Transactional
public class TeacherServiceImpl implements ITeacherService {
	@Autowired
	ITeacherDAO td;
	@Override
	public List<Teacher> getAll() {
		// TODO Auto-generated method stub
		return td.findAll();
	}

}
