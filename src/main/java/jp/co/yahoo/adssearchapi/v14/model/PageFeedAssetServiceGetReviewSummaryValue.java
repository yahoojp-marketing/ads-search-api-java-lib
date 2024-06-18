/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.Error;
import jp.co.yahoo.adssearchapi.v14.model.PageFeedAssetServiceReviewSummary;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceGetReviewSummaryValueは、ページフィードアセットの審査成績、状況サマリー取得結果を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceGetReviewSummaryValue is a container storing the examination results of the page feed asset, acquisitionc result of situation summary.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  PageFeedAssetServiceGetReviewSummaryValue.JSON_PROPERTY_ERRORS,
  PageFeedAssetServiceGetReviewSummaryValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  PageFeedAssetServiceGetReviewSummaryValue.JSON_PROPERTY_REVIEW_SUMMARY
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceGetReviewSummaryValue {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_REVIEW_SUMMARY = "reviewSummary";
  private PageFeedAssetServiceReviewSummary reviewSummary;

  public PageFeedAssetServiceGetReviewSummaryValue() {
  }

  public PageFeedAssetServiceGetReviewSummaryValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public PageFeedAssetServiceGetReviewSummaryValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public PageFeedAssetServiceGetReviewSummaryValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  public PageFeedAssetServiceGetReviewSummaryValue reviewSummary(PageFeedAssetServiceReviewSummary reviewSummary) {
    
    this.reviewSummary = reviewSummary;
    return this;
  }

   /**
   * Get reviewSummary
   * @return reviewSummary
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVIEW_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceReviewSummary getReviewSummary() {
    return reviewSummary;
  }


  @JsonProperty(JSON_PROPERTY_REVIEW_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReviewSummary(PageFeedAssetServiceReviewSummary reviewSummary) {
    this.reviewSummary = reviewSummary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedAssetServiceGetReviewSummaryValue pageFeedAssetServiceGetReviewSummaryValue = (PageFeedAssetServiceGetReviewSummaryValue) o;
    return Objects.equals(this.errors, pageFeedAssetServiceGetReviewSummaryValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedAssetServiceGetReviewSummaryValue.operationSucceeded) &&
        Objects.equals(this.reviewSummary, pageFeedAssetServiceGetReviewSummaryValue.reviewSummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, operationSucceeded, reviewSummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceGetReviewSummaryValue {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    reviewSummary: ").append(toIndentedString(reviewSummary)).append("\n");
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

