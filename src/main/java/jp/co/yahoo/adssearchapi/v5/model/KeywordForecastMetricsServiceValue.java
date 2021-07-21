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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordForecastMetrics object contains estimate request.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordForecastMetrics オブジェクトは、見積もりリクエストを格納します。</div> <div lang=\"en\">KeywordForecastMetrics object contains estimate request.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordForecastMetricsServiceValue   {
  @JsonProperty("keywordForecastMetrics")
  private KeywordForecastMetrics keywordForecastMetrics = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public KeywordForecastMetricsServiceValue keywordForecastMetrics(KeywordForecastMetrics keywordForecastMetrics) {
    this.keywordForecastMetrics = keywordForecastMetrics;
    return this;
  }

  /**
   * Get keywordForecastMetrics
   * @return keywordForecastMetrics
  */
  @ApiModelProperty(value = "")

  @Valid

  public KeywordForecastMetrics getKeywordForecastMetrics() {
    return keywordForecastMetrics;
  }

  public void setKeywordForecastMetrics(KeywordForecastMetrics keywordForecastMetrics) {
    this.keywordForecastMetrics = keywordForecastMetrics;
  }

  public KeywordForecastMetricsServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public KeywordForecastMetricsServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public KeywordForecastMetricsServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Operation result.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

