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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v8.model.CampaignWebpageServiceWebpageCondition;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceWebpageParameterは、除外設定するWebpageの条件リストを保持します。 条件リストはAND条件で適用されます。&lt;br&gt; このフィールドは、ADD時に必須となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceWebpageParameter contains the rule list of webpage to be excluded. The rule list is applied in the AND condition.&lt;br&gt; This field is required in ADD operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceWebpageParameterは、除外設定するWebpageの条件リストを保持します。 条件リストはAND条件で適用されます。<br> このフィールドは、ADD時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">CampaignWebpageServiceWebpageParameter contains the rule list of webpage to be excluded. The rule list is applied in the AND condition.<br> This field is required in ADD operation, and will be ignored in REMOVE operation.</div> ")
@JsonPropertyOrder({
  CampaignWebpageServiceWebpageParameter.JSON_PROPERTY_CONDITIONS
})
@JsonTypeName("CampaignWebpageServiceWebpageParameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignWebpageServiceWebpageParameter {
  public static final String JSON_PROPERTY_CONDITIONS = "conditions";
  private List<CampaignWebpageServiceWebpageCondition> conditions = null;

  public CampaignWebpageServiceWebpageParameter() { 
  }

  public CampaignWebpageServiceWebpageParameter conditions(List<CampaignWebpageServiceWebpageCondition> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public CampaignWebpageServiceWebpageParameter addConditionsItem(CampaignWebpageServiceWebpageCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CampaignWebpageServiceWebpageCondition> getConditions() {
    return conditions;
  }


  @JsonProperty(JSON_PROPERTY_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConditions(List<CampaignWebpageServiceWebpageCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignWebpageServiceWebpageParameter campaignWebpageServiceWebpageParameter = (CampaignWebpageServiceWebpageParameter) o;
    return Objects.equals(this.conditions, campaignWebpageServiceWebpageParameter.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceWebpageParameter {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

