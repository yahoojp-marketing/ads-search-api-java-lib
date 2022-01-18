package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.ConversionTrackerServiceAppEvent;
import jp.co.yahoo.adssearchapi.v7.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServiceAppEventTypeValueオブジェクトは、アプリイベント情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServiceAppEventTypeValue object shows AppEvent information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServiceAppEventTypeValueオブジェクトは、アプリイベント情報を表します。</div> <div lang=\"en\">ConversionTrackerServiceAppEventTypeValue object shows AppEvent information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServiceAppEventTypeValue   {
  @JsonProperty("appEvent")
  private ConversionTrackerServiceAppEvent appEvent = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public ConversionTrackerServiceAppEventTypeValue appEvent(ConversionTrackerServiceAppEvent appEvent) {
    this.appEvent = appEvent;
    return this;
  }

  /**
   * Get appEvent
   * @return appEvent
  */
  @ApiModelProperty(value = "")

  @Valid

  public ConversionTrackerServiceAppEvent getAppEvent() {
    return appEvent;
  }

  public void setAppEvent(ConversionTrackerServiceAppEvent appEvent) {
    this.appEvent = appEvent;
  }

  public ConversionTrackerServiceAppEventTypeValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ConversionTrackerServiceAppEventTypeValue addErrorsItem(Error errorsItem) {
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

  public ConversionTrackerServiceAppEventTypeValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div><div lang=\"en\">Operation result</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div><div lang=\"en\">Operation result</div> ")


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
    ConversionTrackerServiceAppEventTypeValue conversionTrackerServiceAppEventTypeValue = (ConversionTrackerServiceAppEventTypeValue) o;
    return Objects.equals(this.appEvent, conversionTrackerServiceAppEventTypeValue.appEvent) &&
        Objects.equals(this.errors, conversionTrackerServiceAppEventTypeValue.errors) &&
        Objects.equals(this.operationSucceeded, conversionTrackerServiceAppEventTypeValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEvent, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppEventTypeValue {\n");
    
    sb.append("    appEvent: ").append(toIndentedString(appEvent)).append("\n");
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

