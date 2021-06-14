package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceProcessStatus;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceUploadSourceType;
import jp.co.yahoo.adssearchapi.v5.model.OfflineConversionServiceUploadType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オフラインコンバージョンデータをアップロードする処理内容を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;This object contains contents of offline conversion information for upload.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">オフラインコンバージョンデータをアップロードする処理内容を格納します。</div> <div lang=\"en\">This object contains contents of offline conversion information for upload.</div> ")

public class OfflineConversionFile   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("uploadId")
  private JsonNullable<Long> uploadId = JsonNullable.undefined();

  @JsonProperty("uploadFileName")
  private JsonNullable<String> uploadFileName = JsonNullable.undefined();

  @JsonProperty("uploadType")
  private JsonNullable<OfflineConversionServiceUploadType> uploadType = JsonNullable.undefined();

  @JsonProperty("uploadedDate")
  private JsonNullable<String> uploadedDate = JsonNullable.undefined();

  @JsonProperty("uploadSourceType")
  private JsonNullable<OfflineConversionServiceUploadSourceType> uploadSourceType = JsonNullable.undefined();

  @JsonProperty("processStatus")
  private JsonNullable<OfflineConversionServiceProcessStatus> processStatus = JsonNullable.undefined();

  public OfflineConversionFile accountId(Long accountId) {
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

  public OfflineConversionFile uploadId(Long uploadId) {
    this.uploadId = JsonNullable.of(uploadId);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> 
   * @return uploadId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードIDです。</div> <div lang=\"en\">Upload ID.</div> ")


  public JsonNullable<Long> getUploadId() {
    return uploadId;
  }

  public void setUploadId(JsonNullable<Long> uploadId) {
    this.uploadId = uploadId;
  }

  public OfflineConversionFile uploadFileName(String uploadFileName) {
    this.uploadFileName = JsonNullable.of(uploadFileName);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> 
   * @return uploadFileName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロードファイル名です。</div> <div lang=\"en\">Upload file name.</div> ")


  public JsonNullable<String> getUploadFileName() {
    return uploadFileName;
  }

  public void setUploadFileName(JsonNullable<String> uploadFileName) {
    this.uploadFileName = uploadFileName;
  }

  public OfflineConversionFile uploadType(OfflineConversionServiceUploadType uploadType) {
    this.uploadType = JsonNullable.of(uploadType);
    return this;
  }

  /**
   * Get uploadType
   * @return uploadType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceUploadType> getUploadType() {
    return uploadType;
  }

  public void setUploadType(JsonNullable<OfflineConversionServiceUploadType> uploadType) {
    this.uploadType = uploadType;
  }

  public OfflineConversionFile uploadedDate(String uploadedDate) {
    this.uploadedDate = JsonNullable.of(uploadedDate);
    return this;
  }

  /**
   * <div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> 
   * @return uploadedDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アップロード日時です。</div> <div lang=\"en\">Upload date and time.</div> ")


  public JsonNullable<String> getUploadedDate() {
    return uploadedDate;
  }

  public void setUploadedDate(JsonNullable<String> uploadedDate) {
    this.uploadedDate = uploadedDate;
  }

  public OfflineConversionFile uploadSourceType(OfflineConversionServiceUploadSourceType uploadSourceType) {
    this.uploadSourceType = JsonNullable.of(uploadSourceType);
    return this;
  }

  /**
   * Get uploadSourceType
   * @return uploadSourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceUploadSourceType> getUploadSourceType() {
    return uploadSourceType;
  }

  public void setUploadSourceType(JsonNullable<OfflineConversionServiceUploadSourceType> uploadSourceType) {
    this.uploadSourceType = uploadSourceType;
  }

  public OfflineConversionFile processStatus(OfflineConversionServiceProcessStatus processStatus) {
    this.processStatus = JsonNullable.of(processStatus);
    return this;
  }

  /**
   * Get processStatus
   * @return processStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<OfflineConversionServiceProcessStatus> getProcessStatus() {
    return processStatus;
  }

  public void setProcessStatus(JsonNullable<OfflineConversionServiceProcessStatus> processStatus) {
    this.processStatus = processStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

