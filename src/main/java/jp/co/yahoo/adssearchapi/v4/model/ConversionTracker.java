package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceAppLinkConversion;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v4.model.ConversionTrackerServiceWebConversion;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTracker   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("allConversionValue")
  private String allConversionValue = null;

  @JsonProperty("allConversions")
  private Long allConversions = null;

  @JsonProperty("appConversion")
  private ConversionTrackerServiceAppConversion appConversion = null;

  @JsonProperty("appLinkConversion")
  private ConversionTrackerServiceAppLinkConversion appLinkConversion = null;

  @JsonProperty("category")
  private ConversionTrackerServiceCategory category = null;

  @JsonProperty("conversionCountingType")
  private ConversionTrackerServiceConversionCountingType conversionCountingType = null;

  @JsonProperty("conversionTrackerId")
  private Long conversionTrackerId = null;

  @JsonProperty("conversionTrackerTrackId")
  private Long conversionTrackerTrackId = null;

  @JsonProperty("conversionTrackerName")
  private String conversionTrackerName = null;

  @JsonProperty("conversionTrackerType")
  private ConversionTrackerServiceConversionTrackerType conversionTrackerType = null;

  @JsonProperty("conversionValue")
  private String conversionValue = null;

  @JsonProperty("conversions")
  private Long conversions = null;

  @JsonProperty("excludeFromBidding")
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding = null;

  @JsonProperty("measurementPeriod")
  private Integer measurementPeriod = null;

  @JsonProperty("mostRecentConversionDate")
  private String mostRecentConversionDate = null;

  @JsonProperty("status")
  private ConversionTrackerServiceStatus status = null;

  @JsonProperty("userRevenueValue")
  private String userRevenueValue = null;

  @JsonProperty("webConversion")
  private ConversionTrackerServiceWebConversion webConversion = null;

  public ConversionTracker accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public ConversionTracker allConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> ")


  public String getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public ConversionTracker allConversions(Long allConversions) {
    this.allConversions = allConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> ")


  public Long getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(Long allConversions) {
    this.allConversions = allConversions;
  }

  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
    return this;
  }

  /**
   * Get appConversion
   * @return appConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppConversion getAppConversion() {
    return appConversion;
  }

  public void setAppConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = appConversion;
  }

  public ConversionTracker appLinkConversion(ConversionTrackerServiceAppLinkConversion appLinkConversion) {
    this.appLinkConversion = appLinkConversion;
    return this;
  }

  /**
   * Get appLinkConversion
   * @return appLinkConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppLinkConversion getAppLinkConversion() {
    return appLinkConversion;
  }

  public void setAppLinkConversion(ConversionTrackerServiceAppLinkConversion appLinkConversion) {
    this.appLinkConversion = appLinkConversion;
  }

  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceCategory getCategory() {
    return category;
  }

  public void setCategory(ConversionTrackerServiceCategory category) {
    this.category = category;
  }

  public ConversionTracker conversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    this.conversionCountingType = conversionCountingType;
    return this;
  }

  /**
   * Get conversionCountingType
   * @return conversionCountingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceConversionCountingType getConversionCountingType() {
    return conversionCountingType;
  }

  public void setConversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    this.conversionCountingType = conversionCountingType;
  }

  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> ")


  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }

  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  public ConversionTracker conversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。<br> ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTracker ID for tracking.<br> This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.</div> 
   * @return conversionTrackerTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。<br> ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTracker ID for tracking.<br> This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.</div> ")


  public Long getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }

  public void setConversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }

  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> 
   * @return conversionTrackerName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")


  public String getConversionTrackerName() {
    return conversionTrackerName;
  }

  public void setConversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }

  public ConversionTracker conversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
    return this;
  }

  /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceConversionTrackerType getConversionTrackerType() {
    return conversionTrackerType;
  }

  public void setConversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }

  public ConversionTracker conversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> ")


  public String getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }

  public ConversionTracker conversions(Long conversions) {
    this.conversions = conversions;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> ")


  public Long getConversions() {
    return conversions;
  }

  public void setConversions(Long conversions) {
    this.conversions = conversions;
  }

  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
    return this;
  }

  /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }

  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }

  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be 30.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> 
   * @return measurementPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be 30.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")


  public Integer getMeasurementPeriod() {
    return measurementPeriod;
  }

  public void setMeasurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }

  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
    return this;
  }

  /**
   * <div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> 
   * @return mostRecentConversionDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> ")


  public String getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }

  public void setMostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }

  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }

  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }

  public ConversionTracker userRevenueValue(String userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
    return this;
  }

  /**
   * <div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は0のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, Only 0 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> 
   * @return userRevenueValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は0のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, Only 0 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")


  public String getUserRevenueValue() {
    return userRevenueValue;
  }

  public void setUserRevenueValue(String userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }

  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
    return this;
  }

  /**
   * Get webConversion
   * @return webConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceWebConversion getWebConversion() {
    return webConversion;
  }

  public void setWebConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = webConversion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTracker conversionTracker = (ConversionTracker) o;
    return Objects.equals(this.accountId, conversionTracker.accountId) &&
        Objects.equals(this.allConversionValue, conversionTracker.allConversionValue) &&
        Objects.equals(this.allConversions, conversionTracker.allConversions) &&
        Objects.equals(this.appConversion, conversionTracker.appConversion) &&
        Objects.equals(this.appLinkConversion, conversionTracker.appLinkConversion) &&
        Objects.equals(this.category, conversionTracker.category) &&
        Objects.equals(this.conversionCountingType, conversionTracker.conversionCountingType) &&
        Objects.equals(this.conversionTrackerId, conversionTracker.conversionTrackerId) &&
        Objects.equals(this.conversionTrackerTrackId, conversionTracker.conversionTrackerTrackId) &&
        Objects.equals(this.conversionTrackerName, conversionTracker.conversionTrackerName) &&
        Objects.equals(this.conversionTrackerType, conversionTracker.conversionTrackerType) &&
        Objects.equals(this.conversionValue, conversionTracker.conversionValue) &&
        Objects.equals(this.conversions, conversionTracker.conversions) &&
        Objects.equals(this.excludeFromBidding, conversionTracker.excludeFromBidding) &&
        Objects.equals(this.measurementPeriod, conversionTracker.measurementPeriod) &&
        Objects.equals(this.mostRecentConversionDate, conversionTracker.mostRecentConversionDate) &&
        Objects.equals(this.status, conversionTracker.status) &&
        Objects.equals(this.userRevenueValue, conversionTracker.userRevenueValue) &&
        Objects.equals(this.webConversion, conversionTracker.webConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, allConversionValue, allConversions, appConversion, appLinkConversion, category, conversionCountingType, conversionTrackerId, conversionTrackerTrackId, conversionTrackerName, conversionTrackerType, conversionValue, conversions, excludeFromBidding, measurementPeriod, mostRecentConversionDate, status, userRevenueValue, webConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTracker {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    allConversionValue: ").append(toIndentedString(allConversionValue)).append("\n");
    sb.append("    allConversions: ").append(toIndentedString(allConversions)).append("\n");
    sb.append("    appConversion: ").append(toIndentedString(appConversion)).append("\n");
    sb.append("    appLinkConversion: ").append(toIndentedString(appLinkConversion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conversionCountingType: ").append(toIndentedString(conversionCountingType)).append("\n");
    sb.append("    conversionTrackerId: ").append(toIndentedString(conversionTrackerId)).append("\n");
    sb.append("    conversionTrackerTrackId: ").append(toIndentedString(conversionTrackerTrackId)).append("\n");
    sb.append("    conversionTrackerName: ").append(toIndentedString(conversionTrackerName)).append("\n");
    sb.append("    conversionTrackerType: ").append(toIndentedString(conversionTrackerType)).append("\n");
    sb.append("    conversionValue: ").append(toIndentedString(conversionValue)).append("\n");
    sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
    sb.append("    excludeFromBidding: ").append(toIndentedString(excludeFromBidding)).append("\n");
    sb.append("    measurementPeriod: ").append(toIndentedString(measurementPeriod)).append("\n");
    sb.append("    mostRecentConversionDate: ").append(toIndentedString(mostRecentConversionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userRevenueValue: ").append(toIndentedString(userRevenueValue)).append("\n");
    sb.append("    webConversion: ").append(toIndentedString(webConversion)).append("\n");
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
