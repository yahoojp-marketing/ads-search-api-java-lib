package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.CampaignAssetServiceReplaceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceReplaceReturnValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceReplaceReturnValue is a container of configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceReplaceReturnValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">CampaignAssetServiceReplaceReturnValue is a container of configuration information between campaign and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignAssetServiceReplaceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<CampaignAssetServiceReplaceValue> values = null;

  public CampaignAssetServiceReplaceReturnValue values(List<CampaignAssetServiceReplaceValue> values) {
    this.values = values;
    return this;
  }

  public CampaignAssetServiceReplaceReturnValue addValuesItem(CampaignAssetServiceReplaceValue valuesItem) {
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

  public List<CampaignAssetServiceReplaceValue> getValues() {
    return values;
  }

  public void setValues(List<CampaignAssetServiceReplaceValue> values) {
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
    CampaignAssetServiceReplaceReturnValue campaignAssetServiceReplaceReturnValue = (CampaignAssetServiceReplaceReturnValue) o;
    return Objects.equals(this.values, campaignAssetServiceReplaceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAssetServiceReplaceReturnValue {\n");
    
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

