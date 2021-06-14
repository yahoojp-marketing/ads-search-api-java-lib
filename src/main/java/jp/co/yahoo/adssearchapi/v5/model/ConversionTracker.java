package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppLinkConversion;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceWebConversion;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker information such as ConversionTag and performance data by tag.</div> ")

public class ConversionTracker   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("allConversionValue")
  private JsonNullable<String> allConversionValue = JsonNullable.undefined();

  @JsonProperty("allConversions")
  private JsonNullable<Long> allConversions = JsonNullable.undefined();

  @JsonProperty("appConversion")
  private JsonNullable<ConversionTrackerServiceAppConversion> appConversion = JsonNullable.undefined();

  @JsonProperty("appLinkConversion")
  private JsonNullable<ConversionTrackerServiceAppLinkConversion> appLinkConversion = JsonNullable.undefined();

  @JsonProperty("category")
  private JsonNullable<ConversionTrackerServiceCategory> category = JsonNullable.undefined();

  @JsonProperty("conversionCountingType")
  private JsonNullable<ConversionTrackerServiceConversionCountingType> conversionCountingType = JsonNullable.undefined();

  @JsonProperty("conversionTrackerId")
  private JsonNullable<Long> conversionTrackerId = JsonNullable.undefined();

  @JsonProperty("conversionTrackerTrackId")
  private JsonNullable<Long> conversionTrackerTrackId = JsonNullable.undefined();

  @JsonProperty("conversionTrackerName")
  private JsonNullable<String> conversionTrackerName = JsonNullable.undefined();

  @JsonProperty("conversionTrackerType")
  private JsonNullable<ConversionTrackerServiceConversionTrackerType> conversionTrackerType = JsonNullable.undefined();

  @JsonProperty("conversionValue")
  private JsonNullable<String> conversionValue = JsonNullable.undefined();

  @JsonProperty("conversions")
  private JsonNullable<Long> conversions = JsonNullable.undefined();

  @JsonProperty("excludeFromBidding")
  private JsonNullable<ConversionTrackerServiceExcludeFromBidding> excludeFromBidding = JsonNullable.undefined();

  @JsonProperty("measurementPeriod")
  private JsonNullable<Integer> measurementPeriod = JsonNullable.undefined();

  @JsonProperty("mostRecentConversionDate")
  private JsonNullable<String> mostRecentConversionDate = JsonNullable.undefined();

  @JsonProperty("status")
  private JsonNullable<ConversionTrackerServiceStatus> status = JsonNullable.undefined();

  @JsonProperty("userRevenueValue")
  private JsonNullable<String> userRevenueValue = JsonNullable.undefined();

  @JsonProperty("webConversion")
  private JsonNullable<ConversionTrackerServiceWebConversion> webConversion = JsonNullable.undefined();

  public ConversionTracker accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public ConversionTracker allConversionValue(String allConversionValue) {
    this.allConversionValue = JsonNullable.of(allConversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> 
   * @return allConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> ")


  public JsonNullable<String> getAllConversionValue() {
    return allConversionValue;
  }

  public void setAllConversionValue(JsonNullable<String> allConversionValue) {
    this.allConversionValue = allConversionValue;
  }

  public ConversionTracker allConversions(Long allConversions) {
    this.allConversions = JsonNullable.of(allConversions);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> 
   * @return allConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> ")


  public JsonNullable<Long> getAllConversions() {
    return allConversions;
  }

  public void setAllConversions(JsonNullable<Long> allConversions) {
    this.allConversions = allConversions;
  }

  public ConversionTracker appConversion(ConversionTrackerServiceAppConversion appConversion) {
    this.appConversion = JsonNullable.of(appConversion);
    return this;
  }

  /**
   * Get appConversion
   * @return appConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppConversion> getAppConversion() {
    return appConversion;
  }

  public void setAppConversion(JsonNullable<ConversionTrackerServiceAppConversion> appConversion) {
    this.appConversion = appConversion;
  }

  public ConversionTracker appLinkConversion(ConversionTrackerServiceAppLinkConversion appLinkConversion) {
    this.appLinkConversion = JsonNullable.of(appLinkConversion);
    return this;
  }

  /**
   * Get appLinkConversion
   * @return appLinkConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppLinkConversion> getAppLinkConversion() {
    return appLinkConversion;
  }

  public void setAppLinkConversion(JsonNullable<ConversionTrackerServiceAppLinkConversion> appLinkConversion) {
    this.appLinkConversion = appLinkConversion;
  }

  public ConversionTracker category(ConversionTrackerServiceCategory category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * Get category
   * @return category
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceCategory> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<ConversionTrackerServiceCategory> category) {
    this.category = category;
  }

  public ConversionTracker conversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    this.conversionCountingType = JsonNullable.of(conversionCountingType);
    return this;
  }

  /**
   * Get conversionCountingType
   * @return conversionCountingType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceConversionCountingType> getConversionCountingType() {
    return conversionCountingType;
  }

  public void setConversionCountingType(JsonNullable<ConversionTrackerServiceConversionCountingType> conversionCountingType) {
    this.conversionCountingType = conversionCountingType;
  }

  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = JsonNullable.of(conversionTrackerId);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> 
   * @return conversionTrackerId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> ")


  public JsonNullable<Long> getConversionTrackerId() {
    return conversionTrackerId;
  }

  public void setConversionTrackerId(JsonNullable<Long> conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }

  public ConversionTracker conversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = JsonNullable.of(conversionTrackerTrackId);
    return this;
  }

  /**
   * <div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。<br> ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTracker ID for tracking.<br> This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.</div> 
   * @return conversionTrackerTrackId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。<br> ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTracker ID for tracking.<br> This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.</div> ")


  public JsonNullable<Long> getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }

  public void setConversionTrackerTrackId(JsonNullable<Long> conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }

  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    this.conversionTrackerName = JsonNullable.of(conversionTrackerName);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> 
   * @return conversionTrackerName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")


  public JsonNullable<String> getConversionTrackerName() {
    return conversionTrackerName;
  }

  public void setConversionTrackerName(JsonNullable<String> conversionTrackerName) {
    this.conversionTrackerName = conversionTrackerName;
  }

  public ConversionTracker conversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    this.conversionTrackerType = JsonNullable.of(conversionTrackerType);
    return this;
  }

  /**
   * Get conversionTrackerType
   * @return conversionTrackerType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceConversionTrackerType> getConversionTrackerType() {
    return conversionTrackerType;
  }

  public void setConversionTrackerType(JsonNullable<ConversionTrackerServiceConversionTrackerType> conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }

  public ConversionTracker conversionValue(String conversionValue) {
    this.conversionValue = JsonNullable.of(conversionValue);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> 
   * @return conversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> ")


  public JsonNullable<String> getConversionValue() {
    return conversionValue;
  }

  public void setConversionValue(JsonNullable<String> conversionValue) {
    this.conversionValue = conversionValue;
  }

  public ConversionTracker conversions(Long conversions) {
    this.conversions = JsonNullable.of(conversions);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> 
   * @return conversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> ")


  public JsonNullable<Long> getConversions() {
    return conversions;
  }

  public void setConversions(JsonNullable<Long> conversions) {
    this.conversions = conversions;
  }

  public ConversionTracker excludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = JsonNullable.of(excludeFromBidding);
    return this;
  }

  /**
   * Get excludeFromBidding
   * @return excludeFromBidding
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceExcludeFromBidding> getExcludeFromBidding() {
    return excludeFromBidding;
  }

  public void setExcludeFromBidding(JsonNullable<ConversionTrackerServiceExcludeFromBidding> excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }

  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = JsonNullable.of(measurementPeriod);
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be 30.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> 
   * @return measurementPeriod
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be 30.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")


  public JsonNullable<Integer> getMeasurementPeriod() {
    return measurementPeriod;
  }

  public void setMeasurementPeriod(JsonNullable<Integer> measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }

  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    this.mostRecentConversionDate = JsonNullable.of(mostRecentConversionDate);
    return this;
  }

  /**
   * <div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> 
   * @return mostRecentConversionDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> ")


  public JsonNullable<String> getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }

  public void setMostRecentConversionDate(JsonNullable<String> mostRecentConversionDate) {
    this.mostRecentConversionDate = mostRecentConversionDate;
  }

  public ConversionTracker status(ConversionTrackerServiceStatus status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<ConversionTrackerServiceStatus> status) {
    this.status = status;
  }

  public ConversionTracker userRevenueValue(String userRevenueValue) {
    this.userRevenueValue = JsonNullable.of(userRevenueValue);
    return this;
  }

  /**
   * <div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> *conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は指定されても無視されます。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, it will be ignored even if specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> 
   * @return userRevenueValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> *conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は指定されても無視されます。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, it will be ignored even if specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")


  public JsonNullable<String> getUserRevenueValue() {
    return userRevenueValue;
  }

  public void setUserRevenueValue(JsonNullable<String> userRevenueValue) {
    this.userRevenueValue = userRevenueValue;
  }

  public ConversionTracker webConversion(ConversionTrackerServiceWebConversion webConversion) {
    this.webConversion = JsonNullable.of(webConversion);
    return this;
  }

  /**
   * Get webConversion
   * @return webConversion
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceWebConversion> getWebConversion() {
    return webConversion;
  }

  public void setWebConversion(JsonNullable<ConversionTrackerServiceWebConversion> webConversion) {
    this.webConversion = webConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

