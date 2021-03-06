/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v7/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.BiddingStrategyServiceBiddingScheme;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyオブジェクトは、入札方法を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Bidding strategy object displays the type of bidding.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyオブジェクトは、入札方法を表します。</div> <div lang=\"en\">Bidding strategy object displays the type of bidding.</div> ")
@JsonPropertyOrder({
  BiddingStrategy.JSON_PROPERTY_ACCOUNT_ID,
  BiddingStrategy.JSON_PROPERTY_BIDDING_SCHEME,
  BiddingStrategy.JSON_PROPERTY_BIDDING_STRATEGY_ID,
  BiddingStrategy.JSON_PROPERTY_BIDDING_STRATEGY_NAME
})
@JsonTypeName("BiddingStrategy")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BiddingStrategy {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_BIDDING_SCHEME = "biddingScheme";
  private BiddingStrategyServiceBiddingScheme biddingScheme;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_ID = "biddingStrategyId";
  private Long biddingStrategyId;

  public static final String JSON_PROPERTY_BIDDING_STRATEGY_NAME = "biddingStrategyName";
  private String biddingStrategyName;

  public BiddingStrategy() { 
  }

  public BiddingStrategy accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> ")
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


  public BiddingStrategy biddingScheme(BiddingStrategyServiceBiddingScheme biddingScheme) {
    
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

  public BiddingStrategyServiceBiddingScheme getBiddingScheme() {
    return biddingScheme;
  }


  @JsonProperty(JSON_PROPERTY_BIDDING_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBiddingScheme(BiddingStrategyServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }


  public BiddingStrategy biddingStrategyId(Long biddingStrategyId) {
    
    this.biddingStrategyId = biddingStrategyId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札IDです。&lt;br&gt; SET時およびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Auto bidding ID.&lt;br&gt; This field is optional in SET and REMOVE operation.&lt;/div&gt; 
   * @return biddingStrategyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札IDです。<br> SET時およびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Auto bidding ID.<br> This field is optional in SET and REMOVE operation.</div> ")
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


  public BiddingStrategy biddingStrategyName(String biddingStrategyName) {
    
    this.biddingStrategyName = biddingStrategyName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札名です（50文字以内になります）。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Auto bidding name(Can set up to 50 characters).&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return biddingStrategyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札名です（50文字以内になります）。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Auto bidding name(Can set up to 50 characters).<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategy biddingStrategy = (BiddingStrategy) o;
    return Objects.equals(this.accountId, biddingStrategy.accountId) &&
        Objects.equals(this.biddingScheme, biddingStrategy.biddingScheme) &&
        Objects.equals(this.biddingStrategyId, biddingStrategy.biddingStrategyId) &&
        Objects.equals(this.biddingStrategyName, biddingStrategy.biddingStrategyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, biddingScheme, biddingStrategyId, biddingStrategyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategy {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
    sb.append("    biddingStrategyId: ").append(toIndentedString(biddingStrategyId)).append("\n");
    sb.append("    biddingStrategyName: ").append(toIndentedString(biddingStrategyName)).append("\n");
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

