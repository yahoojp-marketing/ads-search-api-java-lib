package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignLabel;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignLabelServiceValueオブジェクトは、操作結果を含むキャンペーンラベルの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignLabelServiceValue object describes campaign label information including its operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignLabelServiceValueオブジェクトは、操作結果を含むキャンペーンラベルの情報を表します。</div> <div lang=\"en\">CampaignLabelServiceValue object describes campaign label information including its operation results.</div> ")

public class CampaignLabelServiceValue   {
  @JsonProperty("campaignLabel")
  private JsonNullable<CampaignLabel> campaignLabel = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public CampaignLabelServiceValue campaignLabel(CampaignLabel campaignLabel) {
    this.campaignLabel = JsonNullable.of(campaignLabel);
    return this;
  }

  /**
   * Get campaignLabel
   * @return campaignLabel
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignLabel> getCampaignLabel() {
    return campaignLabel;
  }

  public void setCampaignLabel(JsonNullable<CampaignLabel> campaignLabel) {
    this.campaignLabel = campaignLabel;
  }

  public CampaignLabelServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public CampaignLabelServiceValue addErrorsItem(Error errorsItem) {
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

  public CampaignLabelServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


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
    CampaignLabelServiceValue campaignLabelServiceValue = (CampaignLabelServiceValue) o;
    return Objects.equals(this.campaignLabel, campaignLabelServiceValue.campaignLabel) &&
        Objects.equals(this.errors, campaignLabelServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignLabelServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignLabel, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignLabelServiceValue {\n");
    
    sb.append("    campaignLabel: ").append(toIndentedString(campaignLabel)).append("\n");
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

