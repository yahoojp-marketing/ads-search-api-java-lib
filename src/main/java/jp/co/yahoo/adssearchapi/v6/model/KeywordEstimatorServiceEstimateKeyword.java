package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.KeywordEstimatorServiceKeywordMatchType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordEstimatorServiceEstimateKeyword オブジェクトは、見積もりのリクエストを格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordEstimatorServiceEstimateKeyword object is a container for the estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordEstimatorServiceEstimateKeyword オブジェクトは、見積もりのリクエストを格納するコンテナです。</div> <div lang=\"en\">KeywordEstimatorServiceEstimateKeyword object is a container for the estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordEstimatorServiceEstimateKeyword   {
  @JsonProperty("keywordMatchType")
  private KeywordEstimatorServiceKeywordMatchType keywordMatchType = null;

  @JsonProperty("text")
  private String text = null;

  public KeywordEstimatorServiceEstimateKeyword keywordMatchType(KeywordEstimatorServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordEstimatorServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(KeywordEstimatorServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public KeywordEstimatorServiceEstimateKeyword text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords</div> 
   * @return text
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">キーワードです。</div> <div lang=\"en\">Keywords</div> ")
  @NotNull


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordEstimatorServiceEstimateKeyword keywordEstimatorServiceEstimateKeyword = (KeywordEstimatorServiceEstimateKeyword) o;
    return Objects.equals(this.keywordMatchType, keywordEstimatorServiceEstimateKeyword.keywordMatchType) &&
        Objects.equals(this.text, keywordEstimatorServiceEstimateKeyword.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordMatchType, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordEstimatorServiceEstimateKeyword {\n");
    
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

