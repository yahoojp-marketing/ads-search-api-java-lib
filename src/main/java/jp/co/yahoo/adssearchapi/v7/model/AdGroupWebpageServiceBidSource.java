package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupWebpageServiceBidSourceは、入札価格の設定されているレベルを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupWebpageServiceBidSource describes the level at which bid is set.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">ADGROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループレベル</span><span lang=\"en\">Level of ad group</span></dd>   <dt class=\"term__item\">CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キーワードレベル</span><span lang=\"en\">Level of keyword</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupWebpageServiceBidSource {
  
  ADGROUP("ADGROUP"),
  
  CRITERION("CRITERION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupWebpageServiceBidSource(String value) {
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
  public static AdGroupWebpageServiceBidSource fromValue(String value) {
    for (AdGroupWebpageServiceBidSource b : AdGroupWebpageServiceBidSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

