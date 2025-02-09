package com.poly.sof3022.B8_9_JPA.repository;

import com.poly.sof3022.B8_9_JPA.entity.Category12;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
// Tang trao doi truc tiep vs CSDL : CRUD, Truy van CSDL....
// extends : JPARepository / CRUDRepostitory
// TS1: Doi tuong (Object) muon truy van
// TS2: Kieu du lieu cua khoa chinh :
// Khong the truyen kieu nguyen thuy => kieu Object
public interface CategoryRepository extends JpaRepository<Category12, Long> {
    // CRUD 1 bang => KHONG CAN PHAN VIET: Co san
    // Custom SQL:
    // C1: Query creation: Dung menh de SQl de truy van CSDL => Truy van bang Object(Class)
    // C2: Raw SQL

    // C1: Menh de de truy van: ten ham => truy van voi dieu kien gi va truy van ntn
    List<Category12> findCategory12sByIdOrCodeOrderByName(Long id, String code);
    // Nhuoc diem:
    // 1. Ten ham ngan/dai : Phu thuoc vao dieu kien truy van
    // 2. Khi sua ten thuoc tinh/ ten doi tuong => Nhung ham viet truy van query creation => khong bao de sua
    // C2: Raw SQL
    // C2.1: JPQL: JPA Query Language <=> HQL : Truy van tren thuc the tren doi
    // Khong co : SELECT * FROM table <=> Select doi tuong from doi tuong

    @Query("SELECT c FROM Category12 c WHERE c.id = ?2 OR c.code = ?1")
    Category12 search1(String categoryCode, Long id);

    // C2.2: Native query: Truy van bang sql : select * From table
    @Query(value = "SELECT * FROM category WHERE id = ?2 AND category_code = ?1", nativeQuery = true)
    Category12 search2(String categoryCode, Long id);

}
