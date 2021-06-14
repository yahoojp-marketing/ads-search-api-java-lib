package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.PageFeedItemServiceReviewSummaryValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;PageFeedItemServiceReviewSummaryPageオブジェクトは、ページフィードアイテムの審査成績、状況サマリー取得結果をリストに格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;PageFeedItemServiceReviewSummaryPage object is a container storing the examination results of the page feed item, the situation summary acquisition result in a list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">PageFeedItemServiceReviewSummaryPageオブジェクトは、ページフィードアイテムの審査成績、状況サマリー取得結果をリストに格納するコンテナです。</div> <div lang=\"en\">PageFeedItemServiceReviewSummaryPage object is a container storing the examination results of the page feed item, the situation summary acquisition result in a list.</div> ")

public class PageFeedItemServiceReviewSummaryPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private JsonNullable<List<PageFeedItemServiceReviewSummaryValue>> values = JsonNullable.undefined();

  public PageFeedItemServiceReviewSummaryPage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public PageFeedItemServiceReviewSummaryPage values(List<PageFeedItemServiceReviewSummaryValue> values) {
    this.values = JsonNullable.of(values);
    return this;
  }

  public PageFeedItemServiceReviewSummaryPage addValuesItem(PageFeedItemServiceReviewSummaryValue valuesItem) {
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

  public JsonNullable<List<PageFeedItemServiceReviewSummaryValue>> getValues() {
    return values;
  }

  public void setValues(JsonNullable<List<PageFeedItemServiceReviewSummaryValue>> values) {
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
    PageFeedItemServiceReviewSummaryPage pageFeedItemServiceReviewSummaryPage = (PageFeedItemServiceReviewSummaryPage) o;
    return Objects.equals(this.totalNumEntries, pageFeedItemServiceReviewSummaryPage.totalNumEntries) &&
        Objects.equals(this.values, pageFeedItemServiceReviewSummaryPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageFeedItemServiceReviewSummaryPage {\n");
    
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

