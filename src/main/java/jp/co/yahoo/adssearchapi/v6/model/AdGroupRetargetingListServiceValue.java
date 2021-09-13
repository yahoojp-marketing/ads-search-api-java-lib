package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupRetargetingList;
import jp.co.yahoo.adssearchapi.v6.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupRetargetingListServiceValueは、広告グループレベルでのターゲットリスト設定の実行結果（1 Entity）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupRetargetingListServiceValue is an oject that holds results (one entity).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupRetargetingListServiceValueは、広告グループレベルでのターゲットリスト設定の実行結果（1 Entity）を保持するオブジェクトです。</div> <div lang=\"en\">AdGroupRetargetingListServiceValue is an oject that holds results (one entity).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupRetargetingListServiceValue   {
  @JsonProperty("adGroupRetargetingList")
  private AdGroupRetargetingList adGroupRetargetingList = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupRetargetingListServiceValue adGroupRetargetingList(AdGroupRetargetingList adGroupRetargetingList) {
    this.adGroupRetargetingList = adGroupRetargetingList;
    return this;
  }

  /**
   * Get adGroupRetargetingList
   * @return adGroupRetargetingList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupRetargetingList getAdGroupRetargetingList() {
    return adGroupRetargetingList;
  }

  public void setAdGroupRetargetingList(AdGroupRetargetingList adGroupRetargetingList) {
    this.adGroupRetargetingList = adGroupRetargetingList;
  }

  public AdGroupRetargetingListServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupRetargetingListServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupRetargetingListServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Process results.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。</div> <div lang=\"en\">Process results.</div> ")


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
    AdGroupRetargetingListServiceValue adGroupRetargetingListServiceValue = (AdGroupRetargetingListServiceValue) o;
    return Objects.equals(this.adGroupRetargetingList, adGroupRetargetingListServiceValue.adGroupRetargetingList) &&
        Objects.equals(this.errors, adGroupRetargetingListServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupRetargetingListServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupRetargetingList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupRetargetingListServiceValue {\n");
    
    sb.append("    adGroupRetargetingList: ").append(toIndentedString(adGroupRetargetingList)).append("\n");
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

