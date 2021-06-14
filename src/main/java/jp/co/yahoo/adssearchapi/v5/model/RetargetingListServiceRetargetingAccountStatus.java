package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceReviewStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRetargetingAccountStatusは、アカウントのリタゲ審査ステータスを保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRetargetingAccountStatus is an object that holds retargeting review status of account.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRetargetingAccountStatusは、アカウントのリタゲ審査ステータスを保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceRetargetingAccountStatus is an object that holds retargeting review status of account.</div> ")

public class RetargetingListServiceRetargetingAccountStatus   {
  @JsonProperty("agreeDate")
  private JsonNullable<String> agreeDate = JsonNullable.undefined();

  @JsonProperty("reviewRequestDate")
  private JsonNullable<String> reviewRequestDate = JsonNullable.undefined();

  @JsonProperty("reviewStatus")
  private JsonNullable<RetargetingListServiceReviewStatus> reviewStatus = JsonNullable.undefined();

  public RetargetingListServiceRetargetingAccountStatus agreeDate(String agreeDate) {
    this.agreeDate = JsonNullable.of(agreeDate);
    return this;
  }

  /**
   * <div lang=\"ja\">規約同意日です。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Agreement date.<br> *In YYYYMMDD format.</div> 
   * @return agreeDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">規約同意日です。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Agreement date.<br> *In YYYYMMDD format.</div> ")


  public JsonNullable<String> getAgreeDate() {
    return agreeDate;
  }

  public void setAgreeDate(JsonNullable<String> agreeDate) {
    this.agreeDate = agreeDate;
  }

  public RetargetingListServiceRetargetingAccountStatus reviewRequestDate(String reviewRequestDate) {
    this.reviewRequestDate = JsonNullable.of(reviewRequestDate);
    return this;
  }

  /**
   * <div lang=\"ja\">再審査依頼日です。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Re-examination review request date.<br> *In YYYYMMDD format.</div> 
   * @return reviewRequestDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">再審査依頼日です。<br> ※YYYYMMDD形式です。</div> <div lang=\"en\">Re-examination review request date.<br> *In YYYYMMDD format.</div> ")


  public JsonNullable<String> getReviewRequestDate() {
    return reviewRequestDate;
  }

  public void setReviewRequestDate(JsonNullable<String> reviewRequestDate) {
    this.reviewRequestDate = reviewRequestDate;
  }

  public RetargetingListServiceRetargetingAccountStatus reviewStatus(RetargetingListServiceReviewStatus reviewStatus) {
    this.reviewStatus = JsonNullable.of(reviewStatus);
    return this;
  }

  /**
   * Get reviewStatus
   * @return reviewStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RetargetingListServiceReviewStatus> getReviewStatus() {
    return reviewStatus;
  }

  public void setReviewStatus(JsonNullable<RetargetingListServiceReviewStatus> reviewStatus) {
    this.reviewStatus = reviewStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRetargetingAccountStatus retargetingListServiceRetargetingAccountStatus = (RetargetingListServiceRetargetingAccountStatus) o;
    return Objects.equals(this.agreeDate, retargetingListServiceRetargetingAccountStatus.agreeDate) &&
        Objects.equals(this.reviewRequestDate, retargetingListServiceRetargetingAccountStatus.reviewRequestDate) &&
        Objects.equals(this.reviewStatus, retargetingListServiceRetargetingAccountStatus.reviewStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreeDate, reviewRequestDate, reviewStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRetargetingAccountStatus {\n");
    
    sb.append("    agreeDate: ").append(toIndentedString(agreeDate)).append("\n");
    sb.append("    reviewRequestDate: ").append(toIndentedString(reviewRequestDate)).append("\n");
    sb.append("    reviewStatus: ").append(toIndentedString(reviewStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

