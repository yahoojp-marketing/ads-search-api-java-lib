/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v5/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionLabel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionLabelServiceOperationオブジェクトは、操作の対象となる広告グループのクライテリアラベル情報と処理の内容を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionLabelServiceOperation displays information of ad group criterion label to be operated and processing content.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionLabelServiceOperationオブジェクトは、操作の対象となる広告グループのクライテリアラベル情報と処理の内容を表します。</div> <div lang=\"en\">AdGroupCriterionLabelServiceOperation displays information of ad group criterion label to be operated and processing content.</div> ")
@JsonPropertyOrder({
  AdGroupCriterionLabelServiceOperation.JSON_PROPERTY_ACCOUNT_ID,
  AdGroupCriterionLabelServiceOperation.JSON_PROPERTY_OPERAND
})
@JsonTypeName("AdGroupCriterionLabelServiceOperation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdGroupCriterionLabelServiceOperation {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_OPERAND = "operand";
  private List<AdGroupCriterionLabel> operand = new ArrayList<>();

  public AdGroupCriterionLabelServiceOperation() { 
  }

  public AdGroupCriterionLabelServiceOperation accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントID</div> <div lang=\"en\">Account ID</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AdGroupCriterionLabelServiceOperation operand(List<AdGroupCriterionLabel> operand) {
    
    this.operand = operand;
    return this;
  }

  public AdGroupCriterionLabelServiceOperation addOperandItem(AdGroupCriterionLabel operandItem) {
    this.operand.add(operandItem);
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AdGroupCriterionLabel> getOperand() {
    return operand;
  }


  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperand(List<AdGroupCriterionLabel> operand) {
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
    AdGroupCriterionLabelServiceOperation adGroupCriterionLabelServiceOperation = (AdGroupCriterionLabelServiceOperation) o;
    return Objects.equals(this.accountId, adGroupCriterionLabelServiceOperation.accountId) &&
        Objects.equals(this.operand, adGroupCriterionLabelServiceOperation.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionLabelServiceOperation {\n");
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

