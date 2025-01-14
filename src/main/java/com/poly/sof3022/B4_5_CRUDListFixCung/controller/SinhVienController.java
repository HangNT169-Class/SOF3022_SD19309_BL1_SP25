package com.poly.sof3022.B4_5_CRUDListFixCung.controller;

import com.poly.sof3022.B4_5_CRUDListFixCung.entity.SinhVien;
import com.poly.sof3022.B4_5_CRUDListFixCung.service.DongVatService;
import com.poly.sof3022.B4_5_CRUDListFixCung.service.SinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("sinh-vien/")
// phan chung cua duong dan
public class SinhVienController {

    @Autowired
    private SinhVienService sinhVienService;

    @Autowired
    private DongVatService service;

    // hien thi
    @GetMapping("hien-thi")
    public String hienThiDanhSachSinhVien(Model model) {
        model.addAttribute("listSinhVien", sinhVienService.getLists());
        return "buoi4/sinh-viens";
    }

    @GetMapping("detail/{id2}")
    public String detailSinhVien(@PathVariable("id2") String mssv, Model model) {
        model.addAttribute("sv", sinhVienService.detailSinhVienC2(mssv));
        return "buoi4/detail-sinh-vien";
    }

    @GetMapping("delete/{id1}")
    public String deleteSinhVien(@PathVariable("id1") String mssv) {
        sinhVienService.removeSinhVien(mssv);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("view-update/{id}")
    public String updateSinhVien(@PathVariable("id") String mssv, Model model) {
        model.addAttribute("sv", sinhVienService.detailSinhVien(mssv));
        return "buoi4/update-sinh-vien";
    }

    @GetMapping("view-add")
    public String hienThiForm() {
        return "buoi4/add-sinh-vien";
    }

    @PostMapping("add")
    public String addSinhVien(SinhVien sv) {
        sinhVienService.addSinhVien(sv);
        return "redirect:/sinh-vien/hien-thi";
    }
}
