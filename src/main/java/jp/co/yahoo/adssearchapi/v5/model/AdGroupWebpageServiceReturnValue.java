package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupWebpageServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceReturnValueオブジェクトは、操作結果を含む配信/除外設定のコンテナを保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceReturnValue object contains allowed or excluded settings including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceReturnValueオブジェクトは、操作結果を含む配信/除外設定のコンテナを保持します。</div> <div lang=\"en\">AdGroupWebpageServiceReturnValue object contains allowed or excluded settings including operation result.</div> ")

public class AdGroupWebpageServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<AdGroupWebpageServiceValue>> values = JsonNullable.undefined();

  public AdGroupWebpageServiceReturnValue values(List<AdGroupWebpageServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public AdGroupWebpageServiceReturnValue addValuesItem(AdGroupWebpageServiceValue valuesItem) {
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

  public JsonNullable<List<AdGroupWebpageServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<AdGroupWebpageServiceValue>> values) {
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
    AdGroupWebpageServiceReturnValue adGroupWebpageServiceReturnValue = (AdGroupWebpageServiceReturnValue) o;
    return Objects.equals(this.values, adGroupWebpageServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceReturnValue {\n");
    
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

