package com.bitlabs.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Palak Sharma");
		List<String> list = new ArrayList<String>();
		list.add("amit");
		list.add("karan");
		list.add("Sharma");
		
		model.addAttribute("list",list);
		
		return "index";
	}
	@RequestMapping("/welcome")
	public ModelAndView wel() {
		ModelAndView mv= new ModelAndView();
		mv.addObject("name", "Anchalssss");
		mv.setViewName("welcome");
		return mv;
	}
}
