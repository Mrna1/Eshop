package cz.eshop.controller;

import cz.eshop.entity.Product;
import cz.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/search/{id}", method = RequestMethod.POST)
    public Product searchByName(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @RequestMapping(value = "/product/search/all", method = RequestMethod.POST)
    public List<Product> searchForAllProducts() {
        return productService.findAllProducts();
    }

}
