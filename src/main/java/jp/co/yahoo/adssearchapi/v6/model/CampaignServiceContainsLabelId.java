package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ラベルデータ取得フラグです。</div> <div lang=\"en\">CampaignServiceContainsLabelId object describes acquisition flag of label data.</div> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">取得する</span><span lang=\"en\">acquiring</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">取得しない</span><span lang=\"en\">not acquire</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceContainsLabelId {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceContainsLabelId(String value) {
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
  public static CampaignServiceContainsLabelId fromValue(String value) {
    for (CampaignServiceContainsLabelId b : CampaignServiceContainsLabelId.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

