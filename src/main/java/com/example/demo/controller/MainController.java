package com.example.demo.controller;

import com.example.demo.model.Repository;
import com.example.demo.model.SchemaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    Repository repository;

    @GetMapping(value = "/getAll")
    public List<SchemaModel> getAllStudents() {
        return repository.findAll();
    }

}
