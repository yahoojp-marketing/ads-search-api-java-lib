package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceAdGroupEstimateRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceCampaignEstimateRequestオブジェクトは、見積もりを行うキャンペーンを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordEstimatorServiceCampaignEstimateRequest object is a container for a campaign to estimate.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceCampaignEstimateRequestオブジェクトは、見積もりを行うキャンペーンを格納するコンテナです。</div> <div lang=\"en\">KeywordEstimatorServiceCampaignEstimateRequest object is a container for a campaign to estimate.</div> ")

public class KeywordEstimatorServiceCampaignEstimateRequest   {
  @JsonProperty("adGroupEstimateRequests")
  @Valid
  private JsonNullable<List<KeywordEstimatorServiceAdGroupEstimateRequest>> adGroupEstimateRequests = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("dailyBudget")
  private JsonNullable<Long> dailyBudget = JsonNullable.undefined();

  @JsonProperty("provinces")
  @Valid
  private JsonNullable<List<String>> provinces = JsonNullable.undefined();

  public KeywordEstimatorServiceCampaignEstimateRequest adGroupEstimateRequests(List<KeywordEstimatorServiceAdGroupEstimateRequest> adGroupEstimateRequests) {
    this.adGroupEstimateRequests = JsonNullable.of(adGroupEstimateRequests);
    return this;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest addAdGroupEstimateRequestsItem(KeywordEstimatorServiceAdGroupEstimateRequest adGroupEstimateRequestsItem) {
    this.adGroupEstimateRequests.get().add(adGroupEstimateRequestsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">見積もりを行う広告グループを格納するコンテナです。</div> <div lang=\"en\">A container for the Ad Group to estimate</div> 
   * @return adGroupEstimateRequests
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">見積もりを行う広告グループを格納するコンテナです。</div> <div lang=\"en\">A container for the Ad Group to estimate</div> ")
  @NotNull

  @Valid
@Size(min=1,max=50) 
  public JsonNullable<List<KeywordEstimatorServiceAdGroupEstimateRequest>> getAdGroupEstimateRequests() {
    return adGroupEstimateRequests;
  }

  public void setAdGroupEstimateRequests(JsonNullable<List<KeywordEstimatorServiceAdGroupEstimateRequest>> adGroupEstimateRequests) {
    this.adGroupEstimateRequests = adGroupEstimateRequests;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。</div> <div lang=\"en\">Campaign ID</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest dailyBudget(Long dailyBudget) {
    this.dailyBudget = JsonNullable.of(dailyBudget);
    return this;
  }

  /**
   * <div lang=\"ja\">見積もりで使用するキャンペーンの一日あたりの予算です。</div> <div lang=\"en\">Daily campaign budget used to estimate</div> 
   * @return dailyBudget
  */
  @ApiModelProperty(value = "<div lang=\"ja\">見積もりで使用するキャンペーンの一日あたりの予算です。</div> <div lang=\"en\">Daily campaign budget used to estimate</div> ")


  public JsonNullable<Long> getDailyBudget() {
    return dailyBudget;
  }

  public void setDailyBudget(JsonNullable<Long> dailyBudget) {
    this.dailyBudget = dailyBudget;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest provinces(List<String> provinces) {
    this.provinces = JsonNullable.of(provinces);
    return this;
  }

  public KeywordEstimatorServiceCampaignEstimateRequest addProvincesItem(String provincesItem) {
    if (this.provinces == null || !this.provinces.isPresent()) {
      this.provinces = JsonNullable.of(new ArrayList<>());
    }
    this.provinces.get().add(provincesItem);
    return this;
  }

  /**
   * <div lang=\"ja\">見積もりで使用する広告配信する指定地域（都道府県）です。</div> <div lang=\"en\">Province to serve Ads used to estimate</div> 
   * @return provinces
  */
  @ApiModelProperty(value = "<div lang=\"ja\">見積もりで使用する広告配信する指定地域（都道府県）です。</div> <div lang=\"en\">Province to serve Ads used to estimate</div> ")


  public JsonNullable<List<String>> getProvinces() {
    return provinces;
  }

  public void setProvinces(JsonNullable<List<String>> provinces) {
    this.provinces = provinces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceCampaignEstimateRequest keywordEstimatorServiceCampaignEstimateRequest = (KeywordEstimatorServiceCampaignEstimateRequest) o;
    return Objects.equals(this.adGroupEstimateRequests, keywordEstimatorServiceCampaignEstimateRequest.adGroupEstimateRequests) &&
        Objects.equals(this.campaignId, keywordEstimatorServiceCampaignEstimateRequest.campaignId) &&
        Objects.equals(this.dailyBudget, keywordEstimatorServiceCampaignEstimateRequest.dailyBudget) &&
        Objects.equals(this.provinces, keywordEstimatorServiceCampaignEstimateRequest.provinces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupEstimateRequests, campaignId, dailyBudget, provinces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceCampaignEstimateRequest {\n");
    
    sb.append("    adGroupEstimateRequests: ").append(toIndentedString(adGroupEstimateRequests)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    dailyBudget: ").append(toIndentedString(dailyBudget)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

