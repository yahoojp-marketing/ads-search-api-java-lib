package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceCriterionTypeFeedItemオブジェクトは、地域設定のクライテリアを表します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時のデフォルト設定値はLOCATIONとなります。 </div> <div lang=\"en\">FeedItemServiceCriterionTypeFeedItem object describes criteria information of location restriction.<br> This field is optional in ADD and SET operation, and will be ignored in REMOVE operation.<br> *The default value in ADD operation will be LOCATION.</div> <dl class=term>   <dt class=\"term__item\">LOCATION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">地域設定です。</span><span lang=\"en\">location restriction</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceCriterionTypeFeedItem {
  
  LOCATION("LOCATION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceCriterionTypeFeedItem(String value) {
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
  public static FeedItemServiceCriterionTypeFeedItem fromValue(String value) {
    for (FeedItemServiceCriterionTypeFeedItem b : FeedItemServiceCriterionTypeFeedItem.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

