package com.woniu.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.woniu.pojo.User;
import com.woniu.service.IUserService;
@Controller
public class UserAction {
	@Autowired
	private IUserService us;
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	public String login() {
		String str = us.login(user);
		if(str.equals("student")) {
			return "student";
		}else if(str.equals("herdmaster")) {
			return "herdmaster";
		}else if(str.equals("teacher")) {
			return "teacher";
		}else if(str.equals("supervisor")) {
			return "supervisor";
		}
		return "fail";
	}
}
