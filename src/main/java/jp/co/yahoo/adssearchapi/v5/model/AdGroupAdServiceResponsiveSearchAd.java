package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceDescriptionTextAsset;
import jp.co.yahoo.adssearchapi.v5.model.AdGroupAdServiceHeadlineTextAsset;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceResponsiveSearchAdオブジェクトは、レスポンシブ広告を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceResponsiveSearchAd object is Responsive ads.&lt;br&gt; This field is optional in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceResponsiveSearchAdオブジェクトは、レスポンシブ広告を表します。<br> ADD時、このフィールドは省略可能となります。※adTypeがRESPONSIVE_SEARCH_ADの場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceResponsiveSearchAd object is Responsive ads.<br> This field is optional in ADD operation. *If adType is RESPONSIVE_SEARCH_AD, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceResponsiveSearchAd   {
  @JsonProperty("headlines")
  @Valid
  private List<AdGroupAdServiceHeadlineTextAsset> headlines = null;

  @JsonProperty("descriptions")
  @Valid
  private List<AdGroupAdServiceDescriptionTextAsset> descriptions = null;

  @JsonProperty("path1")
  private String path1 = null;

  @JsonProperty("path2")
  private String path2 = null;

  public AdGroupAdServiceResponsiveSearchAd headlines(List<AdGroupAdServiceHeadlineTextAsset> headlines) {
    this.headlines = headlines;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addHeadlinesItem(AdGroupAdServiceHeadlineTextAsset headlinesItem) {
    if (this.headlines == null) {
      this.headlines = new ArrayList<>();
    }
    this.headlines.add(headlinesItem);
    return this;
  }

  /**
   * Get headlines
   * @return headlines
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAdServiceHeadlineTextAsset> getHeadlines() {
    return headlines;
  }

  public void setHeadlines(List<AdGroupAdServiceHeadlineTextAsset> headlines) {
    this.headlines = headlines;
  }

  public AdGroupAdServiceResponsiveSearchAd descriptions(List<AdGroupAdServiceDescriptionTextAsset> descriptions) {
    this.descriptions = descriptions;
    return this;
  }

  public AdGroupAdServiceResponsiveSearchAd addDescriptionsItem(AdGroupAdServiceDescriptionTextAsset descriptionsItem) {
    if (this.descriptions == null) {
      this.descriptions = new ArrayList<>();
    }
    this.descriptions.add(descriptionsItem);
    return this;
  }

  /**
   * Get descriptions
   * @return descriptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<AdGroupAdServiceDescriptionTextAsset> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(List<AdGroupAdServiceDescriptionTextAsset> descriptions) {
    this.descriptions = descriptions;
  }

  public AdGroupAdServiceResponsiveSearchAd path1(String path1) {
    this.path1 = path1;
    return this;
  }

  /**
   * <div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path2を指定する場合は、path1は必須です。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD operation. The default value will be null.<br>*To specify path2, path1 is required.</div> 
   * @return path1
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path2を指定する場合は、path1は必須です。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD operation. The default value will be null.<br>*To specify path2, path1 is required.</div> ")


  public String getPath1() {
    return path1;
  }

  public void setPath1(String path1) {
    this.path1 = path1;
  }

  public AdGroupAdServiceResponsiveSearchAd path2(String path2) {
    this.path2 = path2;
    return this;
  }

  /**
   * <div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path1を指定していない場合、path2は無視されます。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD operation. The default value will be null.<br>*If path1 is not specified, path2 will be ignored.</div> 
   * @return path2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動作成される表示URLを補足するパスです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。<br>※path1を指定していない場合、path2は無視されます。</div> <div lang=\"en\">The path information which complements display URL generated automatically.<br> This field is optional in ADD operation. The default value will be null.<br>*If path1 is not specified, path2 will be ignored.</div> ")


  public String getPath2() {
    return path2;
  }

  public void setPath2(String path2) {
    this.path2 = path2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceResponsiveSearchAd adGroupAdServiceResponsiveSearchAd = (AdGroupAdServiceResponsiveSearchAd) o;
    return Objects.equals(this.headlines, adGroupAdServiceResponsiveSearchAd.headlines) &&
        Objects.equals(this.descriptions, adGroupAdServiceResponsiveSearchAd.descriptions) &&
        Objects.equals(this.path1, adGroupAdServiceResponsiveSearchAd.path1) &&
        Objects.equals(this.path2, adGroupAdServiceResponsiveSearchAd.path2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headlines, descriptions, path1, path2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceResponsiveSearchAd {\n");
    
    sb.append("    headlines: ").append(toIndentedString(headlines)).append("\n");
    sb.append("    descriptions: ").append(toIndentedString(descriptions)).append("\n");
    sb.append("    path1: ").append(toIndentedString(path1)).append("\n");
    sb.append("    path2: ").append(toIndentedString(path2)).append("\n");
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

