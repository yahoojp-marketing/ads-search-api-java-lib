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
import jp.co.yahoo.adssearchapi.v7.model.CampaignTargetServiceNetworkCoverageType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceNetworkTargetオブジェクトは、広告掲載方式を表します。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt; ※targetTypeがNETWORKの場合、このフィールドはADD時に必須となります。&lt;br&gt; なおNetworkTargetを設定しない場合、「YAHOO_SEARCH」を含むすべての広告掲載方式に広告は配信されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignTargetServiceNetworkTarget object describes Network coverage type.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; *If targetType is NETWORK, this field is required in ADD operation.&lt;br&gt; If you do not set the NetworkTarget, ads are delivered to the advertising system including all \&quot;YAHOO_SEARCH\&quot;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceNetworkTargetオブジェクトは、広告掲載方式を表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※targetTypeがNETWORKの場合、このフィールドはADD時に必須となります。<br> なおNetworkTargetを設定しない場合、「YAHOO_SEARCH」を含むすべての広告掲載方式に広告は配信されます。</div> <div lang=\"en\">CampaignTargetServiceNetworkTarget object describes Network coverage type.<br> This field is optional in ADD and SET operation.<br> *If targetType is NETWORK, this field is required in ADD operation.<br> If you do not set the NetworkTarget, ads are delivered to the advertising system including all \"YAHOO_SEARCH\".</div> ")
@JsonPropertyOrder({
  CampaignTargetServiceNetworkTarget.JSON_PROPERTY_NETWORK_COVERAGE_TYPE
})
@JsonTypeName("CampaignTargetServiceNetworkTarget")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignTargetServiceNetworkTarget {
  public static final String JSON_PROPERTY_NETWORK_COVERAGE_TYPE = "networkCoverageType";
  private CampaignTargetServiceNetworkCoverageType networkCoverageType;

  public CampaignTargetServiceNetworkTarget() { 
  }

  public CampaignTargetServiceNetworkTarget networkCoverageType(CampaignTargetServiceNetworkCoverageType networkCoverageType) {
    
    this.networkCoverageType = networkCoverageType;
    return this;
  }

   /**
   * Get networkCoverageType
   * @return networkCoverageType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NETWORK_COVERAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignTargetServiceNetworkCoverageType getNetworkCoverageType() {
    return networkCoverageType;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_COVERAGE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkCoverageType(CampaignTargetServiceNetworkCoverageType networkCoverageType) {
    this.networkCoverageType = networkCoverageType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceNetworkTarget campaignTargetServiceNetworkTarget = (CampaignTargetServiceNetworkTarget) o;
    return Objects.equals(this.networkCoverageType, campaignTargetServiceNetworkTarget.networkCoverageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkCoverageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceNetworkTarget {\n");
    sb.append("    networkCoverageType: ").append(toIndentedString(networkCoverageType)).append("\n");
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

