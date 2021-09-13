package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignCriterion;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignCriterionServiceValueオブジェクトは、処理結果を含むキャンペーンのクライテリアを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Campaign criteria including operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignCriterionServiceValueオブジェクトは、処理結果を含むキャンペーンのクライテリアを表します。</div> <div lang=\"en\">Campaign criteria including operation results.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignCriterionServiceValue   {
  @JsonProperty("campaignCriterion")
  private CampaignCriterion campaignCriterion = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignCriterionServiceValue campaignCriterion(CampaignCriterion campaignCriterion) {
    this.campaignCriterion = campaignCriterion;
    return this;
  }

  /**
   * Get campaignCriterion
   * @return campaignCriterion
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignCriterion getCampaignCriterion() {
    return campaignCriterion;
  }

  public void setCampaignCriterion(CampaignCriterion campaignCriterion) {
    this.campaignCriterion = campaignCriterion;
  }

  public CampaignCriterionServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignCriterionServiceValue addErrorsItem(Error errorsItem) {
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

  public CampaignCriterionServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">The operation.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">The operation.</div> ")


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
    CampaignCriterionServiceValue campaignCriterionServiceValue = (CampaignCriterionServiceValue) o;
    return Objects.equals(this.campaignCriterion, campaignCriterionServiceValue.campaignCriterion) &&
        Objects.equals(this.errors, campaignCriterionServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignCriterionServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignCriterion, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCriterionServiceValue {\n");
    
    sb.append("    campaignCriterion: ").append(toIndentedString(campaignCriterion)).append("\n");
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

