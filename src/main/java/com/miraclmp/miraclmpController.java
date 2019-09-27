package com.miraclmp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class miraclmpController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "start";
	}
}
