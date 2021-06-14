package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">BiddingStrategyServiceTargetImpressionShareは、インプレッションシェアの目標割合を達成するための検索結果掲載位置を指定します。<br> このフィールドは省略可能となります。その際、デフォルト設定値は<code>ANYWHERE_ON_PAGE</code>となります。</div> <div lang=\"en\">CampaignServiceTargetImpressionShare specifies search result posting position to achieve the target ratio of impression share.<br> This field is optional. The default value will be <code>ANYWHERE_ON_PAGE</code>. </div> <dl class=term>   <dt class=\"term__item\">ANYWHERE_ON_PAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">任意の位置です。</span><span lang=\"en\">Arbitrary position.</span></dd>   <dt class=\"term__item\">TOP_OF_PAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ページ上部です。</span><span lang=\"en\">Top part of a page.</span></dd>   <dt class=\"term__item\">ABSOLUTE_TOP_OF_PAGE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ページ最上部です。</span><span lang=\"en\">Absolute top of a page.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum BiddingStrategyServiceTargetImpressionShareLocation {
  
  ANYWHERE_ON_PAGE("ANYWHERE_ON_PAGE"),
  
  TOP_OF_PAGE("TOP_OF_PAGE"),
  
  ABSOLUTE_TOP_OF_PAGE("ABSOLUTE_TOP_OF_PAGE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  BiddingStrategyServiceTargetImpressionShareLocation(String value) {
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
  public static BiddingStrategyServiceTargetImpressionShareLocation fromValue(String value) {
    for (BiddingStrategyServiceTargetImpressionShareLocation b : BiddingStrategyServiceTargetImpressionShareLocation.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

