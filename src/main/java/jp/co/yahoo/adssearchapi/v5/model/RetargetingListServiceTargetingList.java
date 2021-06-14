package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceClosingReason;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceDefaultTargetList;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceLogicalTargetList;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceReachStorageStatus;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRetargetingAccountStatus;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRuleBaseTargetList;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceTargetListType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTargetingList is an object that holds retargeting information (target list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceTargetingList is an object that holds retargeting information (target list).</div> ")

public class RetargetingListServiceTargetingList   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("closingReason")
  private JsonNullable<RetargetingListServiceClosingReason> closingReason = JsonNullable.undefined();

  @JsonProperty("defaultTargetList")
  private JsonNullable<RetargetingListServiceDefaultTargetList> defaultTargetList = JsonNullable.undefined();

  @JsonProperty("logicalTargetList")
  private JsonNullable<RetargetingListServiceLogicalTargetList> logicalTargetList = JsonNullable.undefined();

  @JsonProperty("reach")
  private JsonNullable<Long> reach = JsonNullable.undefined();

  @JsonProperty("reachStorageSpan")
  private JsonNullable<Long> reachStorageSpan = JsonNullable.undefined();

  @JsonProperty("reachStorageStatus")
  private JsonNullable<RetargetingListServiceReachStorageStatus> reachStorageStatus = JsonNullable.undefined();

  @JsonProperty("retargetingAccountStatus")
  private JsonNullable<RetargetingListServiceRetargetingAccountStatus> retargetingAccountStatus = JsonNullable.undefined();

  @JsonProperty("ruleBaseTargetList")
  private JsonNullable<RetargetingListServiceRuleBaseTargetList> ruleBaseTargetList = JsonNullable.undefined();

  @JsonProperty("targetListDescription")
  private JsonNullable<String> targetListDescription = JsonNullable.undefined();

  @JsonProperty("targetListId")
  private JsonNullable<Long> targetListId = JsonNullable.undefined();

  @JsonProperty("targetListName")
  private JsonNullable<String> targetListName = JsonNullable.undefined();

  @JsonProperty("targetListOwner")
  private JsonNullable<RetargetingListServiceTargetListOwner> targetListOwner = JsonNullable.undefined();

  @JsonProperty("targetListTrackId")
  private JsonNullable<Long> targetListTrackId = JsonNullable.undefined();

  @JsonProperty("targetListType")
  private JsonNullable<RetargetingListServiceTargetListType> targetListType = JsonNullable.undefined();

  public RetargetingListServiceTargetingList accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br>This field is required in any cases.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br>This field is required in any cases.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public RetargetingListServiceTargetingList closingReason(RetargetingListServiceClosingReason closingReason) {
    this.closingReason = JsonNullable.of(closingReason);
    return this;
  }

  /**
   * Get closingReason
   * @return closingReason
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceClosingReason> getClosingReason() {
    return closingReason;
  }

  public void setClosingReason(JsonNullable<RetargetingListServiceClosingReason> closingReason) {
    this.closingReason = closingReason;
  }

  public RetargetingListServiceTargetingList defaultTargetList(RetargetingListServiceDefaultTargetList defaultTargetList) {
    this.defaultTargetList = JsonNullable.of(defaultTargetList);
    return this;
  }

  /**
   * Get defaultTargetList
   * @return defaultTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceDefaultTargetList> getDefaultTargetList() {
    return defaultTargetList;
  }

  public void setDefaultTargetList(JsonNullable<RetargetingListServiceDefaultTargetList> defaultTargetList) {
    this.defaultTargetList = defaultTargetList;
  }

  public RetargetingListServiceTargetingList logicalTargetList(RetargetingListServiceLogicalTargetList logicalTargetList) {
    this.logicalTargetList = JsonNullable.of(logicalTargetList);
    return this;
  }

  /**
   * Get logicalTargetList
   * @return logicalTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceLogicalTargetList> getLogicalTargetList() {
    return logicalTargetList;
  }

  public void setLogicalTargetList(JsonNullable<RetargetingListServiceLogicalTargetList> logicalTargetList) {
    this.logicalTargetList = logicalTargetList;
  }

  public RetargetingListServiceTargetingList reach(Long reach) {
    this.reach = JsonNullable.of(reach);
    return this;
  }

  /**
   * <div lang=\"ja\">リストに蓄積されているユーザー数です。</div> <div lang=\"en\">Number of users stored to the list.</div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リストに蓄積されているユーザー数です。</div> <div lang=\"en\">Number of users stored to the list.</div> ")


  public JsonNullable<Long> getReach() {
    return reach;
  }

  public void setReach(JsonNullable<Long> reach) {
    this.reach = reach;
  }

  public RetargetingListServiceTargetingList reachStorageSpan(Long reachStorageSpan) {
    this.reachStorageSpan = JsonNullable.of(reachStorageSpan);
    return this;
  }

  /**
   * <div lang=\"ja\">Cookieを保持する日数です。<br> SET時、このフィールドは省略可能となります。<br>LogicalTargetListの場合、SET時にこのフィールドは無視されます。<br> ※Default：180<br> ※1-540日まで設定可能です。</div> <div lang=\"en\">Days to hold Cookie.<br> This field is optional in SET operation.<br> For LogicalTargetList, this field will be ignored in SET operation.<br> *Default: 180<br> *Can set from 1-540 days.</div> 
   * @return reachStorageSpan
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Cookieを保持する日数です。<br> SET時、このフィールドは省略可能となります。<br>LogicalTargetListの場合、SET時にこのフィールドは無視されます。<br> ※Default：180<br> ※1-540日まで設定可能です。</div> <div lang=\"en\">Days to hold Cookie.<br> This field is optional in SET operation.<br> For LogicalTargetList, this field will be ignored in SET operation.<br> *Default: 180<br> *Can set from 1-540 days.</div> ")


  public JsonNullable<Long> getReachStorageSpan() {
    return reachStorageSpan;
  }

  public void setReachStorageSpan(JsonNullable<Long> reachStorageSpan) {
    this.reachStorageSpan = reachStorageSpan;
  }

  public RetargetingListServiceTargetingList reachStorageStatus(RetargetingListServiceReachStorageStatus reachStorageStatus) {
    this.reachStorageStatus = JsonNullable.of(reachStorageStatus);
    return this;
  }

  /**
   * Get reachStorageStatus
   * @return reachStorageStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceReachStorageStatus> getReachStorageStatus() {
    return reachStorageStatus;
  }

  public void setReachStorageStatus(JsonNullable<RetargetingListServiceReachStorageStatus> reachStorageStatus) {
    this.reachStorageStatus = reachStorageStatus;
  }

  public RetargetingListServiceTargetingList retargetingAccountStatus(RetargetingListServiceRetargetingAccountStatus retargetingAccountStatus) {
    this.retargetingAccountStatus = JsonNullable.of(retargetingAccountStatus);
    return this;
  }

  /**
   * Get retargetingAccountStatus
   * @return retargetingAccountStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRetargetingAccountStatus> getRetargetingAccountStatus() {
    return retargetingAccountStatus;
  }

  public void setRetargetingAccountStatus(JsonNullable<RetargetingListServiceRetargetingAccountStatus> retargetingAccountStatus) {
    this.retargetingAccountStatus = retargetingAccountStatus;
  }

  public RetargetingListServiceTargetingList ruleBaseTargetList(RetargetingListServiceRuleBaseTargetList ruleBaseTargetList) {
    this.ruleBaseTargetList = JsonNullable.of(ruleBaseTargetList);
    return this;
  }

  /**
   * Get ruleBaseTargetList
   * @return ruleBaseTargetList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceRuleBaseTargetList> getRuleBaseTargetList() {
    return ruleBaseTargetList;
  }

  public void setRuleBaseTargetList(JsonNullable<RetargetingListServiceRuleBaseTargetList> ruleBaseTargetList) {
    this.ruleBaseTargetList = ruleBaseTargetList;
  }

  public RetargetingListServiceTargetingList targetListDescription(String targetListDescription) {
    this.targetListDescription = JsonNullable.of(targetListDescription);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストの説明です。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Description of Target List.<br> This field is optional in any cases.</div> 
   * @return targetListDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストの説明です。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Description of Target List.<br> This field is optional in any cases.</div> ")


  public JsonNullable<String> getTargetListDescription() {
    return targetListDescription;
  }

  public void setTargetListDescription(JsonNullable<String> targetListDescription) {
    this.targetListDescription = targetListDescription;
  }

  public RetargetingListServiceTargetingList targetListId(Long targetListId) {
    this.targetListId = JsonNullable.of(targetListId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Target List ID.<br> This field is required in SET operation.</div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Target List ID.<br> This field is required in SET operation.</div> ")


  public JsonNullable<Long> getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(JsonNullable<Long> targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceTargetingList targetListName(String targetListName) {
    this.targetListName = JsonNullable.of(targetListName);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリスト名です。<br> ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。</div> <div lang=\"en\">Target List name.<br> This field is required in ADD operation, and is optional in SET operation.</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名です。<br> ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。</div> <div lang=\"en\">Target List name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")


  public JsonNullable<String> getTargetListName() {
    return targetListName;
  }

  public void setTargetListName(JsonNullable<String> targetListName) {
    this.targetListName = targetListName;
  }

  public RetargetingListServiceTargetingList targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = JsonNullable.of(targetListOwner);
    return this;
  }

  /**
   * Get targetListOwner
   * @return targetListOwner
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceTargetListOwner> getTargetListOwner() {
    return targetListOwner;
  }

  public void setTargetListOwner(JsonNullable<RetargetingListServiceTargetListOwner> targetListOwner) {
    this.targetListOwner = targetListOwner;
  }

  public RetargetingListServiceTargetingList targetListTrackId(Long targetListTrackId) {
    this.targetListTrackId = JsonNullable.of(targetListTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストのトラッキング用IDです。</div> <div lang=\"en\">Tracking ID of Target list.</div> 
   * @return targetListTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストのトラッキング用IDです。</div> <div lang=\"en\">Tracking ID of Target list.</div> ")


  public JsonNullable<Long> getTargetListTrackId() {
    return targetListTrackId;
  }

  public void setTargetListTrackId(JsonNullable<Long> targetListTrackId) {
    this.targetListTrackId = targetListTrackId;
  }

  public RetargetingListServiceTargetingList targetListType(RetargetingListServiceTargetListType targetListType) {
    this.targetListType = JsonNullable.of(targetListType);
    return this;
  }

  /**
   * Get targetListType
   * @return targetListType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceTargetListType> getTargetListType() {
    return targetListType;
  }

  public void setTargetListType(JsonNullable<RetargetingListServiceTargetListType> targetListType) {
    this.targetListType = targetListType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

