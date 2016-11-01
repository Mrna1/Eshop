package cz.eshop.controller;

import cz.eshop.Constans;
import cz.eshop.entity.Product;
import cz.eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = Constans.API_ROOT_PRODUCT + "/search/{id}", method = RequestMethod.GET)
    public Product searchByName(@PathVariable Long id) {
        return productService.findProductById(id);
    }

    @RequestMapping(value = Constans.API_ROOT_PRODUCT + "/search/all", method = RequestMethod.GET)
    public List<Product> searchForAllProducts() {
        return productService.findAllProducts();
    }

    @RequestMapping(value = Constans.API_ROOT_PRODUCT + "/create", method = RequestMethod.POST)
    public void createProduct(@RequestBody Product product) {
        productService.createProduct(product);
    }

}
