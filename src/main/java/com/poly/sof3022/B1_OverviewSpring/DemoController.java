package com.poly.sof3022.B1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    /**
     * Spring Boot danh dau cac class bean => cac annotation
     * Cac annotation hay dung:
     * + @Controller / @RestController : Day la tang chung chuyen trao doi giua Be & Fe
     * + @Repository: Tang trao doi truc tiep voi DB
     * + @Service: Tang xu ly logic cua toan project
     * + @Component
     * Tat ca cac ham trong controller luon luon tra ve String (return 1 view)
     * + Get: hien thi, lay....
     * + Post: xu ly form...
     * Danh dau 1 request la method get:
     * + @GetMapping
     * + @RequestMapping
     */

    @GetMapping("/test") // duong dan tren trinh duyet
    public String testBuoi1(Model model) { // import .ui
        // truyen gia tri tu servlet/controller -> FE(jsp/thymeaf)
        // J4: request.setAttribute
        // J5: model.addAttribute
        String name = "SOF3022 - SD19309";
        // ts2: co the la 1 String, 1 Object, 1 List.....
        model.addAttribute("mess1", name);
        return "buoi1"; //ten cua view -> giao dien
    }

}
