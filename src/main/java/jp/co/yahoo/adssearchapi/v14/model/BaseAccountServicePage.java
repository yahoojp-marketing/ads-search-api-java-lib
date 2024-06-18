/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.BaseAccountServiceValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BaseAccountServicePageオブジェクトは、取得されるアカウント情報に関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The BaseAccountServicePage object is a container for storing account information entry.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  BaseAccountServicePage.JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID,
  BaseAccountServicePage.JSON_PROPERTY_TOTAL_NUM_ENTRIES,
  BaseAccountServicePage.JSON_PROPERTY_VALUES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BaseAccountServicePage {
  public static final String JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID = "authorizationBusinessId";
  private String authorizationBusinessId;

  public static final String JSON_PROPERTY_TOTAL_NUM_ENTRIES = "totalNumEntries";
  private Integer totalNumEntries;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<BaseAccountServiceValue> values;

  public BaseAccountServicePage() {
  }

  public BaseAccountServicePage authorizationBusinessId(String authorizationBusinessId) {
    
    this.authorizationBusinessId = authorizationBusinessId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションによるYahoo!広告へのアクセスを認可したYahoo! JAPANビジネスIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Yahoo! JAPAN Business ID that authorized access to Yahoo! JAPAN Ads via application.&lt;/div&gt; 
   * @return authorizationBusinessId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAuthorizationBusinessId() {
    return authorizationBusinessId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorizationBusinessId(String authorizationBusinessId) {
    this.authorizationBusinessId = authorizationBusinessId;
  }


  public BaseAccountServicePage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of items to be retrieved.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }


  public BaseAccountServicePage values(List<BaseAccountServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public BaseAccountServicePage addValuesItem(BaseAccountServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BaseAccountServiceValue> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<BaseAccountServiceValue> values) {
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
    BaseAccountServicePage baseAccountServicePage = (BaseAccountServicePage) o;
    return Objects.equals(this.authorizationBusinessId, baseAccountServicePage.authorizationBusinessId) &&
        Objects.equals(this.totalNumEntries, baseAccountServicePage.totalNumEntries) &&
        Objects.equals(this.values, baseAccountServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationBusinessId, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseAccountServicePage {\n");
    sb.append("    authorizationBusinessId: ").append(toIndentedString(authorizationBusinessId)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

