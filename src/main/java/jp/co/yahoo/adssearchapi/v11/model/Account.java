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
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceAuthType;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceAutoTaggingEnabled;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceDeliveryStatus;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceIsManagerAccount;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceIsTestAccount;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceStatus;
import jp.co.yahoo.adssearchapi.v11.model.AccountServiceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;Accountオブジェクトは、アカウントを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account object describes the account information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_ACCOUNT_ID,
  Account.JSON_PROPERTY_ACCOUNT_NAME,
  Account.JSON_PROPERTY_ACCOUNT_STATUS,
  Account.JSON_PROPERTY_ACCOUNT_TYPE,
  Account.JSON_PROPERTY_AUTH_TYPE,
  Account.JSON_PROPERTY_AUTO_TAGGING_ENABLED,
  Account.JSON_PROPERTY_DELIVERY_STATUS,
  Account.JSON_PROPERTY_IS_TEST_ACCOUNT,
  Account.JSON_PROPERTY_START_DATE,
  Account.JSON_PROPERTY_END_DATE,
  Account.JSON_PROPERTY_IS_MANAGER_ACCOUNT,
  Account.JSON_PROPERTY_CONTACT_BIZ_ID
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private Long accountId;

  public static final String JSON_PROPERTY_ACCOUNT_NAME = "accountName";
  private String accountName;

  public static final String JSON_PROPERTY_ACCOUNT_STATUS = "accountStatus";
  private AccountServiceStatus accountStatus;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountServiceType accountType;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private AccountServiceAuthType authType;

  public static final String JSON_PROPERTY_AUTO_TAGGING_ENABLED = "autoTaggingEnabled";
  private AccountServiceAutoTaggingEnabled autoTaggingEnabled;

  public static final String JSON_PROPERTY_DELIVERY_STATUS = "deliveryStatus";
  private AccountServiceDeliveryStatus deliveryStatus;

  public static final String JSON_PROPERTY_IS_TEST_ACCOUNT = "isTestAccount";
  private AccountServiceIsTestAccount isTestAccount;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_IS_MANAGER_ACCOUNT = "isManagerAccount";
  private AccountServiceIsManagerAccount isManagerAccount;

  public static final String JSON_PROPERTY_CONTACT_BIZ_ID = "contactBizId";
  private String contactBizId;

  public Account() {
  }

  public Account accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウントIDです。&lt;br&gt; SET時、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account ID.&lt;br&gt; This field is required in SET operation.&lt;/div&gt; 
   * @return accountId
  **/
  @jakarta.annotation.Nullable
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


  public Account accountName(String accountName) {
    
    this.accountName = accountName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント名です。&lt;br&gt; SET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Account Name.&lt;br&gt; This field is optional in SET operation.&lt;/div&gt; 
   * @return accountName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountName() {
    return accountName;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }


  public Account accountStatus(AccountServiceStatus accountStatus) {
    
    this.accountStatus = accountStatus;
    return this;
  }

   /**
   * Get accountStatus
   * @return accountStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceStatus getAccountStatus() {
    return accountStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountStatus(AccountServiceStatus accountStatus) {
    this.accountStatus = accountStatus;
  }


  public Account accountType(AccountServiceType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceType getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountType(AccountServiceType accountType) {
    this.accountType = accountType;
  }


  public Account authType(AccountServiceAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(AccountServiceAuthType authType) {
    this.authType = authType;
  }


  public Account autoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    
    this.autoTaggingEnabled = autoTaggingEnabled;
    return this;
  }

   /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceAutoTaggingEnabled getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_TAGGING_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoTaggingEnabled(AccountServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }


  public Account deliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Get deliveryStatus
   * @return deliveryStatus
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceDeliveryStatus getDeliveryStatus() {
    return deliveryStatus;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryStatus(AccountServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public Account isTestAccount(AccountServiceIsTestAccount isTestAccount) {
    
    this.isTestAccount = isTestAccount;
    return this;
  }

   /**
   * Get isTestAccount
   * @return isTestAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIsTestAccount getIsTestAccount() {
    return isTestAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_TEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTestAccount(AccountServiceIsTestAccount isTestAccount) {
    this.isTestAccount = isTestAccount;
  }


  public Account startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載開始日です。&lt;br&gt; 「yyyyMMdd」形式で表示されます。&lt;br&gt; SET時、このフィールドは無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Start date of ad serving.&lt;br&gt; This field will be ignored in SET operation.&lt;br&gt; It is displayed in &amp;#39;yyyyMMdd&amp;#39; format.&lt;/div&gt; 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
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


  public Account endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;掲載終了日です。&lt;br&gt; SET時、このフィールドは無視されます。&lt;br&gt;「yyyyMMdd」形式で表示されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;End date of ad serving.&lt;br&gt;This field will be ignored in SET operation.&lt;br&gt; It is displayed in &amp;#39;yyyyMMdd&amp;#39; format.&lt;/div&gt; 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
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


  public Account isManagerAccount(AccountServiceIsManagerAccount isManagerAccount) {
    
    this.isManagerAccount = isManagerAccount;
    return this;
  }

   /**
   * Get isManagerAccount
   * @return isManagerAccount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MANAGER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountServiceIsManagerAccount getIsManagerAccount() {
    return isManagerAccount;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANAGER_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsManagerAccount(AccountServiceIsManagerAccount isManagerAccount) {
    this.isManagerAccount = isManagerAccount;
  }


  public Account contactBizId(String contactBizId) {
    
    this.contactBizId = contactBizId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;アカウント管理者のYahoo! JAPANビジネスIDです。&lt;br&gt; MCCアカウントの場合、このフィールドは返却されず、リクエストの際も無視されます。&lt;br&gt; テストアカウントの場合、このフィールドは更新できません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Contact Business ID.&lt;br&gt; If isManagerAccount is \&quot;TRUE\&quot;, this field will not be returned and will be ignored on request.&lt;br&gt; If isTestAccount is \&quot;TRUE\&quot;, this field cannot be set.&lt;/div&gt; 
   * @return contactBizId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTACT_BIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContactBizId() {
    return contactBizId;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_BIZ_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactBizId(String contactBizId) {
    this.contactBizId = contactBizId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.accountName, account.accountName) &&
        Objects.equals(this.accountStatus, account.accountStatus) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.authType, account.authType) &&
        Objects.equals(this.autoTaggingEnabled, account.autoTaggingEnabled) &&
        Objects.equals(this.deliveryStatus, account.deliveryStatus) &&
        Objects.equals(this.isTestAccount, account.isTestAccount) &&
        Objects.equals(this.startDate, account.startDate) &&
        Objects.equals(this.endDate, account.endDate) &&
        Objects.equals(this.isManagerAccount, account.isManagerAccount) &&
        Objects.equals(this.contactBizId, account.contactBizId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountStatus, accountType, authType, autoTaggingEnabled, deliveryStatus, isTestAccount, startDate, endDate, isManagerAccount, contactBizId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountStatus: ").append(toIndentedString(accountStatus)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isManagerAccount: ").append(toIndentedString(isManagerAccount)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
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

