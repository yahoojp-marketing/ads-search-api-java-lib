/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v17/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v17.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v17.model.AuditLogServiceEventTypes;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceEventSelectorオブジェクトは、操作履歴の取得対象を設定します。&lt;br&gt; このフィールドは、必須です。&lt;br&gt; 1~25件の指定が可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceEventSelector object enables the target setting of acquiring operation history.&lt;br&gt; This field is required.&lt;br&gt; 1 to 25 items can be specified.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AuditLogServiceEventSelector.JSON_PROPERTY_ENTITY_TYPE,
  AuditLogServiceEventSelector.JSON_PROPERTY_EVENT_TYPES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogServiceEventSelector {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_EVENT_TYPES = "eventTypes";
  private List<AuditLogServiceEventTypes> eventTypes;

  public AuditLogServiceEventSelector() {
  }

  public AuditLogServiceEventSelector entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;   AuditLogServiceEntityTypeは、操作履歴に出力するエンティティの種類を表します。&lt;/br&gt;   ADD時、指定必須です。&lt;/br&gt;   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;AuditLogServiceEntityType&lt;/th&gt;       &lt;th&gt;説明&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN&lt;/td&gt;       &lt;td&gt;キャンペーンです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_CAMPAIGN_CRITERION&lt;/td&gt;       &lt;td&gt;対象外キーワードです（キャンペーン）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_CRITERION&lt;/td&gt;       &lt;td&gt;キャンペーンのターゲティング設定です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP&lt;/td&gt;       &lt;td&gt;広告グループです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_BID_MULTIPLIER&lt;/td&gt;       &lt;td&gt;広告グループ入札価格調整率です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDABLE_AD_GROUP_CRITERION&lt;/td&gt;       &lt;td&gt;入札キーワードです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_AD_GROUP_CRITERION&lt;/td&gt;       &lt;td&gt;対象外キーワードです（広告グループ）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD&lt;/td&gt;       &lt;td&gt;広告です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;FEED&lt;/td&gt;       &lt;td&gt;Feedフォルダーです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;FEED_ITEM&lt;/td&gt;       &lt;td&gt;広告表示アセットです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_FEED&lt;/td&gt;       &lt;td&gt;広告表示アセットです（キャンペーン）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_FEED&lt;/td&gt;       &lt;td&gt;広告表示アセットです（広告グループ）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_IO&lt;/td&gt;       &lt;td&gt;アカウントです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_CONVERSION&lt;/td&gt;       &lt;td&gt;コンバージョントラッカー（コンバージョン測定）です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDING_STRATEGY&lt;/td&gt;       &lt;td&gt;自動入札設定です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_CAMPAIGN_USER_LIST&lt;/td&gt;       &lt;td&gt;対象外ターゲットリストです（キャンペーン）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_AD_GROUP_USER_LIST&lt;/td&gt;       &lt;td&gt;対象外ターゲットリストです（広告グループ）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_USER_LIST&lt;/td&gt;       &lt;td&gt;ターゲットリストです（広告グループ）。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;TARGET_LIST&lt;/td&gt;       &lt;td&gt;サイトリターゲテイングのターゲットリストです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHARED_SET&lt;/td&gt;       &lt;td&gt;共有リストです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHARED_CRITERION&lt;/td&gt;       &lt;td&gt;共有キーワードです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_SHARED_SET&lt;/td&gt;       &lt;td&gt;キャンペーン共有リストです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;アドカスタマイザーです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;EXCLUDE_AD_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;アドカスタマイザーを除くすべての履歴です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ASSET&lt;/td&gt;       &lt;td&gt;アセット（広告表示アセット）です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_ASSET&lt;/td&gt;       &lt;td&gt;キャンペーンとアセット間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_ASSET&lt;/td&gt;       &lt;td&gt;広告グループとアセット間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ACCOUNT_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;アカウントとカスタマイザー属性間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;キャンペーンとカスタマイザー属性間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;広告グループとカスタマイザー属性間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_CRITERION_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;キーワードとカスタマイザー属性間の設定情報です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CUSTOMIZER_ATTRIBUTE&lt;/td&gt;       &lt;td&gt;カスタマイザー属性です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAGE_FEED_ASSET_SET&lt;/td&gt;       &lt;td&gt;ページフィードアセットセットです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAGE_FEED_ASSET&lt;/td&gt;       &lt;td&gt;ページフィードアセットです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDING_SEASONALITY_ADJUSTMENT&lt;/td&gt;       &lt;td&gt;自動入札のスポット調整です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_BUDGET&lt;/td&gt;       &lt;td&gt;キャンペーン間の共有予算です。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AB_TEST&lt;/td&gt;       &lt;td&gt;A/Bテストです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_CONVERSION_GROUP&lt;/td&gt;       &lt;td&gt;コンバージョングループです。&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ALL&lt;/td&gt;       &lt;td&gt;すべての履歴です。&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;   AuditLogServiceEntityType object describes the type of entities to be output on the data of operation history.&lt;/br&gt;   This field is required in ADD operation.&lt;/br&gt;   &lt;table border&#x3D;&#39;1&#39;&gt;     &lt;tr&gt;       &lt;th&gt;AuditLogServiceEntityType&lt;/th&gt;       &lt;th&gt;description&lt;/th&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN&lt;/td&gt;       &lt;td&gt;Campaign.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_CAMPAIGN_CRITERION&lt;/td&gt;       &lt;td&gt;Negative keywords (for campaign).&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_CRITERION&lt;/td&gt;       &lt;td&gt;Targeting setting on campaign.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP&lt;/td&gt;       &lt;td&gt;Ad group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_BID_MULTIPLIER&lt;/td&gt;       &lt;td&gt;Bid adjustment for ad group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDABLE_AD_GROUP_CRITERION&lt;/td&gt;       &lt;td&gt;Bidding keyword.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_AD_GROUP_CRITERION&lt;/td&gt;       &lt;td&gt;Negative keywords (for ad group).&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD&lt;/td&gt;       &lt;td&gt;Ad.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;FEED&lt;/td&gt;       &lt;td&gt;Feed folder.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;FEED_ITEM&lt;/td&gt;       &lt;td&gt;Ad display assets.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_FEED&lt;/td&gt;       &lt;td&gt;Ad display assets for campaign.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_FEED&lt;/td&gt;       &lt;td&gt;Ad display assets for ad group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_IO&lt;/td&gt;       &lt;td&gt;Account.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_CONVERSION&lt;/td&gt;       &lt;td&gt;Conversion tracker for conversion tracking.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDING_STRATEGY&lt;/td&gt;       &lt;td&gt;Auto bidding setting.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_CAMPAIGN_USER_LIST&lt;/td&gt;       &lt;td&gt;Exclude target list for campaign.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;NEGATIVE_AD_GROUP_USER_LIST&lt;/td&gt;       &lt;td&gt;Exclude target list for ad group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_USER_LIST&lt;/td&gt;       &lt;td&gt;Target list for ad group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;TARGET_LIST&lt;/td&gt;       &lt;td&gt;Target list of Site Retargeting.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHARED_SET&lt;/td&gt;       &lt;td&gt;Shared list.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SHARED_CRITERION&lt;/td&gt;       &lt;td&gt;Shared keywords.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_SHARED_SET&lt;/td&gt;       &lt;td&gt;Shared list for campaign.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;Ad customizer.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;EXCLUDE_AD_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;All operation history excepting ad customizer.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ASSET&lt;/td&gt;       &lt;td&gt;Assets (Ad display asset).&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_ASSET&lt;/td&gt;       &lt;td&gt;Configuration information between campaign and assets.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_ASSET&lt;/td&gt;       &lt;td&gt;Configuration information between ad group and assets.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ACCOUNT_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;Configuration information between account and customizer attributes.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;Configuration information between campaign and customizer attributes.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;Configuration information between ad group and customizer attributes.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AD_GROUP_CRITERION_CUSTOMIZER&lt;/td&gt;       &lt;td&gt;Configuration information between keyword and customizer attributes.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CUSTOMIZER_ATTRIBUTE&lt;/td&gt;       &lt;td&gt;Customizer attributes.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAGE_FEED_ASSET_SET&lt;/td&gt;       &lt;td&gt;PageFeedAssetSet.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;PAGE_FEED_ASSET&lt;/td&gt;       &lt;td&gt;PageFeedAsset.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;BIDDING_SEASONALITY_ADJUSTMENT&lt;/td&gt;       &lt;td&gt;Bidding Seasonality Adjustment.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;CAMPAIGN_BUDGET&lt;/td&gt;       &lt;td&gt;Shared budgets.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;AB_TEST&lt;/td&gt;       &lt;td&gt;A/B test.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;SS_CONVERSION_GROUP&lt;/td&gt;       &lt;td&gt;Conversion Group.&lt;/td&gt;     &lt;/tr&gt;     &lt;tr&gt;       &lt;td&gt;ALL&lt;/td&gt;       &lt;td&gt;All operation history.&lt;/td&gt;     &lt;/tr&gt;   &lt;/table&gt; &lt;/div&gt; 
   * @return entityType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AuditLogServiceEventTypes> getEventTypes() {
    return eventTypes;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

