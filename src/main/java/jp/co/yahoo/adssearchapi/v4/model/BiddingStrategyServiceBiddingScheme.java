package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceTargetImpressionShareScheme;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceTargetRoasBiddingScheme;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceTargetSpendBiddingScheme;
import jp.co.yahoo.adssearchapi.v4.model.BiddingStrategyServiceType;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。（BiddingStrategyService用のオブジェクトです。）&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceBiddingScheme object displays the details of Auto Bidding setting. (This is for BiddingStrategyService)&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。（BiddingStrategyService用のオブジェクトです。）<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">BiddingStrategyServiceBiddingScheme object displays the details of Auto Bidding setting. (This is for BiddingStrategyService)<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceBiddingScheme   {
  @JsonProperty("targetCpaBiddingScheme")
  private BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme = null;

  @JsonProperty("targetRoasBiddingScheme")
  private BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme = null;

  @JsonProperty("targetSpendBiddingScheme")
  private BiddingStrategyServiceTargetSpendBiddingScheme targetSpendBiddingScheme = null;

  @JsonProperty("targetImpressionShareScheme")
  private BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme = null;

  @JsonProperty("type")
  private BiddingStrategyServiceType type = null;

  public BiddingStrategyServiceBiddingScheme targetCpaBiddingScheme(BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
    return this;
  }

  /**
   * Get targetCpaBiddingScheme
   * @return targetCpaBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceTargetCpaBiddingScheme getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }

  public void setTargetCpaBiddingScheme(BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetRoasBiddingScheme(BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
    return this;
  }

  /**
   * Get targetRoasBiddingScheme
   * @return targetRoasBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceTargetRoasBiddingScheme getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }

  public void setTargetRoasBiddingScheme(BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetSpendBiddingScheme(BiddingStrategyServiceTargetSpendBiddingScheme targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = targetSpendBiddingScheme;
    return this;
  }

  /**
   * Get targetSpendBiddingScheme
   * @return targetSpendBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceTargetSpendBiddingScheme getTargetSpendBiddingScheme() {
    return targetSpendBiddingScheme;
  }

  public void setTargetSpendBiddingScheme(BiddingStrategyServiceTargetSpendBiddingScheme targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = targetSpendBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetImpressionShareScheme(BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
    return this;
  }

  /**
   * Get targetImpressionShareScheme
   * @return targetImpressionShareScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceTargetImpressionShareScheme getTargetImpressionShareScheme() {
    return targetImpressionShareScheme;
  }

  public void setTargetImpressionShareScheme(BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
  }

  public BiddingStrategyServiceBiddingScheme type(BiddingStrategyServiceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceType getType() {
    return type;
  }

  public void setType(BiddingStrategyServiceType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceBiddingScheme biddingStrategyServiceBiddingScheme = (BiddingStrategyServiceBiddingScheme) o;
    return Objects.equals(this.targetCpaBiddingScheme, biddingStrategyServiceBiddingScheme.targetCpaBiddingScheme) &&
        Objects.equals(this.targetRoasBiddingScheme, biddingStrategyServiceBiddingScheme.targetRoasBiddingScheme) &&
        Objects.equals(this.targetSpendBiddingScheme, biddingStrategyServiceBiddingScheme.targetSpendBiddingScheme) &&
        Objects.equals(this.targetImpressionShareScheme, biddingStrategyServiceBiddingScheme.targetImpressionShareScheme) &&
        Objects.equals(this.type, biddingStrategyServiceBiddingScheme.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetCpaBiddingScheme, targetRoasBiddingScheme, targetSpendBiddingScheme, targetImpressionShareScheme, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceBiddingScheme {\n");
    
    sb.append("    targetCpaBiddingScheme: ").append(toIndentedString(targetCpaBiddingScheme)).append("\n");
    sb.append("    targetRoasBiddingScheme: ").append(toIndentedString(targetRoasBiddingScheme)).append("\n");
    sb.append("    targetSpendBiddingScheme: ").append(toIndentedString(targetSpendBiddingScheme)).append("\n");
    sb.append("    targetImpressionShareScheme: ").append(toIndentedString(targetImpressionShareScheme)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

