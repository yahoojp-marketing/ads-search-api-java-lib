package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterionServiceKeywordMatchType;
import jp.co.yahoo.adssearchapi.v4.model.SharedCriterionServiceUse;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;SharedCriterionオブジェクトは、対象外キーワード情報を保持します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;SharedCriterion object holds negative keyword information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">SharedCriterionオブジェクトは、対象外キーワード情報を保持します。</div> <div lang=\"en\">SharedCriterion object holds negative keyword information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class SharedCriterion   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("criterionId")
  private Long criterionId = null;

  @JsonProperty("keywordMatchType")
  private SharedCriterionServiceKeywordMatchType keywordMatchType = null;

  @JsonProperty("sharedListId")
  private Long sharedListId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("use")
  private SharedCriterionServiceUse use = null;

  public SharedCriterion accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public SharedCriterion criterionId(Long criterionId) {
    this.criterionId = criterionId;
    return this;
  }

  /**
   * <div lang=\"ja\">クライテリオンIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in REMOVE operation.</div> 
   * @return criterionId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">クライテリオンIDです。<br> REMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Criterion ID.<br> This field is required in REMOVE operation.</div> ")


  public Long getCriterionId() {
    return criterionId;
  }

  public void setCriterionId(Long criterionId) {
    this.criterionId = criterionId;
  }

  public SharedCriterion keywordMatchType(SharedCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
    return this;
  }

  /**
   * Get keywordMatchType
   * @return keywordMatchType
  */
  @ApiModelProperty(value = "")

  @Valid

  public SharedCriterionServiceKeywordMatchType getKeywordMatchType() {
    return keywordMatchType;
  }

  public void setKeywordMatchType(SharedCriterionServiceKeywordMatchType keywordMatchType) {
    this.keywordMatchType = keywordMatchType;
  }

  public SharedCriterion sharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント共有リストIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Account shared list ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return sharedListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント共有リストIDです。<br> ADDおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Account shared list ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public Long getSharedListId() {
    return sharedListId;
  }

  public void setSharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
  }

  public SharedCriterion text(String text) {
    this.text = text;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Keyword.<br>This field is required in ADD operation.</div> 
   * @return text
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Keyword.<br>This field is required in ADD operation.</div> ")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public SharedCriterion use(SharedCriterionServiceUse use) {
    this.use = use;
    return this;
  }

  /**
   * Get use
   * @return use
  */
  @ApiModelProperty(value = "")

  @Valid

  public SharedCriterionServiceUse getUse() {
    return use;
  }

  public void setUse(SharedCriterionServiceUse use) {
    this.use = use;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

