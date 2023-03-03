package com.bitLabs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitLabs.Dao.EmployeeDao;
import com.bitLabs.Model.Employee;

@Controller
public class HomeController {
	
	@Autowired
	private EmployeeDao dao;

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/addUser")
	public String userAdd(@ModelAttribute Employee emp) {
		this.dao.addUser(emp);
		return "sucess";
	}
	
	@RequestMapping("/getAll")
	public String allEmp(Model model) {
		List<Employee> list= this.dao.getAll();
		model.addAttribute("Employees" ,list);
		return "AllEmp";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteEmp(@PathVariable("id") int  id, Model model) {
		this.dao.delete(id);
		return "Delete";
		
	}
	@RequestMapping("/update/{id}")
	public String updateUser(@PathVariable("id") int id, Model model) {
	 Employee emp=this.dao.updateByID(id);
	 model.addAttribute("Employee", emp);
		return "indexUpdate";
		
	}
	
	
}
