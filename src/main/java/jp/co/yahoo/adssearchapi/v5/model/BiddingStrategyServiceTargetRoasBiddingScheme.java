package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_ROASの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS.&lt;br&gt; This field is optional. *If type is &#39;TARGET_ROAS&#39;, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceTargetRoasBiddingSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> このフィールドは、省略可能となります。※ADD時、typeがTARGET_ROASの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceTargetRoasBiddingScheme object displays Auto Bidding setting for Target ROAS.<br> This field is optional. *If type is 'TARGET_ROAS', this field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceTargetRoasBiddingScheme   {
  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  @JsonProperty("bidFloor")
  private Long bidFloor = null;

  @JsonProperty("targetRoas")
  private Double targetRoas = null;

  public BiddingStrategyServiceTargetRoasBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。（0〜50000）<br> ※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">CPC limit (0-50000).<br> * No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。（0〜50000）<br> ※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">CPC limit (0-50000).<br> * No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }

  public BiddingStrategyServiceTargetRoasBiddingScheme bidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の下限です。<br> ※ 設定を解除する場合は「0」を指定します。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Minimum CPC.<br> * Set &#34;0&#34; to deactivate.<br> This field is optional in any cases.</div> 
   * @return bidFloor
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の下限です。<br> ※ 設定を解除する場合は「0」を指定します。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Minimum CPC.<br> * Set &#34;0&#34; to deactivate.<br> This field is optional in any cases.</div> ")


  public Long getBidFloor() {
    return bidFloor;
  }

  public void setBidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
  }

  public BiddingStrategyServiceTargetRoasBiddingScheme targetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
    return this;
  }

  /**
   * <div lang=\"ja\">広告費用対効果の目標値<br> ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。※Return On Advertising Spend(ROAS)</div> <div lang=\"en\">Target ROAS.<br> * ROAS: Return On Average Spend.<br> * Setting limit: 0.01 〜1000.00（1%〜100000%）.<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return targetRoas
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告費用対効果の目標値<br> ※0.01 〜1000.00（1%〜100000%）の範囲内のみ許容します。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。※Return On Advertising Spend(ROAS)</div> <div lang=\"en\">Target ROAS.<br> * ROAS: Return On Average Spend.<br> * Setting limit: 0.01 〜1000.00（1%〜100000%）.<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public Double getTargetRoas() {
    return targetRoas;
  }

  public void setTargetRoas(Double targetRoas) {
    this.targetRoas = targetRoas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceTargetRoasBiddingScheme biddingStrategyServiceTargetRoasBiddingScheme = (BiddingStrategyServiceTargetRoasBiddingScheme) o;
    return Objects.equals(this.bidCeiling, biddingStrategyServiceTargetRoasBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, biddingStrategyServiceTargetRoasBiddingScheme.bidFloor) &&
        Objects.equals(this.targetRoas, biddingStrategyServiceTargetRoasBiddingScheme.targetRoas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetRoas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetRoasBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    bidFloor: ").append(toIndentedString(bidFloor)).append("\n");
    sb.append("    targetRoas: ").append(toIndentedString(targetRoas)).append("\n");
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

