package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceCustomKey;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceCustomKeyPageは、ターゲットリストのカスタムキー情報を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceCustomKeyPage is an object that holds custom key informations of target list.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceCustomKeyPageは、ターゲットリストのカスタムキー情報を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceCustomKeyPage is an object that holds custom key informations of target list.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceCustomKeyPage   {
  @JsonProperty("customKeys")
  private RetargetingListServiceCustomKey customKeys = null;

  @JsonProperty("totalNumEntries")
  private Integer totalNumEntries;

  public RetargetingListServiceCustomKeyPage customKeys(RetargetingListServiceCustomKey customKeys) {
    this.customKeys = customKeys;
    return this;
  }

  /**
   * Get customKeys
   * @return customKeys
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceCustomKey getCustomKeys() {
    return customKeys;
  }

  public void setCustomKeys(RetargetingListServiceCustomKey customKeys) {
    this.customKeys = customKeys;
  }

  public RetargetingListServiceCustomKeyPage totalNumEntries(Integer totalNumEntries) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCustomKeyPage retargetingListServiceCustomKeyPage = (RetargetingListServiceCustomKeyPage) o;
    return Objects.equals(this.customKeys, retargetingListServiceCustomKeyPage.customKeys) &&
        Objects.equals(this.totalNumEntries, retargetingListServiceCustomKeyPage.totalNumEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customKeys, totalNumEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCustomKeyPage {\n");
    
    sb.append("    customKeys: ").append(toIndentedString(customKeys)).append("\n");
    sb.append("    totalNumEntries: ").append(toIndentedString(totalNumEntries)).append("\n");
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

