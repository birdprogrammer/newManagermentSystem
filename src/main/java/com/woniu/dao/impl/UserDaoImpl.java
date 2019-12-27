package com.woniu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.woniu.dao.IUserDao;
import com.woniu.pojo.User;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		sessionFactory.openSession().save(user);
	}
//	@Override
//	public Integer getUid(User user) {
//		// TODO Auto-generated method stub
//		Integer uid = null;
//		List<User> list = sessionFactory.openSession().createQuery("from User where uname="+user.getUname()+" and upwd="+user.getUpwd()).list();
//		for (User user2 : list) {
//			uid = user2.getUid();
//		}
//		
//		return uid;
//	}
	@Override
	public Integer getUid(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findOneByName(User obj) {
		String sql = "from User where uname='"+obj.getUname()+"' and upwd='"+obj.getUpwd()+"'";
		return  sessionFactory.getCurrentSession().createQuery(sql).list();
	}
	
	
	
}
