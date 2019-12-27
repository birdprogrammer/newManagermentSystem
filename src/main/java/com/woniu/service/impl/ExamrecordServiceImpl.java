package com.woniu.service.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.IExamrecordDAO;
import com.woniu.pojo.Examrecord;
import com.woniu.service.IExamrecordService;
@Service
@Transactional
public class ExamrecordServiceImpl implements IExamrecordService {
	@Autowired
	IExamrecordDAO ed;
	@Override
	public Examrecord findOneExam(Integer erid) {
		// TODO Auto-generated method stub
		Examrecord exam = ed.findOne(erid);
		return exam;
	}
	@Override
	public void save(Examrecord exam) {
		ed.save(exam);
		
	}

}
