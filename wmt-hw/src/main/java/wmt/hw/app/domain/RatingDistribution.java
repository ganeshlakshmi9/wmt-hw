
package wmt.hw.app.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@JsonPropertyOrder({
    "count",
    "ratingValue"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class RatingDistribution {

    @JsonProperty("count")
    private String count;
    @JsonProperty("ratingValue")
    private String ratingValue;
    /**
     * 
     * @return
     *     The count
     */
    @JsonProperty("count")
    public String getCount() {
        return count;
    }

    /**
     * 
     * @param count
     *     The count
     */
    @JsonProperty("count")
    public void setCount(String count) {
        this.count = count;
    }

    /**
     * 
     * @return
     *     The ratingValue
     */
    @JsonProperty("ratingValue")
    public String getRatingValue() {
        return ratingValue;
    }

    /**
     * 
     * @param ratingValue
     *     The ratingValue
     */
    @JsonProperty("ratingValue")
    public void setRatingValue(String ratingValue) {
        this.ratingValue = ratingValue;
    }

}
