package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceMinuteOfHourは、時間（分）を表します。<br> このフィールドは、ADDおよびSET時に必須となります。</div> <div lang=\"en\">Minutes of an hour. Only supported for: 0, 15, 30, and 45 minutes past the hour.<br> This field is required in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">ZERO</dt>   <dd class=\"term__desc\"><span lang=\"ja\">0分です。</span><span lang=\"en\">Zero minutes past the hour</span></dd>   <dt class=\"term__item\">FIFTEEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">15分です。</span><span lang=\"en\">Fifteen minutes past the hour</span></dd>   <dt class=\"term__item\">THIRTY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">30分です。</span><span lang=\"en\">Thirty minutes past the hour</span></dd>   <dt class=\"term__item\">FORTY_FIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">45分です。</span><span lang=\"en\">Forty-five minutes past the hour</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceMinuteOfHour {
  
  ZERO("ZERO"),
  
  FIFTEEN("FIFTEEN"),
  
  THIRTY("THIRTY"),
  
  FORTY_FIVE("FORTY_FIVE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceMinuteOfHour(String value) {
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
  public static FeedItemServiceMinuteOfHour fromValue(String value) {
    for (FeedItemServiceMinuteOfHour b : FeedItemServiceMinuteOfHour.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

