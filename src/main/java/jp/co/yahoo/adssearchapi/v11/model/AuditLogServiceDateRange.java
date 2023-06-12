/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v11/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v11.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AuditLogServiceDateRangeオブジェクトは操作履歴を取得する条件、期間を示します。&lt;br&gt; このフィールドは、必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AuditLogServiceDateRange object displays the conditions and period to get Operation History.&lt;br&gt; This field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AuditLogServiceDateRangeオブジェクトは操作履歴を取得する条件、期間を示します。<br> このフィールドは、必須です。</div> <div lang=\"en\">AuditLogServiceDateRange object displays the conditions and period to get Operation History.<br> This field is required.</div> ")
@JsonPropertyOrder({
  AuditLogServiceDateRange.JSON_PROPERTY_END_DATE,
  AuditLogServiceDateRange.JSON_PROPERTY_START_DATE
})
@JsonTypeName("AuditLogServiceDateRange")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuditLogServiceDateRange {
  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public AuditLogServiceDateRange() { 
  }

  public AuditLogServiceDateRange endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象期間の終了日です。&lt;br&gt; このフィールドは、必須です。&lt;br&gt; ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。&lt;br&gt; 時間の指定がない場合は、0:00:00として扱われます。&lt;br&gt;　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535&lt;br&gt; ※2 日付は19700101～20371231まで設定可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of target date.&lt;br&gt; This field is required.&lt;br&gt; *1 The format is specified as \&quot;YYYYMMDDhhmmss\&quot;. It can be set at second bid level.&lt;br&gt; If it&#39;s not specified, the value&#39;0:00:00&#39; is set as default.&lt;br&gt;　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \&quot;20160525140535\&quot;.&lt;br&gt; *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)&lt;/div&gt; 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象期間の終了日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">End date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public AuditLogServiceDateRange startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象期間の開始日です。&lt;br&gt; このフィールドは、必須です。&lt;br&gt; ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。&lt;br&gt; 時間の指定がない場合は、0:00:00として扱われます。&lt;br&gt;　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535&lt;br&gt; ※2 日付は19700101～20371231まで設定可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of target date.&lt;br&gt; This field is required.&lt;br&gt; *1 The format is specified as \&quot;YYYYMMDDhhmmss\&quot;. It can be set at second bid level.&lt;br&gt; If it&#39;s not specified, the value&#39;0:00:00&#39; is set as default.&lt;br&gt;　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \&quot;20160525140535\&quot;.&lt;br&gt; *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)&lt;/div&gt; 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象期間の開始日です。<br> このフィールドは、必須です。<br> ※1 「YYYYMMDDhhmmss」形式です。秒単位まで指定できます。<br> 時間の指定がない場合は、0:00:00として扱われます。<br>　 【例】2016年5月25日 午後2時5分35秒に設定したい場合：20160525140535<br> ※2 日付は19700101～20371231まで設定可能です。</div> <div lang=\"en\">Start date of target date.<br> This field is required.<br> *1 The format is specified as \"YYYYMMDDhhmmss\". It can be set at second bid level.<br> If it's not specified, the value'0:00:00' is set as default.<br>　 ex.) To set 2:05:35 PM on May 25, 2016, the value for this option is \"20160525140535\".<br> *2 Available date range :Jan 1, 1970 (19700101) - Dec 31, 2037 (20371231)</div> ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogServiceDateRange auditLogServiceDateRange = (AuditLogServiceDateRange) o;
    return Objects.equals(this.endDate, auditLogServiceDateRange.endDate) &&
        Objects.equals(this.startDate, auditLogServiceDateRange.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogServiceDateRange {\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
