package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AccountSharedServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedServiceReturnValueオブジェクトは、検索結果（全エンティティのリスト）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountSharedServiceReturnValue object holds search results (all entities list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedServiceReturnValueオブジェクトは、検索結果（全エンティティのリスト）を保持します。</div> <div lang=\"en\">AccountSharedServiceReturnValue object holds search results (all entities list).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountSharedServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AccountSharedServiceValue> values = null;

  public AccountSharedServiceReturnValue values(List<AccountSharedServiceValue> values) {
    this.values = values;
    return this;
  }

  public AccountSharedServiceReturnValue addValuesItem(AccountSharedServiceValue valuesItem) {
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

  public List<AccountSharedServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AccountSharedServiceValue> values) {
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
    AccountSharedServiceReturnValue accountSharedServiceReturnValue = (AccountSharedServiceReturnValue) o;
    return Objects.equals(this.values, accountSharedServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountSharedServiceReturnValue {\n");
    
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

