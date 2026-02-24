package com.example.demo;

import com.example.demo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @GetMapping("/student/form")
    public String showForm() {
        return "student-form";
    }

    @PostMapping("/student/save")
    public String saveStudent(Student student, Model model) {
        model.addAttribute("student", student);
        return "student-result";
    }

   
}