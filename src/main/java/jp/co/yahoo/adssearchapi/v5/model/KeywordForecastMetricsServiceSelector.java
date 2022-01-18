package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceDateInterval;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetricsServiceKeywordPlanCampaign;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetricsServiceSelector オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetricsServiceSelector object contains estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetricsServiceSelector オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetricsServiceSelector object contains estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordForecastMetricsServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("dateInterval")
  private KeywordForecastMetricsServiceDateInterval dateInterval = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("keywordPlanCampaign")
  private KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign = null;

  public KeywordForecastMetricsServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public KeywordForecastMetricsServiceSelector dateInterval(KeywordForecastMetricsServiceDateInterval dateInterval) {
    this.dateInterval = dateInterval;
    return this;
  }

  /**
   * Get dateInterval
   * @return dateInterval
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordForecastMetricsServiceDateInterval getDateInterval() {
    return dateInterval;
  }

  public void setDateInterval(KeywordForecastMetricsServiceDateInterval dateInterval) {
    this.dateInterval = dateInterval;
  }

  public KeywordForecastMetricsServiceSelector startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する開始日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">Start date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する開始日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">Start date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public KeywordForecastMetricsServiceSelector endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する終了日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">End date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">dateIntervalがCUSTOM_DATEのときに指定する終了日です。<br> 現在より先の日付、かつ一年未満である必要があります。<br> ※フォーマット：yyyyMMdd</div> <div lang=\"en\">End date specified when dateInterval is CUSTOM_DATE.<br> Must be earlier than the current date and less than a year old.<br> * Format: yyyyMMdd</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public KeywordForecastMetricsServiceSelector keywordPlanCampaign(KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign) {
    this.keywordPlanCampaign = keywordPlanCampaign;
    return this;
  }

  /**
   * Get keywordPlanCampaign
   * @return keywordPlanCampaign
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordForecastMetricsServiceKeywordPlanCampaign getKeywordPlanCampaign() {
    return keywordPlanCampaign;
  }

  public void setKeywordPlanCampaign(KeywordForecastMetricsServiceKeywordPlanCampaign keywordPlanCampaign) {
    this.keywordPlanCampaign = keywordPlanCampaign;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordForecastMetricsServiceSelector keywordForecastMetricsServiceSelector = (KeywordForecastMetricsServiceSelector) o;
    return Objects.equals(this.accountId, keywordForecastMetricsServiceSelector.accountId) &&
        Objects.equals(this.dateInterval, keywordForecastMetricsServiceSelector.dateInterval) &&
        Objects.equals(this.startDate, keywordForecastMetricsServiceSelector.startDate) &&
        Objects.equals(this.endDate, keywordForecastMetricsServiceSelector.endDate) &&
        Objects.equals(this.keywordPlanCampaign, keywordForecastMetricsServiceSelector.keywordPlanCampaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateInterval, startDate, endDate, keywordPlanCampaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateInterval: ").append(toIndentedString(dateInterval)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    keywordPlanCampaign: ").append(toIndentedString(keywordPlanCampaign)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

