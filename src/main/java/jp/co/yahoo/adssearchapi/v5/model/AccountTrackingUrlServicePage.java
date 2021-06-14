package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AccountTrackingUrlServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlServicePageオブジェクトは、アカウントトラッキング情報に関するgetメソッドの実行結果を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrlServicePage object describes the account tracking information with get results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlServicePageオブジェクトは、アカウントトラッキング情報に関するgetメソッドの実行結果を表します。</div> <div lang=\"en\">AccountTrackingUrlServicePage object describes the account tracking information with get results.</div> ")

public class AccountTrackingUrlServicePage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AccountTrackingUrlServiceValue>> values = JsonNullable.undefined();

  public AccountTrackingUrlServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public AccountTrackingUrlServicePage values(List<AccountTrackingUrlServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AccountTrackingUrlServicePage addValuesItem(AccountTrackingUrlServiceValue valuesItem) {
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

  public JsonNullable<List<AccountTrackingUrlServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AccountTrackingUrlServiceValue>> values) {
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
    AccountTrackingUrlServicePage accountTrackingUrlServicePage = (AccountTrackingUrlServicePage) o;
    return Objects.equals(this.totalNumEntries, accountTrackingUrlServicePage.totalNumEntries) &&
        Objects.equals(this.values, accountTrackingUrlServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrlServicePage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

