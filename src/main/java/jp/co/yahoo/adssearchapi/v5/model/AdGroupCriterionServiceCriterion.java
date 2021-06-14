package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceCriterionType;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceKeyword;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceCriterionオブジェクトは、クライテリアを表します。※広告グループ用クライテリアです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceCriterion object displays criteria information. *Ad group criteria.&lt;br&gt; This field is required in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceCriterionオブジェクトは、クライテリアを表します。※広告グループ用クライテリアです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceCriterion object displays criteria information. *Ad group criteria.<br> This field is required in any cases.</div> ")

public class AdGroupCriterionServiceCriterion   {
  @JsonProperty("criterionId")
  private JsonNullable<Long> criterionId = JsonNullable.undefined();

  @JsonProperty("criterionTrackId")
  private JsonNullable<Long> criterionTrackId = JsonNullable.undefined();

  @JsonProperty("criterionType")
  private JsonNullable<AdGroupCriterionServiceCriterionType> criterionType = JsonNullable.undefined();

  @JsonProperty("keyword")
  private JsonNullable<AdGroupCriterionServiceKeyword> keyword = JsonNullable.undefined();

  public AdGroupCriterionServiceCriterion criterionId(Long criterionId) {
    this.criterionId = JsonNullable.of(criterionId);
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリアIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceCriterion ID.<br> This field is required in SET and REMOVE operation.</div> 
   * @return criterionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリアIDです。<br> SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">AdGroupCriterionServiceCriterion ID.<br> This field is required in SET and REMOVE operation.</div> ")


  public JsonNullable<Long> getCriterionId() {
    return criterionId;
  }

  public void setCriterionId(JsonNullable<Long> criterionId) {
    this.criterionId = criterionId;
  }

  public AdGroupCriterionServiceCriterion criterionTrackId(Long criterionTrackId) {
    this.criterionTrackId = JsonNullable.of(criterionTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用クライテリアIDです。</div> <div lang=\"en\">AdGroupCriterionServiceCriterion ID for tracking.</div> 
   * @return criterionTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用クライテリアIDです。</div> <div lang=\"en\">AdGroupCriterionServiceCriterion ID for tracking.</div> ")


  public JsonNullable<Long> getCriterionTrackId() {
    return criterionTrackId;
  }

  public void setCriterionTrackId(JsonNullable<Long> criterionTrackId) {
    this.criterionTrackId = criterionTrackId;
  }

  public AdGroupCriterionServiceCriterion criterionType(AdGroupCriterionServiceCriterionType criterionType) {
    this.criterionType = JsonNullable.of(criterionType);
    return this;
  }

  /**
   * Get criterionType
   * @return criterionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceCriterionType> getCriterionType() {
    return criterionType;
  }

  public void setCriterionType(JsonNullable<AdGroupCriterionServiceCriterionType> criterionType) {
    this.criterionType = criterionType;
  }

  public AdGroupCriterionServiceCriterion keyword(AdGroupCriterionServiceKeyword keyword) {
    this.keyword = JsonNullable.of(keyword);
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceKeyword> getKeyword() {
    return keyword;
  }

  public void setKeyword(JsonNullable<AdGroupCriterionServiceKeyword> keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceCriterion adGroupCriterionServiceCriterion = (AdGroupCriterionServiceCriterion) o;
    return Objects.equals(this.criterionId, adGroupCriterionServiceCriterion.criterionId) &&
        Objects.equals(this.criterionTrackId, adGroupCriterionServiceCriterion.criterionTrackId) &&
        Objects.equals(this.criterionType, adGroupCriterionServiceCriterion.criterionType) &&
        Objects.equals(this.keyword, adGroupCriterionServiceCriterion.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionId, criterionTrackId, criterionType, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceCriterion {\n");
    
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    criterionTrackId: ").append(toIndentedString(criterionTrackId)).append("\n");
    sb.append("    criterionType: ").append(toIndentedString(criterionType)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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

