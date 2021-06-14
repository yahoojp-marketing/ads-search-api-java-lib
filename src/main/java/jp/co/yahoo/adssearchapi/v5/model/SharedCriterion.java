package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.SharedCriterionServiceKeywordMatchType;
import jp.co.yahoo.adssearchapi.v5.model.SharedCriterionServiceUse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionオブジェクトは、対象外キーワード情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterion object holds negative keyword information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionオブジェクトは、対象外キーワード情報を保持します。</div> <div lang=\"en\">SharedCriterion object holds negative keyword information.</div> ")

public class SharedCriterion   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("criterionId")
  private JsonNullable<Long> criterionId = JsonNullable.undefined();

  @JsonProperty("keywordMatchType")
  private JsonNullable<SharedCriterionServiceKeywordMatchType> keywordMatchType = JsonNullable.undefined();

  @JsonProperty("sharedListId")
  private JsonNullable<Long> sharedListId = JsonNullable.undefined();

  @JsonProperty("text")
  private JsonNullable<String> text = JsonNullable.undefined();

  @JsonProperty("use")
  private JsonNullable<SharedCriterionServiceUse> use = JsonNullable.undefined();

  public SharedCriterion accountId(Long accountId) {
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

  public SharedCriterion criterionId(Long criterionId) {
    this.criterionId = JsonNullable.of(criterionId);
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリオンIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in REMOVE operation.</div> 
   * @return criterionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオンIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in REMOVE operation.</div> ")


  public JsonNullable<Long> getCriterionId() {
    return criterionId;
  }

  public void setCriterionId(JsonNullable<Long> criterionId) {
    this.criterionId = criterionId;
  }

  public SharedCriterion keywordMatchType(SharedCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = JsonNullable.of(keywordMatchType);
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SharedCriterionServiceKeywordMatchType> getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(JsonNullable<SharedCriterionServiceKeywordMatchType> keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public SharedCriterion sharedListId(Long sharedListId) {
    this.sharedListId = JsonNullable.of(sharedListId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント共有リストIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Account shared list ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return sharedListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント共有リストIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Account shared list ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public JsonNullable<Long> getSharedListId() {
    return sharedListId;
  }

  public void setSharedListId(JsonNullable<Long> sharedListId) {
    this.sharedListId = sharedListId;
  }

  public SharedCriterion text(String text) {
    this.text = JsonNullable.of(text);
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Keyword.<br>This field is required in ADD operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Keyword.<br>This field is required in ADD operation.</div> ")


  public JsonNullable<String> getText() {
    return text;
  }

  public void setText(JsonNullable<String> text) {
    this.text = text;
  }

  public SharedCriterion use(SharedCriterionServiceUse use) {
    this.use = JsonNullable.of(use);
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SharedCriterionServiceUse> getUse() {
    return use;
  }

  public void setUse(JsonNullable<SharedCriterionServiceUse> use) {
    this.use = use;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedCriterion sharedCriterion = (SharedCriterion) o;
    return Objects.equals(this.accountId, sharedCriterion.accountId) &&
        Objects.equals(this.criterionId, sharedCriterion.criterionId) &&
        Objects.equals(this.keywordMatchType, sharedCriterion.keywordMatchType) &&
        Objects.equals(this.sharedListId, sharedCriterion.sharedListId) &&
        Objects.equals(this.text, sharedCriterion.text) &&
        Objects.equals(this.use, sharedCriterion.use);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, criterionId, keywordMatchType, sharedListId, text, use);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedCriterion {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    criterionId: ").append(toIndentedString(criterionId)).append("\n");
    sb.append("    keywordMatchType: ").append(toIndentedString(keywordMatchType)).append("\n");
    sb.append("    sharedListId: ").append(toIndentedString(sharedListId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    use: ").append(toIndentedString(use)).append("\n");
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

