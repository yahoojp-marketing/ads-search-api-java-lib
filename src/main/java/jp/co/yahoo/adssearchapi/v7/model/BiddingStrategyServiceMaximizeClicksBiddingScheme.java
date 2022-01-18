package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceMaximizeClicksBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。 （BiddingStrategyService用のオブジェクトです。）&lt;br&gt; このフィールドは、省略可能となります。※ADD時、typeがMAXIMIZE_CLICKSの場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceMaximizeClicksBiddingScheme object describes Auto Bidding setting for Maximize Clicks.&lt;br&gt; This field is optional. *If type is &#39;MAXIMIZE_CLICKS&#39;, this field is required in ADD operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceMaximizeClicksBiddingSchemeオブジェクトは、クリック数の最大化の自動入札設定情報を表します。 （BiddingStrategyService用のオブジェクトです。）<br> このフィールドは、省略可能となります。※ADD時、typeがMAXIMIZE_CLICKSの場合は必須です。</div> <div lang=\"en\">BiddingStrategyServiceMaximizeClicksBiddingScheme object describes Auto Bidding setting for Maximize Clicks.<br> This field is optional. *If type is 'MAXIMIZE_CLICKS', this field is required in ADD operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class BiddingStrategyServiceMaximizeClicksBiddingScheme   {
  @JsonProperty("bidCeiling")
  private Long bidCeiling = null;

  public BiddingStrategyServiceMaximizeClicksBiddingScheme bidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
    return this;
  }

  /**
   * <div lang=\"ja\">入札価格の上限です。（0～50000）<br> ※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Bid amount limit (0-50000).<br> * No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> 
   * @return bidCeiling
  */
  @ApiModelProperty(value = "<div lang=\"ja\">入札価格の上限です。（0～50000）<br> ※「0」が設定された場合、上限設定はありません。<br> このフィールドは、いずれの場合でも省略可能となります。</div> <div lang=\"en\">Bid amount limit (0-50000).<br> * No limits if &#34;0&#34; is set.<br> This field is optional in any cases.</div> ")


  public Long getBidCeiling() {
    return bidCeiling;
  }

  public void setBidCeiling(Long bidCeiling) {
    this.bidCeiling = bidCeiling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceMaximizeClicksBiddingScheme biddingStrategyServiceMaximizeClicksBiddingScheme = (BiddingStrategyServiceMaximizeClicksBiddingScheme) o;
    return Objects.equals(this.bidCeiling, biddingStrategyServiceMaximizeClicksBiddingScheme.bidCeiling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCeiling);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceMaximizeClicksBiddingScheme {\n");
    
    sb.append("    bidCeiling: ").append(toIndentedString(bidCeiling)).append("\n");
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

