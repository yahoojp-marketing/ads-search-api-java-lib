package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.ConversionTrackerServiceValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;ConversionTrackerServicePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;ConversionTrackerServicePage object shows entry of ConversionTracker.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">ConversionTrackerServicePageオブジェクトは、取得されるコンバージョントラッカー情報のエントリーを表します。</div> <div lang=\"en\">ConversionTrackerServicePage object shows entry of ConversionTracker.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class ConversionTrackerServicePage   {
  @JsonProperty("totalAllConversionValue")
  private String totalAllConversionValue = null;

  @JsonProperty("totalAllConversions")
  private Long totalAllConversions = null;

  @JsonProperty("totalConversionValue")
  private String totalConversionValue = null;

  @JsonProperty("totalConversions")
  private Long totalConversions = null;

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<ConversionTrackerServiceValue> values = null;

  public ConversionTrackerServicePage totalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定の対象コンバージョン値と、対象外コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> 
   * @return totalAllConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン値と、対象外コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> ")


  public String getTotalAllConversionValue() {
    return totalAllConversionValue;
  }

  public void setTotalAllConversionValue(String totalAllConversionValue) {
    this.totalAllConversionValue = totalAllConversionValue;
  }

  public ConversionTrackerServicePage totalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定の対象コンバージョン数と、対象外コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> 
   * @return totalAllConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン数と、対象外コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting and the value of conversions not on Auto Bidding setting.</div> ")


  public Long getTotalAllConversions() {
    return totalAllConversions;
  }

  public void setTotalAllConversions(Long totalAllConversions) {
    this.totalAllConversions = totalAllConversions;
  }

  public ConversionTrackerServicePage totalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定の対象コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> 
   * @return totalConversionValue
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン値の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> ")


  public String getTotalConversionValue() {
    return totalConversionValue;
  }

  public void setTotalConversionValue(String totalConversionValue) {
    this.totalConversionValue = totalConversionValue;
  }

  public ConversionTrackerServicePage totalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
    return this;
  }

  /**
   * <div lang=\"ja\">自動入札設定の対象コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> 
   * @return totalConversions
  */
  @ApiModelProperty(value = "<div lang=\"ja\">自動入札設定の対象コンバージョン数の合計です。</div> <div lang=\"en\">Total value of conversions on Auto Bidding setting.</div> ")


  public Long getTotalConversions() {
    return totalConversions;
  }

  public void setTotalConversions(Long totalConversions) {
    this.totalConversions = totalConversions;
  }

  public ConversionTrackerServicePage totalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
    return this;
  }

  /**
   * <div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> 
   * @return totalNumEntries
  */
  @ApiModelProperty(value = "<div lang=\"ja\">取得される項目の総件数です。</div> <div lang=\"en\">Total number of entries in the result that this page is a part of.</div> ")


  public Integer getTotalNumEntries() {
    return totalNumEntries;
  }

  public void setTotalNumEntries(Integer totalNumEntries) {
    this.totalNumEntries = totalNumEntries;
  }

  public ConversionTrackerServicePage values(List<ConversionTrackerServiceValue> values) {
    this.values = values;
    return this;
  }

  public ConversionTrackerServicePage addValuesItem(ConversionTrackerServiceValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ConversionTrackerServiceValue> getValues() {
    return values;
  }

  public void setValues(List<ConversionTrackerServiceValue> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTrackerServicePage conversionTrackerServicePage = (ConversionTrackerServicePage) o;
    return Objects.equals(this.totalAllConversionValue, conversionTrackerServicePage.totalAllConversionValue) &&
        Objects.equals(this.totalAllConversions, conversionTrackerServicePage.totalAllConversions) &&
        Objects.equals(this.totalConversionValue, conversionTrackerServicePage.totalConversionValue) &&
        Objects.equals(this.totalConversions, conversionTrackerServicePage.totalConversions) &&
        Objects.equals(this.totalNumEntries, conversionTrackerServicePage.totalNumEntries) &&
        Objects.equals(this.values, conversionTrackerServicePage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAllConversionValue, totalAllConversions, totalConversionValue, totalConversions, totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionTrackerServicePage {\n");
    
    sb.append("    totalAllConversionValue: ").append(toIndentedString(totalAllConversionValue)).append("\n");
    sb.append("    totalAllConversions: ").append(toIndentedString(totalAllConversions)).append("\n");
    sb.append("    totalConversionValue: ").append(toIndentedString(totalConversionValue)).append("\n");
    sb.append("    totalConversions: ").append(toIndentedString(totalConversions)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

