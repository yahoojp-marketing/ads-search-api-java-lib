package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AccountServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServiceReturnValueオブジェクトは、操作結果を含むアカウント情報のコンテナを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container which has account information including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountServiceReturnValueオブジェクトは、操作結果を含むアカウント情報のコンテナを表します。</div> <div lang=\"en\">Container which has account information including operation results.</div> ")

public class AccountServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AccountServiceValue>> values = JsonNullable.undefined();

  public AccountServiceReturnValue values(List<AccountServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AccountServiceReturnValue addValuesItem(AccountServiceValue valuesItem) {
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

  public JsonNullable<List<AccountServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AccountServiceValue>> values) {
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
    AccountServiceReturnValue accountServiceReturnValue = (AccountServiceReturnValue) o;
    return Objects.equals(this.values, accountServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountServiceReturnValue {\n");
    
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

