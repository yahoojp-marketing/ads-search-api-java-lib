/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v13/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v13
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v13.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceInvoice object describes the invoice information.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementServiceInvoiceオブジェクトは、後金支払情報を表します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">AccountManagementServiceInvoice object describes the invoice information.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
@JsonPropertyOrder({
  AccountManagementServiceInvoice.JSON_PROPERTY_BUDGET_AMOUNT,
  AccountManagementServiceInvoice.JSON_PROPERTY_END_DATE,
  AccountManagementServiceInvoice.JSON_PROPERTY_START_DATE
})
@JsonTypeName("AccountManagementServiceInvoice")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountManagementServiceInvoice {
  public static final String JSON_PROPERTY_BUDGET_AMOUNT = "budgetAmount";
  private Long budgetAmount;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public AccountManagementServiceInvoice() { 
  }

  public AccountManagementServiceInvoice budgetAmount(Long budgetAmount) {
    
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;金額です。&lt;br&gt; ※1,000単位、3,000以上999,999,999,999,000以内です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Budget amount.&lt;br&gt; * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
   * @return budgetAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">金額です。<br> ※1,000単位、3,000以上999,999,999,999,000以内です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">Budget amount.<br> * Amount must be more than 3,000 and less than 999,999,999,999,000. The unit is 1,000.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBudgetAmount() {
    return budgetAmount;
  }


  @JsonProperty(JSON_PROPERTY_BUDGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBudgetAmount(Long budgetAmount) {
    this.budgetAmount = budgetAmount;
  }


  public AccountManagementServiceInvoice endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;終了日です。※YYYYMMDD形式です。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値は20371231となり、『設定なし』と同義となります。&lt;br&gt; 20371231を指定した場合も『設定なし』となります。&lt;br&gt;SET時に『設定なし』に設定する場合は、20371231を指定してください。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date (YYYYMMDD).&lt;br&gt; This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231. 20371231 will be considered as \&quot;No setting.\&quot;&lt;br&gt; In order to reset the endDate in SET operation, specify 20371231.&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">終了日です。※YYYYMMDD形式です。<br> ADDおよびSET時、このフィールドは省略可能となります。その際、ADD時のデフォルト設定値は20371231となり、『設定なし』と同義となります。<br> 20371231を指定した場合も『設定なし』となります。<br>SET時に『設定なし』に設定する場合は、20371231を指定してください。</div> <div lang=\"en\">End date (YYYYMMDD).<br> This field is optional in ADD and SET operation. The default value in ADD operation will be 20371231. 20371231 will be considered as \"No setting.\"<br> In order to reset the endDate in SET operation, specify 20371231.</div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AccountManagementServiceInvoice startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始日です。※YYYYMMDD形式です。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。※自動でADD時の日付が登録されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date (YYYYMMDD).&lt;br&gt; Although this field will be returned in the response, it will be ignored on input. * This field will be automatically registered in ADD operation.&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始日です。※YYYYMMDD形式です。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。※自動でADD時の日付が登録されます。</div> <div lang=\"en\">Start date (YYYYMMDD).<br> Although this field will be returned in the response, it will be ignored on input. * This field will be automatically registered in ADD operation.</div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

