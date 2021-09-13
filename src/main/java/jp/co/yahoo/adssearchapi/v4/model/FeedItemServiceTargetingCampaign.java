package jp.co.yahoo.adssearchapi.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;FeedItemServiceTargetingCampaignオブジェクトは、データ自動挿入のキャンペーンとの紐付けを表します。&lt;br&gt; このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。&lt;br&gt; ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;FeedItemServiceTargetingCampaign contains Campaign setting for Data Auto Insertion.&lt;br&gt; Although this field will be returned in the response, it will be ignored on input.&lt;br&gt; *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">FeedItemServiceTargetingCampaignオブジェクトは、データ自動挿入のキャンペーンとの紐付けを表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。<br> ※アドカスタマイザーの場合は、ADDおよびSET時に省略可能となります。</div> <div lang=\"en\">FeedItemServiceTargetingCampaign contains Campaign setting for Data Auto Insertion.<br> Although this field will be returned in the response, it will be ignored on input.<br> *For AD_CUSTOMIZER, this field is optional in ADD and SET operation.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class FeedItemServiceTargetingCampaign   {
  @JsonProperty("targetingCampaignId")
  private Long targetingCampaignId = null;

  public FeedItemServiceTargetingCampaign targetingCampaignId(Long targetingCampaignId) {
    this.targetingCampaignId = targetingCampaignId;
    return this;
  }

  /**
   * <div lang=\"ja\">配信に使用するキャンペーンIDです。<br> ※設定を解除する場合は「0」を指定してください。<br> ※addのリクエストで、「0」指定は未指定と同じ扱いになります。<br> データ自動挿入の場合、このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">Campaign ID used for ad display.<br> *Specify &#39;0&#39; to clear the setting.<br> *The specified &#39;0&#39; will be handled as same as &#39;not specified&#39; by add request.<br> For AD_CUSTOMIZER, This field is required in ADD and SET operation.</div> 
   * @return targetingCampaignId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">配信に使用するキャンペーンIDです。<br> ※設定を解除する場合は「0」を指定してください。<br> ※addのリクエストで、「0」指定は未指定と同じ扱いになります。<br> データ自動挿入の場合、このフィールドはADDおよびSET時に必須となります。</div> <div lang=\"en\">Campaign ID used for ad display.<br> *Specify &#39;0&#39; to clear the setting.<br> *The specified &#39;0&#39; will be handled as same as &#39;not specified&#39; by add request.<br> For AD_CUSTOMIZER, This field is required in ADD and SET operation.</div> ")


  public Long getTargetingCampaignId() {
    return targetingCampaignId;
  }

  public void setTargetingCampaignId(Long targetingCampaignId) {
    this.targetingCampaignId = targetingCampaignId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedItemServiceTargetingCampaign feedItemServiceTargetingCampaign = (FeedItemServiceTargetingCampaign) o;
    return Objects.equals(this.targetingCampaignId, feedItemServiceTargetingCampaign.targetingCampaignId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetingCampaignId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedItemServiceTargetingCampaign {\n");
    
    sb.append("    targetingCampaignId: ").append(toIndentedString(targetingCampaignId)).append("\n");
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

