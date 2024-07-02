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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBudgetオブジェクトは、キャンペーン予算に関する情報を表します。&lt;br&gt; このフィールドは、ADD時に必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBudget object displays budget information for campaign.&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@JsonPropertyOrder({
  CampaignServiceBudget.JSON_PROPERTY_AMOUNT,
  CampaignServiceBudget.JSON_PROPERTY_CAMPAIGN_BUDGET_ID,
  CampaignServiceBudget.JSON_PROPERTY_CAMPAIGN_BUDGET_NAME
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignServiceBudget {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Long amount;

  public static final String JSON_PROPERTY_CAMPAIGN_BUDGET_ID = "campaignBudgetId";
  private Long campaignBudgetId;

  public static final String JSON_PROPERTY_CAMPAIGN_BUDGET_NAME = "campaignBudgetName";
  private String campaignBudgetName;

  public CampaignServiceBudget() {
  }

  public CampaignServiceBudget amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;1日単位のキャンペーン予算利用金額です。&lt;br&gt; ADDおよびSET時、個別予算を設定する場合、このフィールドは必須となり、共有予算を設定する場合、設定不可となります。また、campaignBudgetIdと同時に設定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Amount of budget of Campaign.&lt;br&gt; In ADD and SET operation, this field is required when setting individual budgets, and is not allowed when setting shared budgets. This field cannot be set at the same time as campaignBudgetId.&lt;/div&gt; 
   * @return amount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public CampaignServiceBudget campaignBudgetId(Long campaignBudgetId) {
    
    this.campaignBudgetId = campaignBudgetId;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;共有予算IDです。&lt;br&gt; ADDおよびSET時、個別予算を設定する場合、このフィールドは設定不可となり、共有予算を設定する場合、必須となります。また、amountと同時に設定することはできません。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignBudget ID.&lt;br&gt; In ADD and SET operation, this field is not allowed when setting individual budgets, and is required when setting shared budgets. This field cannot be set at the same time as amount.&lt;/div&gt; 
   * @return campaignBudgetId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCampaignBudgetId() {
    return campaignBudgetId;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDGET_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBudgetId(Long campaignBudgetId) {
    this.campaignBudgetId = campaignBudgetId;
  }


  public CampaignServiceBudget campaignBudgetName(String campaignBudgetName) {
    
    this.campaignBudgetName = campaignBudgetName;
    return this;
  }

   /**
   * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;共有予算名です。&lt;br&gt; ADDおよびSET時、このフィールドは無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignBudget name.&lt;br&gt; This field will be ignored in ADD and SET operation.&lt;/div&gt; 
   * @return campaignBudgetName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDGET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCampaignBudgetName() {
    return campaignBudgetName;
  }


  @JsonProperty(JSON_PROPERTY_CAMPAIGN_BUDGET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCampaignBudgetName(String campaignBudgetName) {
    this.campaignBudgetName = campaignBudgetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBudget campaignServiceBudget = (CampaignServiceBudget) o;
    return Objects.equals(this.amount, campaignServiceBudget.amount) &&
        Objects.equals(this.campaignBudgetId, campaignServiceBudget.campaignBudgetId) &&
        Objects.equals(this.campaignBudgetName, campaignServiceBudget.campaignBudgetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, campaignBudgetId, campaignBudgetName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBudget {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    campaignBudgetId: ").append(toIndentedString(campaignBudgetId)).append("\n");
    sb.append("    campaignBudgetName: ").append(toIndentedString(campaignBudgetName)).append("\n");
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
