package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignSharedSetは、キャンペーンと対象外キーワードリストの関連付け情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignSharedSet is object to hold setup information between negative keyword list and campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignSharedSetは、キャンペーンと対象外キーワードリストの関連付け情報を保持するオブジェクトです。</div> <div lang=\"en\">CampaignSharedSet is object to hold setup information between negative keyword list and campaign.</div> ")

public class CampaignSharedSet   {
  @JsonProperty("accountId")
  private JsonNullable<Long> accountId = JsonNullable.undefined();

  @JsonProperty("campaignId")
  private JsonNullable<Long> campaignId = JsonNullable.undefined();

  @JsonProperty("campaignName")
  private JsonNullable<String> campaignName = JsonNullable.undefined();

  @JsonProperty("sharedListId")
  private JsonNullable<Long> sharedListId = JsonNullable.undefined();

  @JsonProperty("sharedListName")
  private JsonNullable<String> sharedListName = JsonNullable.undefined();

  public CampaignSharedSet accountId(Long accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public JsonNullable<Long> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<Long> accountId) {
    this.accountId = accountId;
  }

  public CampaignSharedSet campaignId(Long campaignId) {
    this.campaignId = JsonNullable.of(campaignId);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public JsonNullable<Long> getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(JsonNullable<Long> campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignSharedSet campaignName(String campaignName) {
    this.campaignName = JsonNullable.of(campaignName);
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> ")


  public JsonNullable<String> getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(JsonNullable<String> campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignSharedSet sharedListId(Long sharedListId) {
    this.sharedListId = JsonNullable.of(sharedListId);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントの対象外キーワードリストIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Negative keyword list ID of the account.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return sharedListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントの対象外キーワードリストIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Negative keyword list ID of the account.<br> This field is required in ADD and REMOVE operation.</div> ")


  public JsonNullable<Long> getSharedListId() {
    return sharedListId;
  }

  public void setSharedListId(JsonNullable<Long> sharedListId) {
    this.sharedListId = sharedListId;
  }

  public CampaignSharedSet sharedListName(String sharedListName) {
    this.sharedListName = JsonNullable.of(sharedListName);
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントの対象外キーワードリスト名です。</div> <div lang=\"en\">Negative keyword list name of the account.</div> 
   * @return sharedListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントの対象外キーワードリスト名です。</div> <div lang=\"en\">Negative keyword list name of the account.</div> ")


  public JsonNullable<String> getSharedListName() {
    return sharedListName;
  }

  public void setSharedListName(JsonNullable<String> sharedListName) {
    this.sharedListName = sharedListName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSharedSet campaignSharedSet = (CampaignSharedSet) o;
    return Objects.equals(this.accountId, campaignSharedSet.accountId) &&
        Objects.equals(this.campaignId, campaignSharedSet.campaignId) &&
        Objects.equals(this.campaignName, campaignSharedSet.campaignName) &&
        Objects.equals(this.sharedListId, campaignSharedSet.sharedListId) &&
        Objects.equals(this.sharedListName, campaignSharedSet.sharedListName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, campaignId, campaignName, sharedListId, sharedListName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSharedSet {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    sharedListId: ").append(toIndentedString(sharedListId)).append("\n");
    sb.append("    sharedListName: ").append(toIndentedString(sharedListName)).append("\n");
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

