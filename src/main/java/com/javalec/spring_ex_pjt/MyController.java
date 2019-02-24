package com.javalec.spring_ex_pjt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value="/view")
	public String view() {
		
		return "view";
	}
	
	@RequestMapping("/cotent/contentView")
	public String contentView(Model model) {
		
		model.addAttribute("id","abcde");
		
		return "content/contentView";
	
	}
	
	@RequestMapping("/model/modelEx")
	public String modelEx(Model model) {
		
		model.addAttribute("data","abcdfefwef");
		
		return "/model/modelEx";
		
	}
	
	@RequestMapping("modelAndView/modelView")
	public ModelAndView modelAndView() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id","abcde");
		mv.setViewName("/modelAndView/modelView");
		
		
		return mv;
	}
	
}
