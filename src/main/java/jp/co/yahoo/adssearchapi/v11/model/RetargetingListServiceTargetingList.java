/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceClosingReason;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceDefaultTargetList;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceLogicalTargetList;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceReachStorageStatus;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceRetargetingAccountStatus;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceRuleBaseTargetList;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v11.model.RetargetingListServiceTargetListType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTargetingList is an object that holds retargeting information (target list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceTargetingList is an object that holds retargeting information (target list).</div> ")
@JsonPropertyOrder({
  RetargetingListServiceTargetingList.JSON_PROPERTY_ACCOUNT_ID,
  RetargetingListServiceTargetingList.JSON_PROPERTY_CLOSING_REASON,
  RetargetingListServiceTargetingList.JSON_PROPERTY_DEFAULT_TARGET_LIST,
  RetargetingListServiceTargetingList.JSON_PROPERTY_LOGICAL_TARGET_LIST,
  RetargetingListServiceTargetingList.JSON_PROPERTY_REACH,
  RetargetingListServiceTargetingList.JSON_PROPERTY_REACH_STORAGE_SPAN,
  RetargetingListServiceTargetingList.JSON_PROPERTY_REACH_STORAGE_STATUS,
  RetargetingListServiceTargetingList.JSON_PROPERTY_RETARGETING_ACCOUNT_STATUS,
  RetargetingListServiceTargetingList.JSON_PROPERTY_RULE_BASE_TARGET_LIST,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_DESCRIPTION,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_ID,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_NAME,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_OWNER,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_TRACK_ID,
  RetargetingListServiceTargetingList.JSON_PROPERTY_TARGET_LIST_TYPE
})
@JsonTypeName("RetargetingListServiceTargetingList")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RetargetingListServiceTargetingList {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CLOSING_REASON = "closingReason";
  private RetargetingListServiceClosingReason closingReason;

  public static final String JSON_PROPERTY_DEFAULT_TARGET_LIST = "defaultTargetList";
  private RetargetingListServiceDefaultTargetList defaultTargetList;

  public static final String JSON_PROPERTY_LOGICAL_TARGET_LIST = "logicalTargetList";
  private RetargetingListServiceLogicalTargetList logicalTargetList;

  public static final String JSON_PROPERTY_REACH = "reach";
  private Long reach;

  public static final String JSON_PROPERTY_REACH_STORAGE_SPAN = "reachStorageSpan";
  private Long reachStorageSpan;

  public static final String JSON_PROPERTY_REACH_STORAGE_STATUS = "reachStorageStatus";
  private RetargetingListServiceReachStorageStatus reachStorageStatus;

  public static final String JSON_PROPERTY_RETARGETING_ACCOUNT_STATUS = "retargetingAccountStatus";
  private RetargetingListServiceRetargetingAccountStatus retargetingAccountStatus;

  public static final String JSON_PROPERTY_RULE_BASE_TARGET_LIST = "ruleBaseTargetList";
  private RetargetingListServiceRuleBaseTargetList ruleBaseTargetList;

  public static final String JSON_PROPERTY_TARGET_LIST_DESCRIPTION = "targetListDescription";
  private String targetListDescription;

  public static final String JSON_PROPERTY_TARGET_LIST_ID = "targetListId";
  private Long targetListId;

  public static final String JSON_PROPERTY_TARGET_LIST_NAME = "targetListName";
  private String targetListName;

  public static final String JSON_PROPERTY_TARGET_LIST_OWNER = "targetListOwner";
  private RetargetingListServiceTargetListOwner targetListOwner;

  public static final String JSON_PROPERTY_TARGET_LIST_TRACK_ID = "targetListTrackId";
  private Long targetListTrackId;

  public static final String JSON_PROPERTY_TARGET_LIST_TYPE = "targetListType";
  private RetargetingListServiceTargetListType targetListType;

  public RetargetingListServiceTargetingList() { 
  }

  public RetargetingListServiceTargetingList accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; このフィールドは、いずれの場合でも必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt;This field is required in any cases.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br>This field is required in any cases.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public RetargetingListServiceTargetingList closingReason(RetargetingListServiceClosingReason closingReason) {
    
    this.closingReason = closingReason;
    return this;
  }

   /**
   * Get closingReason
   * @return closingReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOSING_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceClosingReason getClosingReason() {
    return closingReason;
  }


  @JsonProperty(JSON_PROPERTY_CLOSING_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClosingReason(RetargetingListServiceClosingReason closingReason) {
    this.closingReason = closingReason;
  }


  public RetargetingListServiceTargetingList defaultTargetList(RetargetingListServiceDefaultTargetList defaultTargetList) {
    
    this.defaultTargetList = defaultTargetList;
    return this;
  }

   /**
   * Get defaultTargetList
   * @return defaultTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceDefaultTargetList getDefaultTargetList() {
    return defaultTargetList;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultTargetList(RetargetingListServiceDefaultTargetList defaultTargetList) {
    this.defaultTargetList = defaultTargetList;
  }


  public RetargetingListServiceTargetingList logicalTargetList(RetargetingListServiceLogicalTargetList logicalTargetList) {
    
    this.logicalTargetList = logicalTargetList;
    return this;
  }

   /**
   * Get logicalTargetList
   * @return logicalTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGICAL_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceLogicalTargetList getLogicalTargetList() {
    return logicalTargetList;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalTargetList(RetargetingListServiceLogicalTargetList logicalTargetList) {
    this.logicalTargetList = logicalTargetList;
  }


  public RetargetingListServiceTargetingList reach(Long reach) {
    
    this.reach = reach;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;リストに蓄積されているユーザー数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of users stored to the list.&lt;/div&gt; 
   * @return reach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">リストに蓄積されているユーザー数です。</div> <div lang=\"en\">Number of users stored to the list.</div> ")
  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReach() {
    return reach;
  }


  @JsonProperty(JSON_PROPERTY_REACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReach(Long reach) {
    this.reach = reach;
  }


  public RetargetingListServiceTargetingList reachStorageSpan(Long reachStorageSpan) {
    
    this.reachStorageSpan = reachStorageSpan;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Cookieを保持する日数です。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;br&gt;LogicalTargetListの場合、SET時にこのフィールドは無視されます。&lt;br&gt; ※Default：180&lt;br&gt; ※1-540日まで設定可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Days to hold Cookie.&lt;br&gt; This field is optional in SET operation.&lt;br&gt; For LogicalTargetList, this field will be ignored in SET operation.&lt;br&gt; *Default: 180&lt;br&gt; *Can set from 1-540 days.&lt;/div&gt; 
   * @return reachStorageSpan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">Cookieを保持する日数です。<br> SET時、このフィールドは省略可能となります。<br>LogicalTargetListの場合、SET時にこのフィールドは無視されます。<br> ※Default：180<br> ※1-540日まで設定可能です。</div> <div lang=\"en\">Days to hold Cookie.<br> This field is optional in SET operation.<br> For LogicalTargetList, this field will be ignored in SET operation.<br> *Default: 180<br> *Can set from 1-540 days.</div> ")
  @JsonProperty(JSON_PROPERTY_REACH_STORAGE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getReachStorageSpan() {
    return reachStorageSpan;
  }


  @JsonProperty(JSON_PROPERTY_REACH_STORAGE_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachStorageSpan(Long reachStorageSpan) {
    this.reachStorageSpan = reachStorageSpan;
  }


  public RetargetingListServiceTargetingList reachStorageStatus(RetargetingListServiceReachStorageStatus reachStorageStatus) {
    
    this.reachStorageStatus = reachStorageStatus;
    return this;
  }

   /**
   * Get reachStorageStatus
   * @return reachStorageStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REACH_STORAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceReachStorageStatus getReachStorageStatus() {
    return reachStorageStatus;
  }


  @JsonProperty(JSON_PROPERTY_REACH_STORAGE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachStorageStatus(RetargetingListServiceReachStorageStatus reachStorageStatus) {
    this.reachStorageStatus = reachStorageStatus;
  }


  public RetargetingListServiceTargetingList retargetingAccountStatus(RetargetingListServiceRetargetingAccountStatus retargetingAccountStatus) {
    
    this.retargetingAccountStatus = retargetingAccountStatus;
    return this;
  }

   /**
   * Get retargetingAccountStatus
   * @return retargetingAccountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETARGETING_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceRetargetingAccountStatus getRetargetingAccountStatus() {
    return retargetingAccountStatus;
  }


  @JsonProperty(JSON_PROPERTY_RETARGETING_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetargetingAccountStatus(RetargetingListServiceRetargetingAccountStatus retargetingAccountStatus) {
    this.retargetingAccountStatus = retargetingAccountStatus;
  }


  public RetargetingListServiceTargetingList ruleBaseTargetList(RetargetingListServiceRuleBaseTargetList ruleBaseTargetList) {
    
    this.ruleBaseTargetList = ruleBaseTargetList;
    return this;
  }

   /**
   * Get ruleBaseTargetList
   * @return ruleBaseTargetList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_BASE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceRuleBaseTargetList getRuleBaseTargetList() {
    return ruleBaseTargetList;
  }


  @JsonProperty(JSON_PROPERTY_RULE_BASE_TARGET_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleBaseTargetList(RetargetingListServiceRuleBaseTargetList ruleBaseTargetList) {
    this.ruleBaseTargetList = ruleBaseTargetList;
  }


  public RetargetingListServiceTargetingList targetListDescription(String targetListDescription) {
    
    this.targetListDescription = targetListDescription;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストの説明です。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Description of Target List.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
   * @return targetListDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストの説明です。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Description of Target List.<br> This field is optional in any cases.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetListDescription() {
    return targetListDescription;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListDescription(String targetListDescription) {
    this.targetListDescription = targetListDescription;
  }


  public RetargetingListServiceTargetingList targetListId(Long targetListId) {
    
    this.targetListId = targetListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target List ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return targetListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Target List ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetListId() {
    return targetListId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }


  public RetargetingListServiceTargetingList targetListName(String targetListName) {
    
    this.targetListName = targetListName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリスト名です。&lt;br&gt; ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Target List name.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation.&lt;/div&gt; 
   * @return targetListName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名です。<br> ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。</div> <div lang=\"en\">Target List name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetListName() {
    return targetListName;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListName(String targetListName) {
    this.targetListName = targetListName;
  }


  public RetargetingListServiceTargetingList targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    
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


  public RetargetingListServiceTargetingList targetListTrackId(Long targetListTrackId) {
    
    this.targetListTrackId = targetListTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストのトラッキング用IDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Tracking ID of Target list.&lt;/div&gt; 
   * @return targetListTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストのトラッキング用IDです。</div> <div lang=\"en\">Tracking ID of Target list.</div> ")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTargetListTrackId() {
    return targetListTrackId;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListTrackId(Long targetListTrackId) {
    this.targetListTrackId = targetListTrackId;
  }


  public RetargetingListServiceTargetingList targetListType(RetargetingListServiceTargetListType targetListType) {
    
    this.targetListType = targetListType;
    return this;
  }

   /**
   * Get targetListType
   * @return targetListType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RetargetingListServiceTargetListType getTargetListType() {
    return targetListType;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_LIST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetListType(RetargetingListServiceTargetListType targetListType) {
    this.targetListType = targetListType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceTargetingList retargetingListServiceTargetingList = (RetargetingListServiceTargetingList) o;
    return Objects.equals(this.accountId, retargetingListServiceTargetingList.accountId) &&
        Objects.equals(this.closingReason, retargetingListServiceTargetingList.closingReason) &&
        Objects.equals(this.defaultTargetList, retargetingListServiceTargetingList.defaultTargetList) &&
        Objects.equals(this.logicalTargetList, retargetingListServiceTargetingList.logicalTargetList) &&
        Objects.equals(this.reach, retargetingListServiceTargetingList.reach) &&
        Objects.equals(this.reachStorageSpan, retargetingListServiceTargetingList.reachStorageSpan) &&
        Objects.equals(this.reachStorageStatus, retargetingListServiceTargetingList.reachStorageStatus) &&
        Objects.equals(this.retargetingAccountStatus, retargetingListServiceTargetingList.retargetingAccountStatus) &&
        Objects.equals(this.ruleBaseTargetList, retargetingListServiceTargetingList.ruleBaseTargetList) &&
        Objects.equals(this.targetListDescription, retargetingListServiceTargetingList.targetListDescription) &&
        Objects.equals(this.targetListId, retargetingListServiceTargetingList.targetListId) &&
        Objects.equals(this.targetListName, retargetingListServiceTargetingList.targetListName) &&
        Objects.equals(this.targetListOwner, retargetingListServiceTargetingList.targetListOwner) &&
        Objects.equals(this.targetListTrackId, retargetingListServiceTargetingList.targetListTrackId) &&
        Objects.equals(this.targetListType, retargetingListServiceTargetingList.targetListType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, closingReason, defaultTargetList, logicalTargetList, reach, reachStorageSpan, reachStorageStatus, retargetingAccountStatus, ruleBaseTargetList, targetListDescription, targetListId, targetListName, targetListOwner, targetListTrackId, targetListType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceTargetingList {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    closingReason: ").append(toIndentedString(closingReason)).append("\n");
    sb.append("    defaultTargetList: ").append(toIndentedString(defaultTargetList)).append("\n");
    sb.append("    logicalTargetList: ").append(toIndentedString(logicalTargetList)).append("\n");
    sb.append("    reach: ").append(toIndentedString(reach)).append("\n");
    sb.append("    reachStorageSpan: ").append(toIndentedString(reachStorageSpan)).append("\n");
    sb.append("    reachStorageStatus: ").append(toIndentedString(reachStorageStatus)).append("\n");
    sb.append("    retargetingAccountStatus: ").append(toIndentedString(retargetingAccountStatus)).append("\n");
    sb.append("    ruleBaseTargetList: ").append(toIndentedString(ruleBaseTargetList)).append("\n");
    sb.append("    targetListDescription: ").append(toIndentedString(targetListDescription)).append("\n");
    sb.append("    targetListId: ").append(toIndentedString(targetListId)).append("\n");
    sb.append("    targetListName: ").append(toIndentedString(targetListName)).append("\n");
    sb.append("    targetListOwner: ").append(toIndentedString(targetListOwner)).append("\n");
    sb.append("    targetListTrackId: ").append(toIndentedString(targetListTrackId)).append("\n");
    sb.append("    targetListType: ").append(toIndentedString(targetListType)).append("\n");
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

