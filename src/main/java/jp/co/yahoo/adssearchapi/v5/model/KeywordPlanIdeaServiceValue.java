package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import jp.co.yahoo.adssearchapi.v5.model.KeywordPlanIdea;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceValueオブジェクトは、関連キーワードを格納するコンテナの結果を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Result of the related keyword.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceValueオブジェクトは、関連キーワードを格納するコンテナの結果を表します。</div> <div lang=\"en\">Result of the related keyword.</div> ")

public class KeywordPlanIdeaServiceValue   {
  @JsonProperty("keywordPlanIdea")
  private JsonNullable<KeywordPlanIdea> keywordPlanIdea = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public KeywordPlanIdeaServiceValue keywordPlanIdea(KeywordPlanIdea keywordPlanIdea) {
    this.keywordPlanIdea = JsonNullable.of(keywordPlanIdea);
    return this;
  }

  /**
   * Get keywordPlanIdea
   * @return keywordPlanIdea
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordPlanIdea> getKeywordPlanIdea() {
    return keywordPlanIdea;
  }

  public void setKeywordPlanIdea(JsonNullable<KeywordPlanIdea> keywordPlanIdea) {
    this.keywordPlanIdea = keywordPlanIdea;
  }

  public KeywordPlanIdeaServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public KeywordPlanIdeaServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public KeywordPlanIdeaServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceValue keywordPlanIdeaServiceValue = (KeywordPlanIdeaServiceValue) o;
    return Objects.equals(this.keywordPlanIdea, keywordPlanIdeaServiceValue.keywordPlanIdea) &&
        Objects.equals(this.errors, keywordPlanIdeaServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, keywordPlanIdeaServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordPlanIdea, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceValue {\n");
    
    sb.append("    keywordPlanIdea: ").append(toIndentedString(keywordPlanIdea)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

