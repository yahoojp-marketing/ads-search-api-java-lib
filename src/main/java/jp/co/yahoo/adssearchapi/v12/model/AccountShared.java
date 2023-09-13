/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

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
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedオブジェクトは、アカウント内で共有できる対象外キーワードリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountShared object describes negative keyword list which can be shared within the account.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedオブジェクトは、アカウント内で共有できる対象外キーワードリストの情報を表します。</div> <div lang=\"en\">AccountShared object describes negative keyword list which can be shared within the account.</div> ")
@JsonPropertyOrder({
  AccountShared.JSON_PROPERTY_ACCOUNT_ID,
  AccountShared.JSON_PROPERTY_MEMBER_COUNT,
  AccountShared.JSON_PROPERTY_NAME,
  AccountShared.JSON_PROPERTY_REFERENCE_COUNT,
  AccountShared.JSON_PROPERTY_SHARED_LIST_ID
})
@JsonTypeName("AccountShared")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountShared {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_MEMBER_COUNT = "memberCount";
  private Integer memberCount;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REFERENCE_COUNT = "referenceCount";
  private Integer referenceCount;

  public static final String JSON_PROPERTY_SHARED_LIST_ID = "sharedListId";
  private Long sharedListId;

  public AccountShared() { 
  }

  public AccountShared accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;/div&gt; 
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountShared memberCount(Integer memberCount) {
    
    this.memberCount = memberCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードリストに含まれるアイテム（検索対象外キーワード）数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of items on negative keyword list (keyword excluded on search).&lt;/div&gt; 
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストに含まれるアイテム（検索対象外キーワード）数です。</div> <div lang=\"en\">Number of items on negative keyword list (keyword excluded on search).</div> ")
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberCount() {
    return memberCount;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }


  public AccountShared name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードリスト名です。&lt;br&gt;ADDおよびSET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Negative keyword list name.&lt;br&gt;This field is required in ADD and SET operation.&lt;/div&gt; 
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリスト名です。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list name.<br>This field is required in ADD and SET operation.</div> ")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AccountShared referenceCount(Integer referenceCount) {
    
    this.referenceCount = referenceCount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードリストを使用している キャンペーン数です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Number of campaigns which use negative keyword list.&lt;/div&gt; 
   * @return referenceCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストを使用している キャンペーン数です。</div> <div lang=\"en\">Number of campaigns which use negative keyword list.</div> ")
  @JsonProperty(JSON_PROPERTY_REFERENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReferenceCount() {
    return referenceCount;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
  }


  public AccountShared sharedListId(Long sharedListId) {
    
    this.sharedListId = sharedListId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;対象外キーワードリストIDです。&lt;br&gt;SETおよびREMOVE時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Negative keyword list ID.&lt;br&gt;This field is required in SET and REMOVE operation.&lt;/div&gt; 
   * @return sharedListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストIDです。<br>SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list ID.<br>This field is required in SET and REMOVE operation.</div> ")
  @JsonProperty(JSON_PROPERTY_SHARED_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSharedListId() {
    return sharedListId;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountShared accountShared = (AccountShared) o;
    return Objects.equals(this.accountId, accountShared.accountId) &&
        Objects.equals(this.memberCount, accountShared.memberCount) &&
        Objects.equals(this.name, accountShared.name) &&
        Objects.equals(this.referenceCount, accountShared.referenceCount) &&
        Objects.equals(this.sharedListId, accountShared.sharedListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, memberCount, name, referenceCount, sharedListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountShared {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
    sb.append("    sharedListId: ").append(toIndentedString(sharedListId)).append("\n");
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

