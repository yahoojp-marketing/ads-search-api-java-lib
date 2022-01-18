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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceCallAssetオブジェクトは、電話番号オプションのアセット情報を格納します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※typeがCALLの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceCallAsset contains Asset value information for phone number options.&lt;br&gt; This field is optional in ADD operation. *If type is CALL, this field is required.&lt;br&gt;&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceCallAssetオブジェクトは、電話番号オプションのアセット情報を格納します。<br> ADD時、このフィールドは省略可能となります。※typeがCALLの場合は必須です。</div> <div lang=\"en\">AssetServiceCallAsset contains Asset value information for phone number options.<br> This field is optional in ADD operation. *If type is CALL, this field is required.<br></div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceCallAsset   {
  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("reviewPhoneNumber")
  private String reviewPhoneNumber = null;

  @JsonProperty("schedules")
  @Valid
  private List<AssetServiceSchedule> schedules = null;

  public AssetServiceCallAsset phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * <div lang=\"ja\">電話番号です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Phone Number.<br> This field is required in ADD operation.</div> 
   * @return phoneNumber
  */
  @ApiModelProperty(value = "<div lang=\"ja\">電話番号です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Phone Number.<br> This field is required in ADD operation.</div> ")


  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public AssetServiceCallAsset reviewPhoneNumber(String reviewPhoneNumber) {
    this.reviewPhoneNumber = reviewPhoneNumber;
    return this;
  }

  /**
   * <div lang=\"ja\">審査中の電話番号です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Phone Number on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> 
   * @return reviewPhoneNumber
  */
  @ApiModelProperty(value = "<div lang=\"ja\">審査中の電話番号です。<br> このフィールドは、リクエストの際には無視されます。<br> 審査中の間のみ、レスポンスの際に返却されます。</div> <div lang=\"en\">Phone Number on editorial review.<br> This field will be ignored on input.<br> It will be returned at the time of response only during the review.</div> ")


  public String getReviewPhoneNumber() {
    return reviewPhoneNumber;
  }

  public void setReviewPhoneNumber(String reviewPhoneNumber) {
    this.reviewPhoneNumber = reviewPhoneNumber;
  }

  public AssetServiceCallAsset schedules(List<AssetServiceSchedule> schedules) {
    this.schedules = schedules;
    return this;
  }

  public AssetServiceCallAsset addSchedulesItem(AssetServiceSchedule schedulesItem) {
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
    AssetServiceCallAsset assetServiceCallAsset = (AssetServiceCallAsset) o;
    return Objects.equals(this.phoneNumber, assetServiceCallAsset.phoneNumber) &&
        Objects.equals(this.reviewPhoneNumber, assetServiceCallAsset.reviewPhoneNumber) &&
        Objects.equals(this.schedules, assetServiceCallAsset.schedules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneNumber, reviewPhoneNumber, schedules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceCallAsset {\n");
    
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    reviewPhoneNumber: ").append(toIndentedString(reviewPhoneNumber)).append("\n");
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

