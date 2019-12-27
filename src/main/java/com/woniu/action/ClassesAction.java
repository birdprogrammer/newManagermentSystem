package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Headmaster;
import com.woniu.service.IClassesSsrvice;
import com.woniu.service.IStudentService;

@Controller
public class ClassesAction {
	@Autowired
	IClassesSsrvice IClas;
	@Autowired
	IStudentService ICs;
	private Integer stuid;
	
	private Classes classes;
	private Headmaster headmaster;
	private Integer tid;
	
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Headmaster getHeadmaster() {
		return headmaster;
	}
	public void setHeadmaster(Headmaster headmaster) {
		this.headmaster = headmaster;
	}
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public String showClasses() {
		Classes cla = IClas.getCla(1);
		return "showCla";
	}
	public String findClass() {
		classes = IClas.findOne(tid);
		return "findClass";
	}
}
