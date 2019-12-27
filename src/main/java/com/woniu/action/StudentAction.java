package com.woniu.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Classes;
import com.woniu.pojo.Student;
import com.woniu.service.IClassesSsrvice;
import com.woniu.service.IStudentService;

@Controller
public class StudentAction {
	@Autowired
	IStudentService ss;
	@Autowired
	IClassesSsrvice Ics;
	private List<Student> stus;
	private Student student;
	private Integer stuid;
	private Classes classes;
	private Integer cid;
	
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public Classes getClasses() {
		return classes;
	}
	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public List<Student> getStus() {
		return stus;
	}
	public void setStus(List<Student> stus) {
		this.stus = stus;
	}
	
	public Integer getStuid() {
		return stuid;
	}
	public void setStuid(Integer stuid) {
		this.stuid = stuid;
	}
	public String findAll() {
		stus = ss.findAll();
		//System.out.println(stus);
		return "success";
	}
	
	public String change_class() {
		//System.out.println(stuid);
		student=ss.findOne(stuid);
		return "change";
	}
	public String changeC() {
		
		classes = Ics.getCla(classes.getCid());
		System.out.println("-------------------"+stuid);
		
		student=ss.findOne(stuid);
		System.out.println("-----------------------------------"+student.getIdcard());
		student.setClasses(classes);
		
		ss.upd(student);
		return "changeC";
		
	}
	public String addStudent() {
		 ss.save(student);
		return "addStudent";
	}
	public String findCR() {
		stus = ss.findAllByCid(cid);
		return "findCR";
	}
}
