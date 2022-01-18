package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignExportServiceEntityTypeは、対象となるエンティティを表します。<br> このフィールドは、省略可能となります。※リクエスト時はCampaignExportServiceEntityTypeで定義されている値をString型で指定します。 ※レスポンスの値はenumとして返却されます。</div> <div lang=\"en\">CampaignExportServiceEntityType object describes target entities.<br> This field is optional.* When requesting, specify the value defined on CampaignExportServiceEntityType in string. * Response value is returned in enum type.</div> <dl class=term>   <dt class=\"term__item\">CAMPAIGN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">キャンペーン</span><span lang=\"en\">Campaign</span></dd>   <dt class=\"term__item\">NEGATIVE_CAMPAIGN_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワード（キャンペーンレベル）</span><span lang=\"en\">Negative keyword (campaign level)</span></dd>   <dt class=\"term__item\">AD_GROUP</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告グループ</span><span lang=\"en\">Ad group</span></dd>   <dt class=\"term__item\">BIDDABLE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">入札キーワード</span><span lang=\"en\">Biddable keyword</span></dd>   <dt class=\"term__item\">NEGATIVE_AD_GROUP_CRITERION</dt>   <dd class=\"term__desc\"><span lang=\"ja\">対象外キーワード（広告グループレベル）</span><span lang=\"en\">Negative keyword (ad group level)</span></dd>   <dt class=\"term__item\">AD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">広告</span><span lang=\"en\">Ad</span></dd>   <dt class=\"term__item\">ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">QUICKLINK_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">CALLOUT_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">STRUCTURED_SNIPPET_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">CALLEXTENSION_ASSET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">※こちらのタイプは、現在利用できません。</span><span lang=\"en\">*This type is currently unavailable.</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての広告エンティティ</span><span lang=\"en\">All entities</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignExportServiceEntityType {
  
  CAMPAIGN("CAMPAIGN"),
  
  NEGATIVE_CAMPAIGN_CRITERION("NEGATIVE_CAMPAIGN_CRITERION"),
  
  AD_GROUP("AD_GROUP"),
  
  BIDDABLE_AD_GROUP_CRITERION("BIDDABLE_AD_GROUP_CRITERION"),
  
  NEGATIVE_AD_GROUP_CRITERION("NEGATIVE_AD_GROUP_CRITERION"),
  
  AD("AD"),
  
  ASSET("ASSET"),
  
  QUICKLINK_ASSET("QUICKLINK_ASSET"),
  
  CALLOUT_ASSET("CALLOUT_ASSET"),
  
  STRUCTURED_SNIPPET_ASSET("STRUCTURED_SNIPPET_ASSET"),
  
  CALLEXTENSION_ASSET("CALLEXTENSION_ASSET"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignExportServiceEntityType(String value) {
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
  public static CampaignExportServiceEntityType fromValue(String value) {
    for (CampaignExportServiceEntityType b : CampaignExportServiceEntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

