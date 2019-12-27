package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IExamrecordDAO;
import com.woniu.pojo.Examrecord;
@Repository
public class ExamrecordDAOImpl implements IExamrecordDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Examrecord findOne(Integer id) {
		// TODO Auto-generated method stub
		return (Examrecord) sessionFactory.getCurrentSession().get(Examrecord.class,id);
	}
	@Override
	public void save(Examrecord exam) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(exam);
	}

}
