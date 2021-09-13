package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupServiceBidSourceは、入札価格の設定されているレベルを表します。</div> <div lang=\"en\">AdGroupServiceBidSource displays which level bid belongs to ad group.</div> <dl class=term>   <dt class=\"term__item\">ADGROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループレベルです。</span><span lang=\"en\">Effective Bid is Adgroup level bid</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceBidSource {
  
  ADGROUP("ADGROUP"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceBidSource(String value) {
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
  public static AdGroupServiceBidSource fromValue(String value) {
    for (AdGroupServiceBidSource b : AdGroupServiceBidSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

