package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupAdServiceAppStore;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; AdGroupAdServiceAppAdオブジェクトは、アプリ向けの広告です。&lt;br&gt; ADD時、このフィールドは省略可能となります。※adTypeがAPP_ADの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupAdServiceAppAd object is for Mobile App ads.&lt;br&gt; This field is optional in ADD operation. *If adType is APP_AD, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\"> AdGroupAdServiceAppAdオブジェクトは、アプリ向けの広告です。<br> ADD時、このフィールドは省略可能となります。※adTypeがAPP_ADの場合は必須です。</div> <div lang=\"en\">AdGroupAdServiceAppAd object is for Mobile App ads.<br> This field is optional in ADD operation. *If adType is APP_AD, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupAdServiceAppAd   {
  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("appStore")
  private AdGroupAdServiceAppStore appStore = null;

  @JsonProperty("description2")
  private String description2 = null;

  public AdGroupAdServiceAppAd appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * <div lang=\"ja\">アプリIDです。<br> ※アプリキャンペーンの 場合、自動で設定され ます。</div> <div lang=\"en\">App ID.<br> *Automatically set for Mobile app campaign.</div> 
   * @return appId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アプリIDです。<br> ※アプリキャンペーンの 場合、自動で設定され ます。</div> <div lang=\"en\">App ID.<br> *Automatically set for Mobile app campaign.</div> ")


  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public AdGroupAdServiceAppAd appStore(AdGroupAdServiceAppStore appStore) {
    this.appStore = appStore;
    return this;
  }

  /**
   * Get appStore
   * @return appStore
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupAdServiceAppStore getAppStore() {
    return appStore;
  }

  public void setAppStore(AdGroupAdServiceAppStore appStore) {
    this.appStore = appStore;
  }

  public AdGroupAdServiceAppAd description2(String description2) {
    this.description2 = description2;
    return this;
  }

  /**
   * <div lang=\"ja\">説明文（2行目）2です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> 
   * @return description2
  */
  @ApiModelProperty(value = "<div lang=\"ja\">説明文（2行目）2です。<br> ADD時、このフィールドは必須となります。</div> <div lang=\"en\">Description2 (line2) of the ad.<br> This field is required in ADD operation.</div> ")


  public String getDescription2() {
    return description2;
  }

  public void setDescription2(String description2) {
    this.description2 = description2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupAdServiceAppAd adGroupAdServiceAppAd = (AdGroupAdServiceAppAd) o;
    return Objects.equals(this.appId, adGroupAdServiceAppAd.appId) &&
        Objects.equals(this.appStore, adGroupAdServiceAppAd.appStore) &&
        Objects.equals(this.description2, adGroupAdServiceAppAd.description2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appStore, description2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupAdServiceAppAd {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appStore: ").append(toIndentedString(appStore)).append("\n");
    sb.append("    description2: ").append(toIndentedString(description2)).append("\n");
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

