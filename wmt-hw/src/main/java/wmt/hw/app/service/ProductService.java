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
 * @author lakshmiganesh
 * 
 * Product service interface that provides operations for search , recommend and review
 *
 */
public interface ProductService {

	/**
	 * Recommend top products based on the rating
	 * 
	 * @param query
	 * @return
	 * @throws IOException
	 */
	public abstract Set<Item> getProductRecommendationsByRating(String query)
			throws IOException;

	/**
	 * Search products based on the provided search criteria
	 * 
	 * @param query
	 * @return
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