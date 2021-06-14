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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; CampaignServiceCreatedDateRangeは、作成日時による検索対象期間を表します。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; CampaignServiceCreatedDateRange represents the search target period by the creation date. &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> CampaignServiceCreatedDateRangeは、作成日時による検索対象期間を表します。 </div> <div lang=\"en\"> CampaignServiceCreatedDateRange represents the search target period by the creation date. </div> ")

public class CampaignServiceCreatedDateRange   {
  @JsonProperty("startDate")
  private JsonNullable<String> startDate = JsonNullable.undefined();

  @JsonProperty("endDate")
  private JsonNullable<String> endDate = JsonNullable.undefined();

  public CampaignServiceCreatedDateRange startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索対象期間の開始日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the start date of the search target period.<br> * Format: yyyyMMdd </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の開始日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the start date of the search target period.<br> * Format: yyyyMMdd </div> ")


  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public CampaignServiceCreatedDateRange endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * <div lang=\"ja\"> 検索対象期間の終了日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the end date of the search target period.<br> * Format: yyyyMMdd </div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\"> 検索対象期間の終了日です。<br> ※フォーマット：yyyyMMdd </div> <div lang=\"en\"> This is the end date of the search target period.<br> * Format: yyyyMMdd </div> ")


  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceCreatedDateRange campaignServiceCreatedDateRange = (CampaignServiceCreatedDateRange) o;
    return Objects.equals(this.startDate, campaignServiceCreatedDateRange.startDate) &&
        Objects.equals(this.endDate, campaignServiceCreatedDateRange.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceCreatedDateRange {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

