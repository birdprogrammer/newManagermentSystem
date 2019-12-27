package com.woniu.dao;

import com.woniu.pojo.Examrecord;

public interface IExamrecordDAO {
	
	Examrecord findOne(Integer id);

	void save(Examrecord exam);
}
