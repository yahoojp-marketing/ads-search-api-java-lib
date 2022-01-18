package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AppLinkServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkServiceReturnValueオブジェクトは、操作結果を含むアプリリンク情報のコンテナを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container which has appLink information including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkServiceReturnValueオブジェクトは、操作結果を含むアプリリンク情報のコンテナを表します。</div> <div lang=\"en\">Container which has appLink information including operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AppLinkServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AppLinkServiceValue> values = null;

  public AppLinkServiceReturnValue values(List<AppLinkServiceValue> values) {
    this.values = values;
    return this;
  }

  public AppLinkServiceReturnValue addValuesItem(AppLinkServiceValue valuesItem) {
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

  public List<AppLinkServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AppLinkServiceValue> values) {
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
    AppLinkServiceReturnValue appLinkServiceReturnValue = (AppLinkServiceReturnValue) o;
    return Objects.equals(this.values, appLinkServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinkServiceReturnValue {\n");
    
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

