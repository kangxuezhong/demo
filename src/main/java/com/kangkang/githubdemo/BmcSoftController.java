package com.kangkang.githubdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/")
public class BmcSoftController {

	@GetMapping("/hello")
	public String updateSoft(String fileKey) {
		// 根据key查找文件并进行存储
		return "222";
	}

	

}
