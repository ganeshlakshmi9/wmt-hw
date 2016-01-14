
package wmt.hw.app.domain;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "itemId",
    "parentItemId",
    "name",
    "msrp",
    "salePrice",
    "upc",
    "categoryPath",
    "shortDescription",
    "longDescription",
    "thumbnailImage",
    "productTrackingUrl",
    "standardShipRate",
    "marketplace",
    "modelNumber",
    "productUrl",
    "customerRating",
    "numReviews",
    "customerRatingImage",
    "categoryNode",
    "bundle",
    "addToCartUrl",
    "affiliateAddToCartUrl",
    "giftOptions",
    "availableOnline",
    "sellerInfo",
    "freeShippingOver50Dollars"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item implements Comparable<Item>{

    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("parentItemId")
    private Integer parentItemId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("msrp")
    private Double msrp;
    @JsonProperty("salePrice")
    private Double salePrice;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("productTrackingUrl")
    private String productTrackingUrl;
    @JsonProperty("standardShipRate")
    private Double standardShipRate;
    @JsonProperty("marketplace")
    private Boolean marketplace;
    @JsonProperty("modelNumber")
    private String modelNumber;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("customerRating")
    private String customerRating;
    @JsonProperty("numReviews")
    private Integer numReviews;
    @JsonProperty("customerRatingImage")
    private String customerRatingImage;
    @JsonProperty("categoryNode")
    private String categoryNode;
    @JsonProperty("bundle")
    private Boolean bundle;
    @JsonProperty("addToCartUrl")
    private String addToCartUrl;
    @JsonProperty("affiliateAddToCartUrl")
    private String affiliateAddToCartUrl;
    @JsonProperty("giftOptions")
    private GiftOptions giftOptions;
    @JsonProperty("availableOnline")
    private Boolean availableOnline;
    @JsonProperty("sellerInfo")
    private String sellerInfo;
    @JsonProperty("freeShippingOver50Dollars")
    private Boolean freeShippingOver50Dollars;
    @JsonIgnore
    private Float rating;

    public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	/**
     * 
     * @return
     *     The itemId
     */
    @JsonProperty("itemId")
    public Integer getItemId() {
        return itemId;
    }

    /**
     * 
     * @param itemId
     *     The itemId
     */
    @JsonProperty("itemId")
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * 
     * @return
     *     The parentItemId
     */
    @JsonProperty("parentItemId")
    public Integer getParentItemId() {
        return parentItemId;
    }

    /**
     * 
     * @param parentItemId
     *     The parentItemId
     */
    @JsonProperty("parentItemId")
    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The msrp
     */
    @JsonProperty("msrp")
    public Double getMsrp() {
        return msrp;
    }

    /**
     * 
     * @param msrp
     *     The msrp
     */
    @JsonProperty("msrp")
    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    /**
     * 
     * @return
     *     The salePrice
     */
    @JsonProperty("salePrice")
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * 
     * @param salePrice
     *     The salePrice
     */
    @JsonProperty("salePrice")
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * 
     * @return
     *     The upc
     */
    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    /**
     * 
     * @param upc
     *     The upc
     */
    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * 
     * @return
     *     The categoryPath
     */
    @JsonProperty("categoryPath")
    public String getCategoryPath() {
        return categoryPath;
    }

    /**
     * 
     * @param categoryPath
     *     The categoryPath
     */
    @JsonProperty("categoryPath")
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    /**
     * 
     * @return
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * 
     * @param shortDescription
     *     The shortDescription
     */
    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * 
     * @return
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * 
     * @param longDescription
     *     The longDescription
     */
    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * 
     * @return
     *     The thumbnailImage
     */
    @JsonProperty("thumbnailImage")
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * 
     * @param thumbnailImage
     *     The thumbnailImage
     */
    @JsonProperty("thumbnailImage")
    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    /**
     * 
     * @return
     *     The productTrackingUrl
     */
    @JsonProperty("productTrackingUrl")
    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    /**
     * 
     * @param productTrackingUrl
     *     The productTrackingUrl
     */
    @JsonProperty("productTrackingUrl")
    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    /**
     * 
     * @return
     *     The standardShipRate
     */
    @JsonProperty("standardShipRate")
    public Double getStandardShipRate() {
        return standardShipRate;
    }

    /**
     * 
     * @param standardShipRate
     *     The standardShipRate
     */
    @JsonProperty("standardShipRate")
    public void setStandardShipRate(Double standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    /**
     * 
     * @return
     *     The marketplace
     */
    @JsonProperty("marketplace")
    public Boolean getMarketplace() {
        return marketplace;
    }

    /**
     * 
     * @param marketplace
     *     The marketplace
     */
    @JsonProperty("marketplace")
    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * 
     * @return
     *     The modelNumber
     */
    @JsonProperty("modelNumber")
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * 
     * @param modelNumber
     *     The modelNumber
     */
    @JsonProperty("modelNumber")
    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    /**
     * 
     * @return
     *     The productUrl
     */
    @JsonProperty("productUrl")
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * 
     * @param productUrl
     *     The productUrl
     */
    @JsonProperty("productUrl")
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * 
     * @return
     *     The customerRating
     */
    @JsonProperty("customerRating")
    public String getCustomerRating() {
        return customerRating;
    }

    /**
     * 
     * @param customerRating
     *     The customerRating
     */
    @JsonProperty("customerRating")
    public void setCustomerRating(String customerRating) {
        this.customerRating = customerRating;
    }

    /**
     * 
     * @return
     *     The numReviews
     */
    @JsonProperty("numReviews")
    public Integer getNumReviews() {
        return numReviews;
    }

    /**
     * 
     * @param numReviews
     *     The numReviews
     */
    @JsonProperty("numReviews")
    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    /**
     * 
     * @return
     *     The customerRatingImage
     */
    @JsonProperty("customerRatingImage")
    public String getCustomerRatingImage() {
        return customerRatingImage;
    }

    /**
     * 
     * @param customerRatingImage
     *     The customerRatingImage
     */
    @JsonProperty("customerRatingImage")
    public void setCustomerRatingImage(String customerRatingImage) {
        this.customerRatingImage = customerRatingImage;
    }

    /**
     * 
     * @return
     *     The categoryNode
     */
    @JsonProperty("categoryNode")
    public String getCategoryNode() {
        return categoryNode;
    }

    /**
     * 
     * @param categoryNode
     *     The categoryNode
     */
    @JsonProperty("categoryNode")
    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    /**
     * 
     * @return
     *     The bundle
     */
    @JsonProperty("bundle")
    public Boolean getBundle() {
        return bundle;
    }

    /**
     * 
     * @param bundle
     *     The bundle
     */
    @JsonProperty("bundle")
    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    /**
     * 
     * @return
     *     The addToCartUrl
     */
    @JsonProperty("addToCartUrl")
    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    /**
     * 
     * @param addToCartUrl
     *     The addToCartUrl
     */
    @JsonProperty("addToCartUrl")
    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    /**
     * 
     * @return
     *     The affiliateAddToCartUrl
     */
    @JsonProperty("affiliateAddToCartUrl")
    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    /**
     * 
     * @param affiliateAddToCartUrl
     *     The affiliateAddToCartUrl
     */
    @JsonProperty("affiliateAddToCartUrl")
    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    /**
     * 
     * @return
     *     The giftOptions
     */
    @JsonProperty("giftOptions")
    public GiftOptions getGiftOptions() {
        return giftOptions;
    }

    /**
     * 
     * @param giftOptions
     *     The giftOptions
     */
    @JsonProperty("giftOptions")
    public void setGiftOptions(GiftOptions giftOptions) {
        this.giftOptions = giftOptions;
    }

    /**
     * 
     * @return
     *     The availableOnline
     */
    @JsonProperty("availableOnline")
    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    /**
     * 
     * @param availableOnline
     *     The availableOnline
     */
    @JsonProperty("availableOnline")
    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    /**
     * 
     * @return
     *     The sellerInfo
     */
    @JsonProperty("sellerInfo")
    public String getSellerInfo() {
        return sellerInfo;
    }

    /**
     * 
     * @param sellerInfo
     *     The sellerInfo
     */
    @JsonProperty("sellerInfo")
    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    /**
     * 
     * @return
     *     The freeShippingOver50Dollars
     */
    @JsonProperty("freeShippingOver50Dollars")
    public Boolean getFreeShippingOver50Dollars() {
        return freeShippingOver50Dollars;
    }

    /**
     * 
     * @param freeShippingOver50Dollars
     *     The freeShippingOver50Dollars
     */
    @JsonProperty("freeShippingOver50Dollars")
    public void setFreeShippingOver50Dollars(Boolean freeShippingOver50Dollars) {
        this.freeShippingOver50Dollars = freeShippingOver50Dollars;
    }

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Item item) {
		return item.getRating().compareTo(rating);
	}

}
