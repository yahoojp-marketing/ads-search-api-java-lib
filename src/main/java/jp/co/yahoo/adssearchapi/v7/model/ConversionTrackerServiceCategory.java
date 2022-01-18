package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceCategoryは、トラッキング対象のコンバージョントラッカー情報のカテゴリです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。<br> *SET時、LEADは指定できません。<br> *conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeによって指定できる値に制限があります。<br>  appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。<br> ・first_openの場合はDOWNLOADのみ選択できます。<br> ・in_app_purchaseの場合はPURCHASEのみ選択できます。<br> ・その他の場合はDOWNLOAD以外の値を選択できます。<br> </div> <div lang=\"en\">ConversionTrackerServiceCategory is a category for ConversionTracker.<br> This field is required in ADD operation, and is optional in SET operation.<br> * <code>LEAD</code> cannot be specified in SET operation.<br> * In ADD and SET operation, if the conversionTrackerType is APP_LINK_CONVERSION, there is a limit to the values that can be specified by appEventType.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.<br> - In case of first_open, only DOWNLOAD can be selected.<br> - In case of in_app_purchase, only PURCHASE can be selected.<br> - In other cases, values other than DOWNLOAD can be selected.<br> </div> <dl class=term>   <dt class=\"term__item\">DEFAULT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他です。</span><span lang=\"en\">Others</span></dd>   <dt class=\"term__item\">PAGE_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">主要なページの閲覧です。<br>重要なページなど特定ページの閲覧数の測定を行います。</span><span lang=\"en\">This is used to measure page views of specific page such as an important page.</span></dd>   <dt class=\"term__item\">PURCHASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購入/販売です。<br>商品の注文やサービスへのお申し込みなど、販売につながった測定を行います。</span><span lang=\"en\">Purchase/Sold.<br>It is used to measure sales such as order and application of the items or service.</span></dd>   <dt class=\"term__item\">SIGNUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">契約です。<br>会員やメールマガジンの登録数などの測定を行います。</span><span lang=\"en\">Agreement. It is used to measure registration of membership or subscription</span></dd>   <dt class=\"term__item\">LEAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">販売促進です。<br>資料請求数やサービス、商品に関する問い合わせ数などの測定を行います。</span><span lang=\"en\">Sales promotion. It is used to measure inquiries for catalog, service or merchandise.</span></dd>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ダウンロードです。<br>※広告管理ツールおよびレポート上での表示は「その他」になります。</span><span lang=\"en\"> Download.<br> *This will be displayed as Others in Campaign Management Tool and Reports. </span></dd>   <dt class=\"term__item\">ADD_TO_CART</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カートへの追加です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Add to cart.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">BEGIN_CHECKOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">決済の開始です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Begin checkout.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">SUBSCRIBE_PAID</dt>   <dd class=\"term__desc\"><span lang=\"ja\">定期購入です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Subscription.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">PHONE_CALL_LEAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">架電です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Phone call leads.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">IMPORTED_LEAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データのインポートです。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Imported leads.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">SUBMIT_LEAD_FORM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">見込み客のフォーム送信です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Form submission by prospect.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">BOOK_APPOINTMENT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">予約です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Reservation.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">REQUEST_QUOTE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">見積もりのリクエストです。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Request a quote.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">GET_DIRECTIONS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ルート・乗換案内です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Route / transfer information.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">OUTBOUND_CLICK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">離脱クリックです。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Withdrawal click.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">CONTACT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">連絡先です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Contact.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">ENGAGEMENT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タグの発火です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Engagements.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">STORE_VISIT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">実店舗への来店です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Store visits.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">STORE_SALE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">実店舗での購入です。<br>※こちらのEnumは、現在利用できません。</span><span lang=\"en\">Store sales.<br>*This Enum is currently unavailable.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
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
  
  IMPORTED_LEAD("IMPORTED_LEAD"),
  
  SUBMIT_LEAD_FORM("SUBMIT_LEAD_FORM"),
  
  BOOK_APPOINTMENT("BOOK_APPOINTMENT"),
  
  REQUEST_QUOTE("REQUEST_QUOTE"),
  
  GET_DIRECTIONS("GET_DIRECTIONS"),
  
  OUTBOUND_CLICK("OUTBOUND_CLICK"),
  
  CONTACT("CONTACT"),
  
  ENGAGEMENT("ENGAGEMENT"),
  
  STORE_VISIT("STORE_VISIT"),
  
  STORE_SALE("STORE_SALE"),
  
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

