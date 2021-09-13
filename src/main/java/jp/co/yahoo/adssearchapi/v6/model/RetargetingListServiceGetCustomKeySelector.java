package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.RetargetingListServiceTargetListOwner;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceGetCustomKeySelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceGetCustomKeySelector object holds search condition (execution parameter).&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceGetCustomKeySelectorは、ターゲットリストの検索条件（実行パラメータ）を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceGetCustomKeySelector object holds search condition (execution parameter).</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceGetCustomKeySelector   {
  @JsonProperty("accountId")
  private Long accountId;

  @JsonProperty("targetListOwner")
  private RetargetingListServiceTargetListOwner targetListOwner = null;

  public RetargetingListServiceGetCustomKeySelector accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(required = true, value = "<div lang=\"ja\">検索条件：アカウントIDです。</div> <div lang=\"en\">Search condition: Account ID.</div> ")
  @NotNull


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public RetargetingListServiceGetCustomKeySelector targetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = targetListOwner;
    return this;
  }

  /**
   * Get targetListOwner
   * @return targetListOwner
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceTargetListOwner getTargetListOwner() {
    return targetListOwner;
  }

  public void setTargetListOwner(RetargetingListServiceTargetListOwner targetListOwner) {
    this.targetListOwner = targetListOwner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceGetCustomKeySelector retargetingListServiceGetCustomKeySelector = (RetargetingListServiceGetCustomKeySelector) o;
    return Objects.equals(this.accountId, retargetingListServiceGetCustomKeySelector.accountId) &&
        Objects.equals(this.targetListOwner, retargetingListServiceGetCustomKeySelector.targetListOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, targetListOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceGetCustomKeySelector {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    targetListOwner: ").append(toIndentedString(targetListOwner)).append("\n");
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

