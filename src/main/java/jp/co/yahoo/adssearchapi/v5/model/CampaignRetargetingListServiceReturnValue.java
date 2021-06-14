package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignRetargetingListServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListPageオブジェクトは、キャンペーン階層のターゲットリスト設定における実行結果（全Entityのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListPage object holds results (list of all entities) on Target List settings for campaign layer.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListPageオブジェクトは、キャンペーン階層のターゲットリスト設定における実行結果（全Entityのリスト）を保持します。</div> <div lang=\"en\">CampaignRetargetingListPage object holds results (list of all entities) on Target List settings for campaign layer.</div> ")

public class CampaignRetargetingListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<CampaignRetargetingListServiceValue>> values = JsonNullable.undefined();

  public CampaignRetargetingListServiceReturnValue values(List<CampaignRetargetingListServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public CampaignRetargetingListServiceReturnValue addValuesItem(CampaignRetargetingListServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<CampaignRetargetingListServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<CampaignRetargetingListServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRetargetingListServiceReturnValue campaignRetargetingListServiceReturnValue = (CampaignRetargetingListServiceReturnValue) o;
    return Objects.equals(this.values, campaignRetargetingListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

