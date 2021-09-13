package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.CampaignWebpage;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignWebpageServiceValueオブジェクトは、操作結果を含むPageFeedItemの除外設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignWebpageServiceValue object describes excluded settings including operation result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignWebpageServiceValueオブジェクトは、操作結果を含むPageFeedItemの除外設定を表します。</div> <div lang=\"en\">CampaignWebpageServiceValue object describes excluded settings including operation result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignWebpageServiceValue   {
  @JsonProperty("campaignWebpage")
  private CampaignWebpage campaignWebpage = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignWebpageServiceValue campaignWebpage(CampaignWebpage campaignWebpage) {
    this.campaignWebpage = campaignWebpage;
    return this;
  }

  /**
   * Get campaignWebpage
   * @return campaignWebpage
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignWebpage getCampaignWebpage() {
    return campaignWebpage;
  }

  public void setCampaignWebpage(CampaignWebpage campaignWebpage) {
    this.campaignWebpage = campaignWebpage;
  }

  public CampaignWebpageServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignWebpageServiceValue addErrorsItem(Error errorsItem) {
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

  public CampaignWebpageServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果</div> <div lang=\"en\">Operation result</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果</div> <div lang=\"en\">Operation result</div> ")


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
    CampaignWebpageServiceValue campaignWebpageServiceValue = (CampaignWebpageServiceValue) o;
    return Objects.equals(this.campaignWebpage, campaignWebpageServiceValue.campaignWebpage) &&
        Objects.equals(this.errors, campaignWebpageServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignWebpageServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignWebpage, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignWebpageServiceValue {\n");
    
    sb.append("    campaignWebpage: ").append(toIndentedString(campaignWebpage)).append("\n");
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

