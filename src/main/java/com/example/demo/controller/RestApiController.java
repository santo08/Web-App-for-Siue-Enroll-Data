package com.example.demo.controller;

import com.example.demo.model.Repository;
import com.example.demo.model.SchemaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/")
public class RestApiController {

    @Autowired
    Repository repository;

    @GetMapping(value = "/home")
    public String getHome() {
        return "homePage";
    }


    @GetMapping(value = "/getStudentById")
    public String getStudentById(@RequestParam (name = "studentId", required=false,
            defaultValue="800384058") String studentId, Model model) {
        Optional<SchemaModel> student = repository.findById(Integer.valueOf(studentId));
        model.addAttribute("studentId" , student.get().getId());
        model.addAttribute("firstName" , student.get().getFirstName());
        model.addAttribute("lastName" , student.get().getLastName());
        model.addAttribute("admitTerm" , student.get().getAdmitTerm());
        model.addAttribute("appliedTerm" , student.get().getAppliedTerm());
        model.addAttribute("gradLevel" , student.get().getGradLevel());
        model.addAttribute("email" , student.get().getEmail());
        model.addAttribute("dateEnrolled" , student.get().getDateEnrolled());
        return "homePage";
    }
}
