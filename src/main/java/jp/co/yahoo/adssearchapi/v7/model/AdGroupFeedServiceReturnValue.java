package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupFeedServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupFeedServiceReturnValueオブジェクトは、FeedItem情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupFeedServiceReturnValue is a container of FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupFeedServiceReturnValueオブジェクトは、FeedItem情報を格納するコンテナです。</div> <div lang=\"en\">AdGroupFeedServiceReturnValue is a container of FeedItem information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupFeedServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<AdGroupFeedServiceValue> values = null;

  public AdGroupFeedServiceReturnValue values(List<AdGroupFeedServiceValue> values) {
    this.values = values;
    return this;
  }

  public AdGroupFeedServiceReturnValue addValuesItem(AdGroupFeedServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupFeedServiceValue> getValues() {
    return values;
  }

  public void setValues(List<AdGroupFeedServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupFeedServiceReturnValue adGroupFeedServiceReturnValue = (AdGroupFeedServiceReturnValue) o;
    return Objects.equals(this.values, adGroupFeedServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupFeedServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

