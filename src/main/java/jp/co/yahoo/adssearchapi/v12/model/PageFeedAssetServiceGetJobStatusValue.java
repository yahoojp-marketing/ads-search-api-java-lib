/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

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
import jp.co.yahoo.adssearchapi.v12.model.Error;
import jp.co.yahoo.adssearchapi.v12.model.PageFeedAssetServiceDownloadJob;
import jp.co.yahoo.adssearchapi.v12.model.PageFeedAssetServiceUploadJob;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedAssetServiceGetJobStatusValueは、upload、downloadの処理状況を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedAssetServiceGetJobStatusValue retains a container of the processing situation results (upload/download).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedAssetServiceGetJobStatusValueは、upload、downloadの処理状況を格納するコンテナです。</div> <div lang=\"en\">PageFeedAssetServiceGetJobStatusValue retains a container of the processing situation results (upload/download).</div> ")
@JsonPropertyOrder({
  PageFeedAssetServiceGetJobStatusValue.JSON_PROPERTY_DOWNLOAD_JOB,
  PageFeedAssetServiceGetJobStatusValue.JSON_PROPERTY_ERRORS,
  PageFeedAssetServiceGetJobStatusValue.JSON_PROPERTY_OPERATION_SUCCEEDED,
  PageFeedAssetServiceGetJobStatusValue.JSON_PROPERTY_UPLOAD_JOB
})
@JsonTypeName("PageFeedAssetServiceGetJobStatusValue")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PageFeedAssetServiceGetJobStatusValue {
  public static final String JSON_PROPERTY_DOWNLOAD_JOB = "downloadJob";
  private PageFeedAssetServiceDownloadJob downloadJob;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public static final String JSON_PROPERTY_UPLOAD_JOB = "uploadJob";
  private PageFeedAssetServiceUploadJob uploadJob;

  public PageFeedAssetServiceGetJobStatusValue() { 
  }

  public PageFeedAssetServiceGetJobStatusValue downloadJob(PageFeedAssetServiceDownloadJob downloadJob) {
    
    this.downloadJob = downloadJob;
    return this;
  }

   /**
   * Get downloadJob
   * @return downloadJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceDownloadJob getDownloadJob() {
    return downloadJob;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadJob(PageFeedAssetServiceDownloadJob downloadJob) {
    this.downloadJob = downloadJob;
  }


  public PageFeedAssetServiceGetJobStatusValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public PageFeedAssetServiceGetJobStatusValue addErrorsItem(Error errorsItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public PageFeedAssetServiceGetJobStatusValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")
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


  public PageFeedAssetServiceGetJobStatusValue uploadJob(PageFeedAssetServiceUploadJob uploadJob) {
    
    this.uploadJob = uploadJob;
    return this;
  }

   /**
   * Get uploadJob
   * @return uploadJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PageFeedAssetServiceUploadJob getUploadJob() {
    return uploadJob;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadJob(PageFeedAssetServiceUploadJob uploadJob) {
    this.uploadJob = uploadJob;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageFeedAssetServiceGetJobStatusValue pageFeedAssetServiceGetJobStatusValue = (PageFeedAssetServiceGetJobStatusValue) o;
    return Objects.equals(this.downloadJob, pageFeedAssetServiceGetJobStatusValue.downloadJob) &&
        Objects.equals(this.errors, pageFeedAssetServiceGetJobStatusValue.errors) &&
        Objects.equals(this.operationSucceeded, pageFeedAssetServiceGetJobStatusValue.operationSucceeded) &&
        Objects.equals(this.uploadJob, pageFeedAssetServiceGetJobStatusValue.uploadJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(downloadJob, errors, operationSucceeded, uploadJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedAssetServiceGetJobStatusValue {\n");
    sb.append("    downloadJob: ").append(toIndentedString(downloadJob)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
    sb.append("    uploadJob: ").append(toIndentedString(uploadJob)).append("\n");
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

