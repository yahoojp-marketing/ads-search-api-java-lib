/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceCategoryは、トラッキング対象のコンバージョン設定のカテゴリです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。&lt;br&gt; ※指定可能な組み合わせは以下のヘルプを参照してください。&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044409?language&#x3D;ja\&quot;&gt;「コンバージョン測定の目的」について&lt;/a&gt;&lt;br&gt; ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeによって指定できる値に制限があります。&lt;br&gt;  appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。&lt;br&gt; ・first_openの場合はDOWNLOADのみ選択できます。&lt;br&gt; ・in_app_purchaseの場合はPURCHASEのみ選択できます。&lt;br&gt; ・その他の場合はDOWNLOAD以外の値を選択できます。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceCategory is a category for ConversionTracker.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation.&lt;br&gt; * See help below for possible combinations.&lt;br&gt; ・&lt;a href&#x3D;\&quot;https://ads-help.yahoo-net.jp/s/article/H000044409?language&#x3D;en_US\&quot;&gt;Conversion tracking purpose&lt;/a&gt;&lt;br&gt; * In ADD and SET operation, if the conversionTrackerType is APP_LINK_CONVERSION, there is a limit to the values that can be specified by appEventType.&lt;br&gt; appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.&lt;br&gt; - In case of first_open, only DOWNLOAD can be selected.&lt;br&gt; - In case of in_app_purchase, only PURCHASE can be selected.&lt;br&gt; - In other cases, values other than DOWNLOAD can be selected.&lt;br&gt; &lt;/div&gt; &lt;dl class&#x3D;term&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DEFAULT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;その他です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Others.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PAGE_VIEW&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;主要なページの閲覧です。&lt;br&gt;重要なページなど特定ページの閲覧数の測定を行います。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Page Access.&lt;br&gt;This is used to measure page views of specific page such as an important page.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PURCHASE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;購入/販売です。&lt;br&gt;商品の注文やサービスへのお申し込みなど、販売につながった測定を行います。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Purchase/Sales.&lt;br&gt;It is used to measure sales such as order and application of the items or service.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SIGNUP&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;お申し込みです。&lt;br&gt;会員やメールマガジンの登録数などの測定を行います。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Application.&lt;br&gt;It is used to measure registration of membership or subscription.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;LEAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;販売促進です。&lt;br&gt;資料請求数やサービス、商品に関する問い合わせ数などの測定を行います。&lt;br&gt;※ADDまたはSET時、このEnumは指定できません。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Sales promotion. It is used to measure inquiries for catalog, service or merchandise.&lt;br&gt;*This Enum cannot be specified in ADD and SET operation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;DOWNLOAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ダウンロードです。&lt;br&gt;※広告管理ツールおよびレポート上での表示は「その他」になります。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt; Download.&lt;br&gt; *This will be displayed as Others in Campaign Management Tool and Reports. &lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ADD_TO_CART&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;カートへの追加です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Add to cart.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BEGIN_CHECKOUT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;決済の開始です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Begin checkout.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SUBSCRIBE_PAID&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;定期購入です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Subscription.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;PHONE_CALL_LEAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;架電です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Phone call leads.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;SUBMIT_LEAD_FORM&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;見込み客のフォーム送信です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Form submission by prospect.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;BOOK_APPOINTMENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;予約です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Reservation.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;REQUEST_QUOTE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;見積もりのリクエストです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Request a quote.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;GET_DIRECTIONS&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;ルート・乗換案内です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Route / transfer information.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;OUTBOUND_CLICK&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;離脱クリックです。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Withdrawal click.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONTACT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;連絡先です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Contact.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;ENGAGEMENT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;タグの発火です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Engagements.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STORE_VISIT&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;実店舗に来店です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Store visits.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;STORE_SALE&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;実店舗で購入です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Store sales.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;QUALIFIED_LEAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;有望な見込み客です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Qualified leads.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;CONVERTED_LEAD&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;取引歴のある見込み客です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Converted leads.&lt;/span&gt;&lt;/dd&gt;   &lt;dt class&#x3D;\&quot;term__item\&quot;&gt;UNKNOWN&lt;/dt&gt;   &lt;dd class&#x3D;\&quot;term__desc\&quot;&gt;&lt;span lang&#x3D;\&quot;ja\&quot;&gt;未知の値です。&lt;/span&gt;&lt;span lang&#x3D;\&quot;en\&quot;&gt;Unknown value.&lt;/span&gt;&lt;/dd&gt; &lt;/dl&gt; 
 */
public enum ConversionTrackerServiceCategory {
  
  DEFAULT("DEFAULT"),
  
  PAGE_VIEW("PAGE_VIEW"),
  
  PURCHASE("PURCHASE"),
  
  SIGNUP("SIGNUP"),
  
  LEAD("LEAD"),
  
  DOWNLOAD("DOWNLOAD"),
  
  ADD_TO_CART("ADD_TO_CART"),
  
  BEGIN_CHECKOUT("BEGIN_CHECKOUT"),
  
  SUBSCRIBE_PAID("SUBSCRIBE_PAID"),
  
  PHONE_CALL_LEAD("PHONE_CALL_LEAD"),
  
  SUBMIT_LEAD_FORM("SUBMIT_LEAD_FORM"),
  
  BOOK_APPOINTMENT("BOOK_APPOINTMENT"),
  
  REQUEST_QUOTE("REQUEST_QUOTE"),
  
  GET_DIRECTIONS("GET_DIRECTIONS"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  CONTACT("CONTACT"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  STORE_VISIT("STORE_VISIT"),
  
  STORE_SALE("STORE_SALE"),
  
  QUALIFIED_LEAD("QUALIFIED_LEAD"),
  
  CONVERTED_LEAD("CONVERTED_LEAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceCategory(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ConversionTrackerServiceCategory fromValue(String value) {
    for (ConversionTrackerServiceCategory b : ConversionTrackerServiceCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

