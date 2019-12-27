package com.woniu.dao;

import com.woniu.pojo.Classes;


public interface IClassesDao {
	Classes getCla(Integer hid);
	Classes findOne(Integer id);
}
