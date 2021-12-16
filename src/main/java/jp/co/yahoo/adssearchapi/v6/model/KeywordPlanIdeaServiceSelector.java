package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.KeywordPlanIdeaServiceSeed;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaSelectorオブジェクトは、関連キーワードの提案条件を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Condition for related keyword suggestion.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaSelectorオブジェクトは、関連キーワードの提案条件を表します。</div> <div lang=\"en\">Condition for related keyword suggestion.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceSelector   {

  private static final String EXTRA_INFO = "jp.co.yahoo.api-ads:ads-search-api-lib:0.0.11";

  @JsonProperty("_extraInfo")
  public String get_extraInfo() {
    return EXTRA_INFO;
  }

  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("seed")
  private KeywordPlanIdeaServiceSeed seed = null;

  @JsonProperty("startIndex")
  private Integer startIndex = null;

  @JsonProperty("numberResults")
  private Integer numberResults = null;

  public KeywordPlanIdeaServiceSelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは必須となります。</div> <div lang=\"en\">Account ID.<br> This field is required.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public KeywordPlanIdeaServiceSelector seed(KeywordPlanIdeaServiceSeed seed) {
    this.seed = seed;
    return this;
  }

  /**
   * Get seed
   * @return seed
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordPlanIdeaServiceSeed getSeed() {
    return seed;
  }

  public void setSeed(KeywordPlanIdeaServiceSeed seed) {
    this.seed = seed;
  }

  public KeywordPlanIdeaServiceSelector startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> 
   * minimum: 1
   * @return startIndex
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの先頭のインデックスです。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Index of the first result to return in this page. This field must be greater than or equal to 1.</div> ")

@Min(1)
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public KeywordPlanIdeaServiceSelector numberResults(Integer numberResults) {
    this.numberResults = numberResults;
    return this;
  }

  /**
   * <div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> 
   * minimum: 1
   * maximum: 500
   * @return numberResults
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ページの最大件数です。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">Maximum number of results to return in this page. This field must be greater than or equal to 1. Also see Entity Limits per operation.</div> ")

@Min(1) @Max(500) 
  public Integer getNumberResults() {
    return numberResults;
  }

  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceSelector keywordPlanIdeaServiceSelector = (KeywordPlanIdeaServiceSelector) o;
    return Objects.equals(this.accountId, keywordPlanIdeaServiceSelector.accountId) &&
        Objects.equals(this.seed, keywordPlanIdeaServiceSelector.seed) &&
        Objects.equals(this.startIndex, keywordPlanIdeaServiceSelector.startIndex) &&
        Objects.equals(this.numberResults, keywordPlanIdeaServiceSelector.numberResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, seed, startIndex, numberResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceSelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    seed: ").append(toIndentedString(seed)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
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

