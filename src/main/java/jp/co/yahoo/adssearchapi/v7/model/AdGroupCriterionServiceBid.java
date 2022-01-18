package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupCriterionServiceBidSource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupCriterionServiceBidオブジェクトは、入札価格を表示します。 （AdGroupCriterionService用のオブジェクトです。）<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupCriterionServiceBid object displays the bid values. *Object for AdGroupCriterionService.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupCriterionServiceBid   {
  @JsonProperty("adGroupCpc")
  private Long adGroupCpc = null;

  @JsonProperty("bidSource")
  private AdGroupCriterionServiceBidSource bidSource = null;

  @JsonProperty("keywordCpc")
  private Long keywordCpc = null;

  @JsonProperty("cpc")
  private Long cpc = null;

  public AdGroupCriterionServiceBid adGroupCpc(Long adGroupCpc) {
    this.adGroupCpc = adGroupCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループ入札価格です。</div> <div lang=\"en\">CPC of Ad group.</div> 
   * @return adGroupCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループ入札価格です。</div> <div lang=\"en\">CPC of Ad group.</div> ")


  public Long getAdGroupCpc() {
    return adGroupCpc;
  }

  public void setAdGroupCpc(Long adGroupCpc) {
    this.adGroupCpc = adGroupCpc;
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

  public AdGroupCriterionServiceBid keywordCpc(Long keywordCpc) {
    this.keywordCpc = keywordCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワード入札価格です。</div> <div lang=\"en\">CPC of Keyword.</div> 
   * @return keywordCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。</div> <div lang=\"en\">CPC of Keyword.</div> ")


  public Long getKeywordCpc() {
    return keywordCpc;
  }

  public void setKeywordCpc(Long keywordCpc) {
    this.keywordCpc = keywordCpc;
  }

  public AdGroupCriterionServiceBid cpc(Long cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。<br> ※cpcが0の場合は、設定なしと同様です。</div> <div lang=\"en\">CPC of Keyword.<br> This field is optional. The default value in ADD operation will be 1.<br> *Confirmed as no setting, if value is set &#34;0&#34;.</div> 
   * @return cpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。<br> ※cpcが0の場合は、設定なしと同様です。</div> <div lang=\"en\">CPC of Keyword.<br> This field is optional. The default value in ADD operation will be 1.<br> *Confirmed as no setting, if value is set &#34;0&#34;.</div> ")


  public Long getCpc() {
    return cpc;
  }

  public void setCpc(Long cpc) {
    this.cpc = cpc;
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
    return Objects.equals(this.adGroupCpc, adGroupCriterionServiceBid.adGroupCpc) &&
        Objects.equals(this.bidSource, adGroupCriterionServiceBid.bidSource) &&
        Objects.equals(this.keywordCpc, adGroupCriterionServiceBid.keywordCpc) &&
        Objects.equals(this.cpc, adGroupCriterionServiceBid.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCpc, bidSource, keywordCpc, cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupCriterionServiceBid {\n");
    
    sb.append("    adGroupCpc: ").append(toIndentedString(adGroupCpc)).append("\n");
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
    sb.append("    keywordCpc: ").append(toIndentedString(keywordCpc)).append("\n");
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
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

