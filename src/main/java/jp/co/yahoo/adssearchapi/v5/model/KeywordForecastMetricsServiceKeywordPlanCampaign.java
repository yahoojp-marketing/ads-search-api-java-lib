package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceKeywordPlanAdGroup;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceKeywordPlanNetwork;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanCampaign オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceKeywordPlanCampaign object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceKeywordPlanCampaign オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceKeywordPlanCampaign object is a container for the estimate request.</div> ")

public class KeywordForecastMetricsServiceKeywordPlanCampaign   {
  @JsonProperty("keywordPlanNetwork")
  private JsonNullable<KeywordForecastMetricsServiceKeywordPlanNetwork> keywordPlanNetwork = JsonNullable.undefined();

  @JsonProperty("maxCpc")
  private JsonNullable<Long> maxCpc = JsonNullable.undefined();

  @JsonProperty("geoTargets")
  @Valid
  private JsonNullable<List<String>> geoTargets = JsonNullable.undefined();

  @JsonProperty("keywordPlanAdGroup")
  private JsonNullable<KeywordForecastMetricsServiceKeywordPlanAdGroup> keywordPlanAdGroup = JsonNullable.undefined();

  public KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanNetwork(KeywordForecastMetricsServiceKeywordPlanNetwork keywordPlanNetwork) {
    this.keywordPlanNetwork = JsonNullable.of(keywordPlanNetwork);
    return this;
  }

  /**
   * Get keywordPlanNetwork
   * @return keywordPlanNetwork
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordForecastMetricsServiceKeywordPlanNetwork> getKeywordPlanNetwork() {
    return keywordPlanNetwork;
  }

  public void setKeywordPlanNetwork(JsonNullable<KeywordForecastMetricsServiceKeywordPlanNetwork> keywordPlanNetwork) {
    this.keywordPlanNetwork = keywordPlanNetwork;
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign maxCpc(Long maxCpc) {
    this.maxCpc = JsonNullable.of(maxCpc);
    return this;
  }

  /**
   * <div lang=\"ja\">最大クリック単価です。</div> <div lang=\"en\">Maximum CPC.</div> 
   * @return maxCpc
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">最大クリック単価です。</div> <div lang=\"en\">Maximum CPC.</div> ")
  @NotNull


  public JsonNullable<Long> getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(JsonNullable<Long> maxCpc) {
    this.maxCpc = maxCpc;
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign geoTargets(List<String> geoTargets) {
    this.geoTargets = JsonNullable.of(geoTargets);
    return this;
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign addGeoTargetsItem(String geoTargetsItem) {
    if (this.geoTargets == null || !this.geoTargets.isPresent()) {
      this.geoTargets = JsonNullable.of(new ArrayList<>());
    }
    this.geoTargets.get().add(geoTargetsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">地域情報です。</div> <div lang=\"en\">Area information.</div> 
   * @return geoTargets
  */
  @ApiModelProperty(value = "<div lang=\"ja\">地域情報です。</div> <div lang=\"en\">Area information.</div> ")


  public JsonNullable<List<String>> getGeoTargets() {
    return geoTargets;
  }

  public void setGeoTargets(JsonNullable<List<String>> geoTargets) {
    this.geoTargets = geoTargets;
  }

  public KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanAdGroup(KeywordForecastMetricsServiceKeywordPlanAdGroup keywordPlanAdGroup) {
    this.keywordPlanAdGroup = JsonNullable.of(keywordPlanAdGroup);
    return this;
  }

  /**
   * Get keywordPlanAdGroup
   * @return keywordPlanAdGroup
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<KeywordForecastMetricsServiceKeywordPlanAdGroup> getKeywordPlanAdGroup() {
    return keywordPlanAdGroup;
  }

  public void setKeywordPlanAdGroup(JsonNullable<KeywordForecastMetricsServiceKeywordPlanAdGroup> keywordPlanAdGroup) {
    this.keywordPlanAdGroup = keywordPlanAdGroup;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceKeywordPlanCampaign keywordForecastMetricsServiceKeywordPlanCampaign = (KeywordForecastMetricsServiceKeywordPlanCampaign) o;
    return Objects.equals(this.keywordPlanNetwork, keywordForecastMetricsServiceKeywordPlanCampaign.keywordPlanNetwork) &&
        Objects.equals(this.maxCpc, keywordForecastMetricsServiceKeywordPlanCampaign.maxCpc) &&
        Objects.equals(this.geoTargets, keywordForecastMetricsServiceKeywordPlanCampaign.geoTargets) &&
        Objects.equals(this.keywordPlanAdGroup, keywordForecastMetricsServiceKeywordPlanCampaign.keywordPlanAdGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordPlanNetwork, maxCpc, geoTargets, keywordPlanAdGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceKeywordPlanCampaign {\n");
    
    sb.append("    keywordPlanNetwork: ").append(toIndentedString(keywordPlanNetwork)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
    sb.append("    geoTargets: ").append(toIndentedString(geoTargets)).append("\n");
    sb.append("    keywordPlanAdGroup: ").append(toIndentedString(keywordPlanAdGroup)).append("\n");
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

