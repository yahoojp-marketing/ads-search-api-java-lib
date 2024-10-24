/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupServiceCpcBiddingSchemeオブジェクトは、広告グループ最大入札価格(CPC)の設定情報を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; AdGroupServiceCpcBiddingScheme object holds configuration information of max bid of ad group (CPC). &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupServiceCpcBiddingSchemeオブジェクトは、広告グループ最大入札価格(CPC)の設定情報を表します。 </div> <div lang=\"en\"> AdGroupServiceCpcBiddingScheme object holds configuration information of max bid of ad group (CPC). </div> ")
@JsonPropertyOrder({
  AdGroupServiceCpcBiddingScheme.JSON_PROPERTY_CPC
})
@JsonTypeName("AdGroupServiceCpcBiddingScheme")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupServiceCpcBiddingScheme {
  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public AdGroupServiceCpcBiddingScheme() { 
  }

  public AdGroupServiceCpcBiddingScheme cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 広告グループ最大入札価格（CPC）です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Max bid of ad group (CPC).&lt;br&gt; This field is optional in ADD and SET operation. &lt;/div&gt; 
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\"> 広告グループ最大入札価格（CPC）です。<br> ADDおよびSET時、このフィールドは省略可能となります。 </div> <div lang=\"en\"> Max bid of ad group (CPC).<br> This field is optional in ADD and SET operation. </div> ")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupServiceCpcBiddingScheme adGroupServiceCpcBiddingScheme = (AdGroupServiceCpcBiddingScheme) o;
    return Objects.equals(this.cpc, adGroupServiceCpcBiddingScheme.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceCpcBiddingScheme {\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

