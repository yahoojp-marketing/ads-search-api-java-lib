package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AppLinkServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよびフィルタ条件を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AppLinkServiceSelector object displays information and filter criteria of conversionTracker to be operated.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AppLinkServiceSelectorオブジェクトは、操作の対象となるコンバージョントラッカーおよびフィルタ条件を指定します。</div> <div lang=\"en\">AppLinkServiceSelector object displays information and filter criteria of conversionTracker to be operated.</div> ")

public class AppLinkServiceSelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("appLinkIds")
  @Valid
  private JsonNullable<List<Long>> appLinkIds = JsonNullable.undefined();

  @JsonProperty("numberResults")
  private JsonNullable<Integer> numberResults = JsonNullable.undefined();

  @JsonProperty("startIndex")
  private JsonNullable<Integer> startIndex = JsonNullable.undefined();

  public AppLinkServiceSelector accountId(Long accountId) {
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

  public AppLinkServiceSelector appLinkIds(List<Long> appLinkIds) {
    this.appLinkIds = JsonNullable.of(appLinkIds);
    return this;
  }

  public AppLinkServiceSelector addAppLinkIdsItem(Long appLinkIdsItem) {
    if (this.appLinkIds == null || !this.appLinkIds.isPresent()) {
      this.appLinkIds = JsonNullable.of(new ArrayList<>());
    }
    this.appLinkIds.get().add(appLinkIdsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アプリリンクIDです。<br> ※指定しない場合は、フィルタ条件に すべてのアプリリンク情報が含まれます。</div> <div lang=\"en\">Search condition: App Link ID<br> * All AppLink information will return, if no id are not specified.</div> 
   * @return appLinkIds
  */
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：アプリリンクIDです。<br> ※指定しない場合は、フィルタ条件に すべてのアプリリンク情報が含まれます。</div> <div lang=\"en\">Search condition: App Link ID<br> * All AppLink information will return, if no id are not specified.</div> ")

@Size(max=1000) 
  public JsonNullable<List<Long>> getAppLinkIds() {
    return appLinkIds;
  }

  public void setAppLinkIds(JsonNullable<List<Long>> appLinkIds) {
    this.appLinkIds = appLinkIds;
  }

  public AppLinkServiceSelector numberResults(Integer numberResults) {
    this.numberResults = JsonNullable.of(numberResults);
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
  public JsonNullable<Integer> getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(JsonNullable<Integer> numberResults) {
    this.numberResults = numberResults;
  }

  public AppLinkServiceSelector startIndex(Integer startIndex) {
    this.startIndex = JsonNullable.of(startIndex);
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public JsonNullable<Integer> getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(JsonNullable<Integer> startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppLinkServiceSelector appLinkServiceSelector = (AppLinkServiceSelector) o;
    return Objects.equals(this.accountId, appLinkServiceSelector.accountId) &&
        Objects.equals(this.appLinkIds, appLinkServiceSelector.appLinkIds) &&
        Objects.equals(this.numberResults, appLinkServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, appLinkServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, appLinkIds, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppLinkServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    appLinkIds: ").append(toIndentedString(appLinkIds)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

