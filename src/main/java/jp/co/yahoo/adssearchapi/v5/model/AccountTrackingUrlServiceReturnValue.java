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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountTrackingUrlServiceReturnValueオブジェクトは、アカウントトラッキング情報を含む結果として戻される値を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountTrackingUrlServiceReturnValue obaject describes account tracking details.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountTrackingUrlServiceReturnValueオブジェクトは、アカウントトラッキング情報を含む結果として戻される値を表します。</div> <div lang=\"en\">AccountTrackingUrlServiceReturnValue obaject describes account tracking details.</div> ")

public class AccountTrackingUrlServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AccountTrackingUrlServiceValue>> values = JsonNullable.undefined();

  public AccountTrackingUrlServiceReturnValue values(List<AccountTrackingUrlServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AccountTrackingUrlServiceReturnValue addValuesItem(AccountTrackingUrlServiceValue valuesItem) {
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
    AccountTrackingUrlServiceReturnValue accountTrackingUrlServiceReturnValue = (AccountTrackingUrlServiceReturnValue) o;
    return Objects.equals(this.values, accountTrackingUrlServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTrackingUrlServiceReturnValue {\n");
    
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

