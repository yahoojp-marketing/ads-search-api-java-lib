package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceKeywordEstimateRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupEstimateRequestオブジェクトは、見積もりを行う広告グループを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupEstimateRequest object is a container for AdGroup to estimate.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupEstimateRequestオブジェクトは、見積もりを行う広告グループを格納するコンテナです。</div> <div lang=\"en\">AdGroupEstimateRequest object is a container for AdGroup to estimate.</div> ")

public class KeywordEstimatorServiceAdGroupEstimateRequest   {
  @JsonProperty("adGroupId")
  private JsonNullable<Long> adGroupId = JsonNullable.undefined();

  @JsonProperty("keywordEstimateRequests")
  @Valid
  private JsonNullable<List<KeywordEstimatorServiceKeywordEstimateRequest>> keywordEstimateRequests = JsonNullable.undefined();

  @JsonProperty("maxCpc")
  private JsonNullable<Long> maxCpc = JsonNullable.undefined();

  public KeywordEstimatorServiceAdGroupEstimateRequest adGroupId(Long adGroupId) {
    this.adGroupId = JsonNullable.of(adGroupId);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> ※campaignIdを指定していないとき、このフィールドを指定することはできません。</div> <div lang=\"en\">AdGroupID<br> *This field cannot be specified if campaignId is not specified.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> ※campaignIdを指定していないとき、このフィールドを指定することはできません。</div> <div lang=\"en\">AdGroupID<br> *This field cannot be specified if campaignId is not specified.</div> ")


  public JsonNullable<Long> getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(JsonNullable<Long> adGroupId) {
    this.adGroupId = adGroupId;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest keywordEstimateRequests(List<KeywordEstimatorServiceKeywordEstimateRequest> keywordEstimateRequests) {
    this.keywordEstimateRequests = JsonNullable.of(keywordEstimateRequests);
    return this;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest addKeywordEstimateRequestsItem(KeywordEstimatorServiceKeywordEstimateRequest keywordEstimateRequestsItem) {
    this.keywordEstimateRequests.get().add(keywordEstimateRequestsItem);
    return this;
  }

  /**
   * <div lang=\"ja\">見積もりを行うキーワードのコンテナです。</div> <div lang=\"en\">A container for the keywords to estimate</div> 
   * @return keywordEstimateRequests
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">見積もりを行うキーワードのコンテナです。</div> <div lang=\"en\">A container for the keywords to estimate</div> ")
  @NotNull

  @Valid
@Size(min=1,max=500) 
  public JsonNullable<List<KeywordEstimatorServiceKeywordEstimateRequest>> getKeywordEstimateRequests() {
    return keywordEstimateRequests;
  }

  public void setKeywordEstimateRequests(JsonNullable<List<KeywordEstimatorServiceKeywordEstimateRequest>> keywordEstimateRequests) {
    this.keywordEstimateRequests = keywordEstimateRequests;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest maxCpc(Long maxCpc) {
    this.maxCpc = JsonNullable.of(maxCpc);
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">Max CPC for Ad Group estimate</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">Max CPC for Ad Group estimate</div> ")


  public JsonNullable<Long> getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(JsonNullable<Long> maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceAdGroupEstimateRequest keywordEstimatorServiceAdGroupEstimateRequest = (KeywordEstimatorServiceAdGroupEstimateRequest) o;
    return Objects.equals(this.adGroupId, keywordEstimatorServiceAdGroupEstimateRequest.adGroupId) &&
        Objects.equals(this.keywordEstimateRequests, keywordEstimatorServiceAdGroupEstimateRequest.keywordEstimateRequests) &&
        Objects.equals(this.maxCpc, keywordEstimatorServiceAdGroupEstimateRequest.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, keywordEstimateRequests, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceAdGroupEstimateRequest {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    keywordEstimateRequests: ").append(toIndentedString(keywordEstimateRequests)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

