package cz.eshop.controller;

import cz.eshop.Constans;
import cz.eshop.entity.Subcategory;
import cz.eshop.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@RestController
public class SubCategoryController {

    @Autowired
    SubcategoryService subcategoryService;


    @RequestMapping(value = Constans.API_ROOT_SUBCATEGORY + "/search/all", method = RequestMethod.GET)
    public List<Subcategory> searchForAllProductsSubcategories() {
        return subcategoryService.findAllSubcategories();
    }

    @RequestMapping(value = Constans.API_ROOT_SUBCATEGORY + "/search/{name}", method = RequestMethod.DELETE)
    public List<Subcategory> searchByCategoryName(@PathVariable(value = "name") String name) {
        return subcategoryService.findSubcategoryByCategoryName(name);
    }

}
