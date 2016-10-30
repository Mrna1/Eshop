package cz.eshop.controller;

import cz.eshop.Constans;
import cz.eshop.entity.Category;
import cz.eshop.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@RestController
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @RequestMapping(value = Constans.API_ROOT_CATEGORY + "/search/all", method = RequestMethod.GET)
    public List<Category> searchForAllCategories() {
        return categoryService.findAllCategories();
    }


}
