package session16.demo_student_form_validate.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import session16.demo_student_form_validate.config.model.Student;

import javax.validation.Valid;

@Controller
public class StudentController {
    @RequestMapping(value = {"/","/initInsertStudent"})
    public String initInsert(Model model){
        Student s = new Student();
        model.addAttribute("s",s);
        return "insertStudent";
    }

    @RequestMapping("/insertStudent")
    public String insertStudent(@Validated @ModelAttribute("s") Student s, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("s",s);
            return "insertStudent";
        }else{
            model.addAttribute("s",s);
            return "viewStudent";
        }
    }
}
