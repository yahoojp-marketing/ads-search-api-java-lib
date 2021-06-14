package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.CampaignServiceBiddingStrategySource;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignServiceBiddingStrategyオブジェクトは、自動入札設定方法を表します。&lt;br&gt; ADD時、biddingStrategyConfigurationは必須となります。また、failedBiddingStrategyConfigurationはレスポンスの際に返却されますが、リクエストの際には無視されます。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignServiceBiddingStrategy object describes Auto Bidding setting.&lt;br&gt; biddingStrategyConfiguration is required in ADD operation. Although failedBiddingStrategyConfiguration will be returned in the response, it will be ignored on input.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignServiceBiddingStrategyオブジェクトは、自動入札設定方法を表します。<br> ADD時、biddingStrategyConfigurationは必須となります。また、failedBiddingStrategyConfigurationはレスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">CampaignServiceBiddingStrategy object describes Auto Bidding setting.<br> biddingStrategyConfiguration is required in ADD operation. Although failedBiddingStrategyConfiguration will be returned in the response, it will be ignored on input.</div> ")

public class CampaignServiceBiddingStrategy   {
  @JsonProperty("biddingScheme")
  private JsonNullable<CampaignServiceBiddingScheme> biddingScheme = JsonNullable.undefined();

  @JsonProperty("biddingStrategyId")
  private JsonNullable<Long> biddingStrategyId = JsonNullable.undefined();

  @JsonProperty("biddingStrategyName")
  private JsonNullable<String> biddingStrategyName = JsonNullable.undefined();

  @JsonProperty("biddingStrategySource")
  private JsonNullable<CampaignServiceBiddingStrategySource> biddingStrategySource = JsonNullable.undefined();

  public CampaignServiceBiddingStrategy biddingScheme(CampaignServiceBiddingScheme biddingScheme) {
    this.biddingScheme = JsonNullable.of(biddingScheme);
    return this;
  }

  /**
   * Get biddingScheme
   * @return biddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingScheme> getBiddingScheme() {
    return biddingScheme;
  }

  public void setBiddingScheme(JsonNullable<CampaignServiceBiddingScheme> biddingScheme) {
    this.biddingScheme = biddingScheme;
  }

  public CampaignServiceBiddingStrategy biddingStrategyId(Long biddingStrategyId) {
    this.biddingStrategyId = JsonNullable.of(biddingStrategyId);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札IDです。<br> ADD時、標準入札設定の場合、このフィールドは設定不可となり、ポートフォリオ入札設定の場合、必須となります。また、biddingSchemeと同時に設定することはできません。</div> <div lang=\"en\">Auto Bidding ID.<br> This field cannot be specified when Standard bidding is setting, and is required when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingScheme.</div> 
   * @return biddingStrategyId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札IDです。<br> ADD時、標準入札設定の場合、このフィールドは設定不可となり、ポートフォリオ入札設定の場合、必須となります。また、biddingSchemeと同時に設定することはできません。</div> <div lang=\"en\">Auto Bidding ID.<br> This field cannot be specified when Standard bidding is setting, and is required when Portfolio bidding is setting in ADD operation. It cannot be specified at the same times as biddingScheme.</div> ")


  public JsonNullable<Long> getBiddingStrategyId() {
    return biddingStrategyId;
  }

  public void setBiddingStrategyId(JsonNullable<Long> biddingStrategyId) {
    this.biddingStrategyId = biddingStrategyId;
  }

  public CampaignServiceBiddingStrategy biddingStrategyName(String biddingStrategyName) {
    this.biddingStrategyName = JsonNullable.of(biddingStrategyName);
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札名です。<br> ADD時、このフィールドは無視されます。<br> ※50文字以内になります。</div> <div lang=\"en\">Auto Bidding name.<br> This field will be ignored in ADD operation.<br>* Up to 50 characters.</div> 
   * @return biddingStrategyName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札名です。<br> ADD時、このフィールドは無視されます。<br> ※50文字以内になります。</div> <div lang=\"en\">Auto Bidding name.<br> This field will be ignored in ADD operation.<br>* Up to 50 characters.</div> ")


  public JsonNullable<String> getBiddingStrategyName() {
    return biddingStrategyName;
  }

  public void setBiddingStrategyName(JsonNullable<String> biddingStrategyName) {
    this.biddingStrategyName = biddingStrategyName;
  }

  public CampaignServiceBiddingStrategy biddingStrategySource(CampaignServiceBiddingStrategySource biddingStrategySource) {
    this.biddingStrategySource = JsonNullable.of(biddingStrategySource);
    return this;
  }

  /**
   * Get biddingStrategySource
   * @return biddingStrategySource
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<CampaignServiceBiddingStrategySource> getBiddingStrategySource() {
    return biddingStrategySource;
  }

  public void setBiddingStrategySource(JsonNullable<CampaignServiceBiddingStrategySource> biddingStrategySource) {
    this.biddingStrategySource = biddingStrategySource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignServiceBiddingStrategy campaignServiceBiddingStrategy = (CampaignServiceBiddingStrategy) o;
    return Objects.equals(this.biddingScheme, campaignServiceBiddingStrategy.biddingScheme) &&
        Objects.equals(this.biddingStrategyId, campaignServiceBiddingStrategy.biddingStrategyId) &&
        Objects.equals(this.biddingStrategyName, campaignServiceBiddingStrategy.biddingStrategyName) &&
        Objects.equals(this.biddingStrategySource, campaignServiceBiddingStrategy.biddingStrategySource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingScheme, biddingStrategyId, biddingStrategyName, biddingStrategySource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignServiceBiddingStrategy {\n");
    
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
    sb.append("    biddingStrategyId: ").append(toIndentedString(biddingStrategyId)).append("\n");
    sb.append("    biddingStrategyName: ").append(toIndentedString(biddingStrategyName)).append("\n");
    sb.append("    biddingStrategySource: ").append(toIndentedString(biddingStrategySource)).append("\n");
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

