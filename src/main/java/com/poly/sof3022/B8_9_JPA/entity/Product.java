package com.poly.sof3022.B8_9_JPA.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="product_code")
    private String code;
    @Column(name="product_name")
    private String name;
    @Column(name="price")
    private Integer price;
    @Column(name = "description")
    private String decription;

    @ManyToOne
    @JoinColumn(name="category_id",referencedColumnName = "id")
    private Category12 cate;

}
