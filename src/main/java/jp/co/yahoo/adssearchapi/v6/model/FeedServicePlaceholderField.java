package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedServicePlaceholderFieldは、FeedItem情報の内容を選択します。<br> このフィールドは、ADDおよびSET時に必須となり、REMOVE時に無視されます。</div> <div lang=\"en\">FeedServicePlaceholderField object select the details of Feed Item information.<br> This field is required in ADD and SET operation, and will be ignored in REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">AD_CUSTOMIZER_INTEGER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（INTEGERタイプの入力定義）です。</span><span lang=\"en\">Data Auto Insertion (Input of INTEGER type).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_PRICE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（PRICEタイプの入力定義）です。</span><span lang=\"en\">Data Auto Insertion (Input of PRICE type).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_DATE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（DATEタイプの入力定義）です。</span><span lang=\"en\">Data Auto Insertion (Input of DATE type).</span></dd>   <dt class=\"term__item\">AD_CUSTOMIZER_STRING</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入（STRINGタイプの入力定義）です。</span><span lang=\"en\">Data Auto Insertion (Input of STRING type).</span></dd>   <dt class=\"term__item\">DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索型連動広告ページフィードのページURLです。</span><span lang=\"en\">Page url of Dynamic ad for search page feeds.</span></dd>   <dt class=\"term__item\">DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索型連動広告ページフィードのラベルです。</span><span lang=\"en\">Label of Dynamic ad for search page feeds.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedServicePlaceholderField {
  
  AD_CUSTOMIZER_INTEGER("AD_CUSTOMIZER_INTEGER"),
  
  AD_CUSTOMIZER_PRICE("AD_CUSTOMIZER_PRICE"),
  
  AD_CUSTOMIZER_DATE("AD_CUSTOMIZER_DATE"),
  
  AD_CUSTOMIZER_STRING("AD_CUSTOMIZER_STRING"),
  
  DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL("DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_PAGE_URL"),
  
  DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL("DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS_LABEL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedServicePlaceholderField(String value) {
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
  public static FeedServicePlaceholderField fromValue(String value) {
    for (FeedServicePlaceholderField b : FeedServicePlaceholderField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

