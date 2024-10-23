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
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceConversionActionCategory;
import jp.co.yahoo.adssearchapi.v15.model.CampaignServiceConversionSource;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceCampaignConversionGoalsは、コンバージョンの発生元と目的を表します。&lt;br&gt; ConversionTrackerに存在しないSourceとCategoryの組み合わせを指定した場合、エラーコード「I0001」となり、detailsのrequestKeyには&lt;br&gt; ・conversionSetting/campaignConversionGoals[]/source&lt;br&gt; ・conversionSetting/campaignConversionGoals[]/category&lt;br&gt; が返却されるため、ConversionTrackerの状態をご確認ください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceCampaignConversionGoals displays the combination of conversion source and purpose.&lt;br&gt; The error code \&quot;I0001\&quot; will be returned if you specify a Source and Category combination that does not exist in ConversionTracker.The requestKey in the details will contain:&lt;br&gt; * conversionSetting/campaignConversionGoals[]/source&lt;br&gt; * conversionSetting/campaignConversionGoals[]/category&lt;br&gt; Therefore, please check the content of ConversionTracker.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceCampaignConversionGoals.JSON_PROPERTY_SOURCE,
  CampaignServiceCampaignConversionGoals.JSON_PROPERTY_CATEGORY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceCampaignConversionGoals {
  public static final String JSON_PROPERTY_SOURCE = "source";
  private CampaignServiceConversionSource source;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CampaignServiceConversionActionCategory category;

  public CampaignServiceCampaignConversionGoals() {
  }

  public CampaignServiceCampaignConversionGoals source(CampaignServiceConversionSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceConversionSource getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(CampaignServiceConversionSource source) {
    this.source = source;
  }


  public CampaignServiceCampaignConversionGoals category(CampaignServiceConversionActionCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignServiceConversionActionCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(CampaignServiceConversionActionCategory category) {
    this.category = category;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCampaignConversionGoals campaignServiceCampaignConversionGoals = (CampaignServiceCampaignConversionGoals) o;
    return Objects.equals(this.source, campaignServiceCampaignConversionGoals.source) &&
        Objects.equals(this.category, campaignServiceCampaignConversionGoals.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCampaignConversionGoals {\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
