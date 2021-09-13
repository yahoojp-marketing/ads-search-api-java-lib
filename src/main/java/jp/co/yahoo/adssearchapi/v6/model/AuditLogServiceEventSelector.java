package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AuditLogServiceEventTypes;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceEventSelectorオブジェクトは、操作履歴の取得対象を設定します。&lt;br&gt; このフィールドは、必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceEventSelector object enables the target setting of acquiring operation history.&lt;br&gt; This field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceEventSelectorオブジェクトは、操作履歴の取得対象を設定します。<br> このフィールドは、必須です。</div> <div lang=\"en\">AuditLogServiceEventSelector object enables the target setting of acquiring operation history.<br> This field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AuditLogServiceEventSelector   {
  @JsonProperty("entityType")
  private String entityType = null;

  @JsonProperty("eventTypes")
  @Valid
  private List<AuditLogServiceEventTypes> eventTypes = null;

  public AuditLogServiceEventSelector entityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * <div lang=\"ja\">AuditLogServiceEntityTypeオブジェクトは、操作履歴に出力するエンティティの種類を表します。</div> <div lang=\"en\">AuditLogServiceEntityType object describes the type of entities to be output on the data of operation history.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンです。</span><span lang=\"en\">Campaign.</span></dd>   <dt class=\"term__item\">NEGATIVE_CAMPAIGN_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードです（キャンペーン）。</span><span lang=\"en\">Negative keywords (for campaign)</span></dd>   <dt class=\"term__item\">CAMPAIGN_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンのターゲティング設定です。</span><span lang=\"en\">Targeting setting on campaign.</span></dd>   <dt class=\"term__item\">AD_GROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループです。</span><span lang=\"en\">Ad group.</span></dd>   <dt class=\"term__item\">AD_GROUP_BID_MULTIPLIER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループ入札価格調整率です。</span><span lang=\"en\">Bid adjustment for ad group.</span></dd>   <dt class=\"term__item\">BIDDABLE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札キーワードです。</span><span lang=\"en\">Bidding keyword.</span></dd>   <dt class=\"term__item\">NEGATIVE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードです（広告グループ）。</span><span lang=\"en\">Negative keywords (for ad group)</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告です。</span><span lang=\"en\">Ad.</span></dd>   <dt class=\"term__item\">FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Feedフォルダーです。</span><span lang=\"en\">Feed folder.</span></dd>   <dt class=\"term__item\">FEED_ITEM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです。</span><span lang=\"en\">Ad display options.</span></dd>   <dt class=\"term__item\">CAMPAIGN_FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです（キャンペーン）。</span><span lang=\"en\">Ad display options for campaign.</span></dd>   <dt class=\"term__item\">AD_GROUP_FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです（広告グループ）。</span><span lang=\"en\">Ad display options for ad group.</span></dd>   <dt class=\"term__item\">SS_IO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アカウントです。</span><span lang=\"en\">Account.</span></dd>   <dt class=\"term__item\">SS_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョントラッカー（コンバージョン測定）です。</span><span lang=\"en\">Conversion tracker for conversion tracking.</span></dd>   <dt class=\"term__item\">BIDDING_STRATEGY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札設定です。</span><span lang=\"en\">Auto bidding setting.</span></dd>   <dt class=\"term__item\">NEGATIVE_CAMPAIGN_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外ターゲットリストです（キャンペーン）。</span><span lang=\"en\">Exclude target list for campaign.</span></dd>   <dt class=\"term__item\">NEGATIVE_AD_GROUP_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外ターゲットリストです（広告グループ）。</span><span lang=\"en\">Exclude target list for ad group.</span></dd>   <dt class=\"term__item\">AD_GROUP_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストです（広告グループ）。</span><span lang=\"en\">Target list for ad group.</span></dd>   <dt class=\"term__item\">TARGET_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲテイングのターゲットリストです。</span><span lang=\"en\">Target list of Site Retargeting.</span></dd>   <dt class=\"term__item\">SHARED_SET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有リストです。</span><span lang=\"en\">Shared list.</span></dd>   <dt class=\"term__item\">SHARED_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有キーワードです。</span><span lang=\"en\">Shared keywords.</span></dd>   <dt class=\"term__item\">CAMPAIGN_SHARED_SET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン共有リストです。</span><span lang=\"en\">Shared list for campaign.</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アドカスタマイザーです。</span><span lang=\"en\">Ad customizer.</span></dd>   <dt class=\"term__item\">EXCLUDE_AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アドカスタマイザーを除くすべての履歴です。</span><span lang=\"en\">All operation history excepting ad customizer.</span></dd>   <dt class=\"term__item\">ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">CAMPAIGN_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">AD_GROUP_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての履歴です。</span><span lang=\"en\">All operation history.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
   * @return entityType
  */
  @ApiModelProperty(value = "<div lang=\"ja\">AuditLogServiceEntityTypeオブジェクトは、操作履歴に出力するエンティティの種類を表します。</div> <div lang=\"en\">AuditLogServiceEntityType object describes the type of entities to be output on the data of operation history.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンです。</span><span lang=\"en\">Campaign.</span></dd>   <dt class=\"term__item\">NEGATIVE_CAMPAIGN_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードです（キャンペーン）。</span><span lang=\"en\">Negative keywords (for campaign)</span></dd>   <dt class=\"term__item\">CAMPAIGN_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーンのターゲティング設定です。</span><span lang=\"en\">Targeting setting on campaign.</span></dd>   <dt class=\"term__item\">AD_GROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループです。</span><span lang=\"en\">Ad group.</span></dd>   <dt class=\"term__item\">AD_GROUP_BID_MULTIPLIER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループ入札価格調整率です。</span><span lang=\"en\">Bid adjustment for ad group.</span></dd>   <dt class=\"term__item\">BIDDABLE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札キーワードです。</span><span lang=\"en\">Bidding keyword.</span></dd>   <dt class=\"term__item\">NEGATIVE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワードです（広告グループ）。</span><span lang=\"en\">Negative keywords (for ad group)</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告です。</span><span lang=\"en\">Ad.</span></dd>   <dt class=\"term__item\">FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Feedフォルダーです。</span><span lang=\"en\">Feed folder.</span></dd>   <dt class=\"term__item\">FEED_ITEM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです。</span><span lang=\"en\">Ad display options.</span></dd>   <dt class=\"term__item\">CAMPAIGN_FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです（キャンペーン）。</span><span lang=\"en\">Ad display options for campaign.</span></dd>   <dt class=\"term__item\">AD_GROUP_FEED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションです（広告グループ）。</span><span lang=\"en\">Ad display options for ad group.</span></dd>   <dt class=\"term__item\">SS_IO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アカウントです。</span><span lang=\"en\">Account.</span></dd>   <dt class=\"term__item\">SS_CONVERSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">コンバージョントラッカー（コンバージョン測定）です。</span><span lang=\"en\">Conversion tracker for conversion tracking.</span></dd>   <dt class=\"term__item\">BIDDING_STRATEGY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">自動入札設定です。</span><span lang=\"en\">Auto bidding setting.</span></dd>   <dt class=\"term__item\">NEGATIVE_CAMPAIGN_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外ターゲットリストです（キャンペーン）。</span><span lang=\"en\">Exclude target list for campaign.</span></dd>   <dt class=\"term__item\">NEGATIVE_AD_GROUP_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外ターゲットリストです（広告グループ）。</span><span lang=\"en\">Exclude target list for ad group.</span></dd>   <dt class=\"term__item\">AD_GROUP_USER_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ターゲットリストです（広告グループ）。</span><span lang=\"en\">Target list for ad group.</span></dd>   <dt class=\"term__item\">TARGET_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイトリターゲテイングのターゲットリストです。</span><span lang=\"en\">Target list of Site Retargeting.</span></dd>   <dt class=\"term__item\">SHARED_SET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有リストです。</span><span lang=\"en\">Shared list.</span></dd>   <dt class=\"term__item\">SHARED_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">共有キーワードです。</span><span lang=\"en\">Shared keywords.</span></dd>   <dt class=\"term__item\">CAMPAIGN_SHARED_SET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン共有リストです。</span><span lang=\"en\">Shared list for campaign.</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アドカスタマイザーです。</span><span lang=\"en\">Ad customizer.</span></dd>   <dt class=\"term__item\">EXCLUDE_AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アドカスタマイザーを除くすべての履歴です。</span><span lang=\"en\">All operation history excepting ad customizer.</span></dd>   <dt class=\"term__item\">ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">CAMPAIGN_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">AD_GROUP_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての履歴です。</span><span lang=\"en\">All operation history.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> ")


  public String getEntityType() {
    return entityType;
  }

  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }

  public AuditLogServiceEventSelector eventTypes(List<AuditLogServiceEventTypes> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public AuditLogServiceEventSelector addEventTypesItem(AuditLogServiceEventTypes eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new ArrayList<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * Get eventTypes
   * @return eventTypes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AuditLogServiceEventTypes> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(List<AuditLogServiceEventTypes> eventTypes) {
    this.eventTypes = eventTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceEventSelector auditLogServiceEventSelector = (AuditLogServiceEventSelector) o;
    return Objects.equals(this.entityType, auditLogServiceEventSelector.entityType) &&
        Objects.equals(this.eventTypes, auditLogServiceEventSelector.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceEventSelector {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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

