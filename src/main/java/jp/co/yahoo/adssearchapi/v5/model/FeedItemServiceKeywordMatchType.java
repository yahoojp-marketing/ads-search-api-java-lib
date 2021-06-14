package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceKeywordMatchTypeは、キーワードのマッチタイプを表します。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">FeedItemServiceKeywordMatchType describes keyword match type.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">EXACT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">完全一致です。</span><span lang=\"en\">Exact match.</span></dd>   <dt class=\"term__item\">PHRASE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">フレーズ一致です。</span><span lang=\"en\">Phrase match.</span></dd>   <dt class=\"term__item\">BROAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">部分一致です。</span><span lang=\"en\">Broad match.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceKeywordMatchType {
  
  EXACT("EXACT"),
  
  PHRASE("PHRASE"),
  
  BROAD("BROAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceKeywordMatchType(String value) {
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
  public static FeedItemServiceKeywordMatchType fromValue(String value) {
    for (FeedItemServiceKeywordMatchType b : FeedItemServiceKeywordMatchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

