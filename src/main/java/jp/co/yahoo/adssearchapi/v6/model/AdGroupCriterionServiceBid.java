package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupCriterionServiceBidSource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceBid   {
  @JsonProperty("adGroupMaxCpc")
  private Long adGroupMaxCpc = null;

  @JsonProperty("bidSource")
  private AdGroupCriterionServiceBidSource bidSource = null;

  @JsonProperty("keywordMaxCpc")
  private Long keywordMaxCpc = null;

  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  public AdGroupCriterionServiceBid adGroupMaxCpc(Long adGroupMaxCpc) {
    this.adGroupMaxCpc = adGroupMaxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ入札価格です。</div> <div lang=\"en\">CPC of Ad group.</div> 
   * @return adGroupMaxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ入札価格です。</div> <div lang=\"en\">CPC of Ad group.</div> ")


  public Long getAdGroupMaxCpc() {
    return adGroupMaxCpc;
  }

  public void setAdGroupMaxCpc(Long adGroupMaxCpc) {
    this.adGroupMaxCpc = adGroupMaxCpc;
  }

  public AdGroupCriterionServiceBid bidSource(AdGroupCriterionServiceBidSource bidSource) {
    this.bidSource = bidSource;
    return this;
  }

  /**
   * Get bidSource
   * @return bidSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupCriterionServiceBidSource getBidSource() {
    return bidSource;
  }

  public void setBidSource(AdGroupCriterionServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }

  public AdGroupCriterionServiceBid keywordMaxCpc(Long keywordMaxCpc) {
    this.keywordMaxCpc = keywordMaxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワード入札価格です。</div> <div lang=\"en\">CPC of Keyword.</div> 
   * @return keywordMaxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。</div> <div lang=\"en\">CPC of Keyword.</div> ")


  public Long getKeywordMaxCpc() {
    return keywordMaxCpc;
  }

  public void setKeywordMaxCpc(Long keywordMaxCpc) {
    this.keywordMaxCpc = keywordMaxCpc;
  }

  public AdGroupCriterionServiceBid maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。<br> ※maxCpcが0の場合は、設定なしと同様です。</div> <div lang=\"en\">CPC of Keyword.<br> This field is optional. The default value in ADD operation will be 1.<br> *Confirmed as no setting, if value is set &#34;0&#34;.</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。<br> ※maxCpcが0の場合は、設定なしと同様です。</div> <div lang=\"en\">CPC of Keyword.<br> This field is optional. The default value in ADD operation will be 1.<br> *Confirmed as no setting, if value is set &#34;0&#34;.</div> ")


  public Long getMaxCpc() {
    return maxCpc;
  }

  public void setMaxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupCriterionServiceBid adGroupCriterionServiceBid = (AdGroupCriterionServiceBid) o;
    return Objects.equals(this.adGroupMaxCpc, adGroupCriterionServiceBid.adGroupMaxCpc) &&
        Objects.equals(this.bidSource, adGroupCriterionServiceBid.bidSource) &&
        Objects.equals(this.keywordMaxCpc, adGroupCriterionServiceBid.keywordMaxCpc) &&
        Objects.equals(this.maxCpc, adGroupCriterionServiceBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupMaxCpc, bidSource, keywordMaxCpc, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBid {\n");
    
    sb.append("    adGroupMaxCpc: ").append(toIndentedString(adGroupMaxCpc)).append("\n");
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
    sb.append("    keywordMaxCpc: ").append(toIndentedString(keywordMaxCpc)).append("\n");
    sb.append("    maxCpc: ").append(toIndentedString(maxCpc)).append("\n");
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

