package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceTrademarkStatusは、商標保護ステータスです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupAdServiceTrademarkStatus object describes the status of trademark.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">NO_RESTRICTION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">制限なし</span><span lang=\"en\">No restriction.</span></dd>   <dt class=\"term__item\">CONFLICT_WITH_TRADEMARK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">商標に抵触して配信停止中</span><span lang=\"en\">Conflict with trademark.</span></dd>   <dt class=\"term__item\">CLAIM_IN_PROGRESS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">不服申立中</span><span lang=\"en\">Claim in progress.</span></dd>   <dt class=\"term__item\">DISAPPROVED_CLAIM</dt>   <dd class=\"term__desc\"><span lang=\"ja\">不服申立否認</span><span lang=\"en\">Disapproved claim.</span></dd>   <dt class=\"term__item\">DISAPPROVED_REVIEWER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">目視による審査での否認</span><span lang=\"en\">Disapproved reviewer.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceTrademarkStatus {
  
  NO_RESTRICTION("NO_RESTRICTION"),
  
  CONFLICT_WITH_TRADEMARK("CONFLICT_WITH_TRADEMARK"),
  
  CLAIM_IN_PROGRESS("CLAIM_IN_PROGRESS"),
  
  DISAPPROVED_CLAIM("DISAPPROVED_CLAIM"),
  
  DISAPPROVED_REVIEWER("DISAPPROVED_REVIEWER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceTrademarkStatus(String value) {
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
  public static AdGroupAdServiceTrademarkStatus fromValue(String value) {
    for (AdGroupAdServiceTrademarkStatus b : AdGroupAdServiceTrademarkStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

