package com.poly.sof3022.B4_5_CRUDListFixCung.service;

import com.poly.sof3022.B4_5_CRUDListFixCung.entity.SinhVien;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SinhVienService {
    // xu ly logic cua toan bo project
    // hien thi
    private List<SinhVien> lists = new ArrayList<>();

    public SinhVienService() {
        // them cac phan tu cua list vao day
        lists.add(new SinhVien("SV01", "Nguyen Van A", 20, "HN", true));
        lists.add(new SinhVien("SV02", "Nguyen Thi B", 20, "HN", false));
        lists.add(new SinhVien("SV03", "Nguyen Van C", 20, "HN", true));
        lists.add(new SinhVien("SV04", "Nguyen Thi D", 20, "HN", false));
        lists.add(new SinhVien("SV05", "Nguyen Thuy Hang", 28, "Nam Dinh", false));
    }

    public List<SinhVien> getLists() {
        return lists;
    }

    public void removeSinhVien(String ma) {
        lists.removeIf(sv -> sv.getMssv().equalsIgnoreCase(ma));
    }

    public SinhVien detailSinhVien(String ma) {
        for (SinhVien sv : lists) {
            if (sv.getMssv().equalsIgnoreCase(ma)) {
                return sv;
            }
        }
        return null;
    }

    public SinhVien detailSinhVienC2(String ma) {
        return lists.stream()
                .filter(s -> s.getMssv().equalsIgnoreCase(ma))
                .findFirst()
                .orElse(null);
    }

    public void addSinhVien(SinhVien sv) {
        lists.add(sv);
    }

}
