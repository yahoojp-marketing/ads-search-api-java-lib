package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignRetargetingListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListServicePageオブジェクトは、キャンペーン階層におけるターゲットリストの設定に関する実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListServicePage  object holds execution results (list of all entities) for Target List settings on the campaign level.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListServicePageオブジェクトは、キャンペーン階層におけるターゲットリストの設定に関する実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">CampaignRetargetingListServicePage  object holds execution results (list of all entities) for Target List settings on the campaign level.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignRetargetingListServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<CampaignRetargetingListServiceValue> values = null;

  public CampaignRetargetingListServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public CampaignRetargetingListServicePage values(List<CampaignRetargetingListServiceValue> values) {
    this.values = values;
    return this;
  }

  public CampaignRetargetingListServicePage addValuesItem(CampaignRetargetingListServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignRetargetingListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<CampaignRetargetingListServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingListServicePage campaignRetargetingListServicePage = (CampaignRetargetingListServicePage) o;
    return Objects.equals(this.totalNumEntries, campaignRetargetingListServicePage.totalNumEntries) &&
        Objects.equals(this.values, campaignRetargetingListServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServicePage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

