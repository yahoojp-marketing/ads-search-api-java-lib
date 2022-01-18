package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceCampaignEstimateRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceSelector オブジェクトは、見積もりリクエストを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordEstimatorServiceSelectorobject is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceSelector オブジェクトは、見積もりリクエストを格納するコンテナです。</div> <div lang=\"en\">KeywordEstimatorServiceSelectorobject is a container for the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("campaignEstimateRequest")
  private KeywordEstimatorServiceCampaignEstimateRequest campaignEstimateRequest = null;

  public KeywordEstimatorServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public KeywordEstimatorServiceSelector campaignEstimateRequest(KeywordEstimatorServiceCampaignEstimateRequest campaignEstimateRequest) {
    this.campaignEstimateRequest = campaignEstimateRequest;
    return this;
  }

  /**
   * Get campaignEstimateRequest
   * @return campaignEstimateRequest
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordEstimatorServiceCampaignEstimateRequest getCampaignEstimateRequest() {
    return campaignEstimateRequest;
  }

  public void setCampaignEstimateRequest(KeywordEstimatorServiceCampaignEstimateRequest campaignEstimateRequest) {
    this.campaignEstimateRequest = campaignEstimateRequest;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceSelector keywordEstimatorServiceSelector = (KeywordEstimatorServiceSelector) o;
    return Objects.equals(this.accountId, keywordEstimatorServiceSelector.accountId) &&
        Objects.equals(this.campaignEstimateRequest, keywordEstimatorServiceSelector.campaignEstimateRequest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignEstimateRequest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignEstimateRequest: ").append(toIndentedString(campaignEstimateRequest)).append("\n");
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

