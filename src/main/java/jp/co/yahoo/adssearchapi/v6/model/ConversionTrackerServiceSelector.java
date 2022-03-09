/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v6/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceConversionDateRange;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v6.model.ConversionTrackerServiceTrackingCodeType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよび操作を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceSelector object specifies ConversionTracker and operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよび操作を指定します。</div> <div lang=\"en\">ConversionTrackerServiceSelector object specifies ConversionTracker and operation.</div> ")
@JsonPropertyOrder({
  ConversionTrackerServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  ConversionTrackerServiceSelector.JSON_PROPERTY_APP_IDS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CATEGORIES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_COUNTING_TYPES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_DATE_RANGE,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_IDS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_CONVERSION_TRACKER_TYPES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_EXCLUDE_FROM_BIDDINGS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  ConversionTrackerServiceSelector.JSON_PROPERTY_START_INDEX,
  ConversionTrackerServiceSelector.JSON_PROPERTY_STATUSES,
  ConversionTrackerServiceSelector.JSON_PROPERTY_TRACKING_CODE_TYPES
})
@JsonTypeName("ConversionTrackerServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConversionTrackerServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_APP_IDS = "appIds";
  private List<String> appIds = null;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private List<ConversionTrackerServiceCategory> categories = null;

  public static final String JSON_PROPERTY_CONVERSION_COUNTING_TYPES = "conversionCountingTypes";
  private List<ConversionTrackerServiceConversionCountingType> conversionCountingTypes = null;

  public static final String JSON_PROPERTY_CONVERSION_DATE_RANGE = "conversionDateRange";
  private ConversionTrackerServiceConversionDateRange conversionDateRange;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_IDS = "conversionTrackerIds";
  private List<Long> conversionTrackerIds = null;

  public static final String JSON_PROPERTY_CONVERSION_TRACKER_TYPES = "conversionTrackerTypes";
  private List<ConversionTrackerServiceConversionTrackerType> conversionTrackerTypes = null;

  public static final String JSON_PROPERTY_EXCLUDE_FROM_BIDDINGS = "excludeFromBiddings";
  private List<ConversionTrackerServiceExcludeFromBidding> excludeFromBiddings = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public static final String JSON_PROPERTY_STATUSES = "statuses";
  private List<ConversionTrackerServiceStatus> statuses = null;

  public static final String JSON_PROPERTY_TRACKING_CODE_TYPES = "trackingCodeTypes";
  private List<ConversionTrackerServiceTrackingCodeType> trackingCodeTypes = null;

  public ConversionTrackerServiceSelector() { 
  }

  public ConversionTrackerServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ConversionTrackerServiceSelector appIds(List<String> appIds) {
    
    this.appIds = appIds;
    return this;
  }

  public ConversionTrackerServiceSelector addAppIdsItem(String appIdsItem) {
    if (this.appIds == null) {
      this.appIds = new ArrayList<>();
    }
    this.appIds.add(appIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;App ID.&lt;/div&gt; 
   * @return appIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">App ID.</div> ")
  @JsonProperty(JSON_PROPERTY_APP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAppIds() {
    return appIds;
  }


  @JsonProperty(JSON_PROPERTY_APP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAppIds(List<String> appIds) {
    this.appIds = appIds;
  }


  public ConversionTrackerServiceSelector categories(List<ConversionTrackerServiceCategory> categories) {
    
    this.categories = categories;
    return this;
  }

  public ConversionTrackerServiceSelector addCategoriesItem(ConversionTrackerServiceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Get categories
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceCategory> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(List<ConversionTrackerServiceCategory> categories) {
    this.categories = categories;
  }


  public ConversionTrackerServiceSelector conversionCountingTypes(List<ConversionTrackerServiceConversionCountingType> conversionCountingTypes) {
    
    this.conversionCountingTypes = conversionCountingTypes;
    return this;
  }

  public ConversionTrackerServiceSelector addConversionCountingTypesItem(ConversionTrackerServiceConversionCountingType conversionCountingTypesItem) {
    if (this.conversionCountingTypes == null) {
      this.conversionCountingTypes = new ArrayList<>();
    }
    this.conversionCountingTypes.add(conversionCountingTypesItem);
    return this;
  }

   /**
   * Get conversionCountingTypes
   * @return conversionCountingTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_COUNTING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceConversionCountingType> getConversionCountingTypes() {
    return conversionCountingTypes;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_COUNTING_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionCountingTypes(List<ConversionTrackerServiceConversionCountingType> conversionCountingTypes) {
    this.conversionCountingTypes = conversionCountingTypes;
  }


  public ConversionTrackerServiceSelector conversionDateRange(ConversionTrackerServiceConversionDateRange conversionDateRange) {
    
    this.conversionDateRange = conversionDateRange;
    return this;
  }

   /**
   * Get conversionDateRange
   * @return conversionDateRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ConversionTrackerServiceConversionDateRange getConversionDateRange() {
    return conversionDateRange;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_DATE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionDateRange(ConversionTrackerServiceConversionDateRange conversionDateRange) {
    this.conversionDateRange = conversionDateRange;
  }


  public ConversionTrackerServiceSelector conversionTrackerIds(List<Long> conversionTrackerIds) {
    
    this.conversionTrackerIds = conversionTrackerIds;
    return this;
  }

  public ConversionTrackerServiceSelector addConversionTrackerIdsItem(Long conversionTrackerIdsItem) {
    if (this.conversionTrackerIds == null) {
      this.conversionTrackerIds = new ArrayList<>();
    }
    this.conversionTrackerIds.add(conversionTrackerIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;コンバージョントラッカーIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Conversion Tracker ID.&lt;/div&gt; 
   * @return conversionTrackerIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーIDです。</div> <div lang=\"en\">Conversion Tracker ID.</div> ")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerIds(List<Long> conversionTrackerIds) {
    this.conversionTrackerIds = conversionTrackerIds;
  }


  public ConversionTrackerServiceSelector conversionTrackerTypes(List<ConversionTrackerServiceConversionTrackerType> conversionTrackerTypes) {
    
    this.conversionTrackerTypes = conversionTrackerTypes;
    return this;
  }

  public ConversionTrackerServiceSelector addConversionTrackerTypesItem(ConversionTrackerServiceConversionTrackerType conversionTrackerTypesItem) {
    if (this.conversionTrackerTypes == null) {
      this.conversionTrackerTypes = new ArrayList<>();
    }
    this.conversionTrackerTypes.add(conversionTrackerTypesItem);
    return this;
  }

   /**
   * Get conversionTrackerTypes
   * @return conversionTrackerTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceConversionTrackerType> getConversionTrackerTypes() {
    return conversionTrackerTypes;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_TRACKER_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionTrackerTypes(List<ConversionTrackerServiceConversionTrackerType> conversionTrackerTypes) {
    this.conversionTrackerTypes = conversionTrackerTypes;
  }


  public ConversionTrackerServiceSelector excludeFromBiddings(List<ConversionTrackerServiceExcludeFromBidding> excludeFromBiddings) {
    
    this.excludeFromBiddings = excludeFromBiddings;
    return this;
  }

  public ConversionTrackerServiceSelector addExcludeFromBiddingsItem(ConversionTrackerServiceExcludeFromBidding excludeFromBiddingsItem) {
    if (this.excludeFromBiddings == null) {
      this.excludeFromBiddings = new ArrayList<>();
    }
    this.excludeFromBiddings.add(excludeFromBiddingsItem);
    return this;
  }

   /**
   * Get excludeFromBiddings
   * @return excludeFromBiddings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceExcludeFromBidding> getExcludeFromBiddings() {
    return excludeFromBiddings;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_FROM_BIDDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeFromBiddings(List<ConversionTrackerServiceExcludeFromBidding> excludeFromBiddings) {
    this.excludeFromBiddings = excludeFromBiddings;
  }


  public ConversionTrackerServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの最大件数です。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.&lt;/div&gt; 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public ConversionTrackerServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Index of the first result to return in this page. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  public ConversionTrackerServiceSelector statuses(List<ConversionTrackerServiceStatus> statuses) {
    
    this.statuses = statuses;
    return this;
  }

  public ConversionTrackerServiceSelector addStatusesItem(ConversionTrackerServiceStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Get statuses
   * @return statuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceStatus> getStatuses() {
    return statuses;
  }


  @JsonProperty(JSON_PROPERTY_STATUSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatuses(List<ConversionTrackerServiceStatus> statuses) {
    this.statuses = statuses;
  }


  public ConversionTrackerServiceSelector trackingCodeTypes(List<ConversionTrackerServiceTrackingCodeType> trackingCodeTypes) {
    
    this.trackingCodeTypes = trackingCodeTypes;
    return this;
  }

  public ConversionTrackerServiceSelector addTrackingCodeTypesItem(ConversionTrackerServiceTrackingCodeType trackingCodeTypesItem) {
    if (this.trackingCodeTypes == null) {
      this.trackingCodeTypes = new ArrayList<>();
    }
    this.trackingCodeTypes.add(trackingCodeTypesItem);
    return this;
  }

   /**
   * Get trackingCodeTypes
   * @return trackingCodeTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRACKING_CODE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ConversionTrackerServiceTrackingCodeType> getTrackingCodeTypes() {
    return trackingCodeTypes;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_CODE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingCodeTypes(List<ConversionTrackerServiceTrackingCodeType> trackingCodeTypes) {
    this.trackingCodeTypes = trackingCodeTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceSelector conversionTrackerServiceSelector = (ConversionTrackerServiceSelector) o;
    return Objects.equals(this.accountId, conversionTrackerServiceSelector.accountId) &&
        Objects.equals(this.appIds, conversionTrackerServiceSelector.appIds) &&
        Objects.equals(this.categories, conversionTrackerServiceSelector.categories) &&
        Objects.equals(this.conversionCountingTypes, conversionTrackerServiceSelector.conversionCountingTypes) &&
        Objects.equals(this.conversionDateRange, conversionTrackerServiceSelector.conversionDateRange) &&
        Objects.equals(this.conversionTrackerIds, conversionTrackerServiceSelector.conversionTrackerIds) &&
        Objects.equals(this.conversionTrackerTypes, conversionTrackerServiceSelector.conversionTrackerTypes) &&
        Objects.equals(this.excludeFromBiddings, conversionTrackerServiceSelector.excludeFromBiddings) &&
        Objects.equals(this.numberResults, conversionTrackerServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, conversionTrackerServiceSelector.startIndex) &&
        Objects.equals(this.statuses, conversionTrackerServiceSelector.statuses) &&
        Objects.equals(this.trackingCodeTypes, conversionTrackerServiceSelector.trackingCodeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appIds, categories, conversionCountingTypes, conversionDateRange, conversionTrackerIds, conversionTrackerTypes, excludeFromBiddings, numberResults, startIndex, statuses, trackingCodeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appIds: ").append(toIndentedString(appIds)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    conversionCountingTypes: ").append(toIndentedString(conversionCountingTypes)).append("\n");
    sb.append("    conversionDateRange: ").append(toIndentedString(conversionDateRange)).append("\n");
    sb.append("    conversionTrackerIds: ").append(toIndentedString(conversionTrackerIds)).append("\n");
    sb.append("    conversionTrackerTypes: ").append(toIndentedString(conversionTrackerTypes)).append("\n");
    sb.append("    excludeFromBiddings: ").append(toIndentedString(excludeFromBiddings)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    trackingCodeTypes: ").append(toIndentedString(trackingCodeTypes)).append("\n");
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

