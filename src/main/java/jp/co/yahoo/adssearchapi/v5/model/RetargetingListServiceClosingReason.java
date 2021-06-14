package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceClosingReasonは、ターゲットリストのクローズ理由を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">RetargetingListServiceClosingReason defines the reason for closing.　<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">UNUSED_LIST</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未利用です。</span><span lang=\"en\">Unused</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceClosingReason {
  
  UNUSED_LIST("UNUSED_LIST"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceClosingReason(String value) {
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
  public static RetargetingListServiceClosingReason fromValue(String value) {
    for (RetargetingListServiceClosingReason b : RetargetingListServiceClosingReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

