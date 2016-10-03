package cz.eshop.service;

import cz.eshop.entity.Category;
import cz.eshop.entity.Product;
import cz.eshop.repository.ProductRepository;
import org.hibernate.service.spi.ServiceException;
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

    public void addCategory(Product product, Category category) {
        if (product.getCategories().contains(category)) {
            throw new ServiceException(
                    "Product already contais this category. Product: "
                            + product.getId() + ", category: "
                            + category.getId());
        }
        product.setCategory(category);
    }

    public void removeCategory(Product product, Category category) {
        product.removeCategory(category);
    }


}
