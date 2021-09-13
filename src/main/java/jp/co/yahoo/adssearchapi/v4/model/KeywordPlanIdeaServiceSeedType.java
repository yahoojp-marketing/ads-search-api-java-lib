package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">KeywordPlanIdeaServiceSeedTypeは、キーワード候補作成条件タイプを表します。</div> <div lang=\"en\">KeywordPlanIdeaServiceSeedType describes a type of related keywords creation conditions.</div> <dl class=term>   <dt class=\"term__item\">KEYWORD_AND_URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードとURLです。</span><span lang=\"en\">Keyword and URL.</span></dd>   <dt class=\"term__item\">KEYWORD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードです。</span><span lang=\"en\">Keyword.</span></dd>   <dt class=\"term__item\">URL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">URLです。</span><span lang=\"en\">URL.</span></dd>   <dt class=\"term__item\">SITE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">サイト（ドメインURL）です。</span><span lang=\"en\">Site (domain URL).</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum KeywordPlanIdeaServiceSeedType {
  
  KEYWORD_AND_URL("KEYWORD_AND_URL"),
  
  KEYWORD("KEYWORD"),
  
  URL("URL"),
  
  SITE("SITE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  KeywordPlanIdeaServiceSeedType(String value) {
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
  public static KeywordPlanIdeaServiceSeedType fromValue(String value) {
    for (KeywordPlanIdeaServiceSeedType b : KeywordPlanIdeaServiceSeedType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

