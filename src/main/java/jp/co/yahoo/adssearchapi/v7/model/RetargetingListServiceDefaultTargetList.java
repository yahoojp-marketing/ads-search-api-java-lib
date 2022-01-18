package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v7.model.RetargetingListServiceTag;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceDefaultTargetListは、デフォルトターゲットリストを保持するオブジェクトです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※targetListTypeがDEFAULTの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceDefaultTargetList is an object that holds default target list.&lt;br&gt; This field is optional.&lt;br&gt; If the targetListType is DEFAULT, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceDefaultTargetListは、デフォルトターゲットリストを保持するオブジェクトです。<br> このフィールドは、省略可能となります。<br> ※targetListTypeがDEFAULTの場合、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceDefaultTargetList is an object that holds default target list.<br> This field is optional.<br> If the targetListType is DEFAULT, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceDefaultTargetList   {
  @JsonProperty("tag")
  private RetargetingListServiceTag tag = null;

  public RetargetingListServiceDefaultTargetList tag(RetargetingListServiceTag tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTag getTag() {
    return tag;
  }

  public void setTag(RetargetingListServiceTag tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceDefaultTargetList retargetingListServiceDefaultTargetList = (RetargetingListServiceDefaultTargetList) o;
    return Objects.equals(this.tag, retargetingListServiceDefaultTargetList.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceDefaultTargetList {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

