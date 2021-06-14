package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.FeedItemServiceValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemReturnオブジェクトは、フィードアイテムの情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemReturn contains the Feed Item information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemReturnオブジェクトは、フィードアイテムの情報を格納します。</div> <div lang=\"en\">FeedItemReturn contains the Feed Item information.</div> ")

public class FeedItemServiceReturnValue   {
  @JsonProperty("values")
  @Valid
  private JsonNullable<List<FeedItemServiceValue>> values = JsonNullable.undefined();

  public FeedItemServiceReturnValue values(List<FeedItemServiceValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public FeedItemServiceReturnValue addValuesItem(FeedItemServiceValue valuesItem) {
    if (this.values == null || !this.values.isPresent()) {
      this.values = JsonNullable.of(new ArrayList<>());
    }
    this.values.get().add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<FeedItemServiceValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<FeedItemServiceValue>> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceReturnValue feedItemServiceReturnValue = (FeedItemServiceReturnValue) o;
    return Objects.equals(this.values, feedItemServiceReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceReturnValue {\n");
    
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

