package com.woniu.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.pojo.Classes;

public interface IClassesSsrvice {
	Classes getCla(Integer hid);
	Classes findOne(Integer id);
}
