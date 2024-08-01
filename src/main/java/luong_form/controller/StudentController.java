package luong_form.controller;

import luong_form.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
    @RequestMapping(value = {"/","/initInsertStudent"})
    public String initInsert(Model model){
        Student s = new Student();
        model.addAttribute("s",s);
        return "insertStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@ModelAttribute Student s, Model model){
        model.addAttribute("s",s);
        return "viewStudent";
    }
}
