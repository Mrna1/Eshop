package cz.eshop;

import cz.eshop.entity.Category;
import cz.eshop.entity.Product;
import cz.eshop.service.CategoryService;
import cz.eshop.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EshopApplicationTests {

	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;
	private	Product product1 = new Product();
	private	Product product2 = new Product();
	private	Product product3 = new Product();
	private	Category category1 = new Category();
	private	Category category2 = new Category();
	private	Category category3 = new Category();
	private Date date = new Date();

	@Test
	public void serviceSave() {
		product1.setName("Test4");
		product1.setPrice(new BigDecimal("1001"));

		productService.createProduct(product1);
	}

	@Test
	public void serviceFindAll(){
		System.out.println(productService.findAllProducts().get(0).toString());
	}

	@Test
	public void serviceRemoveAndFindById(){
		productService.removeProduct(productService.findProductById(1L));

	}

	@Test
	public void findById() {
		System.out.println(productService.findProductById(1L).toString());


	}

	@Test
	public void serviceFindByMaxPrice(){
		productService.findAllToMaxPrice(new BigDecimal("1001")).stream()
				.forEach(System.out::println);
	}

	@Test
	public void serviceAddCategoryToProduct(){
		product1.setName("Cat");
		product1.setPrice(new BigDecimal("50"));
		product1.setDescription("Some Cat");
		product1.setAddedDate(date);

		product2.setName("Dog");
		product2.setPrice(new BigDecimal("150"));
		product2.setAddedDate(date);

		product3.setName("Fish");
		product3.setPrice(new BigDecimal("250"));
		product3.setDescription("Some Fish");
		product3.setAddedDate(date);

		category1.setName("Black");
		category1.setDescription("Black animals");

		category2.setName("Red");

		category3.setName("White");
		category3.setDescription("White animals");

		categoryService.createCateogry(category1);
		categoryService.createCateogry(category2);
		categoryService.createCateogry(category3);

		productService.addCategory(product1, category1);
		productService.addCategory(product2, category1);
		productService.addCategory(product2, category2);

		productService.createProduct(product1);
		productService.createProduct(product2);
		productService.createProduct(product3);



	}

}
