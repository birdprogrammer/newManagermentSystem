package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ITeacherDAO;
import com.woniu.pojo.Teacher;
@Repository
public class TeacherDAOImpl implements ITeacherDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<Teacher> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Teacher").list();
	}

}
