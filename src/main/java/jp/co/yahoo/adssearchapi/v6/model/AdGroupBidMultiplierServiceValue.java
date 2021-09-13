package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupBidMultiplier;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupBidMultiplierServiceValueオブジェクトは、入札価格調整率を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Container for bid multiplier.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupBidMultiplierServiceValueオブジェクトは、入札価格調整率を格納するコンテナです。</div> <div lang=\"en\">Container for bid multiplier.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupBidMultiplierServiceValue   {
  @JsonProperty("adGroupBidMultiplier")
  private AdGroupBidMultiplier adGroupBidMultiplier = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupBidMultiplierServiceValue adGroupBidMultiplier(AdGroupBidMultiplier adGroupBidMultiplier) {
    this.adGroupBidMultiplier = adGroupBidMultiplier;
    return this;
  }

  /**
   * Get adGroupBidMultiplier
   * @return adGroupBidMultiplier
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupBidMultiplier getAdGroupBidMultiplier() {
    return adGroupBidMultiplier;
  }

  public void setAdGroupBidMultiplier(AdGroupBidMultiplier adGroupBidMultiplier) {
    this.adGroupBidMultiplier = adGroupBidMultiplier;
  }

  public AdGroupBidMultiplierServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupBidMultiplierServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupBidMultiplierServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


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
    AdGroupBidMultiplierServiceValue adGroupBidMultiplierServiceValue = (AdGroupBidMultiplierServiceValue) o;
    return Objects.equals(this.adGroupBidMultiplier, adGroupBidMultiplierServiceValue.adGroupBidMultiplier) &&
        Objects.equals(this.errors, adGroupBidMultiplierServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupBidMultiplierServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupBidMultiplier, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupBidMultiplierServiceValue {\n");
    
    sb.append("    adGroupBidMultiplier: ").append(toIndentedString(adGroupBidMultiplier)).append("\n");
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

