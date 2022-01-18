package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceJobTypeは、登録したジョブの種類を表します。</div> <div lang=\"en\">PageFeedItemServiceJobType displays kind of registered job.</div> <dl class=term>   <dt class=\"term__item\">UPLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アップロード</span><span lang=\"en\">Upload.</span></dd>   <dt class=\"term__item\">DOWNLOAD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ダウンロード</span><span lang=\"en\">Download.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceJobType {
  
  UPLOAD("UPLOAD"),
  
  DOWNLOAD("DOWNLOAD"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceJobType(String value) {
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
  public static PageFeedItemServiceJobType fromValue(String value) {
    for (PageFeedItemServiceJobType b : PageFeedItemServiceJobType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

