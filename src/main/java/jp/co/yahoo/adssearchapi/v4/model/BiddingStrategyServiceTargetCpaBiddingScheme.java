package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetCpaBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_CPAの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetCpaBiddingScheme object displays Auto Bidding setting for Target CPA.&lt;br&gt; This field is optional. *If type is &#39;TARGET_CPA&#39;, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceTargetCpaBiddingSchemeオブジェクトは、コンバージョン単価の目標値の自動入札設定情報を表します。<br> このフィールドは、省略可能となります。※ADD時、typeがTARGET_CPAの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceTargetCpaBiddingScheme object displays Auto Bidding setting for Target CPA.<br> This field is optional. *If type is 'TARGET_CPA', this field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceTargetCpaBiddingScheme   {
  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  @JsonProperty("bidFloor")
  private Long bidFloor = null;

  @JsonProperty("targetCpa")
  private Long targetCpa = null;

  public BiddingStrategyServiceTargetCpaBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">CPC limit.<br>* No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。<br>※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">CPC limit.<br>* No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }

  public BiddingStrategyServiceTargetCpaBiddingScheme bidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の下限です。<br>※ 設定を解除する場合は「0」を指定します。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Minimum CPC.<br> * Set &#34;0&#34; to deactivate.<br>This field is optional in any cases.</div> 
   * @return bidFloor
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の下限です。<br>※ 設定を解除する場合は「0」を指定します。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Minimum CPC.<br> * Set &#34;0&#34; to deactivate.<br>This field is optional in any cases.</div> ")


  public Long getBidFloor() {
    return bidFloor;
  }

  public void setBidFloor(Long bidFloor) {
    this.bidFloor = bidFloor;
  }

  public BiddingStrategyServiceTargetCpaBiddingScheme targetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
    return this;
  }

  /**
   * <div lang=\"ja\">コンバージョン単価の目標値です（日本円です）。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Target CPA (JPY).<br> This field is required in ADD operation, and will be optional in SET operation.</div> 
   * @return targetCpa
  */
  @ApiModelProperty(value = "<div lang=\"ja\">コンバージョン単価の目標値です（日本円です）。<br> このフィールドは、ADD時は必須となり、SET時は省略可能となります。</div> <div lang=\"en\">Target CPA (JPY).<br> This field is required in ADD operation, and will be optional in SET operation.</div> ")


  public Long getTargetCpa() {
    return targetCpa;
  }

  public void setTargetCpa(Long targetCpa) {
    this.targetCpa = targetCpa;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceTargetCpaBiddingScheme biddingStrategyServiceTargetCpaBiddingScheme = (BiddingStrategyServiceTargetCpaBiddingScheme) o;
    return Objects.equals(this.bidCeiling, biddingStrategyServiceTargetCpaBiddingScheme.bidCeiling) &&
        Objects.equals(this.bidFloor, biddingStrategyServiceTargetCpaBiddingScheme.bidFloor) &&
        Objects.equals(this.targetCpa, biddingStrategyServiceTargetCpaBiddingScheme.targetCpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling, bidFloor, targetCpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetCpaBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    bidFloor: ").append(toIndentedString(bidFloor)).append("\n");
    sb.append("    targetCpa: ").append(toIndentedString(targetCpa)).append("\n");
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

