package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.BalanceServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BalancePageオブジェクトは、取得されるアカウント残高に関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account balance and a page of balance resulting from the query done by BalanceService.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BalancePageオブジェクトは、取得されるアカウント残高に関するエントリーを表します。</div> <div lang=\"en\">Account balance and a page of balance resulting from the query done by BalanceService.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BalanceServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<BalanceServiceValue> values = null;

  public BalanceServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">The total number of retrieved entries.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">The total number of retrieved entries.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public BalanceServicePage values(List<BalanceServiceValue> values) {
    this.values = values;
    return this;
  }

  public BalanceServicePage addValuesItem(BalanceServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">操作結果を含むアカウント情報の配列です。</div> <div lang=\"en\">List of balance.</div> 
   * @return values
  */
  @ApiModelProperty(value = "<div lang=\"ja\">操作結果を含むアカウント情報の配列です。</div> <div lang=\"en\">List of balance.</div> ")

  @Valid

  public List<BalanceServiceValue> getValues() {
    return values;
  }

  public void setValues(List<BalanceServiceValue> values) {
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
    BalanceServicePage balanceServicePage = (BalanceServicePage) o;
    return Objects.equals(this.totalNumEntries, balanceServicePage.totalNumEntries) &&
        Objects.equals(this.values, balanceServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceServicePage {\n");
    
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

