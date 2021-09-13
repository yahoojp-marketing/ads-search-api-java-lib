package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignServiceUserStatusは、ユーザーにより広告配信の有無を調整できる設定です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">CampaignServiceUserStatus displays ad delivery status that can be set by an user.<br> This field is required in ADD operation, and will be optional in SET operation.</div> <dl class=term>   <dt class=\"term__item\">ACTIVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告は配信されている状態です。</span><span lang=\"en\">Currently ad delivery is active.</span></dd>   <dt class=\"term__item\">PAUSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告は一時停止の状態のため、配信されていません。</span><span lang=\"en\">Currently ad is paused, which the delivery is not active.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceUserStatus {
  
  ACTIVE("ACTIVE"),
  
  PAUSED("PAUSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceUserStatus(String value) {
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
  public static CampaignServiceUserStatus fromValue(String value) {
    for (CampaignServiceUserStatus b : CampaignServiceUserStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

