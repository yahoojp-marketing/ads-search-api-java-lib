package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.AdGroupWebpageServiceBidSource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupWebpageServiceBidオブジェクトは、入札価格を表示します。 （AdGroupWebpageService用のオブジェクトです。）&lt;br&gt; ADD時およびSET時、このフィールドは省略可能となります。※ExcludedTypeがINCLUDEDのみ更新可能です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupWebpageServiceBid object describes bid. (Object for AdGroupWebpageService.)&lt;br&gt; This field is optional in ADD and SET operation. *This field can be updated when ExcludedType is &#39;INCLUDED&#39;.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupWebpageServiceBidオブジェクトは、入札価格を表示します。 （AdGroupWebpageService用のオブジェクトです。）<br> ADD時およびSET時、このフィールドは省略可能となります。※ExcludedTypeがINCLUDEDのみ更新可能です。</div> <div lang=\"en\">AdGroupWebpageServiceBid object describes bid. (Object for AdGroupWebpageService.)<br> This field is optional in ADD and SET operation. *This field can be updated when ExcludedType is 'INCLUDED'.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupWebpageServiceBid   {
  @JsonProperty("adGroupCpc")
  private Long adGroupCpc = null;

  @JsonProperty("bidSource")
  private AdGroupWebpageServiceBidSource bidSource = null;

  @JsonProperty("keywordCpc")
  private Long keywordCpc = null;

  @JsonProperty("cpc")
  private Long cpc = null;

  public AdGroupWebpageServiceBid adGroupCpc(Long adGroupCpc) {
    this.adGroupCpc = adGroupCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">広告グループの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of ad group.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return adGroupCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">広告グループの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of ad group.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getAdGroupCpc() {
    return adGroupCpc;
  }

  public void setAdGroupCpc(Long adGroupCpc) {
    this.adGroupCpc = adGroupCpc;
  }

  public AdGroupWebpageServiceBid bidSource(AdGroupWebpageServiceBidSource bidSource) {
    this.bidSource = bidSource;
    return this;
  }

  /**
   * Get bidSource
   * @return bidSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupWebpageServiceBidSource getBidSource() {
    return bidSource;
  }

  public void setBidSource(AdGroupWebpageServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }

  public AdGroupWebpageServiceBid keywordCpc(Long keywordCpc) {
    this.keywordCpc = keywordCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワードの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of keyword.<br>Although this field will be returned in the response, it will be ignored on input.</div> 
   * @return keywordCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワードの最大入札価格です。<br>このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">Max bid of keyword.<br>Although this field will be returned in the response, it will be ignored on input.</div> ")


  public Long getKeywordCpc() {
    return keywordCpc;
  }

  public void setKeywordCpc(Long keywordCpc) {
    this.keywordCpc = keywordCpc;
  }

  public AdGroupWebpageServiceBid cpc(Long cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * <div lang=\"ja\">最大入札価格です。<br>ADD時、このフィールドは省略可能となります。その際、デフォルト値は1となります。SET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Max bid.<br>This field is optional in ADD and SET operation. The default value in ADD operation will be 1.</div> 
   * @return cpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">最大入札価格です。<br>ADD時、このフィールドは省略可能となります。その際、デフォルト値は1となります。SET時、このフィールドは省略可能となります。</div> <div lang=\"en\">Max bid.<br>This field is optional in ADD and SET operation. The default value in ADD operation will be 1.</div> ")


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
    AdGroupWebpageServiceBid adGroupWebpageServiceBid = (AdGroupWebpageServiceBid) o;
    return Objects.equals(this.adGroupCpc, adGroupWebpageServiceBid.adGroupCpc) &&
        Objects.equals(this.bidSource, adGroupWebpageServiceBid.bidSource) &&
        Objects.equals(this.keywordCpc, adGroupWebpageServiceBid.keywordCpc) &&
        Objects.equals(this.cpc, adGroupWebpageServiceBid.cpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupCpc, bidSource, keywordCpc, cpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupWebpageServiceBid {\n");
    
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

