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
import jp.co.yahoo.adssearchapi.v12.model.AccountManagementServiceEnterpriseType;
import jp.co.yahoo.adssearchapi.v12.model.AccountManagementServiceEnterpriseTypePosition;
import jp.co.yahoo.adssearchapi.v12.model.AccountManagementServicePrefectureCode;
import jp.co.yahoo.adssearchapi.v12.model.AccountManagementServiceUrlType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountManagementServiceClientオブジェクトは、広告主情報を表します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountManagementServiceClient object describes the client information.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  AccountManagementServiceClient.JSON_PROPERTY_BUILDING,
  AccountManagementServiceClient.JSON_PROPERTY_CITY,
  AccountManagementServiceClient.JSON_PROPERTY_CLIENT_PERSON_NAME,
  AccountManagementServiceClient.JSON_PROPERTY_COMPANY_NAME,
  AccountManagementServiceClient.JSON_PROPERTY_COMPANY_NAME_KANA,
  AccountManagementServiceClient.JSON_PROPERTY_CORPORATE_NUMBER,
  AccountManagementServiceClient.JSON_PROPERTY_ENTERPRISE_TYPE,
  AccountManagementServiceClient.JSON_PROPERTY_ENTERPRISE_TYPE_POSITION,
  AccountManagementServiceClient.JSON_PROPERTY_PHONE_NUMBER,
  AccountManagementServiceClient.JSON_PROPERTY_PREFECTURE_CODE,
  AccountManagementServiceClient.JSON_PROPERTY_STREET1,
  AccountManagementServiceClient.JSON_PROPERTY_STREET2,
  AccountManagementServiceClient.JSON_PROPERTY_URL,
  AccountManagementServiceClient.JSON_PROPERTY_URL_TYPE,
  AccountManagementServiceClient.JSON_PROPERTY_ZIP
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountManagementServiceClient {
  public static final String JSON_PROPERTY_BUILDING = "building";
  private String building;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_CLIENT_PERSON_NAME = "clientPersonName";
  private String clientPersonName;

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private String companyName;

  public static final String JSON_PROPERTY_COMPANY_NAME_KANA = "companyNameKana";
  private String companyNameKana;

  public static final String JSON_PROPERTY_CORPORATE_NUMBER = "corporateNumber";
  private Long corporateNumber;

  public static final String JSON_PROPERTY_ENTERPRISE_TYPE = "enterpriseType";
  private AccountManagementServiceEnterpriseType enterpriseType;

  public static final String JSON_PROPERTY_ENTERPRISE_TYPE_POSITION = "enterpriseTypePosition";
  private AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition;

  public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
  private String phoneNumber;

  public static final String JSON_PROPERTY_PREFECTURE_CODE = "prefectureCode";
  private AccountManagementServicePrefectureCode prefectureCode;

  public static final String JSON_PROPERTY_STREET1 = "street1";
  private String street1;

  public static final String JSON_PROPERTY_STREET2 = "street2";
  private String street2;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_URL_TYPE = "urlType";
  private AccountManagementServiceUrlType urlType;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public AccountManagementServiceClient() {
  }

  public AccountManagementServiceClient building(String building) {
    
    this.building = building;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ビル名です。&lt;br&gt;このフィールドは、ADD時に省略可能となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Building name.&lt;br&gt;This field is optional in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return building
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuilding() {
    return building;
  }


  @JsonProperty(JSON_PROPERTY_BUILDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuilding(String building) {
    this.building = building;
  }


  public AccountManagementServiceClient city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;市区町村名です。&lt;br&gt;このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;City name.&lt;br&gt;This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return city
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public AccountManagementServiceClient clientPersonName(String clientPersonName) {
    
    this.clientPersonName = clientPersonName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告主の担当者氏名です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SET時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Client person name.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
   * @return clientPersonName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLIENT_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientPersonName() {
    return clientPersonName;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientPersonName(String clientPersonName) {
    this.clientPersonName = clientPersonName;
  }


  public AccountManagementServiceClient companyName(String companyName) {
    
    this.companyName = companyName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告主名です。&lt;br&gt;このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Company name.&lt;br&gt;This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;/div&gt; 
   * @return companyName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyName() {
    return companyName;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }


  public AccountManagementServiceClient companyNameKana(String companyNameKana) {
    
    this.companyNameKana = companyNameKana;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告主名カナです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Kana characters of company name.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;/div&gt; 
   * @return companyNameKana
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME_KANA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompanyNameKana() {
    return companyNameKana;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY_NAME_KANA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompanyNameKana(String companyNameKana) {
    this.companyNameKana = companyNameKana;
  }


  public AccountManagementServiceClient corporateNumber(Long corporateNumber) {
    
    this.corporateNumber = corporateNumber;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt; 法人番号です。&lt;br&gt; このフィールドは、ADD時に省略可能となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※enterpriseTypeがKOJINの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。 &lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt; Corporate number.&lt;br&gt; This field is optional in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * When enterpriseType is \&quot;KOJIN\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response. &lt;/div&gt; 
   * @return corporateNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CORPORATE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCorporateNumber() {
    return corporateNumber;
  }


  @JsonProperty(JSON_PROPERTY_CORPORATE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCorporateNumber(Long corporateNumber) {
    this.corporateNumber = corporateNumber;
  }


  public AccountManagementServiceClient enterpriseType(AccountManagementServiceEnterpriseType enterpriseType) {
    
    this.enterpriseType = enterpriseType;
    return this;
  }

   /**
   * Get enterpriseType
   * @return enterpriseType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceEnterpriseType getEnterpriseType() {
    return enterpriseType;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseType(AccountManagementServiceEnterpriseType enterpriseType) {
    this.enterpriseType = enterpriseType;
  }


  public AccountManagementServiceClient enterpriseTypePosition(AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition) {
    
    this.enterpriseTypePosition = enterpriseTypePosition;
    return this;
  }

   /**
   * Get enterpriseTypePosition
   * @return enterpriseTypePosition
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_TYPE_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceEnterpriseTypePosition getEnterpriseTypePosition() {
    return enterpriseTypePosition;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_TYPE_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseTypePosition(AccountManagementServiceEnterpriseTypePosition enterpriseTypePosition) {
    this.enterpriseTypePosition = enterpriseTypePosition;
  }


  public AccountManagementServiceClient phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;電話番号です。&lt;br&gt; ※xxxxx-xxxxx-xxxxx形式です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Phone number.&lt;br&gt; * In xxxxx-xxxxx-xxxxx format.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return phoneNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPhoneNumber() {
    return phoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AccountManagementServiceClient prefectureCode(AccountManagementServicePrefectureCode prefectureCode) {
    
    this.prefectureCode = prefectureCode;
    return this;
  }

   /**
   * Get prefectureCode
   * @return prefectureCode
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREFECTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServicePrefectureCode getPrefectureCode() {
    return prefectureCode;
  }


  @JsonProperty(JSON_PROPERTY_PREFECTURE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrefectureCode(AccountManagementServicePrefectureCode prefectureCode) {
    this.prefectureCode = prefectureCode;
  }


  public AccountManagementServiceClient street1(String street1) {
    
    this.street1 = street1;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;町・字名です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Street1.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return street1
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet1() {
    return street1;
  }


  @JsonProperty(JSON_PROPERTY_STREET1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet1(String street1) {
    this.street1 = street1;
  }


  public AccountManagementServiceClient street2(String street2) {
    
    this.street2 = street2;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;丁目・番地・号です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Street2.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return street2
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreet2() {
    return street2;
  }


  @JsonProperty(JSON_PROPERTY_STREET2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStreet2(String street2) {
    this.street2 = street2;
  }


  public AccountManagementServiceClient url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;広告掲載を希望するサイトのURLです。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Site URL for placing advertisement.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;/div&gt; 
   * @return url
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public AccountManagementServiceClient urlType(AccountManagementServiceUrlType urlType) {
    
    this.urlType = urlType;
    return this;
  }

   /**
   * Get urlType
   * @return urlType
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountManagementServiceUrlType getUrlType() {
    return urlType;
  }


  @JsonProperty(JSON_PROPERTY_URL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrlType(AccountManagementServiceUrlType urlType) {
    this.urlType = urlType;
  }


  public AccountManagementServiceClient zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;郵便番号です。&lt;br&gt; ※xxx-xxxx形式です。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時に無視されます。&lt;br&gt; ※clientTypeがSELFの場合は、ADD時、SET時ともに無視されます。&lt;br&gt; ※このフィールドは、レスポンスの際に返却されません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Zip code.&lt;br&gt; * In xxx-xxxx format.&lt;br&gt; This field is required in ADD operation, and will be ignored in SET operation.&lt;br&gt; * When clientType is \&quot;SELF\&quot;, this field will be ignored in ADD and SET operations.&lt;br&gt; * This field is not returned in the response.&lt;/div&gt; 
   * @return zip
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }


  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountManagementServiceClient accountManagementServiceClient = (AccountManagementServiceClient) o;
    return Objects.equals(this.building, accountManagementServiceClient.building) &&
        Objects.equals(this.city, accountManagementServiceClient.city) &&
        Objects.equals(this.clientPersonName, accountManagementServiceClient.clientPersonName) &&
        Objects.equals(this.companyName, accountManagementServiceClient.companyName) &&
        Objects.equals(this.companyNameKana, accountManagementServiceClient.companyNameKana) &&
        Objects.equals(this.corporateNumber, accountManagementServiceClient.corporateNumber) &&
        Objects.equals(this.enterpriseType, accountManagementServiceClient.enterpriseType) &&
        Objects.equals(this.enterpriseTypePosition, accountManagementServiceClient.enterpriseTypePosition) &&
        Objects.equals(this.phoneNumber, accountManagementServiceClient.phoneNumber) &&
        Objects.equals(this.prefectureCode, accountManagementServiceClient.prefectureCode) &&
        Objects.equals(this.street1, accountManagementServiceClient.street1) &&
        Objects.equals(this.street2, accountManagementServiceClient.street2) &&
        Objects.equals(this.url, accountManagementServiceClient.url) &&
        Objects.equals(this.urlType, accountManagementServiceClient.urlType) &&
        Objects.equals(this.zip, accountManagementServiceClient.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(building, city, clientPersonName, companyName, companyNameKana, corporateNumber, enterpriseType, enterpriseTypePosition, phoneNumber, prefectureCode, street1, street2, url, urlType, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountManagementServiceClient {\n");
    sb.append("    building: ").append(toIndentedString(building)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    clientPersonName: ").append(toIndentedString(clientPersonName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    companyNameKana: ").append(toIndentedString(companyNameKana)).append("\n");
    sb.append("    corporateNumber: ").append(toIndentedString(corporateNumber)).append("\n");
    sb.append("    enterpriseType: ").append(toIndentedString(enterpriseType)).append("\n");
    sb.append("    enterpriseTypePosition: ").append(toIndentedString(enterpriseTypePosition)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    prefectureCode: ").append(toIndentedString(prefectureCode)).append("\n");
    sb.append("    street1: ").append(toIndentedString(street1)).append("\n");
    sb.append("    street2: ").append(toIndentedString(street2)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlType: ").append(toIndentedString(urlType)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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

