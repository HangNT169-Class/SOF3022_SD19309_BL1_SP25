package com.poly.sof3022.B8_9_JPA.controller;

import com.poly.sof3022.B8_9_JPA.repository.CategoryRepository;
import com.poly.sof3022.B8_9_JPA.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductController {
    @Autowired
    private ProductRepository repo;
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/product/hien-thi")
    public String getAll( Model model){
        model.addAttribute("listP",repo.findAll());
        model.addAttribute("listCate",categoryRepository.findAll());
        return "/buoi8/Product";
    }

}
