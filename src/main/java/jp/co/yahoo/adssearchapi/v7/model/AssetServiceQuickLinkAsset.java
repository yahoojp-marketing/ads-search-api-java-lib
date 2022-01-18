package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AssetServiceSchedule;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceQuickLinkAssetオブジェクトは、クイックリンクオプションのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがQUICKLINKの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceQuickLinkAsset contains Asset value information for quicklink options.&lt;br&gt; This field is optional in ADD operation. *If type is QUICKLINK, this field is required.&lt;br&gt;&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceQuickLinkAssetオブジェクトは、クイックリンクオプションのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがQUICKLINKの場合は必須です。</div> <div lang=\"en\">AssetServiceQuickLinkAsset contains Asset value information for quicklink options.<br> This field is optional in ADD operation. *If type is QUICKLINK, this field is required.<br></div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceQuickLinkAsset   {
  @JsonProperty("linkText")
  private String linkText = null;

  @JsonProperty("reviewLinkText")
  private String reviewLinkText = null;

  @JsonProperty("description1")
  private String description1 = null;

  @JsonProperty("reviewDescription1")
  private String reviewDescription1 = null;

  @JsonProperty("description2")
  private String description2 = null;

  @JsonProperty("reviewDescription2")
  private String reviewDescription2 = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("schedules")
  @Valid
  private List<AssetServiceSchedule> schedules = null;

  public AssetServiceQuickLinkAsset linkText(String linkText) {
    this.linkText = linkText;
    return this;
  }

  /**
   * <div lang=\"ja\">リンクテキストです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Link text.<br> This field is required in ADD operation.</div> 
   * @return linkText
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リンクテキストです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Link text.<br> This field is required in ADD operation.</div> ")


  public String getLinkText() {
    return linkText;
  }

  public void setLinkText(String linkText) {
    this.linkText = linkText;
  }

  public AssetServiceQuickLinkAsset reviewLinkText(String reviewLinkText) {
    this.reviewLinkText = reviewLinkText;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中のリンクテキストです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Link text on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewLinkText
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中のリンクテキストです。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Link text on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewLinkText() {
    return reviewLinkText;
  }

  public void setReviewLinkText(String reviewLinkText) {
    this.reviewLinkText = reviewLinkText;
  }

  public AssetServiceQuickLinkAsset description1(String description1) {
    this.description1 = description1;
    return this;
  }

  /**
   * <div lang=\"ja\">説明文1です。</div> <div lang=\"en\">Description 1.</div> 
   * @return description1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文1です。</div> <div lang=\"en\">Description 1.</div> ")


  public String getDescription1() {
    return description1;
  }

  public void setDescription1(String description1) {
    this.description1 = description1;
  }

  public AssetServiceQuickLinkAsset reviewDescription1(String reviewDescription1) {
    this.reviewDescription1 = reviewDescription1;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の説明文1です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Description 1 on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewDescription1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の説明文1です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Description 1 on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewDescription1() {
    return reviewDescription1;
  }

  public void setReviewDescription1(String reviewDescription1) {
    this.reviewDescription1 = reviewDescription1;
  }

  public AssetServiceQuickLinkAsset description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * <div lang=\"ja\">説明文2です。</div> <div lang=\"en\">Description 2.</div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文2です。</div> <div lang=\"en\">Description 2.</div> ")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public AssetServiceQuickLinkAsset reviewDescription2(String reviewDescription2) {
    this.reviewDescription2 = reviewDescription2;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の説明文2です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Description 2 on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewDescription2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の説明文2です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Description 2 on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewDescription2() {
    return reviewDescription2;
  }

  public void setReviewDescription2(String reviewDescription2) {
    this.reviewDescription2 = reviewDescription2;
  }

  public AssetServiceQuickLinkAsset startDate(String startDate) {
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

  public AssetServiceQuickLinkAsset endDate(String endDate) {
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

  public AssetServiceQuickLinkAsset schedules(List<AssetServiceSchedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public AssetServiceQuickLinkAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
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
    AssetServiceQuickLinkAsset assetServiceQuickLinkAsset = (AssetServiceQuickLinkAsset) o;
    return Objects.equals(this.linkText, assetServiceQuickLinkAsset.linkText) &&
        Objects.equals(this.reviewLinkText, assetServiceQuickLinkAsset.reviewLinkText) &&
        Objects.equals(this.description1, assetServiceQuickLinkAsset.description1) &&
        Objects.equals(this.reviewDescription1, assetServiceQuickLinkAsset.reviewDescription1) &&
        Objects.equals(this.description2, assetServiceQuickLinkAsset.description2) &&
        Objects.equals(this.reviewDescription2, assetServiceQuickLinkAsset.reviewDescription2) &&
        Objects.equals(this.startDate, assetServiceQuickLinkAsset.startDate) &&
        Objects.equals(this.endDate, assetServiceQuickLinkAsset.endDate) &&
        Objects.equals(this.schedules, assetServiceQuickLinkAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkText, reviewLinkText, description1, reviewDescription1, description2, reviewDescription2, startDate, endDate, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceQuickLinkAsset {\n");
    
    sb.append("    linkText: ").append(toIndentedString(linkText)).append("\n");
    sb.append("    reviewLinkText: ").append(toIndentedString(reviewLinkText)).append("\n");
    sb.append("    description1: ").append(toIndentedString(description1)).append("\n");
    sb.append("    reviewDescription1: ").append(toIndentedString(reviewDescription1)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
    sb.append("    reviewDescription2: ").append(toIndentedString(reviewDescription2)).append("\n");
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

