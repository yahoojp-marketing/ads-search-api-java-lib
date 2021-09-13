package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.KeywordEstimatorServiceEstimateResult;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeywordEstimatorServiceResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceResult   {
  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("keyword")
  private String keyword = null;

  @JsonProperty("max")
  private KeywordEstimatorServiceEstimateResult max = null;

  @JsonProperty("min")
  private KeywordEstimatorServiceEstimateResult min = null;

  public KeywordEstimatorServiceResult adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">AdGroup ID.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。</div> <div lang=\"en\">AdGroup ID.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public KeywordEstimatorServiceResult campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public KeywordEstimatorServiceResult keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> 
   * @return keyword
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords.</div> ")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public KeywordEstimatorServiceResult max(KeywordEstimatorServiceEstimateResult max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordEstimatorServiceEstimateResult getMax() {
    return max;
  }

  public void setMax(KeywordEstimatorServiceEstimateResult max) {
    this.max = max;
  }

  public KeywordEstimatorServiceResult min(KeywordEstimatorServiceEstimateResult min) {
    this.min = min;
    return this;
  }

  /**
   * Get min
   * @return min
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordEstimatorServiceEstimateResult getMin() {
    return min;
  }

  public void setMin(KeywordEstimatorServiceEstimateResult min) {
    this.min = min;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

