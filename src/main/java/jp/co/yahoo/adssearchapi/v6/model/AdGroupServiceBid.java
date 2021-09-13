package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.AdGroupServiceBidSource;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AdGroupServiceBidオブジェクトは、入札価格を表示します。&lt;br&gt; ADDおよびSET時、このフィールドは省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AdGroupServiceBid object displays the bid values.&lt;br&gt; This field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AdGroupServiceBidオブジェクトは、入札価格を表示します。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceBid object displays the bid values.<br> This field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AdGroupServiceBid   {
  @JsonProperty("bidSource")
  private AdGroupServiceBidSource bidSource = null;

  @JsonProperty("maxCpc")
  private Long maxCpc = null;

  public AdGroupServiceBid bidSource(AdGroupServiceBidSource bidSource) {
    this.bidSource = bidSource;
    return this;
  }

  /**
   * Get bidSource
   * @return bidSource
  */
  @ApiModelProperty(value = "")

  @Valid

  public AdGroupServiceBidSource getBidSource() {
    return bidSource;
  }

  public void setBidSource(AdGroupServiceBidSource bidSource) {
    this.bidSource = bidSource;
  }

  public AdGroupServiceBid maxCpc(Long maxCpc) {
    this.maxCpc = maxCpc;
    return this;
  }

  /**
   * <div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。</div> <div lang=\"en\">Keyword bid (CPC).<br> This field is optional. The default value in ADD operation will be 1.</div> 
   * @return maxCpc
  */
  @ApiModelProperty(value = "<div lang=\"ja\">キーワード入札価格です。<br> このフィールドは、省略可能となります。その際、ADD時のデフォルト設定値は1となります。</div> <div lang=\"en\">Keyword bid (CPC).<br> This field is optional. The default value in ADD operation will be 1.</div> ")


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
    AdGroupServiceBid adGroupServiceBid = (AdGroupServiceBid) o;
    return Objects.equals(this.bidSource, adGroupServiceBid.bidSource) &&
        Objects.equals(this.maxCpc, adGroupServiceBid.maxCpc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidSource, maxCpc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupServiceBid {\n");
    
    sb.append("    bidSource: ").append(toIndentedString(bidSource)).append("\n");
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

