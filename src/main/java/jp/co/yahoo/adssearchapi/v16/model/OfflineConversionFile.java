/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v16/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v16.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v16.model.OfflineConversionServiceProcessStatus;
import jp.co.yahoo.adssearchapi.v16.model.OfflineConversionServiceUploadSourceType;
import jp.co.yahoo.adssearchapi.v16.model.OfflineConversionServiceUploadType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オフラインコンバージョンデータをアップロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This object contains contents of offline conversion information for upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">オフラインコンバージョンデータをアップロードする処理内容を格納します。</div> <div lang=\"en\">This object contains contents of offline conversion information for upload.</div> ")
@JsonPropertyOrder({
  OfflineConversionFile.JSON_PROPERTY_ACCOUNT_ID,
  OfflineConversionFile.JSON_PROPERTY_UPLOAD_ID,
  OfflineConversionFile.JSON_PROPERTY_UPLOAD_FILE_NAME,
  OfflineConversionFile.JSON_PROPERTY_UPLOAD_TYPE,
  OfflineConversionFile.JSON_PROPERTY_UPLOADED_DATE,
  OfflineConversionFile.JSON_PROPERTY_UPLOAD_SOURCE_TYPE,
  OfflineConversionFile.JSON_PROPERTY_PROCESS_STATUS
})
@JsonTypeName("OfflineConversionFile")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OfflineConversionFile {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_UPLOAD_ID = "uploadId";
  private Long uploadId;

  public static final String JSON_PROPERTY_UPLOAD_FILE_NAME = "uploadFileName";
  private String uploadFileName;

  public static final String JSON_PROPERTY_UPLOAD_TYPE = "uploadType";
  private OfflineConversionServiceUploadType uploadType;

  public static final String JSON_PROPERTY_UPLOADED_DATE = "uploadedDate";
  private String uploadedDate;

  public static final String JSON_PROPERTY_UPLOAD_SOURCE_TYPE = "uploadSourceType";
  private OfflineConversionServiceUploadSourceType uploadSourceType;

  public static final String JSON_PROPERTY_PROCESS_STATUS = "processStatus";
  private OfflineConversionServiceProcessStatus processStatus;

  public OfflineConversionFile() { 
  }

  public OfflineConversionFile accountId(Long accountId) {
    
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


  public OfflineConversionFile uploadId(Long uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload ID.&lt;/div&gt; 
   * @return uploadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUploadId() {
    return uploadId;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }


  public OfflineConversionFile uploadFileName(String uploadFileName) {
    
    this.uploadFileName = uploadFileName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロードファイル名です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload file name.&lt;/div&gt; 
   * @return uploadFileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOAD_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadFileName() {
    return uploadFileName;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
  }


  public OfflineConversionFile uploadType(OfflineConversionServiceUploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineConversionServiceUploadType getUploadType() {
    return uploadType;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadType(OfflineConversionServiceUploadType uploadType) {
    this.uploadType = uploadType;
  }


  public OfflineConversionFile uploadedDate(String uploadedDate) {
    
    this.uploadedDate = uploadedDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アップロード日時です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Upload date and time.&lt;/div&gt; 
   * @return uploadedDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> ")
  @JsonProperty(JSON_PROPERTY_UPLOADED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadedDate() {
    return uploadedDate;
  }


  @JsonProperty(JSON_PROPERTY_UPLOADED_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadedDate(String uploadedDate) {
    this.uploadedDate = uploadedDate;
  }


  public OfflineConversionFile uploadSourceType(OfflineConversionServiceUploadSourceType uploadSourceType) {
    
    this.uploadSourceType = uploadSourceType;
    return this;
  }

   /**
   * Get uploadSourceType
   * @return uploadSourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPLOAD_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineConversionServiceUploadSourceType getUploadSourceType() {
    return uploadSourceType;
  }


  @JsonProperty(JSON_PROPERTY_UPLOAD_SOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUploadSourceType(OfflineConversionServiceUploadSourceType uploadSourceType) {
    this.uploadSourceType = uploadSourceType;
  }


  public OfflineConversionFile processStatus(OfflineConversionServiceProcessStatus processStatus) {
    
    this.processStatus = processStatus;
    return this;
  }

   /**
   * Get processStatus
   * @return processStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROCESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OfflineConversionServiceProcessStatus getProcessStatus() {
    return processStatus;
  }


  @JsonProperty(JSON_PROPERTY_PROCESS_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcessStatus(OfflineConversionServiceProcessStatus processStatus) {
    this.processStatus = processStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionFile offlineConversionFile = (OfflineConversionFile) o;
    return Objects.equals(this.accountId, offlineConversionFile.accountId) &&
        Objects.equals(this.uploadId, offlineConversionFile.uploadId) &&
        Objects.equals(this.uploadFileName, offlineConversionFile.uploadFileName) &&
        Objects.equals(this.uploadType, offlineConversionFile.uploadType) &&
        Objects.equals(this.uploadedDate, offlineConversionFile.uploadedDate) &&
        Objects.equals(this.uploadSourceType, offlineConversionFile.uploadSourceType) &&
        Objects.equals(this.processStatus, offlineConversionFile.processStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, uploadId, uploadFileName, uploadType, uploadedDate, uploadSourceType, processStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionFile {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    uploadFileName: ").append(toIndentedString(uploadFileName)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
    sb.append("    uploadSourceType: ").append(toIndentedString(uploadSourceType)).append("\n");
    sb.append("    processStatus: ").append(toIndentedString(processStatus)).append("\n");
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

