package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupRetargetingListServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServiceReturnValueは、広告グループレベルでのターゲットリスト設定の実行結果（全Entityのリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServiceReturnValue is an object that holds results (list of all entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListServiceReturnValueは、広告グループレベルでのターゲットリスト設定の実行結果（全Entityのリスト）を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingListServiceReturnValue is an object that holds results (list of all entity).</div> ")

public class AdGroupRetargetingListServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AdGroupRetargetingListServiceValue>> values = JsonNullable.undefined();

  public AdGroupRetargetingListServiceReturnValue values(List<AdGroupRetargetingListServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AdGroupRetargetingListServiceReturnValue addValuesItem(AdGroupRetargetingListServiceValue valuesItem) {
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

  public JsonNullable<List<AdGroupRetargetingListServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AdGroupRetargetingListServiceValue>> values) {
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
    AdGroupRetargetingListServiceReturnValue adGroupRetargetingListServiceReturnValue = (AdGroupRetargetingListServiceReturnValue) o;
    return Objects.equals(this.values, adGroupRetargetingListServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServiceReturnValue {\n");
    
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

