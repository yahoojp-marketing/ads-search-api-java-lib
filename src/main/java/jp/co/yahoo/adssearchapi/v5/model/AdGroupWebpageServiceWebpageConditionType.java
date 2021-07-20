package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupWebpageServiceWebpageConditionTypeは、Webページの条件種別です。<br> このフィールドは、ADD時は必須となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceWebpageConditionType is rule type of web page.<br> This field is required in ADD operation, and will be ignored in SET operation.</div> <dl class=term>   <dt class=\"term__item\">PAGE_CONTENT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Webページのコンテンツ</span><span lang=\"en\">Contents of web page</span></dd>   <dt class=\"term__item\">CUSTOM_LABEL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カスタムラベル</span><span lang=\"en\">Custom label</span></dd>   <dt class=\"term__item\">ALL_PAGES</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべてのWebページ</span><span lang=\"en\">All web pages</span></dd>   <dt class=\"term__item\">URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URL</span><span lang=\"en\">URL</span></dd>   <dt class=\"term__item\">PAGE_TITLE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">Webページのタイトル</span><span lang=\"en\">Title of web page</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupWebpageServiceWebpageConditionType {
  
  URL("URL"),
  
  PAGE_TITLE("PAGE_TITLE"),
  
  PAGE_CONTENT("PAGE_CONTENT"),
  
  CUSTOM_LABEL("CUSTOM_LABEL"),
  
  ALL_PAGES("ALL_PAGES"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupWebpageServiceWebpageConditionType(String value) {
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
  public static AdGroupWebpageServiceWebpageConditionType fromValue(String value) {
    for (AdGroupWebpageServiceWebpageConditionType b : AdGroupWebpageServiceWebpageConditionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

