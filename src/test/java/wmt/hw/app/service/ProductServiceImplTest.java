package wmt.hw.app.service;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;

import wmt.hw.app.domain.Item;
import wmt.hw.app.domain.SearchResponse;

public class ProductServiceImplTest{

	private static ProductService productService = null;
	@BeforeClass
	public static void setup(){
		productService = new ProductServiceImpl();
	}
	
	@Test
	public void searchProductsTest() {
		SearchResponse actualResponse = null;
		try {
			actualResponse = productService.searchProducts("ipod");
		} catch (IOException e) {
			fail();
		}
		assertNotNull(actualResponse);
		assertTrue(actualResponse.getItems().size() > 0);
	}
	
	@Test
	public void searchProductsTest2() {
		SearchResponse actualResponse=null;
		try {
			actualResponse = productService.searchProducts("dfdffdfwefe");
		} catch (IOException e) {
			fail();
		}
		assertNotNull(actualResponse);
		assertTrue(actualResponse.getNumItems() == 0);
	}
	
	@Test
	public void searchProductByRatingTest() {
		Set<Item> actualResponse = null;
		try {
			actualResponse = productService.getProductRecommendationsByRating("ipod");
		} catch (IOException e) {
			fail();
		}
		assertNotNull(actualResponse);
		assertTrue(actualResponse.size() > 0);
	}
	
}
