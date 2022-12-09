package com.example.employee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class EmpController {
	
@RequestMapping("index")
	public String index() {
		return "index.jsp";
	}
	
}
