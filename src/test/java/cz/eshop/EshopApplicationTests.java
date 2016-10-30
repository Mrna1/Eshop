package cz.eshop;

import cz.eshop.entity.Category;
import cz.eshop.entity.Product;
import cz.eshop.entity.Subcategory;
import cz.eshop.service.CategoryService;
import cz.eshop.service.ProductService;
import cz.eshop.service.SubcategoryService;
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
	SubcategoryService subcategoryService;

	@Autowired
	CategoryService categoryService;


	private	Product product1 = new Product();
	private	Product product2 = new Product();
	private	Product product3 = new Product();
	private Product product4 = new Product();
	private Product product5 = new Product();
	private Subcategory subcategory1 = new Subcategory();
	private Subcategory subcategory2 = new Subcategory();
	private Subcategory subcategory3 = new Subcategory();
	private Subcategory subcategory4 = new Subcategory();
	private Category category1 = new Category();
	private Category category2 = new Category();
	private Date date = new Date();

	@Test
	public void SynteticData() {
		product1.setName("S. kolo1");
		product1.setPrice(new BigDecimal("10000"));
		product1.setAddedDate(date);
		product2.setName("S. kolo2");
		product2.setPrice(new BigDecimal("20000"));
		product2.setAddedDate(date);
		product3.setName("H. kolo2");
		product3.setPrice(new BigDecimal("30000"));
		product3.setAddedDate(date);
		product4.setName("S. Kolobezka1");
		product4.setPrice(new BigDecimal("7000"));
		product4.setAddedDate(date);
		product5.setName("H. Kolobezka1");
		product5.setPrice(new BigDecimal("25000"));
		product5.setAddedDate(date);

		category1.setName("Kola");
		category2.setName("Kolobezky");
		subcategory1.setName("Silnicni kola");
		subcategory1.setDescription("Horak");
		subcategory2.setName("Horska kola");
		subcategory3.setName("Silnicni kolobezka");
		subcategory3.setDescription("kolak");
		subcategory4.setName("Horska kolobezka");

		subcategoryService.addCategory(subcategory1, category1);
		subcategoryService.addCategory(subcategory2, category1);
		subcategoryService.addCategory(subcategory3, category2);
		subcategoryService.addCategory(subcategory4, category2);

		productService.addSubcategory(product1, subcategory1);
		productService.addSubcategory(product2, subcategory1);
		productService.addSubcategory(product3, subcategory2);
		productService.addSubcategory(product4, subcategory3);
		productService.addSubcategory(product5, subcategory4);

		categoryService.createCategory(category1);
		categoryService.createCategory(category2);

		subcategoryService.createSubcategory(subcategory1);
		subcategoryService.createSubcategory(subcategory2);
		subcategoryService.createSubcategory(subcategory3);
		subcategoryService.createSubcategory(subcategory4);

		productService.createProduct(product1);
		productService.createProduct(product2);
		productService.createProduct(product3);
		productService.createProduct(product4);
		productService.createProduct(product5);

	}

	@Test
	public void test() {

		subcategoryService.findSubcategoryByCategoryName("kola").stream()
				.map(sub -> sub.toString())
				.forEach(System.out::println);
	}

}
