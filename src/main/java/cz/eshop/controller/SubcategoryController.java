package cz.eshop.controller;

import cz.eshop.Constans;
import cz.eshop.entity.Subcategory;
import cz.eshop.service.SubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@RestController
public class SubcategoryController {

    @Autowired
    SubcategoryService subcategoryService;


    @RequestMapping(value = Constans.API_ROOT_CATEGORY + "/search/all", method = RequestMethod.GET)
    public List<Subcategory> searchForAllProducts() {
        return subcategoryService.findAllSubcategories();
    }


}
