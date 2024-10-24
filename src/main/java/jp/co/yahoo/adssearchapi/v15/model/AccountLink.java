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
import jp.co.yahoo.adssearchapi.v15.model.AccountLinkServiceAccountStatus;
import jp.co.yahoo.adssearchapi.v15.model.AccountLinkServiceOwnerShipType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountLinkオブジェクトは、アカウントリンク情報を示します。&lt;br&gt; &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountLink objects serve account link information.&lt;br&gt; &lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountLinkオブジェクトは、アカウントリンク情報を示します。<br> </div> <div lang=\"en\">AccountLink objects serve account link information.<br> </div> ")
@JsonPropertyOrder({
  AccountLink.JSON_PROPERTY_MCC_ACCOUNT_ID,
  AccountLink.JSON_PROPERTY_ACCOUNT_ID,
  AccountLink.JSON_PROPERTY_ACCOUNT_STATUS,
  AccountLink.JSON_PROPERTY_OWNER_SHIP_TYPE
})
@JsonTypeName("AccountLink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountLink {
  public static final String JSON_PROPERTY_MCC_ACCOUNT_ID = "mccAccountId";
  private Long mccAccountId;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_STATUS = "accountStatus";
  private AccountLinkServiceAccountStatus accountStatus;

  public static final String JSON_PROPERTY_OWNER_SHIP_TYPE = "ownerShipType";
  private AccountLinkServiceOwnerShipType ownerShipType;

  public AccountLink() { 
  }

  public AccountLink mccAccountId(Long mccAccountId) {
    
    this.mccAccountId = mccAccountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;MCCアカウントIDです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;MCC Account ID.&lt;/div&gt; 
   * @return mccAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "<div lang=\"ja\">MCCアカウントIDです。</div> <div lang=\"en\">MCC Account ID.</div> ")
  @JsonProperty(JSON_PROPERTY_MCC_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMccAccountId() {
    return mccAccountId;
  }


  @JsonProperty(JSON_PROPERTY_MCC_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMccAccountId(Long mccAccountId) {
    this.mccAccountId = mccAccountId;
  }


  public AccountLink accountId(Long accountId) {
    
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


  public AccountLink accountStatus(AccountLinkServiceAccountStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceAccountStatus getAccountStatus() {
    return accountStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatus(AccountLinkServiceAccountStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public AccountLink ownerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    
    this.ownerShipType = ownerShipType;
    return this;
  }

   /**
   * Get ownerShipType
   * @return ownerShipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER_SHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountLinkServiceOwnerShipType getOwnerShipType() {
    return ownerShipType;
  }


  @JsonProperty(JSON_PROPERTY_OWNER_SHIP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwnerShipType(AccountLinkServiceOwnerShipType ownerShipType) {
    this.ownerShipType = ownerShipType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountLink accountLink = (AccountLink) o;
    return Objects.equals(this.mccAccountId, accountLink.mccAccountId) &&
        Objects.equals(this.accountId, accountLink.accountId) &&
        Objects.equals(this.accountStatus, accountLink.accountStatus) &&
        Objects.equals(this.ownerShipType, accountLink.ownerShipType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mccAccountId, accountId, accountStatus, ownerShipType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountLink {\n");
    sb.append("    mccAccountId: ").append(toIndentedString(mccAccountId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    ownerShipType: ").append(toIndentedString(ownerShipType)).append("\n");
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

