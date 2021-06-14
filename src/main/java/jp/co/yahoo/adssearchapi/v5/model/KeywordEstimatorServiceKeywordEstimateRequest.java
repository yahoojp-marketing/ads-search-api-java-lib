package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceEstimateKeyword;
import jp.co.yahoo.adssearchapi.v5.model.KeywordEstimatorServiceIsNegativeBool;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * KeywordEstimatorServiceKeywordEstimateRequest
 */

public class KeywordEstimatorServiceKeywordEstimateRequest   {
  @JsonProperty("estimateKeyword")
  private JsonNullable<KeywordEstimatorServiceEstimateKeyword> estimateKeyword = JsonNullable.undefined();

  @JsonProperty("isNegativeBool")
  private JsonNullable<KeywordEstimatorServiceIsNegativeBool> isNegativeBool = JsonNullable.undefined();

  @JsonProperty("maxCpc")
  private JsonNullable<Long> maxCpc = JsonNullable.undefined();

  public KeywordEstimatorServiceKeywordEstimateRequest estimateKeyword(KeywordEstimatorServiceEstimateKeyword estimateKeyword) {
    this.estimateKeyword = JsonNullable.of(estimateKeyword);
    return this;
  }

  /**
   * Get estimateKeyword
   * @return estimateKeyword
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<KeywordEstimatorServiceEstimateKeyword> getEstimateKeyword() {
    return estimateKeyword;
  }

  public void setEstimateKeyword(JsonNullable<KeywordEstimatorServiceEstimateKeyword> estimateKeyword) {
    this.estimateKeyword = estimateKeyword;
  }

  public KeywordEstimatorServiceKeywordEstimateRequest isNegativeBool(KeywordEstimatorServiceIsNegativeBool isNegativeBool) {
    this.isNegativeBool = JsonNullable.of(isNegativeBool);
    return this;
  }

  /**
   * Get isNegativeBool
   * @return isNegativeBool
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordEstimatorServiceIsNegativeBool> getIsNegativeBool() {
    return isNegativeBool;
  }

  public void setIsNegativeBool(JsonNullable<KeywordEstimatorServiceIsNegativeBool> isNegativeBool) {
    this.isNegativeBool = isNegativeBool;
  }

  public KeywordEstimatorServiceKeywordEstimateRequest maxCpc(Long maxCpc) {
    this.maxCpc = JsonNullable.of(maxCpc);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">maxCpc for the keyword</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの見積もりに使用する上限クリック単価です。</div> <div lang=\"en\">maxCpc for the keyword</div> ")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

