package com.poly.sof3022.B8_9_JPA.controller;

import com.poly.sof3022.B8_9_JPA.entity.Category12;
import com.poly.sof3022.B8_9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Category1Controller {
    @Autowired
    private CategoryRepository repository;

    @GetMapping("/test1234")
    public List<Category12> getAll() {
        return repository.findAll();
    }
}
