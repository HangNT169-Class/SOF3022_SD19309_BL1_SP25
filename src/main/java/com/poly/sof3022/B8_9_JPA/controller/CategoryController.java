package com.poly.sof3022.B8_9_JPA.controller;

import com.poly.sof3022.B8_9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
    // repo
    @Autowired
    private CategoryRepository repository;

    @GetMapping("/hien-thi")
    public String hienThiDuLieu(){
        // lay ra tat ca: findAll
//        repository.findAll();
//        // detail : findById(khoa chinh)
//        repository.findById(khoa chinh);
//        // add hoac update: save (doi tuong)
//        repository.save(doi tuong);
//        // remove
//        repository.deleteById(khoa chinh);
//        repository.delete(doi tuong);
        // LOAD DU LIEU CUA BANG CATEGORY -> TABLE
        return "buoi8/cate";
    }
}
