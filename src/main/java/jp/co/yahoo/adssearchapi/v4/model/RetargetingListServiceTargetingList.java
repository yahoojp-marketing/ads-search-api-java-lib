package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceClosingReason;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceDefaultTargetList;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceLogicalTargetList;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceReachStorageStatus;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceRetargetingAccountStatus;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceRuleBaseTargetList;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceTargetListOwner;
import jp.co.yahoo.adssearchapi.v4.model.RetargetingListServiceTargetListType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceTargetingList is an object that holds retargeting information (target list).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceTargetingListは、リターゲティング情報（ターゲットリスト）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceTargetingList is an object that holds retargeting information (target list).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceTargetingList   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("closingReason")
  private RetargetingListServiceClosingReason closingReason = null;

  @JsonProperty("defaultTargetList")
  private RetargetingListServiceDefaultTargetList defaultTargetList = null;

  @JsonProperty("logicalTargetList")
  private RetargetingListServiceLogicalTargetList logicalTargetList = null;

  @JsonProperty("reach")
  private Long reach = null;

  @JsonProperty("reachStorageSpan")
  private Long reachStorageSpan = null;

  @JsonProperty("reachStorageStatus")
  private RetargetingListServiceReachStorageStatus reachStorageStatus = null;

  @JsonProperty("retargetingAccountStatus")
  private RetargetingListServiceRetargetingAccountStatus retargetingAccountStatus = null;

  @JsonProperty("ruleBaseTargetList")
  private RetargetingListServiceRuleBaseTargetList ruleBaseTargetList = null;

  @JsonProperty("targetListDescription")
  private String targetListDescription = null;

  @JsonProperty("targetListId")
  private Long targetListId = null;

  @JsonProperty("targetListName")
  private String targetListName = null;

  @JsonProperty("targetListOwner")
  private RetargetingListServiceTargetListOwner targetListOwner = null;

  @JsonProperty("targetListTrackId")
  private Long targetListTrackId = null;

  @JsonProperty("targetListType")
  private RetargetingListServiceTargetListType targetListType = null;

  public RetargetingListServiceTargetingList accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br>This field is required in any cases.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須となります。</div> <div lang=\"en\">Account ID.<br>This field is required in any cases.</div> ")


  public Long getAccountId() {
    return accountId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceClosingReason getClosingReason() {
    return closingReason;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceDefaultTargetList getDefaultTargetList() {
    return defaultTargetList;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceLogicalTargetList getLogicalTargetList() {
    return logicalTargetList;
  }

  public void setLogicalTargetList(RetargetingListServiceLogicalTargetList logicalTargetList) {
    this.logicalTargetList = logicalTargetList;
  }

  public RetargetingListServiceTargetingList reach(Long reach) {
    this.reach = reach;
    return this;
  }

  /**
   * <div lang=\"ja\">リストに蓄積されているユーザー数です。</div> <div lang=\"en\">Number of users stored to the list.</div> 
   * @return reach
  */
  @ApiModelProperty(value = "<div lang=\"ja\">リストに蓄積されているユーザー数です。</div> <div lang=\"en\">Number of users stored to the list.</div> ")


  public Long getReach() {
    return reach;
  }

  public void setReach(Long reach) {
    this.reach = reach;
  }

  public RetargetingListServiceTargetingList reachStorageSpan(Long reachStorageSpan) {
    this.reachStorageSpan = reachStorageSpan;
    return this;
  }

  /**
   * <div lang=\"ja\">Cookieを保持する日数です。<br> SET時、このフィールドは省略可能となります。<br>LogicalTargetListの場合、SET時にこのフィールドは無視されます。<br> ※Default：180<br> ※1-540日まで設定可能です。</div> <div lang=\"en\">Days to hold Cookie.<br> This field is optional in SET operation.<br> For LogicalTargetList, this field will be ignored in SET operation.<br> *Default: 180<br> *Can set from 1-540 days.</div> 
   * @return reachStorageSpan
  */
  @ApiModelProperty(value = "<div lang=\"ja\">Cookieを保持する日数です。<br> SET時、このフィールドは省略可能となります。<br>LogicalTargetListの場合、SET時にこのフィールドは無視されます。<br> ※Default：180<br> ※1-540日まで設定可能です。</div> <div lang=\"en\">Days to hold Cookie.<br> This field is optional in SET operation.<br> For LogicalTargetList, this field will be ignored in SET operation.<br> *Default: 180<br> *Can set from 1-540 days.</div> ")


  public Long getReachStorageSpan() {
    return reachStorageSpan;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceReachStorageStatus getReachStorageStatus() {
    return reachStorageStatus;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceRetargetingAccountStatus getRetargetingAccountStatus() {
    return retargetingAccountStatus;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceRuleBaseTargetList getRuleBaseTargetList() {
    return ruleBaseTargetList;
  }

  public void setRuleBaseTargetList(RetargetingListServiceRuleBaseTargetList ruleBaseTargetList) {
    this.ruleBaseTargetList = ruleBaseTargetList;
  }

  public RetargetingListServiceTargetingList targetListDescription(String targetListDescription) {
    this.targetListDescription = targetListDescription;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストの説明です。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Description of Target List.<br> This field is optional in any cases.</div> 
   * @return targetListDescription
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストの説明です。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Description of Target List.<br> This field is optional in any cases.</div> ")


  public String getTargetListDescription() {
    return targetListDescription;
  }

  public void setTargetListDescription(String targetListDescription) {
    this.targetListDescription = targetListDescription;
  }

  public RetargetingListServiceTargetingList targetListId(Long targetListId) {
    this.targetListId = targetListId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Target List ID.<br> This field is required in SET operation.</div> 
   * @return targetListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストIDです。<br> SET時、このフィールドは必須となります。</div> <div lang=\"en\">Target List ID.<br> This field is required in SET operation.</div> ")


  public Long getTargetListId() {
    return targetListId;
  }

  public void setTargetListId(Long targetListId) {
    this.targetListId = targetListId;
  }

  public RetargetingListServiceTargetingList targetListName(String targetListName) {
    this.targetListName = targetListName;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリスト名です。<br> ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。</div> <div lang=\"en\">Target List name.<br> This field is required in ADD operation, and is optional in SET operation.</div> 
   * @return targetListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリスト名です。<br> ADD時にこのフィールドは必須となり、SET時にこのフィールドは省略可能となります。</div> <div lang=\"en\">Target List name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")


  public String getTargetListName() {
    return targetListName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetListOwner getTargetListOwner() {
    return targetListOwner;
  }

  public void setTargetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = targetListOwner;
  }

  public RetargetingListServiceTargetingList targetListTrackId(Long targetListTrackId) {
    this.targetListTrackId = targetListTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">ターゲットリストのトラッキング用IDです。</div> <div lang=\"en\">Tracking ID of Target list.</div> 
   * @return targetListTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ターゲットリストのトラッキング用IDです。</div> <div lang=\"en\">Tracking ID of Target list.</div> ")


  public Long getTargetListTrackId() {
    return targetListTrackId;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetListType getTargetListType() {
    return targetListType;
  }

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

