package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceInvoice object describes the invoice information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">AccountManagementServiceInvoice object describes the invoice information.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountManagementServiceInvoice   {
  @JsonProperty("budgetAmount")
  private Long budgetAmount = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public AccountManagementServiceInvoice budgetAmount(Long budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

  /**
   * <div lang=\"ja\">金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">Budget Amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return budgetAmount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">Budget Amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public Long getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Long budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public AccountManagementServiceInvoice endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">終了日です。※YYYYMMDD形式です。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値は20371231となり、『設定なし』と同義となります。<br> 20371231を指定した場合も『設定なし』となります。<br>SET時に『設定なし』に設定する場合は、20371231を指定してください。</div> <div lang=\"en\">End Date (YYYYMMDD).<br> This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231. 20371231 will be considered as \"No setting\".<br> In order to reset the endDate in SET operation, specify 20371231.</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">終了日です。※YYYYMMDD形式です。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値は20371231となり、『設定なし』と同義となります。<br> 20371231を指定した場合も『設定なし』となります。<br>SET時に『設定なし』に設定する場合は、20371231を指定してください。</div> <div lang=\"en\">End Date (YYYYMMDD).<br> This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231. 20371231 will be considered as \"No setting\".<br> In order to reset the endDate in SET operation, specify 20371231.</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AccountManagementServiceInvoice startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">開始日です。※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。※自動でADD時の日付が登録されます。</div> <div lang=\"en\">Start Date (YYYYMMDD).<br> Although this field will be returned in the response, it will be ignored on input. * This field will be automatically registered in ADD operation.</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">開始日です。※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。※自動でADD時の日付が登録されます。</div> <div lang=\"en\">Start Date (YYYYMMDD).<br> Although this field will be returned in the response, it will be ignored on input. * This field will be automatically registered in ADD operation.</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementServiceInvoice accountManagementServiceInvoice = (AccountManagementServiceInvoice) o;
    return Objects.equals(this.budgetAmount, accountManagementServiceInvoice.budgetAmount) &&
        Objects.equals(this.endDate, accountManagementServiceInvoice.endDate) &&
        Objects.equals(this.startDate, accountManagementServiceInvoice.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetAmount, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceInvoice {\n");
    
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

