package cz.eshop.repository;

import cz.eshop.entity.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Repository
public interface SubcategoryRepository extends JpaRepository<Subcategory, Long> {

    @Query(value = "SELECT * FROM SUBCATEGORY AS S JOIN CATEGORY AS C ON S.CATEGORY_ID = C.CATEGORY_ID WHERE C.CATEGORY_NAME = ?1", nativeQuery = true)
    public List<Subcategory> findSubcategoriesByCategory(String categoryName);

}
