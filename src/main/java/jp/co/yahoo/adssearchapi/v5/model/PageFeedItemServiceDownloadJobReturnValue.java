package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceDownloadJobValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceDownloadJobReturnValueは、ダウンロードの実行結果をリストに格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceDownloadJobReturnValue retains list of download result.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceDownloadJobReturnValueは、ダウンロードの実行結果をリストに格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceDownloadJobReturnValue retains list of download result.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class PageFeedItemServiceDownloadJobReturnValue   {
  @JsonProperty("values")
  @Valid
  private List<PageFeedItemServiceDownloadJobValue> values = null;

  public PageFeedItemServiceDownloadJobReturnValue values(List<PageFeedItemServiceDownloadJobValue> values) {
    this.values = values;
    return this;
  }

  public PageFeedItemServiceDownloadJobReturnValue addValuesItem(PageFeedItemServiceDownloadJobValue valuesItem) {
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

  public List<PageFeedItemServiceDownloadJobValue> getValues() {
    return values;
  }

  public void setValues(List<PageFeedItemServiceDownloadJobValue> values) {
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
    PageFeedItemServiceDownloadJobReturnValue pageFeedItemServiceDownloadJobReturnValue = (PageFeedItemServiceDownloadJobReturnValue) o;
    return Objects.equals(this.values, pageFeedItemServiceDownloadJobReturnValue.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceDownloadJobReturnValue {\n");
    
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

