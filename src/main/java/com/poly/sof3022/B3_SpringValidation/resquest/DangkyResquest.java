package com.poly.sof3022.B3_SpringValidation.resquest;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DangkyResquest {

    @NotBlank
    private String mssv;

    @NotEmpty(message = "Ten khong duoc de trong")
//    @Size: Do dai min, max
    private String ten;

    @NotNull
//    @Pattern(regexp = "\\d+", message = "Tuoi khong dung dinh dang")
//    @Min(10)
//    @Max(20)
    private Integer tuoi;
    private Boolean gioiTinh;
}
