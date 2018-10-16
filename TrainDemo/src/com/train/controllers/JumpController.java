package com.train.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class JumpController {
	
	@RequestMapping(value="to.do")
	public String jumpto(String target){
		return target;
	}
}
