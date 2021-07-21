package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategyServiceTargetImpressionShareLocation;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceTargetImpressionShareSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがTARGET_IMPRESSION_SHAREの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceTargetImpressionShareScheme describes the Auto bidding setting information of Target ROAS. &lt;br&gt; This field is optional. *If type is TARGET_IMPRESSION_SHARE, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceTargetImpressionShareSchemeオブジェクトは、広告費用対効果の目標値の自動入札設定情報を表します。<br> このフィールドは、省略可能となります。※ADD時、typeがTARGET_IMPRESSION_SHAREの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceTargetImpressionShareScheme describes the Auto bidding setting information of Target ROAS. <br> This field is optional. *If type is TARGET_IMPRESSION_SHARE, this field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceTargetImpressionShareScheme   {
  @JsonProperty("location")
  private BiddingStrategyServiceTargetImpressionShareLocation location = null;

  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  @JsonProperty("targetImpressionShare")
  private Long targetImpressionShare = null;

  public BiddingStrategyServiceTargetImpressionShareScheme location(BiddingStrategyServiceTargetImpressionShareLocation location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")

  @Valid

  public BiddingStrategyServiceTargetImpressionShareLocation getLocation() {
    return location;
  }

  public void setLocation(BiddingStrategyServiceTargetImpressionShareLocation location) {
    this.location = location;
  }

  public BiddingStrategyServiceTargetImpressionShareScheme bidCeiling(Long bidCeiling) {
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

  public BiddingStrategyServiceTargetImpressionShareScheme targetImpressionShare(Long targetImpressionShare) {
    this.targetImpressionShare = targetImpressionShare;
    return this;
  }

  /**
   * <div lang=\"ja\">目標のインプレッションシェアです。<br> ADD時およびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Target impression share.<br> This field is required in ADD and SET operation. </div> 
   * @return targetImpressionShare
  */
  @ApiModelProperty(value = "<div lang=\"ja\">目標のインプレッションシェアです。<br> ADD時およびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Target impression share.<br> This field is required in ADD and SET operation. </div> ")


  public Long getTargetImpressionShare() {
    return targetImpressionShare;
  }

  public void setTargetImpressionShare(Long targetImpressionShare) {
    this.targetImpressionShare = targetImpressionShare;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceTargetImpressionShareScheme biddingStrategyServiceTargetImpressionShareScheme = (BiddingStrategyServiceTargetImpressionShareScheme) o;
    return Objects.equals(this.location, biddingStrategyServiceTargetImpressionShareScheme.location) &&
        Objects.equals(this.bidCeiling, biddingStrategyServiceTargetImpressionShareScheme.bidCeiling) &&
        Objects.equals(this.targetImpressionShare, biddingStrategyServiceTargetImpressionShareScheme.targetImpressionShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, bidCeiling, targetImpressionShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceTargetImpressionShareScheme {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
    sb.append("    targetImpressionShare: ").append(toIndentedString(targetImpressionShare)).append("\n");
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

