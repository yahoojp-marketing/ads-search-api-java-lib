package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterionServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionServicePageオブジェクトは、検索結果（全エンティティのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterionServicePage object holds search results (all entities list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionServicePageオブジェクトは、検索結果（全エンティティのリスト）を保持します。</div> <div lang=\"en\">SharedCriterionServicePage object holds search results (all entities list).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SharedCriterionServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<SharedCriterionServiceValue> values = null;

  public SharedCriterionServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of acruired items.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of acruired items.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public SharedCriterionServicePage values(List<SharedCriterionServiceValue> values) {
    this.values = values;
    return this;
  }

  public SharedCriterionServicePage addValuesItem(SharedCriterionServiceValue valuesItem) {
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

  public List<SharedCriterionServiceValue> getValues() {
    return values;
  }

  public void setValues(List<SharedCriterionServiceValue> values) {
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
    SharedCriterionServicePage sharedCriterionServicePage = (SharedCriterionServicePage) o;
    return Objects.equals(this.totalNumEntries, sharedCriterionServicePage.totalNumEntries) &&
        Objects.equals(this.values, sharedCriterionServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterionServicePage {\n");
    
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

