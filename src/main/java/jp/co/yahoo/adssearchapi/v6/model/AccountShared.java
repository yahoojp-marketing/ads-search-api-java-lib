package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;AccountSharedオブジェクトは、アカウント内で共有できる対象外キーワードリストの情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;AccountShared object describes negative keyword list which can be shared within the account.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">AccountSharedオブジェクトは、アカウント内で共有できる対象外キーワードリストの情報を表します。</div> <div lang=\"en\">AccountShared object describes negative keyword list which can be shared within the account.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class AccountShared   {
  @JsonProperty("accountId")
  private Long accountId = null;

  @JsonProperty("memberCount")
  private Integer memberCount = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("referenceCount")
  private Integer referenceCount = null;

  @JsonProperty("sharedListId")
  private Long sharedListId = null;

  public AccountShared accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * <div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> 
   * @return accountId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">アカウントIDです。</div> <div lang=\"en\">Account ID.</div> ")


  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public AccountShared memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

  /**
   * <div lang=\"ja\">対象外キーワードリストに含まれるアイテム（検索対象外キーワード）数です。</div> <div lang=\"en\">Number of items on Negative keyword list (keyword excluded on search).</div> 
   * @return memberCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストに含まれるアイテム（検索対象外キーワード）数です。</div> <div lang=\"en\">Number of items on Negative keyword list (keyword excluded on search).</div> ")


  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public AccountShared name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <div lang=\"ja\">対象外キーワードリスト名です。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list name.<br>This field is required in ADD and SET operation.</div> 
   * @return name
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリスト名です。<br>ADDおよびSET時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list name.<br>This field is required in ADD and SET operation.</div> ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountShared referenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
    return this;
  }

  /**
   * <div lang=\"ja\">対象外キーワードリストを使用している キャンペーン数です。</div> <div lang=\"en\">Number of campaigns which use negative keyword list.</div> 
   * @return referenceCount
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストを使用している キャンペーン数です。</div> <div lang=\"en\">Number of campaigns which use negative keyword list.</div> ")


  public Integer getReferenceCount() {
    return referenceCount;
  }

  public void setReferenceCount(Integer referenceCount) {
    this.referenceCount = referenceCount;
  }

  public AccountShared sharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
    return this;
  }

  /**
   * <div lang=\"ja\">対象外キーワードリストIDです。<br>SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list ID.<br>This field is required in SET and REMOVE operation.</div> 
   * @return sharedListId
  */
  @ApiModelProperty(value = "<div lang=\"ja\">対象外キーワードリストIDです。<br>SETおよびREMOVE時、このフィールドは必須となります。</div> <div lang=\"en\">Negative keyword list ID.<br>This field is required in SET and REMOVE operation.</div> ")


  public Long getSharedListId() {
    return sharedListId;
  }

  public void setSharedListId(Long sharedListId) {
    this.sharedListId = sharedListId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountShared accountShared = (AccountShared) o;
    return Objects.equals(this.accountId, accountShared.accountId) &&
        Objects.equals(this.memberCount, accountShared.memberCount) &&
        Objects.equals(this.name, accountShared.name) &&
        Objects.equals(this.referenceCount, accountShared.referenceCount) &&
        Objects.equals(this.sharedListId, accountShared.sharedListId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, memberCount, name, referenceCount, sharedListId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountShared {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referenceCount: ").append(toIndentedString(referenceCount)).append("\n");
    sb.append("    sharedListId: ").append(toIndentedString(sharedListId)).append("\n");
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

