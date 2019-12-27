package com.woniu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IHeadmasterDao;
import com.woniu.pojo.Headmaster;
import com.woniu.service.IHeadmasterService;
@Service
@Transactional
public class HeadmasterServiceImpl implements IHeadmasterService {
	@Autowired
	IHeadmasterDao Ihd;
	@Override
	public Headmaster getHds(Integer hid) {
		// TODO Auto-generated method stub
		return Ihd.getHds(1);
	}

}
