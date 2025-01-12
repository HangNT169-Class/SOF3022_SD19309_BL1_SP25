package com.poly.sof3022.B4_5_CRUDListFixCung.controller;

import com.poly.sof3022.B4_5_CRUDListFixCung.service.DongVatService;
import com.poly.sof3022.B4_5_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @Autowired
    private DongVatService service;

    // hien thi
    @GetMapping("sinh-vien/hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.getLists());
        return "buoi4/sinh-viens";
    }

    @GetMapping("/sinh-vien/detail/{id2}")
    public String detailSinhVien(@PathVariable("id2") String mssv, Model model) {
        model.addAttribute("sv", sinhVienService.detailSinhVienC2(mssv));
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("/sinh-vien/delete/{id1}")
    public String deleteSinhVien(@PathVariable("id1") String mssv) {
        sinhVienService.removeSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }
}
