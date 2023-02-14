/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v10.model.AdGroupServiceBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceBiddingStrategyConfigurationオブジェクトは、自動入札設定方法を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceBiddingStrategyConfiguration object describes Auto Bidding setting.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceBiddingStrategyConfigurationオブジェクトは、自動入札設定方法を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupServiceBiddingStrategyConfiguration object describes Auto Bidding setting.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@JsonPropertyOrder({
  AdGroupServiceBiddingStrategyConfiguration.JSON_PROPERTY_BIDDING_SCHEME,
  AdGroupServiceBiddingStrategyConfiguration.JSON_PROPERTY_PORTFOLIO_BIDDING_ID,
  AdGroupServiceBiddingStrategyConfiguration.JSON_PROPERTY_PORTFOLIO_BIDDING_NAME
})
@JsonTypeName("AdGroupServiceBiddingStrategyConfiguration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceBiddingStrategyConfiguration {
  public static final String JSON_PROPERTY_BIDDING_SCHEME = "biddingScheme";
  private AdGroupServiceBiddingScheme biddingScheme;

  public static final String JSON_PROPERTY_PORTFOLIO_BIDDING_ID = "portfolioBiddingId";
  private Long portfolioBiddingId;

  public static final String JSON_PROPERTY_PORTFOLIO_BIDDING_NAME = "portfolioBiddingName";
  private String portfolioBiddingName;

  public AdGroupServiceBiddingStrategyConfiguration() { 
  }

  public AdGroupServiceBiddingStrategyConfiguration biddingScheme(AdGroupServiceBiddingScheme biddingScheme) {
    
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

  public AdGroupServiceBiddingScheme getBiddingScheme() {
    return biddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingScheme(AdGroupServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }


  public AdGroupServiceBiddingStrategyConfiguration portfolioBiddingId(Long portfolioBiddingId) {
    
    this.portfolioBiddingId = portfolioBiddingId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ポートフォリオ入札IDです。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Portfolio bidding ID.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
   * @return portfolioBiddingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ポートフォリオ入札IDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Portfolio bidding ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPortfolioBiddingId() {
    return portfolioBiddingId;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioBiddingId(Long portfolioBiddingId) {
    this.portfolioBiddingId = portfolioBiddingId;
  }


  public AdGroupServiceBiddingStrategyConfiguration portfolioBiddingName(String portfolioBiddingName) {
    
    this.portfolioBiddingName = portfolioBiddingName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ポートフォリオ入札名です。&lt;br&gt; ADD時、このフィールドは無視されます。&lt;br&gt; ※50文字以内になります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Portfolio bidding name.&lt;br&gt; This field will be ignored in ADD operation.&lt;br&gt;* Up to 50 characters.&lt;/div&gt; 
   * @return portfolioBiddingName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ポートフォリオ入札名です。<br> ADD時、このフィールドは無視されます。<br> ※50文字以内になります。</div> <div lang=\"en\">Portfolio bidding name.<br> This field will be ignored in ADD operation.<br>* Up to 50 characters.</div> ")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortfolioBiddingName() {
    return portfolioBiddingName;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO_BIDDING_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolioBiddingName(String portfolioBiddingName) {
    this.portfolioBiddingName = portfolioBiddingName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceBiddingStrategyConfiguration adGroupServiceBiddingStrategyConfiguration = (AdGroupServiceBiddingStrategyConfiguration) o;
    return Objects.equals(this.biddingScheme, adGroupServiceBiddingStrategyConfiguration.biddingScheme) &&
        Objects.equals(this.portfolioBiddingId, adGroupServiceBiddingStrategyConfiguration.portfolioBiddingId) &&
        Objects.equals(this.portfolioBiddingName, adGroupServiceBiddingStrategyConfiguration.portfolioBiddingName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingScheme, portfolioBiddingId, portfolioBiddingName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBiddingStrategyConfiguration {\n");
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
    sb.append("    portfolioBiddingId: ").append(toIndentedString(portfolioBiddingId)).append("\n");
    sb.append("    portfolioBiddingName: ").append(toIndentedString(portfolioBiddingName)).append("\n");
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

