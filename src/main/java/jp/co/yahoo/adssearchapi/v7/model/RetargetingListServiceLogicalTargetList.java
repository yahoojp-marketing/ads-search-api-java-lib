package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v7.model.RetargetingListServiceLogicalGroup;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceLogicalTargetListは、組合せターゲットリストの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※targetListTypeがLOGICALの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceLogicalTargetList is an object that holds the combination target list information.&lt;br&gt; This field is optional.&lt;br&gt; If the targetListType is LOGICAL, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceLogicalTargetListは、組合せターゲットリストの情報を保持するオブジェクトです。<br> このフィールドは、省略可能となります。<br> ※targetListTypeがLOGICALの場合、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceLogicalTargetList is an object that holds the combination target list information.<br> This field is optional.<br> If the targetListType is LOGICAL, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceLogicalTargetList   {
  @JsonProperty("logicalGroup")
  @Valid
  private List<RetargetingListServiceLogicalGroup> logicalGroup = null;

  public RetargetingListServiceLogicalTargetList logicalGroup(List<RetargetingListServiceLogicalGroup> logicalGroup) {
    this.logicalGroup = logicalGroup;
    return this;
  }

  public RetargetingListServiceLogicalTargetList addLogicalGroupItem(RetargetingListServiceLogicalGroup logicalGroupItem) {
    if (this.logicalGroup == null) {
      this.logicalGroup = new ArrayList<>();
    }
    this.logicalGroup.add(logicalGroupItem);
    return this;
  }

  /**
   * Get logicalGroup
   * @return logicalGroup
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceLogicalGroup> getLogicalGroup() {
    return logicalGroup;
  }

  public void setLogicalGroup(List<RetargetingListServiceLogicalGroup> logicalGroup) {
    this.logicalGroup = logicalGroup;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceLogicalTargetList retargetingListServiceLogicalTargetList = (RetargetingListServiceLogicalTargetList) o;
    return Objects.equals(this.logicalGroup, retargetingListServiceLogicalTargetList.logicalGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logicalGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceLogicalTargetList {\n");
    
    sb.append("    logicalGroup: ").append(toIndentedString(logicalGroup)).append("\n");
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

