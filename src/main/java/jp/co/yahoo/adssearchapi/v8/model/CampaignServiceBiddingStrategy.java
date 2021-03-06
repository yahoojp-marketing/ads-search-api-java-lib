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
import jp.co.yahoo.adssearchapi.v8.model.CampaignServiceBiddingScheme;
import jp.co.yahoo.adssearchapi.v8.model.CampaignServiceBiddingStrategySource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingStrategyオブジェクトは、自動入札設定方法を表します。&lt;br&gt; ADD時、biddingStrategyConfigurationは必須となります。また、failedBiddingStrategyConfigurationはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingStrategy object describes Auto Bidding setting.&lt;br&gt; biddingStrategyConfiguration is required in ADD operation. Although failedBiddingStrategyConfiguration will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBiddingStrategyオブジェクトは、自動入札設定方法を表します。<br> ADD時、biddingStrategyConfigurationは必須となります。また、failedBiddingStrategyConfigurationはレスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceBiddingStrategy object describes Auto Bidding setting.<br> biddingStrategyConfiguration is required in ADD operation. Although failedBiddingStrategyConfiguration will be returned in the response, it will be ignored on input.</div> ")
@JsonPropertyOrder({
  CampaignServiceBiddingStrategy.JSON_PROPERTY_BIDDING_SCHEME,
  CampaignServiceBiddingStrategy.JSON_PROPERTY_BIDDING_STRATEGY_ID,
  CampaignServiceBiddingStrategy.JSON_PROPERTY_BIDDING_STRATEGY_NAME,
  CampaignServiceBiddingStrategy.JSON_PROPERTY_BIDDING_STRATEGY_SOURCE
})
@JsonTypeName("CampaignServiceBiddingStrategy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceBiddingStrategy {
  public static final String JSON_PROPERTY_BIDDING_SCHEME = "biddingScheme";
  private CampaignServiceBiddingScheme biddingScheme;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_ID = "biddingStrategyId";
  private Long biddingStrategyId;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_NAME = "biddingStrategyName";
  private String biddingStrategyName;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_SOURCE = "biddingStrategySource";
  private CampaignServiceBiddingStrategySource biddingStrategySource;

  public CampaignServiceBiddingStrategy() { 
  }

  public CampaignServiceBiddingStrategy biddingScheme(CampaignServiceBiddingScheme biddingScheme) {
    
    this.biddingScheme = biddingScheme;
    return this;
  }

   /**
   * Get biddingScheme
   * @return biddingScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBiddingScheme getBiddingScheme() {
    return biddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingScheme(CampaignServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }


  public CampaignServiceBiddingStrategy biddingStrategyId(Long biddingStrategyId) {
    
    this.biddingStrategyId = biddingStrategyId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札IDです。&lt;br&gt; ADD時、標準入札設定の場合、このフィールドは設定不可となり、ポートフォリオ入札設定の場合、必須となります。また、biddingSchemeと同時に設定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Auto Bidding ID.&lt;br&gt; This field cannot be specified when Standard bidding is setting, and is required when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingScheme.&lt;/div&gt; 
   * @return biddingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札IDです。<br> ADD時、標準入札設定の場合、このフィールドは設定不可となり、ポートフォリオ入札設定の場合、必須となります。また、biddingSchemeと同時に設定することはできません。</div> <div lang=\"en\">Auto Bidding ID.<br> This field cannot be specified when Standard bidding is setting, and is required when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingScheme.</div> ")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBiddingStrategyId() {
    return biddingStrategyId;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyId(Long biddingStrategyId) {
    this.biddingStrategyId = biddingStrategyId;
  }


  public CampaignServiceBiddingStrategy biddingStrategyName(String biddingStrategyName) {
    
    this.biddingStrategyName = biddingStrategyName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札名です。&lt;br&gt; ADD時、このフィールドは無視されます。&lt;br&gt; ※50文字以内になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Auto Bidding name.&lt;br&gt; This field will be ignored in ADD operation.&lt;br&gt;* Up to 50 characters.&lt;/div&gt; 
   * @return biddingStrategyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札名です。<br> ADD時、このフィールドは無視されます。<br> ※50文字以内になります。</div> <div lang=\"en\">Auto Bidding name.<br> This field will be ignored in ADD operation.<br>* Up to 50 characters.</div> ")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBiddingStrategyName() {
    return biddingStrategyName;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategyName(String biddingStrategyName) {
    this.biddingStrategyName = biddingStrategyName;
  }


  public CampaignServiceBiddingStrategy biddingStrategySource(CampaignServiceBiddingStrategySource biddingStrategySource) {
    
    this.biddingStrategySource = biddingStrategySource;
    return this;
  }

   /**
   * Get biddingStrategySource
   * @return biddingStrategySource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceBiddingStrategySource getBiddingStrategySource() {
    return biddingStrategySource;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_STRATEGY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingStrategySource(CampaignServiceBiddingStrategySource biddingStrategySource) {
    this.biddingStrategySource = biddingStrategySource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBiddingStrategy campaignServiceBiddingStrategy = (CampaignServiceBiddingStrategy) o;
    return Objects.equals(this.biddingScheme, campaignServiceBiddingStrategy.biddingScheme) &&
        Objects.equals(this.biddingStrategyId, campaignServiceBiddingStrategy.biddingStrategyId) &&
        Objects.equals(this.biddingStrategyName, campaignServiceBiddingStrategy.biddingStrategyName) &&
        Objects.equals(this.biddingStrategySource, campaignServiceBiddingStrategy.biddingStrategySource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingScheme, biddingStrategyId, biddingStrategyName, biddingStrategySource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBiddingStrategy {\n");
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
    sb.append("    biddingStrategyId: ").append(toIndentedString(biddingStrategyId)).append("\n");
    sb.append("    biddingStrategyName: ").append(toIndentedString(biddingStrategyName)).append("\n");
    sb.append("    biddingStrategySource: ").append(toIndentedString(biddingStrategySource)).append("\n");
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

