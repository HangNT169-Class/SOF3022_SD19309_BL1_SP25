package com.poly.sof3022.B3_SpringValidation.controller;

import com.poly.sof3022.B3_SpringValidation.resquest.DangkyResquest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DangKiController {
    @GetMapping("/dang-ki")
    public String hienThi(Model model) {
        model.addAttribute("request1",
                new DangkyResquest());
        return "buoi3/dang-ki-form";
    }

    @PostMapping("/home")
    public String xuLyDangKy(
            @Valid @ModelAttribute("request1") DangkyResquest dangkyResquest,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            return "buoi3/dang-ki-form";
        }
        model.addAttribute("dangky", dangkyResquest);
        return "buoi3/view-dang-ky";
    }
}
