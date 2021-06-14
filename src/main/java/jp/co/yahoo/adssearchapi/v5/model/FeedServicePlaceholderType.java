package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedPlaceholderTypeは、FeedItem情報の種類を選択します。<br> このフィールドは、ADD時に必須となり、SETおよびREMOVE時に無視されます。</div> <div lang=\"en\">FeedServicePlaceholderType (enum) object select the type of Feed Item information.<br> This field is required in ADD operation, and will be ignored in SET and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">AD_CUSTOMIZER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">データ自動挿入です。</span><span lang=\"en\">Auto data insertion.</span></dd>   <dt class=\"term__item\">DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">動的検索連動型広告ページフィードです。</span><span lang=\"en\">Page feeds of dynamic ad for search.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedServicePlaceholderType {
  
  AD_CUSTOMIZER("AD_CUSTOMIZER"),
  
  DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS("DYNAMIC_AD_FOR_SEARCH_PAGE_FEEDS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedServicePlaceholderType(String value) {
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
  public static FeedServicePlaceholderType fromValue(String value) {
    for (FeedServicePlaceholderType b : FeedServicePlaceholderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

