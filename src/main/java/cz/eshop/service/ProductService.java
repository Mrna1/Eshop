package cz.eshop.service;

import cz.eshop.entity.Product;
import cz.eshop.entity.Subcategory;
import cz.eshop.repository.ProductRepository;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by frantisek.manak on 2.10.2016.
 */
@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product){
        productRepository.save(product);
    }

    public void removeProduct(Product product){
        productRepository.delete(product);
    }

    public Product findProductById(Long id){
        return productRepository.findOne(id);
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> findAllToMaxPrice(BigDecimal price){
        return productRepository.findProductbyMaxPrice(price);
    }

    public void addSubcategory(Product product, Subcategory subcategory) {
        if (product.getCategories().contains(subcategory)) {
            throw new ServiceException(
                    "Product already contais this subcategory. Product: "
                            + product.getId() + ", subcategory: "
                            + subcategory.getId());
        }
        product.setCategory(subcategory);
    }

    public void removeCategory(Product product, Subcategory subcategory) {
        if (product == null) {
            throw new ServiceException(
                    "Product doesn't exist"
            );
        }
        product.removeCategory(subcategory);
    }


}
