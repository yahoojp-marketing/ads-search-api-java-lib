package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceCriterionType;
import jp.co.yahoo.adssearchapi.v4.model.CampaignCriterionServiceKeyword;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceCriterionオブジェクトは、クライテリアを表します。※キャンペーン用クライテリアです。&lt;br&gt; ADD時およびREMOVE時、このフィールドは必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignCriterionServiceCriterion object describes criteria information. *This is a criteria for campaign.&lt;br&gt; This field is required in ADD and REMOVE operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceCriterionオブジェクトは、クライテリアを表します。※キャンペーン用クライテリアです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterion object describes criteria information. *This is a criteria for campaign.<br> This field is required in ADD and REMOVE operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignCriterionServiceCriterion   {
  @JsonProperty("criterionId")
  private Long criterionId = null;

  @JsonProperty("criterionTrackId")
  private Long criterionTrackId = null;

  @JsonProperty("criterionType")
  private CampaignCriterionServiceCriterionType criterionType = null;

  @JsonProperty("keyword")
  private CampaignCriterionServiceKeyword keyword = null;

  public CampaignCriterionServiceCriterion criterionId(Long criterionId) {
    this.criterionId = criterionId;
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリアIDです。<br> REMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterion ID.<br> This field is required in REMOVE operation.</div> 
   * @return criterionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリアIDです。<br> REMOVE時、このフィールドは必須です。</div> <div lang=\"en\">CampaignCriterionServiceCriterion ID.<br> This field is required in REMOVE operation.</div> ")


  public Long getCriterionId() {
    return criterionId;
  }

  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }

  public CampaignCriterionServiceCriterion criterionTrackId(Long criterionTrackId) {
    this.criterionTrackId = criterionTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリオントラックIDです。<br> 対象外キーワードでは返却されません。</div> <div lang=\"en\">CampaignCriterionServiceCriterion Track ID.<br> This is not returned for Negative keyword.</div> 
   * @return criterionTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオントラックIDです。<br> 対象外キーワードでは返却されません。</div> <div lang=\"en\">CampaignCriterionServiceCriterion Track ID.<br> This is not returned for Negative keyword.</div> ")


  public Long getCriterionTrackId() {
    return criterionTrackId;
  }

  public void setCriterionTrackId(Long criterionTrackId) {
    this.criterionTrackId = criterionTrackId;
  }

  public CampaignCriterionServiceCriterion criterionType(CampaignCriterionServiceCriterionType criterionType) {
    this.criterionType = criterionType;
    return this;
  }

  /**
   * Get criterionType
   * @return criterionType
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterionServiceCriterionType getCriterionType() {
    return criterionType;
  }

  public void setCriterionType(CampaignCriterionServiceCriterionType criterionType) {
    this.criterionType = criterionType;
  }

  public CampaignCriterionServiceCriterion keyword(CampaignCriterionServiceKeyword keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * Get keyword
   * @return keyword
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterionServiceKeyword getKeyword() {
    return keyword;
  }

  public void setKeyword(CampaignCriterionServiceKeyword keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCriterionServiceCriterion campaignCriterionServiceCriterion = (CampaignCriterionServiceCriterion) o;
    return Objects.equals(this.criterionId, campaignCriterionServiceCriterion.criterionId) &&
        Objects.equals(this.criterionTrackId, campaignCriterionServiceCriterion.criterionTrackId) &&
        Objects.equals(this.criterionType, campaignCriterionServiceCriterion.criterionType) &&
        Objects.equals(this.keyword, campaignCriterionServiceCriterion.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(criterionId, criterionTrackId, criterionType, keyword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceCriterion {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

