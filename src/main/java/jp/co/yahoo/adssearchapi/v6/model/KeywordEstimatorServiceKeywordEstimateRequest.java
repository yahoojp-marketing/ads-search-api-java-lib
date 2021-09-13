package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.KeywordEstimatorServiceEstimateKeyword;
import jp.co.yahoo.adssearchapi.v6.model.KeywordEstimatorServiceIsNegativeBool;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeywordEstimatorServiceKeywordEstimateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceKeywordEstimateRequest   {
  @JsonProperty("estimateKeyword")
  private KeywordEstimatorServiceEstimateKeyword estimateKeyword = null;

  @JsonProperty("isNegativeBool")
  private KeywordEstimatorServiceIsNegativeBool isNegativeBool = null;

  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  public KeywordEstimatorServiceKeywordEstimateRequest estimateKeyword(KeywordEstimatorServiceEstimateKeyword estimateKeyword) {
    this.estimateKeyword = estimateKeyword;
    return this;
  }

  /**
   * Get estimateKeyword
   * @return estimateKeyword
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordEstimatorServiceEstimateKeyword getEstimateKeyword() {
    return estimateKeyword;
  }

  public void setEstimateKeyword(KeywordEstimatorServiceEstimateKeyword estimateKeyword) {
    this.estimateKeyword = estimateKeyword;
  }

  public KeywordEstimatorServiceKeywordEstimateRequest isNegativeBool(KeywordEstimatorServiceIsNegativeBool isNegativeBool) {
    this.isNegativeBool = isNegativeBool;
    return this;
  }

  /**
   * Get isNegativeBool
   * @return isNegativeBool
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordEstimatorServiceIsNegativeBool getIsNegativeBool() {
    return isNegativeBool;
  }

  public void setIsNegativeBool(KeywordEstimatorServiceIsNegativeBool isNegativeBool) {
    this.isNegativeBool = isNegativeBool;
  }

  public KeywordEstimatorServiceKeywordEstimateRequest maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">maxCpc for the keyword</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">maxCpc for the keyword</div> ")


  public Long getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceKeywordEstimateRequest keywordEstimatorServiceKeywordEstimateRequest = (KeywordEstimatorServiceKeywordEstimateRequest) o;
    return Objects.equals(this.estimateKeyword, keywordEstimatorServiceKeywordEstimateRequest.estimateKeyword) &&
        Objects.equals(this.isNegativeBool, keywordEstimatorServiceKeywordEstimateRequest.isNegativeBool) &&
        Objects.equals(this.maxCpc, keywordEstimatorServiceKeywordEstimateRequest.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateKeyword, isNegativeBool, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceKeywordEstimateRequest {\n");
    
    sb.append("    estimateKeyword: ").append(toIndentedString(estimateKeyword)).append("\n");
    sb.append("    isNegativeBool: ").append(toIndentedString(isNegativeBool)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

