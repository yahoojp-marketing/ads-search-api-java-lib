package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AssetServiceSchedule;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceCalloutAssetオブジェクトは、テキスト補足オプションのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがCALLOUTの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceCalloutAsset contains Asset value information for callout options.&lt;br&gt; This field is optional in ADD operation. *If type is CALLOUT, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceCalloutAssetオブジェクトは、テキスト補足オプションのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがCALLOUTの場合は必須です。</div> <div lang=\"en\">AssetServiceCalloutAsset contains Asset value information for callout options.<br> This field is optional in ADD operation. *If type is CALLOUT, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceCalloutAsset   {
  @JsonProperty("calloutText")
  private String calloutText = null;

  @JsonProperty("reviewCalloutText")
  private String reviewCalloutText = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("schedules")
  @Valid
  private List<AssetServiceSchedule> schedules = null;

  public AssetServiceCalloutAsset calloutText(String calloutText) {
    this.calloutText = calloutText;
    return this;
  }

  /**
   * <div lang=\"ja\">コールアウトテキストです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Callout text.<br> This field is required in ADD operation.</div> 
   * @return calloutText
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コールアウトテキストです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Callout text.<br> This field is required in ADD operation.</div> ")


  public String getCalloutText() {
    return calloutText;
  }

  public void setCalloutText(String calloutText) {
    this.calloutText = calloutText;
  }

  public AssetServiceCalloutAsset reviewCalloutText(String reviewCalloutText) {
    this.reviewCalloutText = reviewCalloutText;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のコールアウトテキストです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Callout text on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewCalloutText
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のコールアウトテキストです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Callout text on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewCalloutText() {
    return reviewCalloutText;
  }

  public void setReviewCalloutText(String reviewCalloutText) {
    this.reviewCalloutText = reviewCalloutText;
  }

  public AssetServiceCalloutAsset startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">配信開始日です。<br> ※空で設定すると、既存の配信開始日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Start date of ad display<br> *On setting blank, existing start date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信開始日です。<br> ※空で設定すると、既存の配信開始日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">Start date of ad display<br> *On setting blank, existing start date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AssetServiceCalloutAsset endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">配信終了日です。<br> ※空で設定すると、既存の配信終了日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">End date of ad display.<br> *By setting blank, existing end date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信終了日です。<br> ※空で設定すると、既存の配信終了日は削除されます。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。</div> <div lang=\"en\">End date of ad display.<br> *By setting blank, existing end date of ad display will be deleted.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AssetServiceCalloutAsset schedules(List<AssetServiceSchedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public AssetServiceCalloutAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
    if (this.schedules == null) {
      this.schedules = new ArrayList<>();
    }
    this.schedules.add(schedulesItem);
    return this;
  }

  /**
   * Get schedules
   * @return schedules
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AssetServiceSchedule> getSchedules() {
    return schedules;
  }

  public void setSchedules(List<AssetServiceSchedule> schedules) {
    this.schedules = schedules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceCalloutAsset assetServiceCalloutAsset = (AssetServiceCalloutAsset) o;
    return Objects.equals(this.calloutText, assetServiceCalloutAsset.calloutText) &&
        Objects.equals(this.reviewCalloutText, assetServiceCalloutAsset.reviewCalloutText) &&
        Objects.equals(this.startDate, assetServiceCalloutAsset.startDate) &&
        Objects.equals(this.endDate, assetServiceCalloutAsset.endDate) &&
        Objects.equals(this.schedules, assetServiceCalloutAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calloutText, reviewCalloutText, startDate, endDate, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceCalloutAsset {\n");
    
    sb.append("    calloutText: ").append(toIndentedString(calloutText)).append("\n");
    sb.append("    reviewCalloutText: ").append(toIndentedString(reviewCalloutText)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
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

