package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceAuthType;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceAutoTaggingEnabled;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceClient;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceClientType;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceDeliveryStatus;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceIsAdultAccount;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceIsTestAccount;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServicePayment;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adssearchapi.v5.model.AccountManagementServiceStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementオブジェクトは、アカウント情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagement object serves account information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountManagementオブジェクトは、アカウント情報を表します。</div> <div lang=\"en\">AccountManagement object serves account information.</div> ")

public class AccountManagement   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("accountName")
  private JsonNullable<String> accountName = JsonNullable.undefined();

  @JsonProperty("accountPayment")
  private JsonNullable<AccountManagementServicePayment> accountPayment = JsonNullable.undefined();

  @JsonProperty("agencyPersonName")
  private JsonNullable<String> agencyPersonName = JsonNullable.undefined();

  @JsonProperty("agencyPrefectureCode")
  private JsonNullable<AccountManagementServicePrefectureCode> agencyPrefectureCode = JsonNullable.undefined();

  @JsonProperty("authType")
  private JsonNullable<AccountManagementServiceAuthType> authType = JsonNullable.undefined();

  @JsonProperty("autoTaggingEnabled")
  private JsonNullable<AccountManagementServiceAutoTaggingEnabled> autoTaggingEnabled = JsonNullable.undefined();

  @JsonProperty("client")
  private JsonNullable<AccountManagementServiceClient> client = JsonNullable.undefined();

  @JsonProperty("clientType")
  private JsonNullable<AccountManagementServiceClientType> clientType = JsonNullable.undefined();

  @JsonProperty("contactBizId")
  private JsonNullable<String> contactBizId = JsonNullable.undefined();

  @JsonProperty("deliveryStatus")
  private JsonNullable<AccountManagementServiceDeliveryStatus> deliveryStatus = JsonNullable.undefined();

  @JsonProperty("isAdultAccount")
  private JsonNullable<AccountManagementServiceIsAdultAccount> isAdultAccount = JsonNullable.undefined();

  @JsonProperty("isTestAccount")
  private JsonNullable<AccountManagementServiceIsTestAccount> isTestAccount = JsonNullable.undefined();

  @JsonProperty("status")
  private JsonNullable<AccountManagementServiceStatus> status = JsonNullable.undefined();

  public AccountManagement accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Account ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public AccountManagement accountName(String accountName) {
    this.accountName = JsonNullable.of(accountName);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account Name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return accountName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント名です。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Account Name.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public JsonNullable<String> getAccountName() {
    return accountName;
  }

  public void setAccountName(JsonNullable<String> accountName) {
    this.accountName = accountName;
  }

  public AccountManagement accountPayment(AccountManagementServicePayment accountPayment) {
    this.accountPayment = JsonNullable.of(accountPayment);
    return this;
  }

  /**
   * Get accountPayment
   * @return accountPayment
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServicePayment> getAccountPayment() {
    return accountPayment;
  }

  public void setAccountPayment(JsonNullable<AccountManagementServicePayment> accountPayment) {
    this.accountPayment = accountPayment;
  }

  public AccountManagement agencyPersonName(String agencyPersonName) {
    this.agencyPersonName = JsonNullable.of(agencyPersonName);
    return this;
  }

  /**
   * <div lang=\"ja\">代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Agency Person Name.<br> This field is optional in ADD and SET operation.</div> 
   * @return agencyPersonName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">代理店担当者名です。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Agency Person Name.<br> This field is optional in ADD and SET operation.</div> ")


  public JsonNullable<String> getAgencyPersonName() {
    return agencyPersonName;
  }

  public void setAgencyPersonName(JsonNullable<String> agencyPersonName) {
    this.agencyPersonName = agencyPersonName;
  }

  public AccountManagement agencyPrefectureCode(AccountManagementServicePrefectureCode agencyPrefectureCode) {
    this.agencyPrefectureCode = JsonNullable.of(agencyPrefectureCode);
    return this;
  }

  /**
   * Get agencyPrefectureCode
   * @return agencyPrefectureCode
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServicePrefectureCode> getAgencyPrefectureCode() {
    return agencyPrefectureCode;
  }

  public void setAgencyPrefectureCode(JsonNullable<AccountManagementServicePrefectureCode> agencyPrefectureCode) {
    this.agencyPrefectureCode = agencyPrefectureCode;
  }

  public AccountManagement authType(AccountManagementServiceAuthType authType) {
    this.authType = JsonNullable.of(authType);
    return this;
  }

  /**
   * Get authType
   * @return authType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceAuthType> getAuthType() {
    return authType;
  }

  public void setAuthType(JsonNullable<AccountManagementServiceAuthType> authType) {
    this.authType = authType;
  }

  public AccountManagement autoTaggingEnabled(AccountManagementServiceAutoTaggingEnabled autoTaggingEnabled) {
    this.autoTaggingEnabled = JsonNullable.of(autoTaggingEnabled);
    return this;
  }

  /**
   * Get autoTaggingEnabled
   * @return autoTaggingEnabled
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceAutoTaggingEnabled> getAutoTaggingEnabled() {
    return autoTaggingEnabled;
  }

  public void setAutoTaggingEnabled(JsonNullable<AccountManagementServiceAutoTaggingEnabled> autoTaggingEnabled) {
    this.autoTaggingEnabled = autoTaggingEnabled;
  }

  public AccountManagement client(AccountManagementServiceClient client) {
    this.client = JsonNullable.of(client);
    return this;
  }

  /**
   * Get client
   * @return client
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceClient> getClient() {
    return client;
  }

  public void setClient(JsonNullable<AccountManagementServiceClient> client) {
    this.client = client;
  }

  public AccountManagement clientType(AccountManagementServiceClientType clientType) {
    this.clientType = JsonNullable.of(clientType);
    return this;
  }

  /**
   * Get clientType
   * @return clientType
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceClientType> getClientType() {
    return clientType;
  }

  public void setClientType(JsonNullable<AccountManagementServiceClientType> clientType) {
    this.clientType = clientType;
  }

  public AccountManagement contactBizId(String contactBizId) {
    this.contactBizId = JsonNullable.of(contactBizId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Contact Business ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return contactBizId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウント管理者のYahoo! JAPANビジネスIDです。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Contact Business ID.<br> Although this field will be returned in the response, it will be ignored on input.</div> ")


  public JsonNullable<String> getContactBizId() {
    return contactBizId;
  }

  public void setContactBizId(JsonNullable<String> contactBizId) {
    this.contactBizId = contactBizId;
  }

  public AccountManagement deliveryStatus(AccountManagementServiceDeliveryStatus deliveryStatus) {
    this.deliveryStatus = JsonNullable.of(deliveryStatus);
    return this;
  }

  /**
   * Get deliveryStatus
   * @return deliveryStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceDeliveryStatus> getDeliveryStatus() {
    return deliveryStatus;
  }

  public void setDeliveryStatus(JsonNullable<AccountManagementServiceDeliveryStatus> deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }

  public AccountManagement isAdultAccount(AccountManagementServiceIsAdultAccount isAdultAccount) {
    this.isAdultAccount = JsonNullable.of(isAdultAccount);
    return this;
  }

  /**
   * Get isAdultAccount
   * @return isAdultAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceIsAdultAccount> getIsAdultAccount() {
    return isAdultAccount;
  }

  public void setIsAdultAccount(JsonNullable<AccountManagementServiceIsAdultAccount> isAdultAccount) {
    this.isAdultAccount = isAdultAccount;
  }

  public AccountManagement isTestAccount(AccountManagementServiceIsTestAccount isTestAccount) {
    this.isTestAccount = JsonNullable.of(isTestAccount);
    return this;
  }

  /**
   * Get isTestAccount
   * @return isTestAccount
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceIsTestAccount> getIsTestAccount() {
    return isTestAccount;
  }

  public void setIsTestAccount(JsonNullable<AccountManagementServiceIsTestAccount> isTestAccount) {
    this.isTestAccount = isTestAccount;
  }

  public AccountManagement status(AccountManagementServiceStatus status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<AccountManagementServiceStatus> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<AccountManagementServiceStatus> status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagement accountManagement = (AccountManagement) o;
    return Objects.equals(this.accountId, accountManagement.accountId) &&
        Objects.equals(this.accountName, accountManagement.accountName) &&
        Objects.equals(this.accountPayment, accountManagement.accountPayment) &&
        Objects.equals(this.agencyPersonName, accountManagement.agencyPersonName) &&
        Objects.equals(this.agencyPrefectureCode, accountManagement.agencyPrefectureCode) &&
        Objects.equals(this.authType, accountManagement.authType) &&
        Objects.equals(this.autoTaggingEnabled, accountManagement.autoTaggingEnabled) &&
        Objects.equals(this.client, accountManagement.client) &&
        Objects.equals(this.clientType, accountManagement.clientType) &&
        Objects.equals(this.contactBizId, accountManagement.contactBizId) &&
        Objects.equals(this.deliveryStatus, accountManagement.deliveryStatus) &&
        Objects.equals(this.isAdultAccount, accountManagement.isAdultAccount) &&
        Objects.equals(this.isTestAccount, accountManagement.isTestAccount) &&
        Objects.equals(this.status, accountManagement.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountName, accountPayment, agencyPersonName, agencyPrefectureCode, authType, autoTaggingEnabled, client, clientType, contactBizId, deliveryStatus, isAdultAccount, isTestAccount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagement {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountPayment: ").append(toIndentedString(accountPayment)).append("\n");
    sb.append("    agencyPersonName: ").append(toIndentedString(agencyPersonName)).append("\n");
    sb.append("    agencyPrefectureCode: ").append(toIndentedString(agencyPrefectureCode)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    autoTaggingEnabled: ").append(toIndentedString(autoTaggingEnabled)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    contactBizId: ").append(toIndentedString(contactBizId)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    isAdultAccount: ").append(toIndentedString(isAdultAccount)).append("\n");
    sb.append("    isTestAccount: ").append(toIndentedString(isTestAccount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

