package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.Checkrecord;
import com.woniu.service.ICheckrecordService;

@Controller
public class CheckrecordAction {

	@Autowired
	ICheckrecordService cs;
	private Integer crid;
	private Checkrecord checkRecord;
	public Integer getCrid() {
		return crid;
	}
	public void setCrid(Integer crid) {
		this.crid = crid;
	}
	public Checkrecord getCheckRecord() {
		return checkRecord;
	}
	public void setCheckRecord(Checkrecord checkRecord) {
		this.checkRecord = checkRecord;
	}
	public String findCheckRecord() {
		checkRecord = cs.findCheckRecord(crid);
		return "success";
	}
}
