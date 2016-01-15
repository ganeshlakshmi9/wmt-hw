package wmt.hw.app.service;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.httpclient.HttpException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import wmt.hw.app.domain.Item;
import wmt.hw.app.domain.ProductReview;
import wmt.hw.app.domain.SearchResponse;

/**
 * @author Ganesh Muthuluru
 * 
 *         Product service interface that provides operations for search,
 *         recommendations and review
 *
 */
public interface ProductService {

	/**
	 * Recommends top products based on the rating. This uses a Facade pattern.
	 * 
	 * It searches for the items with given string and then retrieves the
	 * recommendations for the first item in the search results and then displays the
	 * first 10 recommendations items in the decreasing order of their overall customer reviews reviews.
	 * 
	 * @param query
	 * @return {@link Set<Item>}
	 * @throws IOException
	 */
	public abstract Set<Item> getProductRecommendationsByRating(String query)
			throws IOException;

	/**
	 * Search products based on the provided search criteria
	 * 
	 * @param query
	 * @return {@link SearchResponse}
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws HttpException
	 * @throws IOException
	 */
	public abstract SearchResponse searchProducts(String query)
			throws JsonParseException, JsonMappingException, HttpException,
			IOException;

	/**
	 * Retrieve product recommendations based on the provided item id.
	 * 
	 * @param itemid
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws HttpException
	 * @throws IOException
	 */
	public abstract List<Item> getRecommendedProducts(Integer itemid)
			throws JsonParseException, JsonMappingException, HttpException,
			IOException;

	/**
	 * Retrieve product review.
	 * 
	 * @param itemid
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws HttpException
	 * @throws IOException
	 */
	public abstract ProductReview getProductReview(Integer itemid)
			throws JsonParseException, JsonMappingException, HttpException,
			IOException;

}