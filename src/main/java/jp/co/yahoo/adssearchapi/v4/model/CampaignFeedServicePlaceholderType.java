package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignFeedServicePlaceholderTypeは、FeedItem情報の種類を選択します。<br> SET時、campaignFeed配下では無視され、campaignFeedList配下では必須です。</div> <div lang=\"en\">CampaignFeedServicePlaceholderType selects the type of FeedItem information.<br> In SET operation, this field will be ignored under 'campaignFeed', and this field is required under 'campaignFeedList'.</div> <dl class=term>   <dt class=\"term__item\">QUICKLINK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションのクイックリンクオプションです。</span><span lang=\"en\">QuickLinks of Ad Display Options.</span></dd>   <dt class=\"term__item\">CALLEXTENSION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告表示オプションの電話番号オプションです。</span><span lang=\"en\">Call Extensions of Ad Display Options.</span></dd>   <dt class=\"term__item\">CALLOUT</dt>   <dd class=\"term__desc\"><span lang=\"ja\">テキスト補足オプションです。</span><span lang=\"en\">Callout options.</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">カテゴリ補足オプションです。</span><span lang=\"en\">Structured snippet options.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignFeedServicePlaceholderType {
  
  QUICKLINK("QUICKLINK"),
  
  CALLEXTENSION("CALLEXTENSION"),
  
  CALLOUT("CALLOUT"),
  
  STRUCTURED_SNIPPET("STRUCTURED_SNIPPET"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignFeedServicePlaceholderType(String value) {
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
  public static CampaignFeedServicePlaceholderType fromValue(String value) {
    for (CampaignFeedServicePlaceholderType b : CampaignFeedServicePlaceholderType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

