package com.woniu.service;

import com.woniu.pojo.Examrecord;

public interface IExamrecordService {

	Examrecord findOneExam(Integer erid);

	void save(Examrecord exam);

}
