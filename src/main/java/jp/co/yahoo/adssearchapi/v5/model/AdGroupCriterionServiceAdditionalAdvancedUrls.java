package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceAdditionalUrl;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupCriterionServiceIsRemove;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceAdditionalAdvancedUrlsオブジェクトは、追加する最終リンク先URULのリストを保持します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceAdditionalAdvancedUrls object holds list of Landing Page URL to be added.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceAdditionalAdvancedUrlsオブジェクトは、追加する最終リンク先URULのリストを保持します。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceAdditionalAdvancedUrls object holds list of Landing Page URL to be added.<br> This field is optional in ADD and SET operation.</div> ")

public class AdGroupCriterionServiceAdditionalAdvancedUrls   {
  @JsonProperty("additionalAdvancedUrl")
  @Valid
  private JsonNullable<List<AdGroupCriterionServiceAdditionalUrl>> additionalAdvancedUrl = JsonNullable.undefined();

  @JsonProperty("isRemove")
  private JsonNullable<AdGroupCriterionServiceIsRemove> isRemove = JsonNullable.undefined();

  public AdGroupCriterionServiceAdditionalAdvancedUrls additionalAdvancedUrl(List<AdGroupCriterionServiceAdditionalUrl> additionalAdvancedUrl) {
    this.additionalAdvancedUrl = JsonNullable.of(additionalAdvancedUrl);
    return this;
  }

  public AdGroupCriterionServiceAdditionalAdvancedUrls addAdditionalAdvancedUrlItem(AdGroupCriterionServiceAdditionalUrl additionalAdvancedUrlItem) {
    if (this.additionalAdvancedUrl == null || !this.additionalAdvancedUrl.isPresent()) {
      this.additionalAdvancedUrl = JsonNullable.of(new ArrayList<>());
    }
    this.additionalAdvancedUrl.get().add(additionalAdvancedUrlItem);
    return this;
  }

  /**
   * Get additionalAdvancedUrl
   * @return additionalAdvancedUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<AdGroupCriterionServiceAdditionalUrl>> getAdditionalAdvancedUrl() {
    return additionalAdvancedUrl;
  }

  public void setAdditionalAdvancedUrl(JsonNullable<List<AdGroupCriterionServiceAdditionalUrl>> additionalAdvancedUrl) {
    this.additionalAdvancedUrl = additionalAdvancedUrl;
  }

  public AdGroupCriterionServiceAdditionalAdvancedUrls isRemove(AdGroupCriterionServiceIsRemove isRemove) {
    this.isRemove = JsonNullable.of(isRemove);
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AdGroupCriterionServiceIsRemove> getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(JsonNullable<AdGroupCriterionServiceIsRemove> isRemove) {
    this.isRemove = isRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceAdditionalAdvancedUrls adGroupCriterionServiceAdditionalAdvancedUrls = (AdGroupCriterionServiceAdditionalAdvancedUrls) o;
    return Objects.equals(this.additionalAdvancedUrl, adGroupCriterionServiceAdditionalAdvancedUrls.additionalAdvancedUrl) &&
        Objects.equals(this.isRemove, adGroupCriterionServiceAdditionalAdvancedUrls.isRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAdvancedUrl, isRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceAdditionalAdvancedUrls {\n");
    
    sb.append("    additionalAdvancedUrl: ").append(toIndentedString(additionalAdvancedUrl)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
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

