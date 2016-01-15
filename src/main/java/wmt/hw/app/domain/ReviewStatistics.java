
package wmt.hw.app.domain;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;


@JsonPropertyOrder({
    "averageOverallRating",
    "overallRatingRange",
    "ratingDistributions",
    "totalReviewCount"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewStatistics {

    @JsonProperty("averageOverallRating")
    private String averageOverallRating;
    @JsonProperty("overallRatingRange")
    private String overallRatingRange;
    @JsonProperty("ratingDistributions")
    private List<RatingDistribution> ratingDistributions = new ArrayList<RatingDistribution>();
    @JsonProperty("totalReviewCount")
    private String totalReviewCount;

    /**
     * 
     * @return
     *     The averageOverallRating
     */
    @JsonProperty("averageOverallRating")
    public String getAverageOverallRating() {
        return averageOverallRating;
    }

    /**
     * 
     * @param averageOverallRating
     *     The averageOverallRating
     */
    @JsonProperty("averageOverallRating")
    public void setAverageOverallRating(String averageOverallRating) {
        this.averageOverallRating = averageOverallRating;
    }

    /**
     * 
     * @return
     *     The overallRatingRange
     */
    @JsonProperty("overallRatingRange")
    public String getOverallRatingRange() {
        return overallRatingRange;
    }

    /**
     * 
     * @param overallRatingRange
     *     The overallRatingRange
     */
    @JsonProperty("overallRatingRange")
    public void setOverallRatingRange(String overallRatingRange) {
        this.overallRatingRange = overallRatingRange;
    }

    /**
     * 
     * @return
     *     The ratingDistributions
     */
    @JsonProperty("ratingDistributions")
    public List<RatingDistribution> getRatingDistributions() {
        return ratingDistributions;
    }

    /**
     * 
     * @param ratingDistributions
     *     The ratingDistributions
     */
    @JsonProperty("ratingDistributions")
    public void setRatingDistributions(List<RatingDistribution> ratingDistributions) {
        this.ratingDistributions = ratingDistributions;
    }

    /**
     * 
     * @return
     *     The totalReviewCount
     */
    @JsonProperty("totalReviewCount")
    public String getTotalReviewCount() {
        return totalReviewCount;
    }

    /**
     * 
     * @param totalReviewCount
     *     The totalReviewCount
     */
    @JsonProperty("totalReviewCount")
    public void setTotalReviewCount(String totalReviewCount) {
        this.totalReviewCount = totalReviewCount;
    }

}
