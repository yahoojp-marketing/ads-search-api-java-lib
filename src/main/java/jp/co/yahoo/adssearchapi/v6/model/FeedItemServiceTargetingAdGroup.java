package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceTargetingAdGroupオブジェクトは、データ自動挿入の広告グループとの紐付けを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceTargetingAdGroup contains ad group setting for Data Auto Insertion.&lt;br&gt; Although this field will be returned in the response, it will be  ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceTargetingAdGroupオブジェクトは、データ自動挿入の広告グループとの紐付けを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceTargetingAdGroup contains ad group setting for Data Auto Insertion.<br> Although this field will be returned in the response, it will be  ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceTargetingAdGroup   {
  @JsonProperty("targetingAdGroupId")
  private Long targetingAdGroupId = null;

  public FeedItemServiceTargetingAdGroup targetingAdGroupId(Long targetingAdGroupId) {
    this.targetingAdGroupId = targetingAdGroupId;
    return this;
  }

  /**
   * <div lang=\"ja\">配信に使用する広告グループIDです。<br> ※設定を解除する場合は「0」を指定してください。<br> ※addのリクエストで、「0」指定は未 指定と同じ扱いになります。<br> データ自動挿入の場合、このフィールドはADDおよびSET時に省略可能となります。 </div> <div lang=\"en\">Targeting Ad group ID.<br> * To deactive, insert &#34;0&#34;.<br> * It would be &#34;no setting&#34;, if &#34;0&#34; is set in add request.<br> For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> 
   * @return targetingAdGroupId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信に使用する広告グループIDです。<br> ※設定を解除する場合は「0」を指定してください。<br> ※addのリクエストで、「0」指定は未 指定と同じ扱いになります。<br> データ自動挿入の場合、このフィールドはADDおよびSET時に省略可能となります。 </div> <div lang=\"en\">Targeting Ad group ID.<br> * To deactive, insert &#34;0&#34;.<br> * It would be &#34;no setting&#34;, if &#34;0&#34; is set in add request.<br> For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> ")


  public Long getTargetingAdGroupId() {
    return targetingAdGroupId;
  }

  public void setTargetingAdGroupId(Long targetingAdGroupId) {
    this.targetingAdGroupId = targetingAdGroupId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceTargetingAdGroup feedItemServiceTargetingAdGroup = (FeedItemServiceTargetingAdGroup) o;
    return Objects.equals(this.targetingAdGroupId, feedItemServiceTargetingAdGroup.targetingAdGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingAdGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceTargetingAdGroup {\n");
    
    sb.append("    targetingAdGroupId: ").append(toIndentedString(targetingAdGroupId)).append("\n");
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

