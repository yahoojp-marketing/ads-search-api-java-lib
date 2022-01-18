package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.KeywordPlanIdeaServiceKeywordAndUrlSeed;
import jp.co.yahoo.adssearchapi.v7.model.KeywordPlanIdeaServiceKeywordSeed;
import jp.co.yahoo.adssearchapi.v7.model.KeywordPlanIdeaServiceSeedType;
import jp.co.yahoo.adssearchapi.v7.model.KeywordPlanIdeaServiceSiteSeed;
import jp.co.yahoo.adssearchapi.v7.model.KeywordPlanIdeaServiceUrlSeed;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceSeedオブジェクトは、キーワード候補作成条件の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceSeed object describes detailed information about related keywords creation conditions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceSeedオブジェクトは、キーワード候補作成条件の詳細情報を表します。</div> <div lang=\"en\">KeywordPlanIdeaServiceSeed object describes detailed information about related keywords creation conditions.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceSeed   {
  @JsonProperty("keywordAndUrlSeed")
  private KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed = null;

  @JsonProperty("keywordSeed")
  private KeywordPlanIdeaServiceKeywordSeed keywordSeed = null;

  @JsonProperty("urlSeed")
  private KeywordPlanIdeaServiceUrlSeed urlSeed = null;

  @JsonProperty("siteSeed")
  private KeywordPlanIdeaServiceSiteSeed siteSeed = null;

  @JsonProperty("seedType")
  private KeywordPlanIdeaServiceSeedType seedType = null;

  public KeywordPlanIdeaServiceSeed keywordAndUrlSeed(KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed) {
    this.keywordAndUrlSeed = keywordAndUrlSeed;
    return this;
  }

  /**
   * Get keywordAndUrlSeed
   * @return keywordAndUrlSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordPlanIdeaServiceKeywordAndUrlSeed getKeywordAndUrlSeed() {
    return keywordAndUrlSeed;
  }

  public void setKeywordAndUrlSeed(KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed) {
    this.keywordAndUrlSeed = keywordAndUrlSeed;
  }

  public KeywordPlanIdeaServiceSeed keywordSeed(KeywordPlanIdeaServiceKeywordSeed keywordSeed) {
    this.keywordSeed = keywordSeed;
    return this;
  }

  /**
   * Get keywordSeed
   * @return keywordSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordPlanIdeaServiceKeywordSeed getKeywordSeed() {
    return keywordSeed;
  }

  public void setKeywordSeed(KeywordPlanIdeaServiceKeywordSeed keywordSeed) {
    this.keywordSeed = keywordSeed;
  }

  public KeywordPlanIdeaServiceSeed urlSeed(KeywordPlanIdeaServiceUrlSeed urlSeed) {
    this.urlSeed = urlSeed;
    return this;
  }

  /**
   * Get urlSeed
   * @return urlSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordPlanIdeaServiceUrlSeed getUrlSeed() {
    return urlSeed;
  }

  public void setUrlSeed(KeywordPlanIdeaServiceUrlSeed urlSeed) {
    this.urlSeed = urlSeed;
  }

  public KeywordPlanIdeaServiceSeed siteSeed(KeywordPlanIdeaServiceSiteSeed siteSeed) {
    this.siteSeed = siteSeed;
    return this;
  }

  /**
   * Get siteSeed
   * @return siteSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordPlanIdeaServiceSiteSeed getSiteSeed() {
    return siteSeed;
  }

  public void setSiteSeed(KeywordPlanIdeaServiceSiteSeed siteSeed) {
    this.siteSeed = siteSeed;
  }

  public KeywordPlanIdeaServiceSeed seedType(KeywordPlanIdeaServiceSeedType seedType) {
    this.seedType = seedType;
    return this;
  }

  /**
   * Get seedType
   * @return seedType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public KeywordPlanIdeaServiceSeedType getSeedType() {
    return seedType;
  }

  public void setSeedType(KeywordPlanIdeaServiceSeedType seedType) {
    this.seedType = seedType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceSeed keywordPlanIdeaServiceSeed = (KeywordPlanIdeaServiceSeed) o;
    return Objects.equals(this.keywordAndUrlSeed, keywordPlanIdeaServiceSeed.keywordAndUrlSeed) &&
        Objects.equals(this.keywordSeed, keywordPlanIdeaServiceSeed.keywordSeed) &&
        Objects.equals(this.urlSeed, keywordPlanIdeaServiceSeed.urlSeed) &&
        Objects.equals(this.siteSeed, keywordPlanIdeaServiceSeed.siteSeed) &&
        Objects.equals(this.seedType, keywordPlanIdeaServiceSeed.seedType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordAndUrlSeed, keywordSeed, urlSeed, siteSeed, seedType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceSeed {\n");
    
    sb.append("    keywordAndUrlSeed: ").append(toIndentedString(keywordAndUrlSeed)).append("\n");
    sb.append("    keywordSeed: ").append(toIndentedString(keywordSeed)).append("\n");
    sb.append("    urlSeed: ").append(toIndentedString(urlSeed)).append("\n");
    sb.append("    siteSeed: ").append(toIndentedString(siteSeed)).append("\n");
    sb.append("    seedType: ").append(toIndentedString(seedType)).append("\n");
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

