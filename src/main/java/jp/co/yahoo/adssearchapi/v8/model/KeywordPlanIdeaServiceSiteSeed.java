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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceSiteSeedオブジェクトは、キーワード候補作成条件としてサイト（ドメインURL）を指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;SITE&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceSiteSeed object is for specifying site (domain URL) as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;SITE&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceSiteSeedオブジェクトは、キーワード候補作成条件としてサイト（ドメインURL）を指定するオブジェクトです。<br>seedTypeが<code>SITE</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceSiteSeed object is for specifying site (domain URL) as related keywords creation conditions.<br>If seedType is <code>SITE</code>, this field is required.</div> ")
@JsonPropertyOrder({
  KeywordPlanIdeaServiceSiteSeed.JSON_PROPERTY_SITE
})
@JsonTypeName("KeywordPlanIdeaServiceSiteSeed")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class KeywordPlanIdeaServiceSiteSeed {
  public static final String JSON_PROPERTY_SITE = "site";
  private String site;

  public KeywordPlanIdeaServiceSiteSeed() { 
  }

  public KeywordPlanIdeaServiceSiteSeed site(String site) {
    
    this.site = site;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;サイト（ドメインURL）です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Site (domain URL).&lt;/div&gt; 
   * @return site
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">サイト（ドメインURL）です。</div> <div lang=\"en\">Site (domain URL).</div> ")
  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSite() {
    return site;
  }


  @JsonProperty(JSON_PROPERTY_SITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSite(String site) {
    this.site = site;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceSiteSeed keywordPlanIdeaServiceSiteSeed = (KeywordPlanIdeaServiceSiteSeed) o;
    return Objects.equals(this.site, keywordPlanIdeaServiceSiteSeed.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceSiteSeed {\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

