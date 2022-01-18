package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.DictionaryServiceAppLinkVendorValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceAppLinkVendorPageオブジェクトは、 アプリ計測ベンダー情報一覧を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceAppLinkVendorPage object is a container for App measurement vendor information list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceAppLinkVendorPageオブジェクトは、 アプリ計測ベンダー情報一覧を格納するコンテナです。</div> <div lang=\"en\">DictionaryServiceAppLinkVendorPage object is a container for App measurement vendor information list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceAppLinkVendorPage   {
  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  @JsonProperty("values")
  @Valid
  private List<DictionaryServiceAppLinkVendorValue> values = null;

  public DictionaryServiceAppLinkVendorPage totalNumEntries(Integer totalNumEntries) {
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

  public DictionaryServiceAppLinkVendorPage values(List<DictionaryServiceAppLinkVendorValue> values) {
    this.values = values;
    return this;
  }

  public DictionaryServiceAppLinkVendorPage addValuesItem(DictionaryServiceAppLinkVendorValue valuesItem) {
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

  public List<DictionaryServiceAppLinkVendorValue> getValues() {
    return values;
  }

  public void setValues(List<DictionaryServiceAppLinkVendorValue> values) {
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
    DictionaryServiceAppLinkVendorPage dictionaryServiceAppLinkVendorPage = (DictionaryServiceAppLinkVendorPage) o;
    return Objects.equals(this.totalNumEntries, dictionaryServiceAppLinkVendorPage.totalNumEntries) &&
        Objects.equals(this.values, dictionaryServiceAppLinkVendorPage.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumEntries, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceAppLinkVendorPage {\n");
    
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

