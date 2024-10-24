/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v15/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v15.model;

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
import jp.co.yahoo.adssearchapi.v15.model.AccountCustomizerServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountCustomizerServiceSelectorオブジェクトは、カスタマイザー属性の情報を指定します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountCustomizerServiceSelector describes the AccountCustomizer information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountCustomizerServiceSelectorオブジェクトは、カスタマイザー属性の情報を指定します。</div> <div lang=\"en\">AccountCustomizerServiceSelector describes the AccountCustomizer information.</div> ")
@JsonPropertyOrder({
  AccountCustomizerServiceSelector.JSON_PROPERTY_ACCOUNT_ID,
  AccountCustomizerServiceSelector.JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS,
  AccountCustomizerServiceSelector.JSON_PROPERTY_TYPES,
  AccountCustomizerServiceSelector.JSON_PROPERTY_NUMBER_RESULTS,
  AccountCustomizerServiceSelector.JSON_PROPERTY_START_INDEX
})
@JsonTypeName("AccountCustomizerServiceSelector")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountCustomizerServiceSelector {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS = "customizerAttributeIds";
  private List<Long> customizerAttributeIds = null;

  public static final String JSON_PROPERTY_TYPES = "types";
  private List<AccountCustomizerServiceType> types = null;

  public static final String JSON_PROPERTY_NUMBER_RESULTS = "numberResults";
  private Integer numberResults = 500;

  public static final String JSON_PROPERTY_START_INDEX = "startIndex";
  private Integer startIndex = 1;

  public AccountCustomizerServiceSelector() { 
  }

  public AccountCustomizerServiceSelector accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountCustomizerServiceSelector customizerAttributeIds(List<Long> customizerAttributeIds) {
    
    this.customizerAttributeIds = customizerAttributeIds;
    return this;
  }

  public AccountCustomizerServiceSelector addCustomizerAttributeIdsItem(Long customizerAttributeIdsItem) {
    if (this.customizerAttributeIds == null) {
      this.customizerAttributeIds = new ArrayList<>();
    }
    this.customizerAttributeIds.add(customizerAttributeIdsItem);
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;検索条件：カスタマイザー属性ID&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Search condition: Customizer attribute ID.&lt;/div&gt; 
   * @return customizerAttributeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">検索条件：カスタマイザー属性ID</div> <div lang=\"en\">Search condition: Customizer attribute ID.</div> ")
  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCustomizerAttributeIds() {
    return customizerAttributeIds;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZER_ATTRIBUTE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomizerAttributeIds(List<Long> customizerAttributeIds) {
    this.customizerAttributeIds = customizerAttributeIds;
  }


  public AccountCustomizerServiceSelector types(List<AccountCustomizerServiceType> types) {
    
    this.types = types;
    return this;
  }

  public AccountCustomizerServiceSelector addTypesItem(AccountCustomizerServiceType typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AccountCustomizerServiceType> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<AccountCustomizerServiceType> types) {
    this.types = types;
  }


  public AccountCustomizerServiceSelector numberResults(Integer numberResults) {
    
    this.numberResults = numberResults;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * maximum: 2000
   * @return numberResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">開始位置から取得する結果の数。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The number of results to retrieve starting from the initial position. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumberResults() {
    return numberResults;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberResults(Integer numberResults) {
    this.numberResults = numberResults;
  }


  public AccountCustomizerServiceSelector startIndex(Integer startIndex) {
    
    this.startIndex = startIndex;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The position within the result set where retrieval begins. This field must be greater than or equal to 1.&lt;/div&gt; 
   * minimum: 1
   * @return startIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">取得を開始する結果セット内の位置。このフィールドは、1以上を指定する必要があります。</div> <div lang=\"en\">The position within the result set where retrieval begins. This field must be greater than or equal to 1.</div> ")
  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStartIndex() {
    return startIndex;
  }


  @JsonProperty(JSON_PROPERTY_START_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCustomizerServiceSelector accountCustomizerServiceSelector = (AccountCustomizerServiceSelector) o;
    return Objects.equals(this.accountId, accountCustomizerServiceSelector.accountId) &&
        Objects.equals(this.customizerAttributeIds, accountCustomizerServiceSelector.customizerAttributeIds) &&
        Objects.equals(this.types, accountCustomizerServiceSelector.types) &&
        Objects.equals(this.numberResults, accountCustomizerServiceSelector.numberResults) &&
        Objects.equals(this.startIndex, accountCustomizerServiceSelector.startIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, customizerAttributeIds, types, numberResults, startIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCustomizerServiceSelector {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    customizerAttributeIds: ").append(toIndentedString(customizerAttributeIds)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    numberResults: ").append(toIndentedString(numberResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
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

