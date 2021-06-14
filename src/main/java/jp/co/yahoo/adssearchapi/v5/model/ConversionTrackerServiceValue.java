package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTracker;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceValue object shows ConversionTracker information includes operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceValueオブジェクトは、操作結果を含むコンバージョントラッカー情報を表します。</div> <div lang=\"en\">ConversionTrackerServiceValue object shows ConversionTracker information includes operation results.</div> ")

public class ConversionTrackerServiceValue   {
  @JsonProperty("conversionTracker")
  private JsonNullable<ConversionTracker> conversionTracker = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public ConversionTrackerServiceValue conversionTracker(ConversionTracker conversionTracker) {
    this.conversionTracker = JsonNullable.of(conversionTracker);
    return this;
  }

  /**
   * Get conversionTracker
   * @return conversionTracker
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTracker> getConversionTracker() {
    return conversionTracker;
  }

  public void setConversionTracker(JsonNullable<ConversionTracker> conversionTracker) {
    this.conversionTracker = conversionTracker;
  }

  public ConversionTrackerServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public ConversionTrackerServiceValue addErrorsItem(Error errorsItem) {
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

  public ConversionTrackerServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div><div lang=\"en\">Operation result</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div><div lang=\"en\">Operation result</div> ")


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
    ConversionTrackerServiceValue conversionTrackerServiceValue = (ConversionTrackerServiceValue) o;
    return Objects.equals(this.conversionTracker, conversionTrackerServiceValue.conversionTracker) &&
        Objects.equals(this.errors, conversionTrackerServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, conversionTrackerServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionTracker, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceValue {\n");
    
    sb.append("    conversionTracker: ").append(toIndentedString(conversionTracker)).append("\n");
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

