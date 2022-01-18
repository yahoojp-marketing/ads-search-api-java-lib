package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupAsset;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceReplaceValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceReplaceValue is a container of configuration information between ad groups and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceReplaceValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupAssetServiceReplaceValue is a container of configuration information between ad groups and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceReplaceValue   {
  @JsonProperty("adGroupAssets")
  @Valid
  private List<AdGroupAsset> adGroupAssets = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupAssetServiceReplaceValue adGroupAssets(List<AdGroupAsset> adGroupAssets) {
    this.adGroupAssets = adGroupAssets;
    return this;
  }

  public AdGroupAssetServiceReplaceValue addAdGroupAssetsItem(AdGroupAsset adGroupAssetsItem) {
    if (this.adGroupAssets == null) {
      this.adGroupAssets = new ArrayList<>();
    }
    this.adGroupAssets.add(adGroupAssetsItem);
    return this;
  }

  /**
   * Get adGroupAssets
   * @return adGroupAssets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAsset> getAdGroupAssets() {
    return adGroupAssets;
  }

  public void setAdGroupAssets(List<AdGroupAsset> adGroupAssets) {
    this.adGroupAssets = adGroupAssets;
  }

  public AdGroupAssetServiceReplaceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupAssetServiceReplaceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public AdGroupAssetServiceReplaceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAssetServiceReplaceValue adGroupAssetServiceReplaceValue = (AdGroupAssetServiceReplaceValue) o;
    return Objects.equals(this.adGroupAssets, adGroupAssetServiceReplaceValue.adGroupAssets) &&
        Objects.equals(this.errors, adGroupAssetServiceReplaceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupAssetServiceReplaceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupAssets, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceReplaceValue {\n");
    
    sb.append("    adGroupAssets: ").append(toIndentedString(adGroupAssets)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

