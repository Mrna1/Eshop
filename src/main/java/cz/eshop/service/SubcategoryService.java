package cz.eshop.service;

import cz.eshop.entity.Subcategory;
import cz.eshop.repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Service
public class SubcategoryService {

    @Autowired
    SubCategoryRepository subCategoryRepository;

    public void createSubcategory(Subcategory subcategory) {
        subCategoryRepository.save(subcategory);
    }

    public void removeSubcategory(Subcategory subcategory) {
        subCategoryRepository.delete(subcategory);
    }

    public Subcategory findSubcategoryById(Long id) {
        return subCategoryRepository.findOne(id);
    }

    public List<Subcategory> findAllSubcategories() {
        return subCategoryRepository.findAll();
    }


}
