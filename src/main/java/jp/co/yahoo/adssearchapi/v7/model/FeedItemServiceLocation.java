package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.FeedItemServiceCriterionTypeFeedItem;
import jp.co.yahoo.adssearchapi.v7.model.FeedItemServiceGeoRestriction;
import jp.co.yahoo.adssearchapi.v7.model.FeedItemServiceIsRemove;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceLocationオブジェクトは、地域設定情報を格納します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADD時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceLocation object contains the information of Geographic FeedItemServiceLocation.&lt;br&gt; Although this field will be returned in the  response, it will be ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceLocationオブジェクトは、地域設定情報を格納します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADD時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceLocation object contains the information of Geographic FeedItemServiceLocation.<br> Although this field will be returned in the  response, it will be ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceLocation   {
  @JsonProperty("criterionTypeFeedItem")
  private FeedItemServiceCriterionTypeFeedItem criterionTypeFeedItem = null;

  @JsonProperty("geoRestriction")
  private FeedItemServiceGeoRestriction geoRestriction = null;

  @JsonProperty("isRemove")
  private FeedItemServiceIsRemove isRemove = null;

  @JsonProperty("targetId")
  private String targetId = null;

  public FeedItemServiceLocation criterionTypeFeedItem(FeedItemServiceCriterionTypeFeedItem criterionTypeFeedItem) {
    this.criterionTypeFeedItem = criterionTypeFeedItem;
    return this;
  }

  /**
   * Get criterionTypeFeedItem
   * @return criterionTypeFeedItem
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceCriterionTypeFeedItem getCriterionTypeFeedItem() {
    return criterionTypeFeedItem;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceGeoRestriction getGeoRestriction() {
    return geoRestriction;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public FeedItemServiceIsRemove getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(FeedItemServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }

  public FeedItemServiceLocation targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * <div lang=\"ja\">地域種別コードです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedItemServiceLocation Type Code.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.</div> 
   * @return targetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域種別コードです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedItemServiceLocation Type Code.<br> This field is required in ADD operation, is optional in SET operation, and will be ignored in REMOVE operation.</div> ")


  public String getTargetId() {
    return targetId;
  }

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

