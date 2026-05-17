package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {

        System.out.println("Home Controller");

        model.addAttribute("name", "Shivtej Pawar");
        model.addAttribute("id", 123);

        List<String> friends = new ArrayList<>();

        friends.add("Jolly Reddy");
        friends.add("Black Reddy");
        friends.add("Amol Reddy");

        model.addAttribute("f", friends);

        return "index";
    }

    @RequestMapping("/about")
    public String about() {

        System.out.println("About Controller");

        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help() {

        System.out.println("Help Controller");

        // Creating ModelAndView object
        ModelAndView mv = new ModelAndView();

        // Setting data
        mv.addObject("name", "Shivtej");
        mv.addObject("rno", 7);

        LocalDateTime ld = LocalDateTime.now();
        mv.addObject("time", ld);

        // Marks list
        List<Integer> al = new ArrayList<>();

        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);

        mv.addObject("marks", al);

        // Setting view name
        mv.setViewName("help");

        return mv;
    }
}