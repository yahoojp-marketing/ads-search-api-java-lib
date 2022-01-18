package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.CampaignAsset;
import jp.co.yahoo.adssearchapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignAssetServiceReplaceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignAssetServiceReplaceValue is a container of configuration information between campaign and assets.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignAssetServiceReplaceValueオブジェクトは、キャンペーンとアセット間の設定情報を格納するコンテナです。</div> <div lang=\"en\">CampaignAssetServiceReplaceValue is a container of configuration information between campaign and assets.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignAssetServiceReplaceValue   {
  @JsonProperty("campaignAssets")
  @Valid
  private List<CampaignAsset> campaignAssets = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignAssetServiceReplaceValue campaignAssets(List<CampaignAsset> campaignAssets) {
    this.campaignAssets = campaignAssets;
    return this;
  }

  public CampaignAssetServiceReplaceValue addCampaignAssetsItem(CampaignAsset campaignAssetsItem) {
    if (this.campaignAssets == null) {
      this.campaignAssets = new ArrayList<>();
    }
    this.campaignAssets.add(campaignAssetsItem);
    return this;
  }

  /**
   * Get campaignAssets
   * @return campaignAssets
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<CampaignAsset> getCampaignAssets() {
    return campaignAssets;
  }

  public void setCampaignAssets(List<CampaignAsset> campaignAssets) {
    this.campaignAssets = campaignAssets;
  }

  public CampaignAssetServiceReplaceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignAssetServiceReplaceValue addErrorsItem(Error errorsItem) {
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

  public CampaignAssetServiceReplaceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


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
    CampaignAssetServiceReplaceValue campaignAssetServiceReplaceValue = (CampaignAssetServiceReplaceValue) o;
    return Objects.equals(this.campaignAssets, campaignAssetServiceReplaceValue.campaignAssets) &&
        Objects.equals(this.errors, campaignAssetServiceReplaceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignAssetServiceReplaceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignAssets, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAssetServiceReplaceValue {\n");
    
    sb.append("    campaignAssets: ").append(toIndentedString(campaignAssets)).append("\n");
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

