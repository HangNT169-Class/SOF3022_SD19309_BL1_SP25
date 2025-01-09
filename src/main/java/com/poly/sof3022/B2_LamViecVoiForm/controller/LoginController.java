package com.poly.sof3022.B2_LamViecVoiForm.controller;

import com.poly.sof3022.B2_LamViecVoiForm.request.LoginRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("login")
    public String hienThi() {
        return "buoi2/form-login";
    }

    //    @PostMapping("ket-qua")
//    public String xuLyForm(
//            @RequestParam("username")String uname,
//            @RequestParam("pass")String password,
//            Model model
//    ) {
//        // B1: Lay gia tri tu phia view -> controller
//        // J4: getParameter
//        // J5: RequestParam
//        // => input: phai co name
//        model.addAttribute("u1",uname);
//        model.addAttribute("p1",password);
//        return "buoi2/view-ket-qua";
//    }
    @PostMapping("ket-qua")
    public String xuLyForm(
            LoginRequest request,
            Model model
    ) {
        // B1: Lay gia tri tu phia view -> controller
        // J4: getParameter
        // J5: RequestParam
        // => input: phai co name
        model.addAttribute("res", request);
        return "buoi2/view-ket-qua";
    }
}
