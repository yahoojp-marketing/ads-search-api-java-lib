package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceIsAllVisitorRule;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceIsDateSpecificRule;
import jp.co.yahoo.adssearchapi.v5.model.RetargetingListServiceRuleGroup;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceRuleBaseTargetListは、ベースターゲットリストの情報を保持するオブジェクトです。&lt;br&gt; このフィールドは、省略可能となります。&lt;br&gt; ※targetListTypeがRULEの場合、このフィールドは必須となります。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceRuleBaseTargetList is an object that holds Rule based target list information.&lt;br&gt; This field is optional.&lt;br&gt;*If the targetListType is RULE, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceRuleBaseTargetListは、ベースターゲットリストの情報を保持するオブジェクトです。<br> このフィールドは、省略可能となります。<br> ※targetListTypeがRULEの場合、このフィールドは必須となります。</div> <div lang=\"en\">RetargetingListServiceRuleBaseTargetList is an object that holds Rule based target list information.<br> This field is optional.<br>*If the targetListType is RULE, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class RetargetingListServiceRuleBaseTargetList   {
  @JsonProperty("endDate")
  private String endDate = null;

  @JsonProperty("isAllVisitorRule")
  private RetargetingListServiceIsAllVisitorRule isAllVisitorRule = null;

  @JsonProperty("isDateSpecificRule")
  private RetargetingListServiceIsDateSpecificRule isDateSpecificRule = null;

  @JsonProperty("rules")
  @Valid
  private List<RetargetingListServiceRuleGroup> rules = null;

  @JsonProperty("startDate")
  private String startDate = null;

  public RetargetingListServiceRuleBaseTargetList endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ルール適用終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> isDateSpecificがTRUEである場合、ADDおよびSET時に必須となります。<br> ※YYYYMMDD形式です。<br> ※リクエスト日は2037/12/30まで 指定可能です。</div> <div lang=\"en\">End date of rule setting.<br> This field is optional in ADD and SET operation.<br> If isDateSpecific is TRUE, this field  is required in ADD and SET operation.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30</div> 
   * @return endDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ルール適用終了日です。<br> このフィールドは、ADDおよびSET時に省略可能となります。<br> isDateSpecificがTRUEである場合、ADDおよびSET時に必須となります。<br> ※YYYYMMDD形式です。<br> ※リクエスト日は2037/12/30まで 指定可能です。</div> <div lang=\"en\">End date of rule setting.<br> This field is optional in ADD and SET operation.<br> If isDateSpecific is TRUE, this field  is required in ADD and SET operation.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30</div> ")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public RetargetingListServiceRuleBaseTargetList isAllVisitorRule(RetargetingListServiceIsAllVisitorRule isAllVisitorRule) {
    this.isAllVisitorRule = isAllVisitorRule;
    return this;
  }

  /**
   * Get isAllVisitorRule
   * @return isAllVisitorRule
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceIsAllVisitorRule getIsAllVisitorRule() {
    return isAllVisitorRule;
  }

  public void setIsAllVisitorRule(RetargetingListServiceIsAllVisitorRule isAllVisitorRule) {
    this.isAllVisitorRule = isAllVisitorRule;
  }

  public RetargetingListServiceRuleBaseTargetList isDateSpecificRule(RetargetingListServiceIsDateSpecificRule isDateSpecificRule) {
    this.isDateSpecificRule = isDateSpecificRule;
    return this;
  }

  /**
   * Get isDateSpecificRule
   * @return isDateSpecificRule
  */
  @ApiModelProperty(value = "")

  @Valid

  public RetargetingListServiceIsDateSpecificRule getIsDateSpecificRule() {
    return isDateSpecificRule;
  }

  public void setIsDateSpecificRule(RetargetingListServiceIsDateSpecificRule isDateSpecificRule) {
    this.isDateSpecificRule = isDateSpecificRule;
  }

  public RetargetingListServiceRuleBaseTargetList rules(List<RetargetingListServiceRuleGroup> rules) {
    this.rules = rules;
    return this;
  }

  public RetargetingListServiceRuleBaseTargetList addRulesItem(RetargetingListServiceRuleGroup rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<RetargetingListServiceRuleGroup> getRules() {
    return rules;
  }

  public void setRules(List<RetargetingListServiceRuleGroup> rules) {
    this.rules = rules;
  }

  public RetargetingListServiceRuleBaseTargetList startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <div lang=\"ja\">ルール適用開始日です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> isDateSpecificがTRUEである場合、ADDおよびSET時に必須となります。 <br> ※YYYYMMDD形式です。<br>※リクエスト日は2037/12/30まで 指定可能です。</div> <div lang=\"en\">Start date of rule setting.<br> This field is optional in ADD and SET operation.<br> If isDateSpecific is TRUE, this field is  required in ADD and SET operation.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30 </div> 
   * @return startDate
  */
  @ApiModelProperty(value = "<div lang=\"ja\">ルール適用開始日です。<br> ADDおよびSET時、このフィールドは省略可能となります。<br> isDateSpecificがTRUEである場合、ADDおよびSET時に必須となります。 <br> ※YYYYMMDD形式です。<br>※リクエスト日は2037/12/30まで 指定可能です。</div> <div lang=\"en\">Start date of rule setting.<br> This field is optional in ADD and SET operation.<br> If isDateSpecific is TRUE, this field is  required in ADD and SET operation.<br> *In YYYYMMDD format<br> *Request date can be set up to 2037/12/30 </div> ")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceRuleBaseTargetList retargetingListServiceRuleBaseTargetList = (RetargetingListServiceRuleBaseTargetList) o;
    return Objects.equals(this.endDate, retargetingListServiceRuleBaseTargetList.endDate) &&
        Objects.equals(this.isAllVisitorRule, retargetingListServiceRuleBaseTargetList.isAllVisitorRule) &&
        Objects.equals(this.isDateSpecificRule, retargetingListServiceRuleBaseTargetList.isDateSpecificRule) &&
        Objects.equals(this.rules, retargetingListServiceRuleBaseTargetList.rules) &&
        Objects.equals(this.startDate, retargetingListServiceRuleBaseTargetList.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endDate, isAllVisitorRule, isDateSpecificRule, rules, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceRuleBaseTargetList {\n");
    
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isAllVisitorRule: ").append(toIndentedString(isAllVisitorRule)).append("\n");
    sb.append("    isDateSpecificRule: ").append(toIndentedString(isDateSpecificRule)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

