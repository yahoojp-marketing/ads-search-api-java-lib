package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceCategoryは、トラッキング対象のコンバージョントラッカー情報のカテゴリです。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。<br> *SET時、LEADは指定できません。<br> *conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeによって指定できる値に制限があります。<br>  appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。<br> ・first_openの場合はDOWNLOADのみ選択できます。<br> ・in_app_purchaseの場合はPURCHASEのみ選択できます。<br> ・その他の場合はDOWNLOAD以外の値を選択できます。<br> </div> <div lang=\"en\">ConversionTrackerServiceCategory is a category for ConversionTracker.<br> This field is required in ADD operation, and is optional in SET operation.<br> * <code>LEAD</code> cannot be specified in SET operation.<br> * In ADD and SET operation, if the conversionTrackerType is APP_LINK_CONVERSION, there is a limit to the values that can be specified by appEventType.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.<br> - In case of first_open, only DOWNLOAD can be selected.<br> - In case of in_app_purchase, only PURCHASE can be selected.<br> - In other cases, values other than DOWNLOAD can be selected.<br> </div> <dl class=term>   <dt class=\"term__item\">DEFAULT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">その他です。</span><span lang=\"en\">Others</span></dd>   <dt class=\"term__item\">PAGE_VIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">主要なページの閲覧です。<br>重要なページなど特定ページの閲覧数の測定を行います。</span><span lang=\"en\">This is used to measure page views of specific page such as an important page.</span></dd>   <dt class=\"term__item\">PURCHASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">購入/販売です。<br>商品の注文やサービスへのお申し込みなど、販売につながった測定を行います。</span><span lang=\"en\">Purchase/Sold.<br>It is used to measure sales such as order and application of the items or service.</span></dd>   <dt class=\"term__item\">SIGNUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">契約です。<br>会員やメールマガジンの登録数などの測定を行います。</span><span lang=\"en\">Agreement. It is used to measure registration of membership or subscription</span></dd>   <dt class=\"term__item\">LEAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">販売促進です。<br>資料請求数やサービス、商品に関する問い合わせ数などの測定を行います。</span><span lang=\"en\">Sales promotion. It is used to measure inquiries for catalog, service or merchandise.</span></dd>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ダウンロードです。<br>※広告管理ツールおよびレポート上での表示は「その他」になります。</span><span lang=\"en\"> Download.<br> *This will be displayed as Others in Campaign Management Tool and Reports. </span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceCategory {
  
  DEFAULT("DEFAULT"),
  
  PAGE_VIEW("PAGE_VIEW"),
  
  PURCHASE("PURCHASE"),
  
  SIGNUP("SIGNUP"),
  
  LEAD("LEAD"),
  
  DOWNLOAD("DOWNLOAD"),
  
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

