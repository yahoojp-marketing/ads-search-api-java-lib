package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.DictionaryServiceAppLinkVendor;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAppLinkVendorValueオブジェクトは、 操作結果を含むアプリ計測ベンダー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAppLinkVendorValue object is a container for App measurement vendor information includes operation results.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAppLinkVendorValueオブジェクトは、 操作結果を含むアプリ計測ベンダー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAppLinkVendorValue object is a container for App measurement vendor information includes operation results.</div> ")

public class DictionaryServiceAppLinkVendorValue   {
  @JsonProperty("appLinkVendor")
  private JsonNullable<DictionaryServiceAppLinkVendor> appLinkVendor = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public DictionaryServiceAppLinkVendorValue appLinkVendor(DictionaryServiceAppLinkVendor appLinkVendor) {
    this.appLinkVendor = JsonNullable.of(appLinkVendor);
    return this;
  }

  /**
   * Get appLinkVendor
   * @return appLinkVendor
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<DictionaryServiceAppLinkVendor> getAppLinkVendor() {
    return appLinkVendor;
  }

  public void setAppLinkVendor(JsonNullable<DictionaryServiceAppLinkVendor> appLinkVendor) {
    this.appLinkVendor = appLinkVendor;
  }

  public DictionaryServiceAppLinkVendorValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public DictionaryServiceAppLinkVendorValue addErrorsItem(Error errorsItem) {
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

  public DictionaryServiceAppLinkVendorValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


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
    DictionaryServiceAppLinkVendorValue dictionaryServiceAppLinkVendorValue = (DictionaryServiceAppLinkVendorValue) o;
    return Objects.equals(this.appLinkVendor, dictionaryServiceAppLinkVendorValue.appLinkVendor) &&
        Objects.equals(this.errors, dictionaryServiceAppLinkVendorValue.errors) &&
        Objects.equals(this.operationSucceeded, dictionaryServiceAppLinkVendorValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLinkVendor, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAppLinkVendorValue {\n");
    
    sb.append("    appLinkVendor: ").append(toIndentedString(appLinkVendor)).append("\n");
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

