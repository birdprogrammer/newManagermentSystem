package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.ICheckrecordDAO;
import com.woniu.pojo.Checkrecord;
import com.woniu.service.ICheckrecordService;
@Service
@Transactional
public class CheckrecordServiceImpl implements ICheckrecordService {
	@Autowired
	ICheckrecordDAO cd;
	@Override
	public Checkrecord findCheckRecord(Integer crid) {
		// TODO Auto-generated method stub
		Checkrecord cr = cd.findOne(crid);
		return cr;
	}

}
