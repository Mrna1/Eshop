package cz.eshop;

import cz.eshop.controller.SubcategoryController;
import cz.eshop.entity.Product;
import cz.eshop.entity.Subcategory;
import cz.eshop.service.ProductService;
import cz.eshop.service.SubcategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EshopApplicationTests {

	@Autowired
	ProductService productService;

	@Autowired
	SubcategoryController subcategoryController;

	@Autowired
	SubcategoryService subcategoryService;


	private	Product product1 = new Product();
	private	Product product2 = new Product();
	private	Product product3 = new Product();
	private Subcategory subcategory1 = new Subcategory();
	private Subcategory subcategory2 = new Subcategory();
	private Subcategory subcategory3 = new Subcategory();
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

		subcategory1.setName("Silnicni kola");
		subcategory1.setDescription("Black animals");

		subcategory2.setName("Horska kola");

		subcategory3.setName("Elektricke kola");
		subcategory3.setDescription("White animals");

		subcategoryService.createSubcategory(subcategory1);
		subcategoryService.createSubcategory(subcategory2);
		subcategoryService.createSubcategory(subcategory3);

		productService.addCategory(product1, subcategory1);
		productService.addCategory(product2, subcategory1);
		productService.addCategory(product2, subcategory2);

		productService.createProduct(product1);
		productService.createProduct(product2);
		productService.createProduct(product3);
	}

	@Test
	public void subcategoryTest() {
		List<Subcategory> list = subcategoryController.searchForAllProducts();
		for (Subcategory value : list) {
			String str = value.getName();
			System.out.println(str);
		}
	}

}
