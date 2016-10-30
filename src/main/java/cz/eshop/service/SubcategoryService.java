package cz.eshop.service;

import cz.eshop.entity.Category;
import cz.eshop.entity.Subcategory;
import cz.eshop.repository.SubcategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Service
public class SubcategoryService {

    @Autowired
    SubcategoryRepository subcategoryRepository;

    public void createSubcategory(Subcategory subcategory) {
        subcategoryRepository.save(subcategory);
    }

    public void removeSubcategory(Subcategory subcategory) {
        subcategoryRepository.delete(subcategory);
    }

    public List<Subcategory> findAllSubcategories() {
        return subcategoryRepository.findAll();
    }

    public void addCategory(Subcategory subcategory, Category category) {
        subcategory.setCategory(category);
    }

    public List<Subcategory> findSubcategoryByCategoryName(String categoryName) {
        return subcategoryRepository.findSubcategoriesByCategory(categoryName);
    }

}
