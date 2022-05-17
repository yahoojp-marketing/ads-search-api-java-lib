/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v8.model.CampaignCriterionServiceCriterion;
import jp.co.yahoo.adssearchapi.v8.model.CampaignCriterionServiceUse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterion object describes campaign criteria.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionオブジェクトは、キャンペーンのクライテリアを表します。</div> <div lang=\"en\">CampaignCriterion object describes campaign criteria.</div> ")
@JsonPropertyOrder({
  CampaignCriterion.JSON_PROPERTY_ACCOUNT_ID,
  CampaignCriterion.JSON_PROPERTY_CAMPAIGN_ID,
  CampaignCriterion.JSON_PROPERTY_CAMPAIGN_NAME,
  CampaignCriterion.JSON_PROPERTY_CRITERION,
  CampaignCriterion.JSON_PROPERTY_USE
})
@JsonTypeName("CampaignCriterion")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignCriterion {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CAMPAIGN_ID = "campaignId";
  private Long campaignId;

  public static final String JSON_PROPERTY_CAMPAIGN_NAME = "campaignName";
  private String campaignName;

  public static final String JSON_PROPERTY_CRITERION = "criterion";
  private CampaignCriterionServiceCriterion criterion;

  public static final String JSON_PROPERTY_USE = "use";
  private CampaignCriterionServiceUse use;

  public CampaignCriterion() { 
  }

  public CampaignCriterion accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; ADD時およびREMOVE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in ADD and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public CampaignCriterion campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンIDです。&lt;br&gt; ADD時およびREMOVE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign ID.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignId() {
    return campaignId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignCriterion campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン名です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign name.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Campaign name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignName() {
    return campaignName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignCriterion criterion(CampaignCriterionServiceCriterion criterion) {
    
    this.criterion = criterion;
    return this;
  }

   /**
   * Get criterion
   * @return criterion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignCriterionServiceCriterion getCriterion() {
    return criterion;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterion(CampaignCriterionServiceCriterion criterion) {
    this.criterion = criterion;
  }


  public CampaignCriterion use(CampaignCriterionServiceUse use) {
    
    this.use = use;
    return this;
  }

   /**
   * Get use
   * @return use
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignCriterionServiceUse getUse() {
    return use;
  }


  @JsonProperty(JSON_PROPERTY_USE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUse(CampaignCriterionServiceUse use) {
    this.use = use;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterion campaignCriterion = (CampaignCriterion) o;
    return Objects.equals(this.accountId, campaignCriterion.accountId) &&
        Objects.equals(this.campaignId, campaignCriterion.campaignId) &&
        Objects.equals(this.campaignName, campaignCriterion.campaignName) &&
        Objects.equals(this.criterion, campaignCriterion.criterion) &&
        Objects.equals(this.use, campaignCriterion.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, campaignName, criterion, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterion {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

