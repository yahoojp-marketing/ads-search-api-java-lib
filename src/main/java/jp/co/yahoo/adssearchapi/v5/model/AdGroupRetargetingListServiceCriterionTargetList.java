package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServiceCriterionTargetListは、ターゲットリスト情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、いずれの場合でも必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServiceCriterionTargetList is an object that holds target list information.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListServiceCriterionTargetListは、ターゲットリスト情報を保持するオブジェクトです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">AdGroupRetargetingListServiceCriterionTargetList is an object that holds target list information.<br> This field is required in any cases.</div> ")

public class AdGroupRetargetingListServiceCriterionTargetList   {
  @JsonProperty("retargetingTrackId")
  private JsonNullable<Long> retargetingTrackId = JsonNullable.undefined();

  @JsonProperty("targetListId")
  private JsonNullable<Long> targetListId = JsonNullable.undefined();

  @JsonProperty("targetListName")
  private JsonNullable<String> targetListName = JsonNullable.undefined();

  public AdGroupRetargetingListServiceCriterionTargetList retargetingTrackId(Long retargetingTrackId) {
    this.retargetingTrackId = JsonNullable.of(retargetingTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">リターゲティングトラックIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Retargeting Track ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return retargetingTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リターゲティングトラックIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Retargeting Track ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getRetargetingTrackId() {
    return retargetingTrackId;
  }

  public void setRetargetingTrackId(JsonNullable<Long> retargetingTrackId) {
    this.retargetingTrackId = retargetingTrackId;
  }

  public AdGroupRetargetingListServiceCriterionTargetList targetListId(Long targetListId) {
    this.targetListId = JsonNullable.of(targetListId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Target list ID.<br> This field is required in any cases.</div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Target list ID.<br> This field is required in any cases.</div> ")


  public JsonNullable<Long> getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(JsonNullable<Long> targetListId) {
    this.targetListId = targetListId;
  }

  public AdGroupRetargetingListServiceCriterionTargetList targetListName(String targetListName) {
    this.targetListName = JsonNullable.of(targetListName);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Target list name.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Target list name.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<String> getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(JsonNullable<String> targetListName) {
    this.targetListName = targetListName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupRetargetingListServiceCriterionTargetList adGroupRetargetingListServiceCriterionTargetList = (AdGroupRetargetingListServiceCriterionTargetList) o;
    return Objects.equals(this.retargetingTrackId, adGroupRetargetingListServiceCriterionTargetList.retargetingTrackId) &&
        Objects.equals(this.targetListId, adGroupRetargetingListServiceCriterionTargetList.targetListId) &&
        Objects.equals(this.targetListName, adGroupRetargetingListServiceCriterionTargetList.targetListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retargetingTrackId, targetListId, targetListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServiceCriterionTargetList {\n");
    
    sb.append("    retargetingTrackId: ").append(toIndentedString(retargetingTrackId)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

