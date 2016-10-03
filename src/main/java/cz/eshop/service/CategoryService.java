package cz.eshop.service;

import cz.eshop.entity.Category;
import cz.eshop.entity.Product;
import cz.eshop.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Service
@Component
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public void createCateogry(Category category){
        categoryRepository.save(category);
    }

    public void removeCategory(Category category){
        categoryRepository.delete(category);
    }

    public Category findCategoryById(Long id){
        return categoryRepository.findOne(id);
    }

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }


}
