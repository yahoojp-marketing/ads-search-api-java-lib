package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignTarget;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignTargetServiceValueオブジェクトは、処理結果を含むキャンペーンのターゲティング設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign target settings including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignTargetServiceValueオブジェクトは、処理結果を含むキャンペーンのターゲティング設定を表します。</div> <div lang=\"en\">Campaign target settings including operation results.</div> ")

public class CampaignTargetServiceValue   {
  @JsonProperty("campaignTarget")
  private JsonNullable<CampaignTarget> campaignTarget = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public CampaignTargetServiceValue campaignTarget(CampaignTarget campaignTarget) {
    this.campaignTarget = JsonNullable.of(campaignTarget);
    return this;
  }

  /**
   * Get campaignTarget
   * @return campaignTarget
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignTarget> getCampaignTarget() {
    return campaignTarget;
  }

  public void setCampaignTarget(JsonNullable<CampaignTarget> campaignTarget) {
    this.campaignTarget = campaignTarget;
  }

  public CampaignTargetServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public CampaignTargetServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public CampaignTargetServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">The operation.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">The operation.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignTargetServiceValue campaignTargetServiceValue = (CampaignTargetServiceValue) o;
    return Objects.equals(this.campaignTarget, campaignTargetServiceValue.campaignTarget) &&
        Objects.equals(this.errors, campaignTargetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignTargetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignTarget, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignTargetServiceValue {\n");
    
    sb.append("    campaignTarget: ").append(toIndentedString(campaignTarget)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

