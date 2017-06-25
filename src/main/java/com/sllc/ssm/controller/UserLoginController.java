package com.sllc.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sllc.ssm.dao.UserinfoDao;
import com.sllc.ssm.entity.User;

@RestController
public class UserLoginController {

	@Autowired
	private UserinfoDao userinfoDao;

	// 测试路由器 http://localhost:9999/ 默认是8080,但我把他配置为9999了
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String test() {
		return "hello spring boot";
	}

	// 测试路由器 http://localhost:9999/test2 默认是8080,但我把他配置为9999了
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	@ResponseBody
	public String test2() {
		return userinfoDao.findByUsername("sl1990").getAccount();
	}
}
