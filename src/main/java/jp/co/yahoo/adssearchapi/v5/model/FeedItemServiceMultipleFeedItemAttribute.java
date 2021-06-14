package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceFeedAttributeValue;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceIsRemove;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時には無視されます。&lt;br&gt; ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.&lt;br&gt; If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時には無視されます。<br> ※placeholderFieldがSTRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, ADDITIONAL_ADVANCED_MOBILE_URLSの場合、ADDおよびSET時に必須となります。</div> <div lang=\"en\">This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> If the placeholderField is STRUCTURED_SNIPPET_VALUES, ADDITIONAL_ADVANCED_URLS, or ADDITIONAL_ADVANCED_MOBILE_URLS, this field is required in ADD and SET operation.</div> ")

public class FeedItemServiceMultipleFeedItemAttribute   {
  @JsonProperty("feedAttributeValues")
  @Valid
  private JsonNullable<List<FeedItemServiceFeedAttributeValue>> feedAttributeValues = JsonNullable.undefined();

  @JsonProperty("isRemove")
  private JsonNullable<FeedItemServiceIsRemove> isRemove = JsonNullable.undefined();

  public FeedItemServiceMultipleFeedItemAttribute feedAttributeValues(List<FeedItemServiceFeedAttributeValue> feedAttributeValues) {
    this.feedAttributeValues = JsonNullable.of(feedAttributeValues);
    return this;
  }

  public FeedItemServiceMultipleFeedItemAttribute addFeedAttributeValuesItem(FeedItemServiceFeedAttributeValue feedAttributeValuesItem) {
    if (this.feedAttributeValues == null || !this.feedAttributeValues.isPresent()) {
      this.feedAttributeValues = JsonNullable.of(new ArrayList<>());
    }
    this.feedAttributeValues.get().add(feedAttributeValuesItem);
    return this;
  }

  /**
   * Get feedAttributeValues
   * @return feedAttributeValues
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedItemServiceFeedAttributeValue>> getFeedAttributeValues() {
    return feedAttributeValues;
  }

  public void setFeedAttributeValues(JsonNullable<List<FeedItemServiceFeedAttributeValue>> feedAttributeValues) {
    this.feedAttributeValues = feedAttributeValues;
  }

  public FeedItemServiceMultipleFeedItemAttribute isRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = JsonNullable.of(isRemove);
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<FeedItemServiceIsRemove> getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(JsonNullable<FeedItemServiceIsRemove> isRemove) {
    this.isRemove = isRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceMultipleFeedItemAttribute feedItemServiceMultipleFeedItemAttribute = (FeedItemServiceMultipleFeedItemAttribute) o;
    return Objects.equals(this.feedAttributeValues, feedItemServiceMultipleFeedItemAttribute.feedAttributeValues) &&
        Objects.equals(this.isRemove, feedItemServiceMultipleFeedItemAttribute.isRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feedAttributeValues, isRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceMultipleFeedItemAttribute {\n");
    
    sb.append("    feedAttributeValues: ").append(toIndentedString(feedAttributeValues)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

