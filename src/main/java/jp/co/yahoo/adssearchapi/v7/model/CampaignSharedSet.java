package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignSharedSetは、キャンペーンと対象外キーワードリストの関連付け情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignSharedSet is object to hold setup information between negative keyword list and campaign.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignSharedSetは、キャンペーンと対象外キーワードリストの関連付け情報を保持するオブジェクトです。</div> <div lang=\"en\">CampaignSharedSet is object to hold setup information between negative keyword list and campaign.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignSharedSet   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("campaignId")
  private Long campaignId = null;

  @JsonProperty("campaignName")
  private String campaignName = null;

  @JsonProperty("sharedListId")
  private Long sharedListId = null;

  @JsonProperty("sharedListName")
  private String sharedListName = null;

  public CampaignSharedSet accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public CampaignSharedSet campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return campaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーンIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Campaign ID.<br> This field is required in ADD and REMOVE operation.</div> ")


  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignSharedSet campaignName(String campaignName) {
    this.campaignName = campaignName;
    return this;
  }

  /**
   * <div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> 
   * @return campaignName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キャンペーン名です。</div> <div lang=\"en\">Campaign name.</div> ")


  public String getCampaignName() {
    return campaignName;
  }

  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }

  public CampaignSharedSet sharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントの対象外キーワードリストIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Negative keyword list ID of the account.<br> This field is required in ADD and REMOVE operation.</div> 
   * @return sharedListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントの対象外キーワードリストIDです。<br> ADD時およびREMOVE時、このフィールドは必須です。</div> <div lang=\"en\">Negative keyword list ID of the account.<br> This field is required in ADD and REMOVE operation.</div> ")


  public Long getSharedListId() {
    return sharedListId;
  }

  public void setSharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
  }

  public CampaignSharedSet sharedListName(String sharedListName) {
    this.sharedListName = sharedListName;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントの対象外キーワードリスト名です。</div> <div lang=\"en\">Negative keyword list name of the account.</div> 
   * @return sharedListName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントの対象外キーワードリスト名です。</div> <div lang=\"en\">Negative keyword list name of the account.</div> ")


  public String getSharedListName() {
    return sharedListName;
  }

  public void setSharedListName(String sharedListName) {
    this.sharedListName = sharedListName;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

