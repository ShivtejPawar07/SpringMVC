package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("Home Controller"); 
		model.addAttribute("name","Shivtej Pawar ");
		model.addAttribute("id",123);
		
		List<String>friends=new ArrayList<String>();
		friends.add("Jolly Reddy");
		friends.add("Black Reddy");
		friends.add("Amol Reddy");
		
		model.addAttribute("f",friends);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("about Controller"); 
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("Help Controller");
		//creating model and ciew object
		ModelAndView mv=new ModelAndView();
		
		
		//setting the data
		mv.addObject("name","Shivtej");
		mv.addObject("rno",7);
		LocalDateTime ld=LocalDateTime.now();
		  mv.addObject("time", ld); 
		  
		  //marks
		  
		  List<Integer>al=new ArrayList<Integer>();
		  al.add(100);
		  al.add(200);
		  al.add(300);
		  al.add(400);
		  al.add(500);
		  
		  mv.addObject("marks",al);
		  
				//setting the view name
		mv.setViewName("help");
		return mv;
	}
}
