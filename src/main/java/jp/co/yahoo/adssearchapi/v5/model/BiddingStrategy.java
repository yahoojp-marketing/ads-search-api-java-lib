package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceBiddingScheme;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyオブジェクトは、入札方法を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;Bidding strategy object displays the type of bidding.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyオブジェクトは、入札方法を表します。</div> <div lang=\"en\">Bidding strategy object displays the type of bidding.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategy   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("biddingScheme")
  private BiddingStrategyServiceBiddingScheme biddingScheme = null;

  @JsonProperty("biddingStrategyId")
  private Long biddingStrategyId = null;

  @JsonProperty("biddingStrategyName")
  private String biddingStrategyName = null;

  public BiddingStrategy accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。<br> このフィールドは、いずれの場合でも必須です。</div> <div lang=\"en\">Account ID.<br> This field is required in any cases.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public BiddingStrategy biddingScheme(BiddingStrategyServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
    return this;
  }

  /**
   * Get biddingScheme
   * @return biddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceBiddingScheme getBiddingScheme() {
    return biddingScheme;
  }

  public void setBiddingScheme(BiddingStrategyServiceBiddingScheme biddingScheme) {
    this.biddingScheme = biddingScheme;
  }

  public BiddingStrategy biddingStrategyId(Long biddingStrategyId) {
    this.biddingStrategyId = biddingStrategyId;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札IDです。<br> SET時およびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Auto bidding ID.<br> This field is optional in SET and REMOVE operation.</div> 
   * @return biddingStrategyId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札IDです。<br> SET時およびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Auto bidding ID.<br> This field is optional in SET and REMOVE operation.</div> ")


  public Long getBiddingStrategyId() {
    return biddingStrategyId;
  }

  public void setBiddingStrategyId(Long biddingStrategyId) {
    this.biddingStrategyId = biddingStrategyId;
  }

  public BiddingStrategy biddingStrategyName(String biddingStrategyName) {
    this.biddingStrategyName = biddingStrategyName;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札名です（50文字以内になります）。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Auto bidding name(Can set up to 50 characters).<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return biddingStrategyName
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札名です（50文字以内になります）。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Auto bidding name(Can set up to 50 characters).<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public String getBiddingStrategyName() {
    return biddingStrategyName;
  }

  public void setBiddingStrategyName(String biddingStrategyName) {
    this.biddingStrategyName = biddingStrategyName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategy biddingStrategy = (BiddingStrategy) o;
    return Objects.equals(this.accountId, biddingStrategy.accountId) &&
        Objects.equals(this.biddingScheme, biddingStrategy.biddingScheme) &&
        Objects.equals(this.biddingStrategyId, biddingStrategy.biddingStrategyId) &&
        Objects.equals(this.biddingStrategyName, biddingStrategy.biddingStrategyName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, biddingScheme, biddingStrategyId, biddingStrategyName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategy {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    biddingScheme: ").append(toIndentedString(biddingScheme)).append("\n");
    sb.append("    biddingStrategyId: ").append(toIndentedString(biddingStrategyId)).append("\n");
    sb.append("    biddingStrategyName: ").append(toIndentedString(biddingStrategyName)).append("\n");
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

