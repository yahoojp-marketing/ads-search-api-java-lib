package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.CampaignRetargetingList;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignRetargetingListServiceValueオブジェクトは、キャンペーン階層のターゲットリスト設定における実行結果（1Entity）を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignRetargetingListServiceValue object holds operation results (1 entity)  for Target List settings on the campaign level.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignRetargetingListServiceValueオブジェクトは、キャンペーン階層のターゲットリスト設定における実行結果（1Entity）を保持します。</div> <div lang=\"en\">CampaignRetargetingListServiceValue object holds operation results (1 entity)  for Target List settings on the campaign level.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignRetargetingListServiceValue   {
  @JsonProperty("campaignRetargetingList")
  private CampaignRetargetingList campaignRetargetingList = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignRetargetingListServiceValue campaignRetargetingList(CampaignRetargetingList campaignRetargetingList) {
    this.campaignRetargetingList = campaignRetargetingList;
    return this;
  }

  /**
   * Get campaignRetargetingList
   * @return campaignRetargetingList
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignRetargetingList getCampaignRetargetingList() {
    return campaignRetargetingList;
  }

  public void setCampaignRetargetingList(CampaignRetargetingList campaignRetargetingList) {
    this.campaignRetargetingList = campaignRetargetingList;
  }

  public CampaignRetargetingListServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignRetargetingListServiceValue addErrorsItem(Error errorsItem) {
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

  public CampaignRetargetingListServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    CampaignRetargetingListServiceValue campaignRetargetingListServiceValue = (CampaignRetargetingListServiceValue) o;
    return Objects.equals(this.campaignRetargetingList, campaignRetargetingListServiceValue.campaignRetargetingList) &&
        Objects.equals(this.errors, campaignRetargetingListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignRetargetingListServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignRetargetingList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRetargetingListServiceValue {\n");
    
    sb.append("    campaignRetargetingList: ").append(toIndentedString(campaignRetargetingList)).append("\n");
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

