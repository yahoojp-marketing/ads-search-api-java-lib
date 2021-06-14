package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;オフラインコンバージョンデータのファイルダウンロード処理を実施します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Download file of offline conversion data.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">オフラインコンバージョンデータのファイルダウンロード処理を実施します。</div> <div lang=\"en\">Download file of offline conversion data.</div> ")

public class OfflineConversionServiceDownloadSelector   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("uploadId")
  private JsonNullable<Long> uploadId = JsonNullable.undefined();

  public OfflineConversionServiceDownloadSelector accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search conditon: Account ID.</div> ")
  @NotNull


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public OfflineConversionServiceDownloadSelector uploadId(Long uploadId) {
    this.uploadId = JsonNullable.of(uploadId);
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> 
   * @return uploadId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アップロードIDです。</div> <div lang=\"en\">Search conditon: Upload ID.</div> ")
  @NotNull


  public JsonNullable<Long> getUploadId() {
    return uploadId;
  }

  public void setUploadId(JsonNullable<Long> uploadId) {
    this.uploadId = uploadId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfflineConversionServiceDownloadSelector offlineConversionServiceDownloadSelector = (OfflineConversionServiceDownloadSelector) o;
    return Objects.equals(this.accountId, offlineConversionServiceDownloadSelector.accountId) &&
        Objects.equals(this.uploadId, offlineConversionServiceDownloadSelector.uploadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, uploadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfflineConversionServiceDownloadSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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

