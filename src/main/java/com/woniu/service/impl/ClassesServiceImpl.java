package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IClassesDao;
import com.woniu.pojo.Classes;
import com.woniu.service.IClassesSsrvice;
@Service
@Transactional
public class ClassesServiceImpl implements IClassesSsrvice {
	@Autowired
	IClassesDao Icd;
	@Override
	public Classes getCla(Integer hid) {
		// TODO Auto-generated method stub
		return Icd.getCla(hid);
	}
	@Override
	public Classes findOne(Integer id) {
		// TODO Auto-generated method stub
		return Icd.findOne(id);
	}

}
