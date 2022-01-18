package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ConversionTrackerServiceExcludeFromBiddingは、自動入札設定で使用するかを表します。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> ※ADD時のデフォルト設定値はFALSE（使用する）となります。</div> <div lang=\"en\">ConversionTrackerServiceExcludeFromBidding describes whether exclude the data for Auto Bidding setting or not.<br> This field is optional in ADD and SET operation.<br> *The default value in ADD operation will be FALSE.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">使用しません。</span><span lang=\"en\">Exclude from Auto Bidding.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">使用します。</span><span lang=\"en\">Include for Auto Bidding.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ConversionTrackerServiceExcludeFromBidding {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ConversionTrackerServiceExcludeFromBidding(String value) {
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
  public static ConversionTrackerServiceExcludeFromBidding fromValue(String value) {
    for (ConversionTrackerServiceExcludeFromBidding b : ConversionTrackerServiceExcludeFromBidding.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

