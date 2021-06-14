package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupFeedServiceList;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeedServiceValue is a container of FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupFeedServiceValue is a container of FeedItem information.</div> ")

public class AdGroupFeedServiceValue   {
  @JsonProperty("adGroupFeedList")
  private JsonNullable<AdGroupFeedServiceList> adGroupFeedList = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public AdGroupFeedServiceValue adGroupFeedList(AdGroupFeedServiceList adGroupFeedList) {
    this.adGroupFeedList = JsonNullable.of(adGroupFeedList);
    return this;
  }

  /**
   * Get adGroupFeedList
   * @return adGroupFeedList
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupFeedServiceList> getAdGroupFeedList() {
    return adGroupFeedList;
  }

  public void setAdGroupFeedList(JsonNullable<AdGroupFeedServiceList> adGroupFeedList) {
    this.adGroupFeedList = adGroupFeedList;
  }

  public AdGroupFeedServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public AdGroupFeedServiceValue addErrorsItem(Error errorsItem) {
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

  public AdGroupFeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果を表示します。</div> <div lang=\"en\">Showing operation results.</div> ")


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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

