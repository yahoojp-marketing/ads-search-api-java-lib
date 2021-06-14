package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceEstimateResult;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeywordEstimatorServiceResult
 */

public class KeywordEstimatorServiceResult   {
  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("keyword")
  private JsonNullable<String> keyword = JsonNullable.undefined();

  @JsonProperty("max")
  private JsonNullable<KeywordEstimatorServiceEstimateResult> max = JsonNullable.undefined();

  @JsonProperty("min")
  private JsonNullable<KeywordEstimatorServiceEstimateResult> min = JsonNullable.undefined();

  public KeywordEstimatorServiceResult adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">AdGroup ID.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">AdGroup ID.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public KeywordEstimatorServiceResult campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public KeywordEstimatorServiceResult keyword(String keyword) {
    this.keyword = JsonNullable.of(keyword);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> ")


  public JsonNullable<String> getKeyword() {
    return keyword;
  }

  public void setKeyword(JsonNullable<String> keyword) {
    this.keyword = keyword;
  }

  public KeywordEstimatorServiceResult max(KeywordEstimatorServiceEstimateResult max) {
    this.max = JsonNullable.of(max);
    return this;
  }

  /**
   * Get max
   * @return max
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordEstimatorServiceEstimateResult> getMax() {
    return max;
  }

  public void setMax(JsonNullable<KeywordEstimatorServiceEstimateResult> max) {
    this.max = max;
  }

  public KeywordEstimatorServiceResult min(KeywordEstimatorServiceEstimateResult min) {
    this.min = JsonNullable.of(min);
    return this;
  }

  /**
   * Get min
   * @return min
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordEstimatorServiceEstimateResult> getMin() {
    return min;
  }

  public void setMin(JsonNullable<KeywordEstimatorServiceEstimateResult> min) {
    this.min = min;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceResult keywordEstimatorServiceResult = (KeywordEstimatorServiceResult) o;
    return Objects.equals(this.adGroupId, keywordEstimatorServiceResult.adGroupId) &&
        Objects.equals(this.campaignId, keywordEstimatorServiceResult.campaignId) &&
        Objects.equals(this.keyword, keywordEstimatorServiceResult.keyword) &&
        Objects.equals(this.max, keywordEstimatorServiceResult.max) &&
        Objects.equals(this.min, keywordEstimatorServiceResult.min);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, campaignId, keyword, max, min);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceResult {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
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

