package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v4.model.PageFeedItemServiceUploadValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PageFeedItemServiceUploadReturnValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceUploadReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<PageFeedItemServiceUploadValue> values = null;

  public PageFeedItemServiceUploadReturnValue values(List<PageFeedItemServiceUploadValue> values) {
    this.values = values;
    return this;
  }

  public PageFeedItemServiceUploadReturnValue addValuesItem(PageFeedItemServiceUploadValue valuesItem) {
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

  public List<PageFeedItemServiceUploadValue> getValues() {
    return values;
  }

  public void setValues(List<PageFeedItemServiceUploadValue> values) {
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
    PageFeedItemServiceUploadReturnValue pageFeedItemServiceUploadReturnValue = (PageFeedItemServiceUploadReturnValue) o;
    return Objects.equals(this.values, pageFeedItemServiceUploadReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceUploadReturnValue {\n");
    
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

