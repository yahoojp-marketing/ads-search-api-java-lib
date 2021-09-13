package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.AdGroupFeedServiceList;
import jp.co.yahoo.adssearchapi.v4.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeedServiceValue is a container of FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupFeedServiceValue is a container of FeedItem information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupFeedServiceValue   {
  @JsonProperty("adGroupFeedList")
  private AdGroupFeedServiceList adGroupFeedList = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public AdGroupFeedServiceValue adGroupFeedList(AdGroupFeedServiceList adGroupFeedList) {
    this.adGroupFeedList = adGroupFeedList;
    return this;
  }

  /**
   * Get adGroupFeedList
   * @return adGroupFeedList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupFeedServiceList getAdGroupFeedList() {
    return adGroupFeedList;
  }

  public void setAdGroupFeedList(AdGroupFeedServiceList adGroupFeedList) {
    this.adGroupFeedList = adGroupFeedList;
  }

  public AdGroupFeedServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public AdGroupFeedServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupFeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> ")


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
    AdGroupFeedServiceValue adGroupFeedServiceValue = (AdGroupFeedServiceValue) o;
    return Objects.equals(this.adGroupFeedList, adGroupFeedServiceValue.adGroupFeedList) &&
        Objects.equals(this.errors, adGroupFeedServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, adGroupFeedServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupFeedList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupFeedServiceValue {\n");
    
    sb.append("    adGroupFeedList: ").append(toIndentedString(adGroupFeedList)).append("\n");
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

