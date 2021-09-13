package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupAdServiceExtendedTextAdオブジェクトは、拡大テキスト広告に関する情報を表します。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがEXTENDED_TEXT_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceExtendedTextAd object describes the information of Extended Text Ad.&lt;br&gt; This field is optional in ADD operation. *If adType is EXTENDED_TEXT_AD, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupAdServiceExtendedTextAdオブジェクトは、拡大テキスト広告に関する情報を表します。<br> ADD時、このフィールドは省略可能となります。※adTypeがEXTENDED_TEXT_ADの場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceExtendedTextAd object describes the information of Extended Text Ad.<br> This field is optional in ADD operation. *If adType is EXTENDED_TEXT_AD, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceExtendedTextAd   {
  @JsonProperty("headline2")
  private String headline2 = null;

  @JsonProperty("headline3")
  private String headline3 = null;

  @JsonProperty("description2")
  private String description2 = null;

  @JsonProperty("path1")
  private String path1 = null;

  @JsonProperty("path2")
  private String path2 = null;

  public AdGroupAdServiceExtendedTextAd headline2(String headline2) {
    this.headline2 = headline2;
    return this;
  }

  /**
   * <div lang=\"ja\">2行目のタイトルです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Title on the second line.<br> This field is required in ADD operation.</div> 
   * @return headline2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">2行目のタイトルです。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Title on the second line.<br> This field is required in ADD operation.</div> ")


  public String getHeadline2() {
    return headline2;
  }

  public void setHeadline2(String headline2) {
    this.headline2 = headline2;
  }

  public AdGroupAdServiceExtendedTextAd headline3(String headline3) {
    this.headline3 = headline3;
    return this;
  }

  /**
   * <div lang=\"ja\">3行目のタイトルです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。</div> <div lang=\"en\">Title on the second line.<br> This field is optional in ADD operation. The default value will be null.</div> 
   * @return headline3
  */
  @ApiModelProperty(value = "<div lang=\"ja\">3行目のタイトルです。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。</div> <div lang=\"en\">Title on the second line.<br> This field is optional in ADD operation. The default value will be null.</div> ")


  public String getHeadline3() {
    return headline3;
  }

  public void setHeadline3(String headline3) {
    this.headline3 = headline3;
  }

  public AdGroupAdServiceExtendedTextAd description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * <div lang=\"ja\">2行目の説明文です。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。</div> <div lang=\"en\">Description on the second line.<br> This field is optional in ADD operation. The default value will be null.</div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">2行目の説明文です。<br> ADD時、このフィールドは省略可能となります。その際、デフォルト設定値はnullとなります。</div> <div lang=\"en\">Description on the second line.<br> This field is optional in ADD operation. The default value will be null.</div> ")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }

  public AdGroupAdServiceExtendedTextAd path1(String path1) {
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

  public AdGroupAdServiceExtendedTextAd path2(String path2) {
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
    AdGroupAdServiceExtendedTextAd adGroupAdServiceExtendedTextAd = (AdGroupAdServiceExtendedTextAd) o;
    return Objects.equals(this.headline2, adGroupAdServiceExtendedTextAd.headline2) &&
        Objects.equals(this.headline3, adGroupAdServiceExtendedTextAd.headline3) &&
        Objects.equals(this.description2, adGroupAdServiceExtendedTextAd.description2) &&
        Objects.equals(this.path1, adGroupAdServiceExtendedTextAd.path1) &&
        Objects.equals(this.path2, adGroupAdServiceExtendedTextAd.path2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline2, headline3, description2, path1, path2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceExtendedTextAd {\n");
    
    sb.append("    headline2: ").append(toIndentedString(headline2)).append("\n");
    sb.append("    headline3: ").append(toIndentedString(headline3)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
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

