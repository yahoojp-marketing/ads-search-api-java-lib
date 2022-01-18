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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAssetServiceValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAssetServiceValue is a container of configuration information between ad groups and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAssetServiceValueオブジェクトは、広告グループとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupAssetServiceValue is a container of configuration information between ad groups and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAssetServiceValue   {
  @JsonProperty("adGroupAsset")
  private AdGroupAsset adGroupAsset = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupAssetServiceValue adGroupAsset(AdGroupAsset adGroupAsset) {
    this.adGroupAsset = adGroupAsset;
    return this;
  }

  /**
   * Get adGroupAsset
   * @return adGroupAsset
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAsset getAdGroupAsset() {
    return adGroupAsset;
  }

  public void setAdGroupAsset(AdGroupAsset adGroupAsset) {
    this.adGroupAsset = adGroupAsset;
  }

  public AdGroupAssetServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupAssetServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupAssetServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    AdGroupAssetServiceValue adGroupAssetServiceValue = (AdGroupAssetServiceValue) o;
    return Objects.equals(this.adGroupAsset, adGroupAssetServiceValue.adGroupAsset) &&
        Objects.equals(this.errors, adGroupAssetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupAssetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupAsset, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAssetServiceValue {\n");
    
    sb.append("    adGroupAsset: ").append(toIndentedString(adGroupAsset)).append("\n");
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

