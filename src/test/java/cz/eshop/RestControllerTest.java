package cz.eshop;

import cz.eshop.controller.ProductController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RestControllerTest {

    @Autowired
    ProductController productController;

    @Test
    public void serviceSave() {
//	System.out.println(productController.searchForAllProducts().get(0).getName());
    }
}