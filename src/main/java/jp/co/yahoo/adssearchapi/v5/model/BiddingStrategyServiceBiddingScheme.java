package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceTargetCpaBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceTargetImpressionShareScheme;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceTargetRoasBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceTargetSpendBiddingScheme;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。（BiddingStrategyService用のオブジェクトです。）&lt;br&gt; このフィールドは、ADD時は必須となり、SET時は省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceBiddingScheme object displays the details of Auto Bidding setting. (This is for BiddingStrategyService)&lt;br&gt; This field is required in ADD operation, and will be optional in SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceBiddingSchemeオブジェクトは、自動入札設定の詳細情報を表します。（BiddingStrategyService用のオブジェクトです。）<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">BiddingStrategyServiceBiddingScheme object displays the details of Auto Bidding setting. (This is for BiddingStrategyService)<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")

public class BiddingStrategyServiceBiddingScheme   {
  @JsonProperty("targetCpaBiddingScheme")
  private JsonNullable<BiddingStrategyServiceTargetCpaBiddingScheme> targetCpaBiddingScheme = JsonNullable.undefined();

  @JsonProperty("targetRoasBiddingScheme")
  private JsonNullable<BiddingStrategyServiceTargetRoasBiddingScheme> targetRoasBiddingScheme = JsonNullable.undefined();

  @JsonProperty("targetSpendBiddingScheme")
  private JsonNullable<BiddingStrategyServiceTargetSpendBiddingScheme> targetSpendBiddingScheme = JsonNullable.undefined();

  @JsonProperty("targetImpressionShareScheme")
  private JsonNullable<BiddingStrategyServiceTargetImpressionShareScheme> targetImpressionShareScheme = JsonNullable.undefined();

  @JsonProperty("type")
  private JsonNullable<BiddingStrategyServiceType> type = JsonNullable.undefined();

  public BiddingStrategyServiceBiddingScheme targetCpaBiddingScheme(BiddingStrategyServiceTargetCpaBiddingScheme targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = JsonNullable.of(targetCpaBiddingScheme);
    return this;
  }

  /**
   * Get targetCpaBiddingScheme
   * @return targetCpaBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategyServiceTargetCpaBiddingScheme> getTargetCpaBiddingScheme() {
    return targetCpaBiddingScheme;
  }

  public void setTargetCpaBiddingScheme(JsonNullable<BiddingStrategyServiceTargetCpaBiddingScheme> targetCpaBiddingScheme) {
    this.targetCpaBiddingScheme = targetCpaBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetRoasBiddingScheme(BiddingStrategyServiceTargetRoasBiddingScheme targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = JsonNullable.of(targetRoasBiddingScheme);
    return this;
  }

  /**
   * Get targetRoasBiddingScheme
   * @return targetRoasBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategyServiceTargetRoasBiddingScheme> getTargetRoasBiddingScheme() {
    return targetRoasBiddingScheme;
  }

  public void setTargetRoasBiddingScheme(JsonNullable<BiddingStrategyServiceTargetRoasBiddingScheme> targetRoasBiddingScheme) {
    this.targetRoasBiddingScheme = targetRoasBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetSpendBiddingScheme(BiddingStrategyServiceTargetSpendBiddingScheme targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = JsonNullable.of(targetSpendBiddingScheme);
    return this;
  }

  /**
   * Get targetSpendBiddingScheme
   * @return targetSpendBiddingScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategyServiceTargetSpendBiddingScheme> getTargetSpendBiddingScheme() {
    return targetSpendBiddingScheme;
  }

  public void setTargetSpendBiddingScheme(JsonNullable<BiddingStrategyServiceTargetSpendBiddingScheme> targetSpendBiddingScheme) {
    this.targetSpendBiddingScheme = targetSpendBiddingScheme;
  }

  public BiddingStrategyServiceBiddingScheme targetImpressionShareScheme(BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShareScheme) {
    this.targetImpressionShareScheme = JsonNullable.of(targetImpressionShareScheme);
    return this;
  }

  /**
   * Get targetImpressionShareScheme
   * @return targetImpressionShareScheme
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategyServiceTargetImpressionShareScheme> getTargetImpressionShareScheme() {
    return targetImpressionShareScheme;
  }

  public void setTargetImpressionShareScheme(JsonNullable<BiddingStrategyServiceTargetImpressionShareScheme> targetImpressionShareScheme) {
    this.targetImpressionShareScheme = targetImpressionShareScheme;
  }

  public BiddingStrategyServiceBiddingScheme type(BiddingStrategyServiceType type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategyServiceType> getType() {
    return type;
  }

  public void setType(JsonNullable<BiddingStrategyServiceType> type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

