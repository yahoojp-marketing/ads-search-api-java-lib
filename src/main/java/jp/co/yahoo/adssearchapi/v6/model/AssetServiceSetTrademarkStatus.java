package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AssetServiceSetTrademarkStatusオブジェクトは、アセットの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AssetServiceSetTrademarkStatus object holds asset information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AssetServiceSetTrademarkStatusオブジェクトは、アセットの情報を格納します。</div> <div lang=\"en\">AssetServiceSetTrademarkStatus object holds asset information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AssetServiceSetTrademarkStatus   {
  @JsonProperty("assetId")
  private Long assetId = null;

  public AssetServiceSetTrademarkStatus assetId(Long assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * <div lang=\"ja\">アセットIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Asset ID.<br>This field is required.</div> 
   * @return assetId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アセットIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Asset ID.<br>This field is required.</div> ")


  public Long getAssetId() {
    return assetId;
  }

  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetServiceSetTrademarkStatus assetServiceSetTrademarkStatus = (AssetServiceSetTrademarkStatus) o;
    return Objects.equals(this.assetId, assetServiceSetTrademarkStatus.assetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetServiceSetTrademarkStatus {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
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

