package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignTargetServiceNetworkCoverageTypeは、広告掲載方式を表します。 この指定は、キャンペーンのPlatformTypeがWAP_MOBILEの場合、指定できません。<br> このフィールドは、ADD時に必須となります。</div> <div lang=\"en\">Network coverage types. This cannot be specified if the campaign's platformType is specified as WAP MOBILE.<br> This field is required in ADD operation.</div> <dl class=term>   <dt class=\"term__item\">YAHOO_SEARCH</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告はYahoo!検索の検索結果画面にのみ表示されます。</span><span lang=\"en\">Ads are only displayed in the search results of Yahoo! JAPAN Search.</span></dd>   <dt class=\"term__item\">SEARCH_NETWORK</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告はYahoo!検索を含むすべての広告掲載方式に配信されます。</span><span lang=\"en\">Ads are delivered in all ad distribution including Yahoo! JAPAN Search.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignTargetServiceNetworkCoverageType {
  
  YAHOO_SEARCH("YAHOO_SEARCH"),
  
  SEARCH_NETWORK("SEARCH_NETWORK"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignTargetServiceNetworkCoverageType(String value) {
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
  public static CampaignTargetServiceNetworkCoverageType fromValue(String value) {
    for (CampaignTargetServiceNetworkCoverageType b : CampaignTargetServiceNetworkCoverageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

