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
import jp.co.yahoo.adssearchapi.v8.model.FeedItemServiceCriterionTypeFeedItem;
import jp.co.yahoo.adssearchapi.v8.model.FeedItemServiceGeoRestriction;
import jp.co.yahoo.adssearchapi.v8.model.FeedItemServiceIsRemove;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceLocationオブジェクトは、地域設定情報を格納します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADD時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceLocation object contains the information of Geographic FeedItemServiceLocation.&lt;br&gt; Although this field will be returned in the  response, it will be ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceLocationオブジェクトは、地域設定情報を格納します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADD時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceLocation object contains the information of Geographic FeedItemServiceLocation.<br> Although this field will be returned in the  response, it will be ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD operation.</div> ")
@JsonPropertyOrder({
  FeedItemServiceLocation.JSON_PROPERTY_CRITERION_TYPE_FEED_ITEM,
  FeedItemServiceLocation.JSON_PROPERTY_GEO_RESTRICTION,
  FeedItemServiceLocation.JSON_PROPERTY_IS_REMOVE,
  FeedItemServiceLocation.JSON_PROPERTY_TARGET_ID
})
@JsonTypeName("FeedItemServiceLocation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FeedItemServiceLocation {
  public static final String JSON_PROPERTY_CRITERION_TYPE_FEED_ITEM = "criterionTypeFeedItem";
  private FeedItemServiceCriterionTypeFeedItem criterionTypeFeedItem;

  public static final String JSON_PROPERTY_GEO_RESTRICTION = "geoRestriction";
  private FeedItemServiceGeoRestriction geoRestriction;

  public static final String JSON_PROPERTY_IS_REMOVE = "isRemove";
  private FeedItemServiceIsRemove isRemove;

  public static final String JSON_PROPERTY_TARGET_ID = "targetId";
  private String targetId;

  public FeedItemServiceLocation() { 
  }

  public FeedItemServiceLocation criterionTypeFeedItem(FeedItemServiceCriterionTypeFeedItem criterionTypeFeedItem) {
    
    this.criterionTypeFeedItem = criterionTypeFeedItem;
    return this;
  }

   /**
   * Get criterionTypeFeedItem
   * @return criterionTypeFeedItem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE_FEED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceCriterionTypeFeedItem getCriterionTypeFeedItem() {
    return criterionTypeFeedItem;
  }


  @JsonProperty(JSON_PROPERTY_CRITERION_TYPE_FEED_ITEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCriterionTypeFeedItem(FeedItemServiceCriterionTypeFeedItem criterionTypeFeedItem) {
    this.criterionTypeFeedItem = criterionTypeFeedItem;
  }


  public FeedItemServiceLocation geoRestriction(FeedItemServiceGeoRestriction geoRestriction) {
    
    this.geoRestriction = geoRestriction;
    return this;
  }

   /**
   * Get geoRestriction
   * @return geoRestriction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEO_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceGeoRestriction getGeoRestriction() {
    return geoRestriction;
  }


  @JsonProperty(JSON_PROPERTY_GEO_RESTRICTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeoRestriction(FeedItemServiceGeoRestriction geoRestriction) {
    this.geoRestriction = geoRestriction;
  }


  public FeedItemServiceLocation isRemove(FeedItemServiceIsRemove isRemove) {
    
    this.isRemove = isRemove;
    return this;
  }

   /**
   * Get isRemove
   * @return isRemove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }


  @JsonProperty(JSON_PROPERTY_IS_REMOVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }


  public FeedItemServiceLocation targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;地域種別コードです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceLocation Type Code.&lt;br&gt; This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.&lt;/div&gt; 
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">地域種別コードです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedItemServiceLocation Type Code.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetId() {
    return targetId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceLocation feedItemServiceLocation = (FeedItemServiceLocation) o;
    return Objects.equals(this.criterionTypeFeedItem, feedItemServiceLocation.criterionTypeFeedItem) &&
        Objects.equals(this.geoRestriction, feedItemServiceLocation.geoRestriction) &&
        Objects.equals(this.isRemove, feedItemServiceLocation.isRemove) &&
        Objects.equals(this.targetId, feedItemServiceLocation.targetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionTypeFeedItem, geoRestriction, isRemove, targetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceLocation {\n");
    sb.append("    criterionTypeFeedItem: ").append(toIndentedString(criterionTypeFeedItem)).append("\n");
    sb.append("    geoRestriction: ").append(toIndentedString(geoRestriction)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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

