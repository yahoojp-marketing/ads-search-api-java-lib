package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupCriterionServiceBidSourceは、入札価格の設定されているレベルを表します。</div> <div lang=\"en\">AdGroupCriterionServiceBidSource displays which level bid belongs to (criterion or ad group.)</div> <dl class=term>   <dt class=\"term__item\">ADGROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループレベルです。</span><span lang=\"en\">Effective Bid is Adgroup level bid</span></dd>   <dt class=\"term__item\">CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードレベルです。</span><span lang=\"en\">Effective Bid is Keyword level bid</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupCriterionServiceBidSource {
  
  ADGROUP("ADGROUP"),
  
  CRITERION("CRITERION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupCriterionServiceBidSource(String value) {
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
  public static AdGroupCriterionServiceBidSource fromValue(String value) {
    for (AdGroupCriterionServiceBidSource b : AdGroupCriterionServiceBidSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

