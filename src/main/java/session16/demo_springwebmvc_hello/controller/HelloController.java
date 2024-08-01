package session16.demo_springwebmvc_hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/","/webapp-hello"})
public class HelloController {
    @RequestMapping()
    public String home(Model model){
        model.addAttribute("name","Bùi Thanh Hải");
        return "home";
    }
}
