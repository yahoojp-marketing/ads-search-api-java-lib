package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupRetargetingListServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServicePageは、広告グループレベルでのターゲットリスト設定の実行結果（全Entityのリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServicePage is an object that holds results (list of all entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListServicePageは、広告グループレベルでのターゲットリスト設定の実行結果（全Entityのリスト）を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingListServicePage is an object that holds results (list of all entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupRetargetingListServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<AdGroupRetargetingListServiceValue> values = null;

  public AdGroupRetargetingListServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number the item have retrieved.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number the item have retrieved.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public AdGroupRetargetingListServicePage values(List<AdGroupRetargetingListServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupRetargetingListServicePage addValuesItem(AdGroupRetargetingListServiceValue valuesItem) {
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

  public List<AdGroupRetargetingListServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupRetargetingListServiceValue> values) {
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
    AdGroupRetargetingListServicePage adGroupRetargetingListServicePage = (AdGroupRetargetingListServicePage) o;
    return Objects.equals(this.totalNumEntries, adGroupRetargetingListServicePage.totalNumEntries) &&
        Objects.equals(this.values, adGroupRetargetingListServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServicePage {\n");
    
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

