package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceCategory;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceConversionCountingType;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceConversionDateRange;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceConversionTrackerType;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceExcludeFromBidding;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceStatus;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceTrackingCodeType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよび操作を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceSelector object specifies ConversionTracker and operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよび操作を指定します。</div> <div lang=\"en\">ConversionTrackerServiceSelector object specifies ConversionTracker and operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.12";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("appIds")
  @Valid
  private List<String> appIds = null;

  @JsonProperty("categories")
  @Valid
  private List<ConversionTrackerServiceCategory> categories = null;

  @JsonProperty("conversionCountingTypes")
  @Valid
  private List<ConversionTrackerServiceConversionCountingType> conversionCountingTypes = null;

  @JsonProperty("conversionDateRange")
  private ConversionTrackerServiceConversionDateRange conversionDateRange = null;

  @JsonProperty("conversionTrackerIds")
  @Valid
  private List<Long> conversionTrackerIds = null;

  @JsonProperty("conversionTrackerTypes")
  @Valid
  private List<ConversionTrackerServiceConversionTrackerType> conversionTrackerTypes = null;

  @JsonProperty("excludeFromBiddings")
  @Valid
  private List<ConversionTrackerServiceExcludeFromBidding> excludeFromBiddings = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("statuses")
  @Valid
  private List<ConversionTrackerServiceStatus> statuses = null;

  @JsonProperty("trackingCodeTypes")
  @Valid
  private List<ConversionTrackerServiceTrackingCodeType> trackingCodeTypes = null;

  public ConversionTrackerServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

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
   * <div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">App ID.</div> 
   * @return appIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションIDです。</div> <div lang=\"en\">App ID.</div> ")

@Size(max=500) 
  public List<String> getAppIds() {
    return appIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=6) 
  public List<ConversionTrackerServiceCategory> getCategories() {
    return categories;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceConversionCountingType> getConversionCountingTypes() {
    return conversionCountingTypes;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceConversionDateRange getConversionDateRange() {
    return conversionDateRange;
  }

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
   * <div lang=\"ja\">コンバージョントラッカーIDです。</div> <div lang=\"en\">Conversion Tracker ID.</div> 
   * @return conversionTrackerIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョントラッカーIDです。</div> <div lang=\"en\">Conversion Tracker ID.</div> ")

@Size(max=500) 
  public List<Long> getConversionTrackerIds() {
    return conversionTrackerIds;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceConversionTrackerType> getConversionTrackerTypes() {
    return conversionTrackerTypes;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceExcludeFromBidding> getExcludeFromBiddings() {
    return excludeFromBiddings;
  }

  public void setExcludeFromBiddings(List<ConversionTrackerServiceExcludeFromBidding> excludeFromBiddings) {
    this.excludeFromBiddings = excludeFromBiddings;
  }

  public ConversionTrackerServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }

  public ConversionTrackerServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=2) 
  public List<ConversionTrackerServiceStatus> getStatuses() {
    return statuses;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid
@Size(max=3) 
  public List<ConversionTrackerServiceTrackingCodeType> getTrackingCodeTypes() {
    return trackingCodeTypes;
  }

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

