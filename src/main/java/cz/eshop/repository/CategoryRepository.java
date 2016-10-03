package cz.eshop.repository;

import cz.eshop.entity.Category;
import cz.eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Component
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
