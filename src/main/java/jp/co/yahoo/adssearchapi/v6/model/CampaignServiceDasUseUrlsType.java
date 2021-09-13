package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">DSAのURL使用タイプです。</div> <div lang=\"en\">DSA URL usage type.</div> <dl class=term>   <dt class=\"term__item\">USE_SUPPLIED_URLS_ONLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">PageFeedで指定されたURLのみを使用します。</span><span lang=\"en\">Uses only the URL specified in PageFeed.</span></dd>   <dt class=\"term__item\">TOP_DOMAIN_ONLY</dt>   <dd class=\"term__desc\"><span lang=\"ja\">TopDomainからAdWordsに自動クローリングします。</span><span lang=\"en\">Automatically crawl from TopDomain to AdWords.</span></dd>   <dt class=\"term__item\">DOMAIN_AND_SUPPLIED_URLS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">TopDomainからの自動クローリングと、PageFeedで指定されたURLの双方に配信します。</span><span lang=\"en\">It will be delivered to both the automatic crawling from the TopDomain and the URL specified in PageFeed.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignServiceDasUseUrlsType {
  
  USE_SUPPLIED_URLS_ONLY("USE_SUPPLIED_URLS_ONLY"),
  
  TOP_DOMAIN_ONLY("TOP_DOMAIN_ONLY"),
  
  DOMAIN_AND_SUPPLIED_URLS("DOMAIN_AND_SUPPLIED_URLS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignServiceDasUseUrlsType(String value) {
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
  public static CampaignServiceDasUseUrlsType fromValue(String value) {
    for (CampaignServiceDasUseUrlsType b : CampaignServiceDasUseUrlsType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

