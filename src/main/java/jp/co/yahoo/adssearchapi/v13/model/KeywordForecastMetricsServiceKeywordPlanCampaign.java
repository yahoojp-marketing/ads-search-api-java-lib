/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v13.model.KeywordForecastMetricsServiceKeywordPlanAdGroup;
import jp.co.yahoo.adssearchapi.v13.model.KeywordForecastMetricsServiceKeywordPlanNetwork;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanCampaign オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanCampaign object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanCampaign オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanCampaign object is a container for the estimate request.</div> ")
@JsonPropertyOrder({
  KeywordForecastMetricsServiceKeywordPlanCampaign.JSON_PROPERTY_KEYWORD_PLAN_NETWORK,
  KeywordForecastMetricsServiceKeywordPlanCampaign.JSON_PROPERTY_CPC,
  KeywordForecastMetricsServiceKeywordPlanCampaign.JSON_PROPERTY_GEO_TARGETS,
  KeywordForecastMetricsServiceKeywordPlanCampaign.JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP
})
@JsonTypeName("KeywordForecastMetricsServiceKeywordPlanCampaign")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordForecastMetricsServiceKeywordPlanCampaign {
  public static final String JSON_PROPERTY_KEYWORD_PLAN_NETWORK = "keywordPlanNetwork";
  private KeywordForecastMetricsServiceKeywordPlanNetwork keywordPlanNetwork;

  public static final String JSON_PROPERTY_CPC = "cpc";
  private Long cpc;

  public static final String JSON_PROPERTY_GEO_TARGETS = "geoTargets";
  private List<String> geoTargets = null;

  public static final String JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP = "keywordPlanAdGroup";
  private KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroup;

  public KeywordForecastMetricsServiceKeywordPlanCampaign() { 
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanNetwork(KeywordForecastMetricsServiceKeywordPlanNetwork keywordPlanNetwork) {
    
    this.keywordPlanNetwork = keywordPlanNetwork;
    return this;
  }

   /**
   * Get keywordPlanNetwork
   * @return keywordPlanNetwork
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KeywordForecastMetricsServiceKeywordPlanNetwork getKeywordPlanNetwork() {
    return keywordPlanNetwork;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_NETWORK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordPlanNetwork(KeywordForecastMetricsServiceKeywordPlanNetwork keywordPlanNetwork) {
    this.keywordPlanNetwork = keywordPlanNetwork;
  }


  public KeywordForecastMetricsServiceKeywordPlanCampaign cpc(Long cpc) {
    
    this.cpc = cpc;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;最大クリック単価です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum CPC.&lt;/div&gt; 
   * @return cpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">最大クリック単価です。</div> <div lang=\"en\">Maximum CPC.</div> ")
  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCpc() {
    return cpc;
  }


  @JsonProperty(JSON_PROPERTY_CPC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  public KeywordForecastMetricsServiceKeywordPlanCampaign geoTargets(List<String> geoTargets) {
    
    this.geoTargets = geoTargets;
    return this;
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign addGeoTargetsItem(String geoTargetsItem) {
    if (this.geoTargets == null) {
      this.geoTargets = new ArrayList<>();
    }
    this.geoTargets.add(geoTargetsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域情報です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Area information.&lt;/div&gt; 
   * @return geoTargets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域情報です。</div> <div lang=\"en\">Area information.</div> ")
  @JsonProperty(JSON_PROPERTY_GEO_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGeoTargets() {
    return geoTargets;
  }


  @JsonProperty(JSON_PROPERTY_GEO_TARGETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoTargets(List<String> geoTargets) {
    this.geoTargets = geoTargets;
  }


  public KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanAdGroup(KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroup) {
    
    this.keywordPlanAdGroup = keywordPlanAdGroup;
    return this;
  }

   /**
   * Get keywordPlanAdGroup
   * @return keywordPlanAdGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KeywordForecastMetricsServiceKeywordPlanAdGroup getKeywordPlanAdGroup() {
    return keywordPlanAdGroup;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_PLAN_AD_GROUP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKeywordPlanAdGroup(KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroup) {
    this.keywordPlanAdGroup = keywordPlanAdGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanCampaign keywordForecastMetricsServiceKeywordPlanCampaign = (KeywordForecastMetricsServiceKeywordPlanCampaign) o;
    return Objects.equals(this.keywordPlanNetwork, keywordForecastMetricsServiceKeywordPlanCampaign.keywordPlanNetwork) &&
        Objects.equals(this.cpc, keywordForecastMetricsServiceKeywordPlanCampaign.cpc) &&
        Objects.equals(this.geoTargets, keywordForecastMetricsServiceKeywordPlanCampaign.geoTargets) &&
        Objects.equals(this.keywordPlanAdGroup, keywordForecastMetricsServiceKeywordPlanCampaign.keywordPlanAdGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordPlanNetwork, cpc, geoTargets, keywordPlanAdGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanCampaign {\n");
    sb.append("    keywordPlanNetwork: ").append(toIndentedString(keywordPlanNetwork)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    geoTargets: ").append(toIndentedString(geoTargets)).append("\n");
    sb.append("    keywordPlanAdGroup: ").append(toIndentedString(keywordPlanAdGroup)).append("\n");
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

