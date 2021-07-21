package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.CampaignFeedServiceList;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;CampaignFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;CampaignFeedServiceValue is a container of FeedItem information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">CampaignFeedServiceValueオブジェクトは、FeedItem情報を格納するコンテナです。</div> <div lang=\"en\">CampaignFeedServiceValue is a container of FeedItem information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class CampaignFeedServiceValue   {
  @JsonProperty("campaignFeedList")
  private CampaignFeedServiceList campaignFeedList = null;

  @JsonProperty("errors")
  @Valid
  private List<Error> errors = null;

  @JsonProperty("operationSucceeded")
  private Boolean operationSucceeded = null;

  public CampaignFeedServiceValue campaignFeedList(CampaignFeedServiceList campaignFeedList) {
    this.campaignFeedList = campaignFeedList;
    return this;
  }

  /**
   * Get campaignFeedList
   * @return campaignFeedList
  */
  @ApiModelProperty(value = "")

  @Valid

  public CampaignFeedServiceList getCampaignFeedList() {
    return campaignFeedList;
  }

  public void setCampaignFeedList(CampaignFeedServiceList campaignFeedList) {
    this.campaignFeedList = campaignFeedList;
  }

  public CampaignFeedServiceValue errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public CampaignFeedServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public CampaignFeedServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">The process results. If true, the process succeeded. If false, the process failed.</div> ")


  public Boolean getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignFeedServiceValue campaignFeedServiceValue = (CampaignFeedServiceValue) o;
    return Objects.equals(this.campaignFeedList, campaignFeedServiceValue.campaignFeedList) &&
        Objects.equals(this.errors, campaignFeedServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, campaignFeedServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFeedList, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignFeedServiceValue {\n");
    
    sb.append("    campaignFeedList: ").append(toIndentedString(campaignFeedList)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

