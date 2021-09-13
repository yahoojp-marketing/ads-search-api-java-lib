package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.ReportDefinition;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ReportDefinitionServiceOperationオブジェクトは、操作の対象となるレポートおよび操作の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target report and operation (add, update and remove report)&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ReportDefinitionServiceOperationオブジェクトは、操作の対象となるレポートおよび操作の内容を表します。</div> <div lang=\"en\">Target report and operation (add, update and remove report)</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ReportDefinitionServiceOperation   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("operand")
  @Valid
  private List<ReportDefinition> operand = new ArrayList<>();

  public ReportDefinitionServiceOperation accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ReportDefinitionServiceOperation operand(List<ReportDefinition> operand) {
    this.operand = operand;
    return this;
  }

  public ReportDefinitionServiceOperation addOperandItem(ReportDefinition operandItem) {
    if (this.operand == null) {
      this.operand = new ArrayList<>();
    }
    this.operand.add(operandItem);
    return this;
  }

  /**
   * Get operand
   * @return operand
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
@Size(min=1,max=30) 
  public List<ReportDefinition> getOperand() {
    return operand;
  }

  public void setOperand(List<ReportDefinition> operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportDefinitionServiceOperation reportDefinitionServiceOperation = (ReportDefinitionServiceOperation) o;
    return Objects.equals(this.accountId, reportDefinitionServiceOperation.accountId) &&
        Objects.equals(this.operand, reportDefinitionServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportDefinitionServiceOperation {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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
