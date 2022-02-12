package com.example.demo.controller;

import com.example.demo.model.Repository;
import com.example.demo.model.SchemaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    Repository repository;

    @GetMapping(value = "/getAll")
    public List<SchemaModel> getAllStudents() {
        return repository.findAll();
    }
}
