package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home Controller"); 
		model.addAttribute("name","Shivtej Pawar ");
		model.addAttribute("id",123);
		
		List<String>friends=new ArrayList<String>();
		friends.add("qwe");
		friends.add("asd");
		friends.add("rty");
		
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("about Controller"); 
		return "about";
	}
}
