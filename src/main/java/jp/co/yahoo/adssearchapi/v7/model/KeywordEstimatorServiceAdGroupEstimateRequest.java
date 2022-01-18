package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.KeywordEstimatorServiceKeywordEstimateRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupEstimateRequestオブジェクトは、見積もりを行う広告グループを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupEstimateRequest object is a container for AdGroup to estimate.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupEstimateRequestオブジェクトは、見積もりを行う広告グループを格納するコンテナです。</div> <div lang=\"en\">AdGroupEstimateRequest object is a container for AdGroup to estimate.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceAdGroupEstimateRequest   {
  @JsonProperty("adGroupId")
  private Long adGroupId = null;

  @JsonProperty("keywordEstimateRequests")
  @Valid
  private List<KeywordEstimatorServiceKeywordEstimateRequest> keywordEstimateRequests = new ArrayList<>();

  @JsonProperty("cpc")
  private Long cpc = null;

  public KeywordEstimatorServiceAdGroupEstimateRequest adGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループIDです。<br> ※campaignIdを指定していないとき、このフィールドを指定することはできません。</div> <div lang=\"en\">AdGroupID<br> *This field cannot be specified if campaignId is not specified.</div> 
   * @return adGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループIDです。<br> ※campaignIdを指定していないとき、このフィールドを指定することはできません。</div> <div lang=\"en\">AdGroupID<br> *This field cannot be specified if campaignId is not specified.</div> ")


  public Long getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(Long adGroupId) {
    this.adGroupId = adGroupId;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest keywordEstimateRequests(List<KeywordEstimatorServiceKeywordEstimateRequest> keywordEstimateRequests) {
    this.keywordEstimateRequests = keywordEstimateRequests;
    return this;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest addKeywordEstimateRequestsItem(KeywordEstimatorServiceKeywordEstimateRequest keywordEstimateRequestsItem) {
    if (this.keywordEstimateRequests == null) {
      this.keywordEstimateRequests = new ArrayList<>();
    }
    this.keywordEstimateRequests.add(keywordEstimateRequestsItem);
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
  public List<KeywordEstimatorServiceKeywordEstimateRequest> getKeywordEstimateRequests() {
    return keywordEstimateRequests;
  }

  public void setKeywordEstimateRequests(List<KeywordEstimatorServiceKeywordEstimateRequest> keywordEstimateRequests) {
    this.keywordEstimateRequests = keywordEstimateRequests;
  }

  public KeywordEstimatorServiceAdGroupEstimateRequest cpc(Long cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">Max CPC for Ad Group estimate</div> 
   * @return cpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">Max CPC for Ad Group estimate</div> ")


  public Long getCpc() {
    return cpc;
  }

  public void setCpc(Long cpc) {
    this.cpc = cpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceAdGroupEstimateRequest keywordEstimatorServiceAdGroupEstimateRequest = (KeywordEstimatorServiceAdGroupEstimateRequest) o;
    return Objects.equals(this.adGroupId, keywordEstimatorServiceAdGroupEstimateRequest.adGroupId) &&
        Objects.equals(this.keywordEstimateRequests, keywordEstimatorServiceAdGroupEstimateRequest.keywordEstimateRequests) &&
        Objects.equals(this.cpc, keywordEstimatorServiceAdGroupEstimateRequest.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupId, keywordEstimateRequests, cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceAdGroupEstimateRequest {\n");
    
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    keywordEstimateRequests: ").append(toIndentedString(keywordEstimateRequests)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

