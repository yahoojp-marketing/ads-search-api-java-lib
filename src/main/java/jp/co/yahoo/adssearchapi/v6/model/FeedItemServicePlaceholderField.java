package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServicePlaceholderFieldは、FeedItem情報の内容を選択します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に無視されます。</div> <div lang=\"en\">FeedItemServicePlaceholderField object selects FeedItem information details.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.<br> *For AD_CUSTOMIZER,  this field will be ignored in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">LINK_TEXT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クイックリンクオプションのテキストです。</span><span lang=\"en\">QuickLink option text.</span></dd>   <dt class=\"term__item\">LINK_DESCRIPTION_1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クイックリンク説明文1</span><span lang=\"en\">Description 1 of Quicklink. </span></dd>   <dt class=\"term__item\">LINK_DESCRIPTION_2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">クイックリンク説明文2</span><span lang=\"en\">Description 2 of Quicklink. </span></dd>   <dt class=\"term__item\">ADVANCED_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最終リンク先URLです。</span><span lang=\"en\">Landing Page URL.</span></dd>   <dt class=\"term__item\">ADVANCED_MOBILE_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン向けURLです。</span><span lang=\"en\">Smartphone Landing Page URL.</span></dd>   <dt class=\"term__item\">TRACKING_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">トラッキングURLです。</span><span lang=\"en\">Tracking URL.</span></dd>   <dt class=\"term__item\">CALL_PHONE_NUMBER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">電話番号オプションの電話番号です。</span><span lang=\"en\">Phone number of Call extensions.</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_INTEGER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（INTEGERタイプの入力定義）です。</span><span lang=\"en\">Auto data insertion (INTEGER type defined).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_PRICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（PRICEタイプの入力定義）です。</span><span lang=\"en\">Auto data insertion (PRICE type defined).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（DATEタイプの入力定義）です。</span><span lang=\"en\">Auto data insertion (DATE type defined).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_STRING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（STRINGタイプの入力定義）です。</span><span lang=\"en\">Auto data insertion (STRING type defined.).</span></dd>   <dt class=\"term__item\">CALLOUT_TEXT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テキスト補足オプションのテキストです。</span><span lang=\"en\">Text for Callout option.</span></dd>   <dt class=\"term__item\">ADDITIONAL_ADVANCED_URLS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最終リンク先URLを2件以上設定する場合の入力定義です。</span><span lang=\"en\">Define when multiple Landing Page URLs are set.</span></dd>   <dt class=\"term__item\">ADDITIONAL_ADVANCED_MOBILE_URLS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">スマートフォン向けURLを2件以上設定する場合の入力定義です。</span><span lang=\"en\">Define when multiple smartphone landing page URLs are set.</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET_HEADER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カテゴリ補足オプション（ヘッダ）です。</span><span lang=\"en\">Category Option (header)</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET_VALUES</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カテゴリ補足オプション（バリュー）です。</span><span lang=\"en\">Category Option (value)</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServicePlaceholderField {
  
  LINK_TEXT("LINK_TEXT"),
  
  LINK_DESCRIPTION_1("LINK_DESCRIPTION_1"),
  
  LINK_DESCRIPTION_2("LINK_DESCRIPTION_2"),
  
  ADVANCED_URL("ADVANCED_URL"),
  
  ADVANCED_MOBILE_URL("ADVANCED_MOBILE_URL"),
  
  TRACKING_URL("TRACKING_URL"),
  
  CALL_PHONE_NUMBER("CALL_PHONE_NUMBER"),
  
  AD_CUSTOMIZER_INTEGER("AD_CUSTOMIZER_INTEGER"),
  
  AD_CUSTOMIZER_PRICE("AD_CUSTOMIZER_PRICE"),
  
  AD_CUSTOMIZER_DATE("AD_CUSTOMIZER_DATE"),
  
  AD_CUSTOMIZER_STRING("AD_CUSTOMIZER_STRING"),
  
  CALLOUT_TEXT("CALLOUT_TEXT"),
  
  ADDITIONAL_ADVANCED_URLS("ADDITIONAL_ADVANCED_URLS"),
  
  ADDITIONAL_ADVANCED_MOBILE_URLS("ADDITIONAL_ADVANCED_MOBILE_URLS"),
  
  STRUCTURED_SNIPPET_HEADER("STRUCTURED_SNIPPET_HEADER"),
  
  STRUCTURED_SNIPPET_VALUES("STRUCTURED_SNIPPET_VALUES"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServicePlaceholderField(String value) {
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
  public static FeedItemServicePlaceholderField fromValue(String value) {
    for (FeedItemServicePlaceholderField b : FeedItemServicePlaceholderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

