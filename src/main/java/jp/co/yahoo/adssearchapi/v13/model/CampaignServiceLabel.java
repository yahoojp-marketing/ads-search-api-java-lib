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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;紐づけられているラベル情報を表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceLabel object describes label information to be associated.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">紐づけられているラベル情報を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceLabel object describes label information to be associated.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")
@JsonPropertyOrder({
  CampaignServiceLabel.JSON_PROPERTY_COLOR,
  CampaignServiceLabel.JSON_PROPERTY_DESCRIPTION,
  CampaignServiceLabel.JSON_PROPERTY_LABEL_ID,
  CampaignServiceLabel.JSON_PROPERTY_LABEL_NAME
})
@JsonTypeName("CampaignServiceLabel")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceLabel {
  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL_ID = "labelId";
  private Long labelId;

  public static final String JSON_PROPERTY_LABEL_NAME = "labelName";
  private String labelName;

  public CampaignServiceLabel() { 
  }

  public CampaignServiceLabel color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;カラーです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Color.&lt;br&gt;&lt;/div&gt; 
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">カラーです。</div> <div lang=\"en\">Color.<br></div> ")
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public CampaignServiceLabel description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;説明文です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description.&lt;/div&gt; 
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">説明文です。</div> <div lang=\"en\">Description.</div> ")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CampaignServiceLabel labelId(Long labelId) {
    
    this.labelId = labelId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベルIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label ID.&lt;/div&gt; 
   * @return labelId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベルIDです。</div> <div lang=\"en\">Label ID.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLabelId() {
    return labelId;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }


  public CampaignServiceLabel labelName(String labelName) {
    
    this.labelName = labelName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ラベル名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Label name.&lt;/div&gt; 
   * @return labelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ラベル名です。</div> <div lang=\"en\">Label name.</div> ")
  @JsonProperty(JSON_PROPERTY_LABEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabelName() {
    return labelName;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceLabel campaignServiceLabel = (CampaignServiceLabel) o;
    return Objects.equals(this.color, campaignServiceLabel.color) &&
        Objects.equals(this.description, campaignServiceLabel.description) &&
        Objects.equals(this.labelId, campaignServiceLabel.labelId) &&
        Objects.equals(this.labelName, campaignServiceLabel.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, description, labelId, labelName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceLabel {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

