package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IClassesDao;
import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
@Repository
public class ClassesDaoImpl implements IClassesDao {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	IHeadmasterDao Ihd;
	@Override
	public Classes getCla(Integer hid) {
		// TODO Auto-generated method stub
		return (Classes) sessionFactory.openSession().get(Classes.class, 1);
	}
	@Override
	public Classes findOne(Integer id) {
		// TODO Auto-generated method stub
		return (Classes) sessionFactory.openSession().get(Classes.class, id);
	}

}
