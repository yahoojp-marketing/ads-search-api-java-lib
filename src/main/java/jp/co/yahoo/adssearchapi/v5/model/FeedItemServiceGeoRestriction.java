package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">FeedItemServiceGeoRestrictionオブジェクトは、地域設定の配信を制御します。<br> このフィールドは、ADDおよびSET時に省略可能となり、REMOVE時に無視されます。<br> ※ADD時のデフォルト設定値はNONEとなります。 </div> <div lang=\"en\">FeedItemServiceGeoRestriction object controls ad delivery of location restriction.<br> This field is optional in ADD and SET operation, and will be ignored in  REMOVE operation.<br> The default value in ADD operation will be NONE.</div> <dl class=term>   <dt class=\"term__item\">NONE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索キーワードとユーザーの所在地の関係にかかわらず、配信されます。</span><span lang=\"en\">Regardless of the relationship between the search keyword and the user&#39;s location, Ads will be delivered.</span></dd>   <dt class=\"term__item\">LOCATION_OF_PRESENCE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">検索キーワードがユーザーの所在地と無関係の場合は配信されません。</span><span lang=\"en\">Ads will not be delivered if the search keyword is unrelated to the user&#39;s location.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum FeedItemServiceGeoRestriction {
  
  NONE("NONE"),
  
  LOCATION_OF_PRESENCE("LOCATION_OF_PRESENCE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  FeedItemServiceGeoRestriction(String value) {
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
  public static FeedItemServiceGeoRestriction fromValue(String value) {
    for (FeedItemServiceGeoRestriction b : FeedItemServiceGeoRestriction.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

