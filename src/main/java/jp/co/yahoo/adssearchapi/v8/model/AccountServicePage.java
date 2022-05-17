/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v8/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v8.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v8.model.AccountServiceValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountServicePageオブジェクトは、取得されるアカウントに関するエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account entry information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountServicePageオブジェクトは、取得されるアカウントに関するエントリーを表します。</div> <div lang=\"en\">Account entry information.</div> ")
@JsonPropertyOrder({
  AccountServicePage.JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID,
  AccountServicePage.JSON_PROPERTY_TOTAL_NUM_ENTRIES,
  AccountServicePage.JSON_PROPERTY_VALUES
})
@JsonTypeName("AccountServicePage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountServicePage {
  public static final String JSON_PROPERTY_AUTHORIZATION_BUSINESS_ID = "authorizationBusinessId";
  private String authorizationBusinessId;

  public static final String JSON_PROPERTY_TOTAL_NUM_ENTRIES = "totalNumEntries";
  private Integer totalNumEntries;

  public static final String JSON_PROPERTY_VALUES = "values";
  private List<AccountServiceValue> values = null;

  public AccountServicePage() { 
  }

  public AccountServicePage authorizationBusinessId(String authorizationBusinessId) {
    
    this.authorizationBusinessId = authorizationBusinessId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アプリケーションによるYahoo!広告へのアクセスを認可したYahoo! JAPANビジネスIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Yahoo! JAPAN Business ID that authorized access to Yahoo! JAPAN Ads via application.&lt;/div&gt; 
   * @return authorizationBusinessId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アプリケーションによるYahoo!広告へのアクセスを認可したYahoo! JAPANビジネスIDです。</div> <div lang=\"en\">Yahoo! JAPAN Business ID that authorized access to Yahoo! JAPAN Ads via application.</div> ")
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


  public AccountServicePage totalNumEntries(Integer totalNumEntries) {
    
    this.totalNumEntries = totalNumEntries;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得される項目の総件数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Total number of entries.&lt;/div&gt; 
   * @return totalNumEntries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries.</div> ")
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


  public AccountServicePage values(List<AccountServiceValue> values) {
    
    this.values = values;
    return this;
  }

  public AccountServicePage addValuesItem(AccountServiceValue valuesItem) {
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
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountServiceValue> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(List<AccountServiceValue> values) {
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
    AccountServicePage accountServicePage = (AccountServicePage) o;
    return Objects.equals(this.authorizationBusinessId, accountServicePage.authorizationBusinessId) &&
        Objects.equals(this.totalNumEntries, accountServicePage.totalNumEntries) &&
        Objects.equals(this.values, accountServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizationBusinessId, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountServicePage {\n");
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

