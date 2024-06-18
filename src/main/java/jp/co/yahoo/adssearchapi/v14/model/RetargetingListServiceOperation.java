/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

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
import jp.co.yahoo.adssearchapi.v14.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v14.model.RetargetingListServiceTargetingList;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceOperationは、操作対象のターゲットリストを保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceOperation is an object that holds target retargeting.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceOperationは、操作対象のターゲットリストを保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceOperation is an object that holds target retargeting.</div> ")
@JsonPropertyOrder({
  RetargetingListServiceOperation.JSON_PROPERTY_ACCOUNT_ID,
  RetargetingListServiceOperation.JSON_PROPERTY_OPERAND,
  RetargetingListServiceOperation.JSON_PROPERTY_TARGET_LIST_OWNER
})
@JsonTypeName("RetargetingListServiceOperation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceOperation {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_OPERAND = "operand";
  private List<RetargetingListServiceTargetingList> operand = new ArrayList<>();

  public static final String JSON_PROPERTY_TARGET_LIST_OWNER = "targetListOwner";
  private RetargetingListServiceTargetListOwner targetListOwner;

  public RetargetingListServiceOperation() { 
  }

  public RetargetingListServiceOperation accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
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


  public RetargetingListServiceOperation operand(List<RetargetingListServiceTargetingList> operand) {
    
    this.operand = operand;
    return this;
  }

  public RetargetingListServiceOperation addOperandItem(RetargetingListServiceTargetingList operandItem) {
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

  public List<RetargetingListServiceTargetingList> getOperand() {
    return operand;
  }


  @JsonProperty(JSON_PROPERTY_OPERAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperand(List<RetargetingListServiceTargetingList> operand) {
    this.operand = operand;
  }


  public RetargetingListServiceOperation targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    
    this.targetListOwner = targetListOwner;
    return this;
  }

   /**
   * Get targetListOwner
   * @return targetListOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceTargetListOwner getTargetListOwner() {
    return targetListOwner;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = targetListOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceOperation retargetingListServiceOperation = (RetargetingListServiceOperation) o;
    return Objects.equals(this.accountId, retargetingListServiceOperation.accountId) &&
        Objects.equals(this.operand, retargetingListServiceOperation.operand) &&
        Objects.equals(this.targetListOwner, retargetingListServiceOperation.targetListOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, operand, targetListOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceOperation {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    targetListOwner: ").append(toIndentedString(targetListOwner)).append("\n");
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

