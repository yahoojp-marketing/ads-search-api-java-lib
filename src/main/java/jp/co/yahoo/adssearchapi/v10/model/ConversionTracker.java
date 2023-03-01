/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceAppConversion;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceAppLinkConversion;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v10.model.ConversionTrackerServiceWebConversion;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker object shows ConversionTracker settings such as ConversionTag and performance data by tag.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerオブジェクトは、コンバージョン測定タグやタグごとのパフォーマンスデータなどのコンバージョン設定を表します。</div> <div lang=\"en\">ConversionTracker object shows ConversionTracker settings such as ConversionTag and performance data by tag.</div> ")
@JsonPropertyOrder({
  ConversionTracker.JSON_PROPERTY_ACCOUNT_ID,
  ConversionTracker.JSON_PROPERTY_ALL_CONVERSION_VALUE,
  ConversionTracker.JSON_PROPERTY_ALL_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_APP_CONVERSION,
  ConversionTracker.JSON_PROPERTY_APP_LINK_CONVERSION,
  ConversionTracker.JSON_PROPERTY_CATEGORY,
  ConversionTracker.JSON_PROPERTY_CONVERSION_COUNTING_TYPE,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_ID,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_NAME,
  ConversionTracker.JSON_PROPERTY_CONVERSION_TRACKER_TYPE,
  ConversionTracker.JSON_PROPERTY_CONVERSION_VALUE,
  ConversionTracker.JSON_PROPERTY_CONVERSIONS,
  ConversionTracker.JSON_PROPERTY_EXCLUDE_FROM_BIDDING,
  ConversionTracker.JSON_PROPERTY_MEASUREMENT_PERIOD,
  ConversionTracker.JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE,
  ConversionTracker.JSON_PROPERTY_STATUS,
  ConversionTracker.JSON_PROPERTY_USER_REVENUE_VALUE,
  ConversionTracker.JSON_PROPERTY_WEB_CONVERSION
})
@JsonTypeName("ConversionTracker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTracker {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ALL_CONVERSION_VALUE = "allConversionValue";
  private String allConversionValue;

  public static final String JSON_PROPERTY_ALL_CONVERSIONS = "allConversions";
  private Long allConversions;

  public static final String JSON_PROPERTY_APP_CONVERSION = "appConversion";
  private ConversionTrackerServiceAppConversion appConversion;

  public static final String JSON_PROPERTY_APP_LINK_CONVERSION = "appLinkConversion";
  private ConversionTrackerServiceAppLinkConversion appLinkConversion;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private ConversionTrackerServiceCategory category;

  public static final String JSON_PROPERTY_CONVERSION_COUNTING_TYPE = "conversionCountingType";
  private ConversionTrackerServiceConversionCountingType conversionCountingType;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_ID = "conversionTrackerId";
  private Long conversionTrackerId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID = "conversionTrackerTrackId";
  private Long conversionTrackerTrackId;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_NAME = "conversionTrackerName";
  private String conversionTrackerName;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TYPE = "conversionTrackerType";
  private ConversionTrackerServiceConversionTrackerType conversionTrackerType;

  public static final String JSON_PROPERTY_CONVERSION_VALUE = "conversionValue";
  private String conversionValue;

  public static final String JSON_PROPERTY_CONVERSIONS = "conversions";
  private Long conversions;

  public static final String JSON_PROPERTY_EXCLUDE_FROM_BIDDING = "excludeFromBidding";
  private ConversionTrackerServiceExcludeFromBidding excludeFromBidding;

  public static final String JSON_PROPERTY_MEASUREMENT_PERIOD = "measurementPeriod";
  private Integer measurementPeriod;

  public static final String JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE = "mostRecentConversionDate";
  private String mostRecentConversionDate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ConversionTrackerServiceStatus status;

  public static final String JSON_PROPERTY_USER_REVENUE_VALUE = "userRevenueValue";
  private String userRevenueValue;

  public static final String JSON_PROPERTY_WEB_CONVERSION = "webConversion";
  private ConversionTrackerServiceWebConversion webConversion;

  public ConversionTracker() { 
  }

  public ConversionTracker accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ConversionTracker allConversionValue(String allConversionValue) {
    
    this.allConversionValue = allConversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total value of conversions to be included to auto bidding and to be exluded from auto bidding.&lt;/div&gt; 
   * @return allConversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値と、対象外のコンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions to be included to auto bidding and to be exluded from auto bidding.</div> ")
  @JsonProperty(JSON_PROPERTY_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAllConversionValue() {
    return allConversionValue;
  }


  @JsonProperty(JSON_PROPERTY_ALL_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllConversionValue(String allConversionValue) {
    this.allConversionValue = allConversionValue;
  }


  public ConversionTracker allConversions(Long allConversions) {
    
    this.allConversions = allConversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of conversions to be included to auto bidding and to be excluded from auto bidding.&lt;/div&gt; 
   * @return allConversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数と、対象外のコンバージョン数の合計です。</div> <div lang=\"en\">Total number of conversions to be included to auto bidding and to be excluded from auto bidding.</div> ")
  @JsonProperty(JSON_PROPERTY_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAllConversions() {
    return allConversions;
  }


  @JsonProperty(JSON_PROPERTY_ALL_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppConversion getAppConversion() {
    return appConversion;
  }


  @JsonProperty(JSON_PROPERTY_APP_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APP_LINK_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceAppLinkConversion getAppLinkConversion() {
    return appLinkConversion;
  }


  @JsonProperty(JSON_PROPERTY_APP_LINK_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceCategory getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceConversionCountingType getConversionCountingType() {
    return conversionCountingType;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_COUNTING_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionCountingType(ConversionTrackerServiceConversionCountingType conversionCountingType) {
    this.conversionCountingType = conversionCountingType;
  }


  public ConversionTracker conversionTrackerId(Long conversionTrackerId) {
    
    this.conversionTrackerId = conversionTrackerId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーのIDです。&lt;br&gt; このフィールドは、SET時に必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return conversionTrackerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーのIDです。<br> このフィールドは、SET時に必須となります。</div> <div lang=\"en\">ConversionTracker ID.<br> This field is required in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerId() {
    return conversionTrackerId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerId(Long conversionTrackerId) {
    this.conversionTrackerId = conversionTrackerId;
  }


  public ConversionTracker conversionTrackerTrackId(Long conversionTrackerTrackId) {
    
    this.conversionTrackerTrackId = conversionTrackerTrackId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;トラッキング用コンバージョントラッカーIDです。&lt;br&gt; ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker ID for tracking.&lt;br&gt; This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.&lt;/div&gt; 
   * @return conversionTrackerTrackId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">トラッキング用コンバージョントラッカーIDです。<br> ADD時、このフィールドは省略可能となります。※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合は必須です。</div> <div lang=\"en\">ConversionTracker ID for tracking.<br> This field is optional in ADD operation. *If conversionTrackerType is APP_LINK_CONVERSION, this field is required.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversionTrackerTrackId() {
    return conversionTrackerTrackId;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TRACK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerTrackId(Long conversionTrackerTrackId) {
    this.conversionTrackerTrackId = conversionTrackerTrackId;
  }


  public ConversionTracker conversionTrackerName(String conversionTrackerName) {
    
    this.conversionTrackerName = conversionTrackerName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーの名称です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTracker Name.&lt;br&gt; This field is required in ADD operation, and is optional in SET operation.&lt;/div&gt; 
   * @return conversionTrackerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーの名称です。<br> このフィールドは、ADD時に必須となり、SET時に省略可能となります。</div> <div lang=\"en\">ConversionTracker Name.<br> This field is required in ADD operation, and is optional in SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionTrackerName() {
    return conversionTrackerName;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceConversionTrackerType getConversionTrackerType() {
    return conversionTrackerType;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerType(ConversionTrackerServiceConversionTrackerType conversionTrackerType) {
    this.conversionTrackerType = conversionTrackerType;
  }


  public ConversionTracker conversionValue(String conversionValue) {
    
    this.conversionValue = conversionValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン値です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion value to be included to auto bidding.&lt;/div&gt; 
   * @return conversionValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン値です。</div> <div lang=\"en\">Conversion value to be included to auto bidding.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConversionValue() {
    return conversionValue;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionValue(String conversionValue) {
    this.conversionValue = conversionValue;
  }


  public ConversionTracker conversions(Long conversions) {
    
    this.conversions = conversions;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;自動入札設定対象のコンバージョン数です。&lt;br&gt; ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversions which counts as included to Auto Bidding setting.&lt;br&gt; countingType specifies whether one-per-click or many-per-click.&lt;/div&gt; 
   * @return conversions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定対象のコンバージョン数です。<br> ユニークコンバージョンか総コンバージョンかは、countingTypeに依存します。</div> <div lang=\"en\">Conversions which counts as included to Auto Bidding setting.<br> countingType specifies whether one-per-click or many-per-click.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getConversions() {
    return conversions;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceExcludeFromBidding getExcludeFromBidding() {
    return excludeFromBidding;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeFromBidding(ConversionTrackerServiceExcludeFromBidding excludeFromBidding) {
    this.excludeFromBidding = excludeFromBidding;
  }


  public ConversionTracker measurementPeriod(Integer measurementPeriod) {
    
    this.measurementPeriod = measurementPeriod;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョン計測期間です（単位：日)。&lt;br&gt; 7～90日間で設定可能です。&lt;br&gt;※アプリダウンロードの場合は30日間固定。&lt;br&gt; このフィールドは、ADDおよびSET時に省略可能となります。&lt;br&gt;※ADD時のデフォルト設定値は30となります。&lt;br&gt; ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。&lt;br&gt; appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Counting period of conversoins (days).&lt;br&gt;It is available between 7 to 90 days&lt;br&gt; * For Mobile App Download, this period is fixed as 30 days.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; * The default value in ADD operation will be 30.&lt;br&gt; * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.&lt;br&gt; appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.&lt;/div&gt; 
   * @return measurementPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン計測期間です（単位：日)。<br> 7～90日間で設定可能です。<br>※アプリダウンロードの場合は30日間固定。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br>※ADD時のデフォルト設定値は30となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがfirst_openの場合は30のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">Counting period of conversoins (days).<br>It is available between 7 to 90 days<br> * For Mobile App Download, this period is fixed as 30 days.<br> This field is optional in ADD and SET operation.<br> * The default value in ADD operation will be 30.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is first_open, Only 30 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")
  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMeasurementPeriod() {
    return measurementPeriod;
  }


  @JsonProperty(JSON_PROPERTY_MEASUREMENT_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeasurementPeriod(Integer measurementPeriod) {
    this.measurementPeriod = measurementPeriod;
  }


  public ConversionTracker mostRecentConversionDate(String mostRecentConversionDate) {
    
    this.mostRecentConversionDate = mostRecentConversionDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;直近のコンバージョン発生日です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The most latest date when conversion occured.&lt;/div&gt; 
   * @return mostRecentConversionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">直近のコンバージョン発生日です。</div> <div lang=\"en\">The most latest date when conversion occured.</div> ")
  @JsonProperty(JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMostRecentConversionDate() {
    return mostRecentConversionDate;
  }


  @JsonProperty(JSON_PROPERTY_MOST_RECENT_CONVERSION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ConversionTrackerServiceStatus status) {
    this.status = status;
  }


  public ConversionTracker userRevenueValue(String userRevenueValue) {
    
    this.userRevenueValue = userRevenueValue;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;このコンバージョントラッカーに対するユーザー指定の収益値です。&lt;br&gt; 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。&lt;br&gt; ADDリクエスト時に未指定の場合、0が設定されます。&lt;br&gt; このフィールドは、ADD時およびSET時に省略可能となります。&lt;br&gt; ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は0のみ指定可能となります。&lt;br&gt; appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The value of revenue of the conversion tracker specified by user.&lt;br&gt; When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.&lt;br&gt; If it is not specified on ADD request, the value &amp;#34;0&amp;#34; is set.&lt;br&gt; This field is optional in ADD and SET operation.&lt;br&gt; * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, Only 0 can be specified.&lt;br&gt; appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.&lt;/div&gt; 
   * @return userRevenueValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">このコンバージョントラッカーに対するユーザー指定の収益値です。<br> 1コンバージョンあたりの売上金額が固定値の場合、その金額を設定することで、売上金額をレポートなどで確認できます。<br> ADDリクエスト時に未指定の場合、0が設定されます。<br> このフィールドは、ADD時およびSET時に省略可能となります。<br> ※conversionTrackerTypeがAPP_LINK_CONVERSIONの場合、ADDおよびSET時にappEventTypeがin_app_purchaseの場合は0のみ指定可能となります。<br> appEventTypeはConversionTrackerService/getAppEventTypeで取得されるappEvent.appEventTypeで確認できます。</div> <div lang=\"en\">The value of revenue of the conversion tracker specified by user.<br> When the sales revenue of 1 conversion is fixed value, you are able to review the total sales on reports by specifying the amount on this item.<br> If it is not specified on ADD request, the value &#34;0&#34; is set.<br> This field is optional in ADD and SET operation.<br> * In ADD and SET operation, if conversionTrackerType is APP_LINK_CONVERSION and appEventType is in_app_purchase, Only 0 can be specified.<br> appEventType can be confirmed by appEvent.appEventType obtained by ConversionTrackerService/getAppEventType.</div> ")
  @JsonProperty(JSON_PROPERTY_USER_REVENUE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserRevenueValue() {
    return userRevenueValue;
  }


  @JsonProperty(JSON_PROPERTY_USER_REVENUE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceWebConversion getWebConversion() {
    return webConversion;
  }


  @JsonProperty(JSON_PROPERTY_WEB_CONVERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
