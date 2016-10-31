package cz.eshop.repository;

import cz.eshop.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Override
    @Query
    List<Category> findAll();
}
