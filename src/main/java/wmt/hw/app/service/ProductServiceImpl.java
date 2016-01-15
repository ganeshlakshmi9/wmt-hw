package wmt.hw.app.service;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.httpclient.HttpException;
import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.TypeFactory;

import com.google.common.base.Preconditions;

import wmt.hw.app.domain.Item;
import wmt.hw.app.domain.ProductReview;
import wmt.hw.app.domain.SearchResponse;
import wmt.hw.app.http.RestRunner;

/**
 * @author Ganesh Muthuluru
 *
 */
public class ProductServiceImpl implements ProductService {
	private static final String SEARCH_URL = "http://api.walmartlabs.com/v1/search";
	private static final String RECOMMENDATION_URL = "http://api.walmartlabs.com/v1/nbp";
	private static final String REVIEW_URL = "http://api.walmartlabs.com/v1/reviews/";
	private ObjectMapper mapper = new ObjectMapper();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * wmt.hw.app.ProductService#getProductRecommendationsByRating(java.lang.
	 * String)
	 */
	public Set<Item> getProductRecommendationsByRating(String query) throws IOException {
		TreeSet<Item> sortedItems = new TreeSet<Item>();
		try {
			Preconditions.checkArgument(StringUtils.isNotEmpty(query), "query cannot not be null");
			SearchResponse response = searchProducts(URLEncoder.encode(query.trim(),"UTF-8"));
			if (response.getItems().size() > 0) {
				List<Item> items = getRecommendedProducts(response.getItems().get(0).getItemId());
				for (int i = 0; i < items.size() && i < 10; i++) {
					Item item = items.get(i);
					ProductReview productReview = getProductReview(item.getItemId());
					item.setRating(Float.parseFloat(productReview.getReviewStatistics().getAverageOverallRating()));
					sortedItems.add(item);
				}
			}
		} catch (HttpException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
		return sortedItems;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see wmt.hw.app.ProductService#searchProducts(java.lang.String)
	 */
	public SearchResponse searchProducts(String query)
			throws JsonParseException, JsonMappingException, HttpException, IOException {
		Map<String, String> parametersMap = createBasicParameters();
		parametersMap.put("query", query);
		SearchResponse response = mapper.readValue(RestRunner.execute(SEARCH_URL, parametersMap), SearchResponse.class);
		return response;
	}

	/*
	 * (non-Javadoc)
	 * 	 * @see wmt.hw.app.ProductService#getRecommendedProducts(java.lang.Integer)

	 */
	public List<Item> getRecommendedProducts(Integer itemId)
			throws JsonParseException, JsonMappingException, HttpException, IOException {
		Map<String, String> parametersMap = createBasicParameters();
		parametersMap.put("itemId", itemId.toString());
		return mapper.readValue(RestRunner.execute(RECOMMENDATION_URL, parametersMap),
				TypeFactory.defaultInstance().constructCollectionType(List.class, Item.class));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see wmt.hw.app.ProductService#getProductReview(java.lang.Integer)
	 */
	public ProductReview getProductReview(Integer itemId)
			throws JsonParseException, JsonMappingException, HttpException, IOException {
		Map<String, String> parametersMap = createBasicParameters();
		String reviewUrlWithId = String.format("%s%d", REVIEW_URL, itemId);
		return mapper.readValue(RestRunner.execute(reviewUrlWithId, parametersMap), ProductReview.class);
	}

	/**
	 * @return
	 */
	private Map<String, String> createBasicParameters() {
		Map<String, String> basicParameters = new HashMap<String, String>();
		basicParameters.put("apiKey", "vgs9ka37ckfw5bqchnfufmf9");
		return basicParameters;
	}

}
