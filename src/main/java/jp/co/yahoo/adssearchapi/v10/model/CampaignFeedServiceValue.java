/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v10/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v10
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v10.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v10.model.CampaignFeedServiceList;
import jp.co.yahoo.adssearchapi.v10.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceValue is a container of FeedItem information.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignFeedServiceValue.JSON_PROPERTY_CAMPAIGN_FEED_LIST,
  CampaignFeedServiceValue.JSON_PROPERTY_ERRORS,
  CampaignFeedServiceValue.JSON_PROPERTY_OPERATION_SUCCEEDED
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignFeedServiceValue {
  public static final String JSON_PROPERTY_CAMPAIGN_FEED_LIST = "campaignFeedList";
  private CampaignFeedServiceList campaignFeedList;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors;

  public static final String JSON_PROPERTY_OPERATION_SUCCEEDED = "operationSucceeded";
  private Boolean operationSucceeded;

  public CampaignFeedServiceValue() {
  }

  public CampaignFeedServiceValue campaignFeedList(CampaignFeedServiceList campaignFeedList) {
    
    this.campaignFeedList = campaignFeedList;
    return this;
  }

   /**
   * Get campaignFeedList
   * @return campaignFeedList
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CampaignFeedServiceList getCampaignFeedList() {
    return campaignFeedList;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_FEED_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignFeedList(CampaignFeedServiceList campaignFeedList) {
    this.campaignFeedList = campaignFeedList;
  }


  public CampaignFeedServiceValue errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignFeedServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public CampaignFeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    
    this.operationSucceeded = operationSucceeded;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;The process results. If true, the process succeeded. If false, the process failed.&lt;/div&gt; 
   * @return operationSucceeded
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_SUCCEEDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignFeedServiceValue campaignFeedServiceValue = (CampaignFeedServiceValue) o;
    return Objects.equals(this.campaignFeedList, campaignFeedServiceValue.campaignFeedList) &&
        Objects.equals(this.errors, campaignFeedServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignFeedServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFeedList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedServiceValue {\n");
    sb.append("    campaignFeedList: ").append(toIndentedString(campaignFeedList)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

