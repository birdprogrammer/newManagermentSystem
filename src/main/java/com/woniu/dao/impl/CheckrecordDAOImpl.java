package com.woniu.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.ICheckrecordDAO;
import com.woniu.pojo.Checkrecord;
@Repository
public class CheckrecordDAOImpl implements ICheckrecordDAO {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public Checkrecord findOne(Integer id) {
		// TODO Auto-generated method stub
		return (Checkrecord) sessionFactory.getCurrentSession().get(Checkrecord.class, id);
	}

}
