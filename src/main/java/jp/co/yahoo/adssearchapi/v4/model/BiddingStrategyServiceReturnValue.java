package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceReturnValueオブジェクトは、自動入札設定を作成・更新・削除したときの結果に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceReturnValue object displays the results of auto bidding creation/update/removal setting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceReturnValueオブジェクトは、自動入札設定を作成・更新・削除したときの結果に関する情報を表します。</div> <div lang=\"en\">BiddingStrategyServiceReturnValue object displays the results of auto bidding creation/update/removal setting.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<BiddingStrategyServiceValue> values = null;

  public BiddingStrategyServiceReturnValue values(List<BiddingStrategyServiceValue> values) {
    this.values = values;
    return this;
  }

  public BiddingStrategyServiceReturnValue addValuesItem(BiddingStrategyServiceValue valuesItem) {
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

  public List<BiddingStrategyServiceValue> getValues() {
    return values;
  }

  public void setValues(List<BiddingStrategyServiceValue> values) {
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
    BiddingStrategyServiceReturnValue biddingStrategyServiceReturnValue = (BiddingStrategyServiceReturnValue) o;
    return Objects.equals(this.values, biddingStrategyServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceReturnValue {\n");
    
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

