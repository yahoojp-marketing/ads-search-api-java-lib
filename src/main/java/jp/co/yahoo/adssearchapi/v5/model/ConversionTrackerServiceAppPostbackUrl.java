package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceAppPostbackUrlClearFlag;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ポストバックURLです。&lt;br&gt; このフィールドは、いずれの場合でも省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Postback URL.&lt;br&gt; This field is optional in any cases.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ポストバックURLです。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Postback URL.<br> This field is optional in any cases.</div> ")

public class ConversionTrackerServiceAppPostbackUrl   {
  @JsonProperty("appPostbackUrlClearFlag")
  private JsonNullable<ConversionTrackerServiceAppPostbackUrlClearFlag> appPostbackUrlClearFlag = JsonNullable.undefined();

  @JsonProperty("url")
  private JsonNullable<String> url = JsonNullable.undefined();

  public ConversionTrackerServiceAppPostbackUrl appPostbackUrlClearFlag(ConversionTrackerServiceAppPostbackUrlClearFlag appPostbackUrlClearFlag) {
    this.appPostbackUrlClearFlag = JsonNullable.of(appPostbackUrlClearFlag);
    return this;
  }

  /**
   * Get appPostbackUrlClearFlag
   * @return appPostbackUrlClearFlag
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ConversionTrackerServiceAppPostbackUrlClearFlag> getAppPostbackUrlClearFlag() {
    return appPostbackUrlClearFlag;
  }

  public void setAppPostbackUrlClearFlag(JsonNullable<ConversionTrackerServiceAppPostbackUrlClearFlag> appPostbackUrlClearFlag) {
    this.appPostbackUrlClearFlag = appPostbackUrlClearFlag;
  }

  public ConversionTrackerServiceAppPostbackUrl url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * Get url
   * @return url
  */
  @ApiModelProperty(value = "")


  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServiceAppPostbackUrl conversionTrackerServiceAppPostbackUrl = (ConversionTrackerServiceAppPostbackUrl) o;
    return Objects.equals(this.appPostbackUrlClearFlag, conversionTrackerServiceAppPostbackUrl.appPostbackUrlClearFlag) &&
        Objects.equals(this.url, conversionTrackerServiceAppPostbackUrl.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appPostbackUrlClearFlag, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServiceAppPostbackUrl {\n");
    
    sb.append("    appPostbackUrlClearFlag: ").append(toIndentedString(appPostbackUrlClearFlag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

