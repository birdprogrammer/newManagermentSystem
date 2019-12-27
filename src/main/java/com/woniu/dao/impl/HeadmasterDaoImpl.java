package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Headmaster;
@Repository
public class HeadmasterDaoImpl implements IHeadmasterDao{
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Headmaster getHds(Integer hid) {
		// TODO Auto-generated method stub
		return (Headmaster) sessionFactory.openSession().get(Headmaster.class, hid);
	}

}
