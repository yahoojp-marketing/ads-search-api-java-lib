package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdeaServiceKeywordAndUrlSeed;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdeaServiceKeywordSeed;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdeaServiceSeedType;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdeaServiceSiteSeed;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdeaServiceUrlSeed;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceSeedオブジェクトは、キーワード候補作成条件の詳細情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceSeed object describes detailed information about related keywords creation conditions.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceSeedオブジェクトは、キーワード候補作成条件の詳細情報を表します。</div> <div lang=\"en\">KeywordPlanIdeaServiceSeed object describes detailed information about related keywords creation conditions.</div> ")

public class KeywordPlanIdeaServiceSeed   {
  @JsonProperty("keywordAndUrlSeed")
  private JsonNullable<KeywordPlanIdeaServiceKeywordAndUrlSeed> keywordAndUrlSeed = JsonNullable.undefined();

  @JsonProperty("keywordSeed")
  private JsonNullable<KeywordPlanIdeaServiceKeywordSeed> keywordSeed = JsonNullable.undefined();

  @JsonProperty("urlSeed")
  private JsonNullable<KeywordPlanIdeaServiceUrlSeed> urlSeed = JsonNullable.undefined();

  @JsonProperty("siteSeed")
  private JsonNullable<KeywordPlanIdeaServiceSiteSeed> siteSeed = JsonNullable.undefined();

  @JsonProperty("seedType")
  private JsonNullable<KeywordPlanIdeaServiceSeedType> seedType = JsonNullable.undefined();

  public KeywordPlanIdeaServiceSeed keywordAndUrlSeed(KeywordPlanIdeaServiceKeywordAndUrlSeed keywordAndUrlSeed) {
    this.keywordAndUrlSeed = JsonNullable.of(keywordAndUrlSeed);
    return this;
  }

  /**
   * Get keywordAndUrlSeed
   * @return keywordAndUrlSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordPlanIdeaServiceKeywordAndUrlSeed> getKeywordAndUrlSeed() {
    return keywordAndUrlSeed;
  }

  public void setKeywordAndUrlSeed(JsonNullable<KeywordPlanIdeaServiceKeywordAndUrlSeed> keywordAndUrlSeed) {
    this.keywordAndUrlSeed = keywordAndUrlSeed;
  }

  public KeywordPlanIdeaServiceSeed keywordSeed(KeywordPlanIdeaServiceKeywordSeed keywordSeed) {
    this.keywordSeed = JsonNullable.of(keywordSeed);
    return this;
  }

  /**
   * Get keywordSeed
   * @return keywordSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordPlanIdeaServiceKeywordSeed> getKeywordSeed() {
    return keywordSeed;
  }

  public void setKeywordSeed(JsonNullable<KeywordPlanIdeaServiceKeywordSeed> keywordSeed) {
    this.keywordSeed = keywordSeed;
  }

  public KeywordPlanIdeaServiceSeed urlSeed(KeywordPlanIdeaServiceUrlSeed urlSeed) {
    this.urlSeed = JsonNullable.of(urlSeed);
    return this;
  }

  /**
   * Get urlSeed
   * @return urlSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordPlanIdeaServiceUrlSeed> getUrlSeed() {
    return urlSeed;
  }

  public void setUrlSeed(JsonNullable<KeywordPlanIdeaServiceUrlSeed> urlSeed) {
    this.urlSeed = urlSeed;
  }

  public KeywordPlanIdeaServiceSeed siteSeed(KeywordPlanIdeaServiceSiteSeed siteSeed) {
    this.siteSeed = JsonNullable.of(siteSeed);
    return this;
  }

  /**
   * Get siteSeed
   * @return siteSeed
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordPlanIdeaServiceSiteSeed> getSiteSeed() {
    return siteSeed;
  }

  public void setSiteSeed(JsonNullable<KeywordPlanIdeaServiceSiteSeed> siteSeed) {
    this.siteSeed = siteSeed;
  }

  public KeywordPlanIdeaServiceSeed seedType(KeywordPlanIdeaServiceSeedType seedType) {
    this.seedType = JsonNullable.of(seedType);
    return this;
  }

  /**
   * Get seedType
   * @return seedType
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public JsonNullable<KeywordPlanIdeaServiceSeedType> getSeedType() {
    return seedType;
  }

  public void setSeedType(JsonNullable<KeywordPlanIdeaServiceSeedType> seedType) {
    this.seedType = seedType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

