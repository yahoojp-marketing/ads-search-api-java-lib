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
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.AuditLogServiceEventTypes;
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
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceEntityTypeオブジェクトは、操作履歴に出力するエンティティの種類を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceEntityType object describes the type of entities to be output on the data of operation history.&lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_CAMPAIGN_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードです（キャンペーン）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Negative keywords (for campaign).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンのターゲティング設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Targeting setting on campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_BID_MULTIPLIER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループ入札価格調整率です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Bid adjustment for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BIDDABLE_AD_GROUP_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;入札キーワードです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Bidding keyword.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_AD_GROUP_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードです（広告グループ）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Negative keywords (for ad group).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FEED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;Feedフォルダーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Feed folder.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;FEED_ITEM&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告表示アセットです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad display assets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_FEED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告表示アセットです（キャンペーン）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad display assets for campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_FEED&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告表示アセットです（広告グループ）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad display assets for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SS_IO&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウントです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Account.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SS_CONVERSION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカー（コンバージョン測定）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Conversion tracker for conversion tracking.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BIDDING_STRATEGY&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Auto bidding setting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_CAMPAIGN_USER_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外ターゲットリストです（キャンペーン）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclude target list for campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;NEGATIVE_AD_GROUP_USER_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;対象外ターゲットリストです（広告グループ）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Exclude target list for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_USER_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ターゲットリストです（広告グループ）。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target list for ad group.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;TARGET_LIST&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;サイトリターゲテイングのターゲットリストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Target list of Site Retargeting.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SHARED_SET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;共有リストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Shared list.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SHARED_CRITERION&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;共有キーワードです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Shared keywords.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_SHARED_SET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン共有リストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Shared list for campaign.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アドカスタマイザーです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Ad customizer.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;EXCLUDE_AD_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アドカスタマイザーを除くすべての履歴です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All operation history excepting ad customizer.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アセット（広告表示アセット）です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Assets (Ad display asset).&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンとアセット間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between campaign and assets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループとアセット間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between ad group and assets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ACCOUNT_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;アカウントとカスタマイザー属性間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between account and customizer attributes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーンとカスタマイザー属性間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between campaign and customizer attributes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;広告グループとカスタマイザー属性間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between ad group and customizer attributes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;AD_GROUP_CRITERION_CUSTOMIZER&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キーワードとカスタマイザー属性間の設定情報です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Configuration information between keyword and customizer attributes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CUSTOMIZER_ATTRIBUTE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カスタマイザー属性です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Customizer attributes.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_FEED_ASSET_SET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットセットです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetSet.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_FEED_ASSET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ページフィードアセットです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;PageFeedAsset.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BIDDING_SEASONALITY_ADJUSTMENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;自動入札のスポット調整です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Bidding Seasonality Adjustment.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CAMPAIGN_BUDGET&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;キャンペーン間の共有予算です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Shared budgets.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ALL&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;すべての履歴です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;All operation history.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
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

