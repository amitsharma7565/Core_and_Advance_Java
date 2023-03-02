package springWebMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springWebMVC.Dao.UserDao;
import springWebMVC.Model.User;


@Controller
public class HomeController {

	@Autowired
	private UserDao dao;
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Alli Saheb");
		model.addAttribute("id",101);
		List<String> list=new ArrayList<String>();
		list.add("lokesh");
		list.add("madar");
		list.add("Amith");
		
		model.addAttribute("listofnames", list);
		
		System.out.println("hai");
		return "index";
	}
	
	@RequestMapping("/addUser")
	public String addUser(@ModelAttribute User user,Model model) {
        //DAO LAYER
		this.dao.addUser(user);
		return "success";
	}
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<User> list=this.dao.getAllUsers();
		model.addAttribute("users",list);
		
		return "allUsers";
	}
	@RequestMapping("/delete/{id}")
	public String getAll(@PathVariable("id") int id) {
		this.dao.delete(id);
		
		return "success";
	}
	@RequestMapping("/update/{id}")
	public String getAll(@PathVariable("id") int id,Model model) {
		User u=this.dao.getUserById(id);
		model.addAttribute("user",u);
		
		return "index1";
	}
	
	
	
}
