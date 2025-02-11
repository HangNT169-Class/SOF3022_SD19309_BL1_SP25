package com.poly.sof3022.B8_9_JPA.controller;

import com.poly.sof3022.B8_9_JPA.entity.Category12;
import com.poly.sof3022.B8_9_JPA.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {
    // repo
    @Autowired
    private CategoryRepository repository;

    @GetMapping("/hien-thi")
    public String hienThiDuLieu() {
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

    @ResponseBody
    @GetMapping("/test123")
    public List<Category12> getAll() {
        return repository.findAll();
    }

    @ResponseBody
    @GetMapping("/phan-trang")
    // import => .domain
    public List<Category12> phanTrang(
            @RequestParam("pageNo12") Integer pageNo,
            @RequestParam("pageSize") Integer pageSize
    ) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return repository.findAll(pageable).getContent();
    }


}
