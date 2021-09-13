package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignSharedSet;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignSharedSetServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignSharedSetServiceValue is object to hold execution result (1 entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignSharedSetServiceValueは、実行結果（1エンティティ）を保持するオブジェクトです。</div> <div lang=\"en\">CampaignSharedSetServiceValue is object to hold execution result (1 entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignSharedSetServiceValue   {
  @JsonProperty("campaignSharedSet")
  private CampaignSharedSet campaignSharedSet = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignSharedSetServiceValue campaignSharedSet(CampaignSharedSet campaignSharedSet) {
    this.campaignSharedSet = campaignSharedSet;
    return this;
  }

  /**
   * Get campaignSharedSet
   * @return campaignSharedSet
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignSharedSet getCampaignSharedSet() {
    return campaignSharedSet;
  }

  public void setCampaignSharedSet(CampaignSharedSet campaignSharedSet) {
    this.campaignSharedSet = campaignSharedSet;
  }

  public CampaignSharedSetServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignSharedSetServiceValue addErrorsItem(Error errorsItem) {
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

  public CampaignSharedSetServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results</div> ")


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
    CampaignSharedSetServiceValue campaignSharedSetServiceValue = (CampaignSharedSetServiceValue) o;
    return Objects.equals(this.campaignSharedSet, campaignSharedSetServiceValue.campaignSharedSet) &&
        Objects.equals(this.errors, campaignSharedSetServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignSharedSetServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignSharedSet, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSharedSetServiceValue {\n");
    
    sb.append("    campaignSharedSet: ").append(toIndentedString(campaignSharedSet)).append("\n");
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

