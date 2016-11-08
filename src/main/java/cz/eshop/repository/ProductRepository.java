package cz.eshop.repository;

import cz.eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT * FROM PRODUCT WHERE PRODUCT_PRICE < ?1", nativeQuery = true)
    List<Product> findProductbyMaxPrice(BigDecimal price);

    @Query(value = "Select * from product p left join product2subcategory ps on p.product_id = ps.product_id where ps.subcategory_id = ?1", nativeQuery = true)
    List<Product> findProductbySubcategoryId(Long id);
}
