package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAssetServiceReplaceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceReplaceReturnValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceReplaceReturnValue is a container of configuration information between ad groups and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceReplaceReturnValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupAssetServiceReplaceReturnValue is a container of configuration information between ad groups and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceReplaceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupAssetServiceReplaceValue> values = null;

  public AdGroupAssetServiceReplaceReturnValue values(List<AdGroupAssetServiceReplaceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupAssetServiceReplaceReturnValue addValuesItem(AdGroupAssetServiceReplaceValue valuesItem) {
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

  public List<AdGroupAssetServiceReplaceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupAssetServiceReplaceValue> values) {
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
    AdGroupAssetServiceReplaceReturnValue adGroupAssetServiceReplaceReturnValue = (AdGroupAssetServiceReplaceReturnValue) o;
    return Objects.equals(this.values, adGroupAssetServiceReplaceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceReplaceReturnValue {\n");
    
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

