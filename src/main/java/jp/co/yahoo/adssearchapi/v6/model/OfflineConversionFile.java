package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.OfflineConversionServiceProcessStatus;
import jp.co.yahoo.adssearchapi.v6.model.OfflineConversionServiceUploadSourceType;
import jp.co.yahoo.adssearchapi.v6.model.OfflineConversionServiceUploadType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オフラインコンバージョンデータをアップロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This object contains contents of offline conversion information for upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">オフラインコンバージョンデータをアップロードする処理内容を格納します。</div> <div lang=\"en\">This object contains contents of offline conversion information for upload.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class OfflineConversionFile   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("uploadId")
  private Long uploadId = null;

  @JsonProperty("uploadFileName")
  private String uploadFileName = null;

  @JsonProperty("uploadType")
  private OfflineConversionServiceUploadType uploadType = null;

  @JsonProperty("uploadedDate")
  private String uploadedDate = null;

  @JsonProperty("uploadSourceType")
  private OfflineConversionServiceUploadSourceType uploadSourceType = null;

  @JsonProperty("processStatus")
  private OfflineConversionServiceProcessStatus processStatus = null;

  public OfflineConversionFile accountId(Long accountId) {
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

  public OfflineConversionFile uploadId(Long uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> 
   * @return uploadId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> ")


  public Long getUploadId() {
    return uploadId;
  }

  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }

  public OfflineConversionFile uploadFileName(String uploadFileName) {
    this.uploadFileName = uploadFileName;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> 
   * @return uploadFileName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> ")


  public String getUploadFileName() {
    return uploadFileName;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public OfflineConversionServiceUploadType getUploadType() {
    return uploadType;
  }

  public void setUploadType(OfflineConversionServiceUploadType uploadType) {
    this.uploadType = uploadType;
  }

  public OfflineConversionFile uploadedDate(String uploadedDate) {
    this.uploadedDate = uploadedDate;
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> 
   * @return uploadedDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> ")


  public String getUploadedDate() {
    return uploadedDate;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public OfflineConversionServiceUploadSourceType getUploadSourceType() {
    return uploadSourceType;
  }

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
  */
  @ApiModelProperty(value = "")

  @Valid

  public OfflineConversionServiceProcessStatus getProcessStatus() {
    return processStatus;
  }

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

