package cz.eshop.repository;

import cz.eshop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
