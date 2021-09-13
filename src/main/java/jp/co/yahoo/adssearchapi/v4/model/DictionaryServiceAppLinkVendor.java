package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAppLinkVendor オブジェクトは、 アプリ計測ベンダー情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAppLinkVendor object is a container that stores App measurement vendor information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAppLinkVendor オブジェクトは、 アプリ計測ベンダー情報を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAppLinkVendor object is a container that stores App measurement vendor information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceAppLinkVendor   {
  @JsonProperty("appVendorId")
  private String appVendorId = null;

  @JsonProperty("appVendorNameJa")
  private String appVendorNameJa = null;

  @JsonProperty("appVendorNameEn")
  private String appVendorNameEn = null;

  public DictionaryServiceAppLinkVendor appVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダーIDです。</div> <div lang=\"en\">App Vendor ID.</div> 
   * @return appVendorId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダーIDです。</div> <div lang=\"en\">App Vendor ID.</div> ")


  public String getAppVendorId() {
    return appVendorId;
  }

  public void setAppVendorId(String appVendorId) {
    this.appVendorId = appVendorId;
  }

  public DictionaryServiceAppLinkVendor appVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> 
   * @return appVendorNameJa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（日本語）です。</div> <div lang=\"en\">App Vendor Name in Japanese.</div> ")


  public String getAppVendorNameJa() {
    return appVendorNameJa;
  }

  public void setAppVendorNameJa(String appVendorNameJa) {
    this.appVendorNameJa = appVendorNameJa;
  }

  public DictionaryServiceAppLinkVendor appVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> 
   * @return appVendorNameEn
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリ計測ベンダー名（英語）です。</div> <div lang=\"en\">App Vendor Name in English.</div> ")


  public String getAppVendorNameEn() {
    return appVendorNameEn;
  }

  public void setAppVendorNameEn(String appVendorNameEn) {
    this.appVendorNameEn = appVendorNameEn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceAppLinkVendor dictionaryServiceAppLinkVendor = (DictionaryServiceAppLinkVendor) o;
    return Objects.equals(this.appVendorId, dictionaryServiceAppLinkVendor.appVendorId) &&
        Objects.equals(this.appVendorNameJa, dictionaryServiceAppLinkVendor.appVendorNameJa) &&
        Objects.equals(this.appVendorNameEn, dictionaryServiceAppLinkVendor.appVendorNameEn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appVendorId, appVendorNameJa, appVendorNameEn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAppLinkVendor {\n");
    
    sb.append("    appVendorId: ").append(toIndentedString(appVendorId)).append("\n");
    sb.append("    appVendorNameJa: ").append(toIndentedString(appVendorNameJa)).append("\n");
    sb.append("    appVendorNameEn: ").append(toIndentedString(appVendorNameEn)).append("\n");
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

