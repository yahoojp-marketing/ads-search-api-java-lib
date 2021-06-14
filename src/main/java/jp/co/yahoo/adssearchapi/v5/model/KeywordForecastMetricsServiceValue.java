package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import jp.co.yahoo.adssearchapi.v5.model.KeywordForecastMetrics;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetrics object contains estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetrics object contains estimate request.</div> ")

public class KeywordForecastMetricsServiceValue   {
  @JsonProperty("keywordForecastMetrics")
  private JsonNullable<KeywordForecastMetrics> keywordForecastMetrics = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public KeywordForecastMetricsServiceValue keywordForecastMetrics(KeywordForecastMetrics keywordForecastMetrics) {
    this.keywordForecastMetrics = JsonNullable.of(keywordForecastMetrics);
    return this;
  }

  /**
   * Get keywordForecastMetrics
   * @return keywordForecastMetrics
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<KeywordForecastMetrics> getKeywordForecastMetrics() {
    return keywordForecastMetrics;
  }

  public void setKeywordForecastMetrics(JsonNullable<KeywordForecastMetrics> keywordForecastMetrics) {
    this.keywordForecastMetrics = keywordForecastMetrics;
  }

  public KeywordForecastMetricsServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public KeywordForecastMetricsServiceValue addErrorsItem(Error errorsItem) {
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

  public KeywordForecastMetricsServiceValue operationSucceeded(Boolean operationSucceeded) {
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
    KeywordForecastMetricsServiceValue keywordForecastMetricsServiceValue = (KeywordForecastMetricsServiceValue) o;
    return Objects.equals(this.keywordForecastMetrics, keywordForecastMetricsServiceValue.keywordForecastMetrics) &&
        Objects.equals(this.errors, keywordForecastMetricsServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, keywordForecastMetricsServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordForecastMetrics, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordForecastMetricsServiceValue {\n");
    
    sb.append("    keywordForecastMetrics: ").append(toIndentedString(keywordForecastMetrics)).append("\n");
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

