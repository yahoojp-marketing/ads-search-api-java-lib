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
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceAdditionalAdvancedMobileUrlsオブジェクトは、追加する最終リンク先URULのリストを保持します。&lt;br&gt; ※こちらのフィールドは、現在利用できません。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceAdditionalAdvancedMobileUrls object holds the list of added Landing Page URLs.&lt;br&gt; *This field is currently unavailable.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceAdditionalAdvancedMobileUrlsオブジェクトは、追加する最終リンク先URULのリストを保持します。<br> ※こちらのフィールドは、現在利用できません。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceAdditionalAdvancedMobileUrls object holds the list of added Landing Page URLs.<br> *This field is currently unavailable.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceAdditionalAdvancedMobileUrls   {
  @JsonProperty("additionalAdvancedMobileUrl")
  @Valid
  private List<AdGroupCriterionServiceAdditionalUrl> additionalAdvancedMobileUrl = null;

  @JsonProperty("isRemove")
  private AdGroupCriterionServiceIsRemove isRemove = null;

  public AdGroupCriterionServiceAdditionalAdvancedMobileUrls additionalAdvancedMobileUrl(List<AdGroupCriterionServiceAdditionalUrl> additionalAdvancedMobileUrl) {
    this.additionalAdvancedMobileUrl = additionalAdvancedMobileUrl;
    return this;
  }

  public AdGroupCriterionServiceAdditionalAdvancedMobileUrls addAdditionalAdvancedMobileUrlItem(AdGroupCriterionServiceAdditionalUrl additionalAdvancedMobileUrlItem) {
    if (this.additionalAdvancedMobileUrl == null) {
      this.additionalAdvancedMobileUrl = new ArrayList<>();
    }
    this.additionalAdvancedMobileUrl.add(additionalAdvancedMobileUrlItem);
    return this;
  }

  /**
   * Get additionalAdvancedMobileUrl
   * @return additionalAdvancedMobileUrl
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupCriterionServiceAdditionalUrl> getAdditionalAdvancedMobileUrl() {
    return additionalAdvancedMobileUrl;
  }

  public void setAdditionalAdvancedMobileUrl(List<AdGroupCriterionServiceAdditionalUrl> additionalAdvancedMobileUrl) {
    this.additionalAdvancedMobileUrl = additionalAdvancedMobileUrl;
  }

  public AdGroupCriterionServiceAdditionalAdvancedMobileUrls isRemove(AdGroupCriterionServiceIsRemove isRemove) {
    this.isRemove = isRemove;
    return this;
  }

  /**
   * Get isRemove
   * @return isRemove
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceIsRemove getIsRemove() {
    return isRemove;
  }

  public void setIsRemove(AdGroupCriterionServiceIsRemove isRemove) {
    this.isRemove = isRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceAdditionalAdvancedMobileUrls adGroupCriterionServiceAdditionalAdvancedMobileUrls = (AdGroupCriterionServiceAdditionalAdvancedMobileUrls) o;
    return Objects.equals(this.additionalAdvancedMobileUrl, adGroupCriterionServiceAdditionalAdvancedMobileUrls.additionalAdvancedMobileUrl) &&
        Objects.equals(this.isRemove, adGroupCriterionServiceAdditionalAdvancedMobileUrls.isRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalAdvancedMobileUrl, isRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceAdditionalAdvancedMobileUrls {\n");
    
    sb.append("    additionalAdvancedMobileUrl: ").append(toIndentedString(additionalAdvancedMobileUrl)).append("\n");
    sb.append("    isRemove: ").append(toIndentedString(isRemove)).append("\n");
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

