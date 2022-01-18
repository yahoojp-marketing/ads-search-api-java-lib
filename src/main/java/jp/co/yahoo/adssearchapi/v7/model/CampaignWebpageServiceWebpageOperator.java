package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">CampaignWebpageServiceWebpageOperatorは、URLの条件種別です。<br> このフィールドは、typeがURLの場合のみ指定できます。<br> operatorにEQUALSを指定する場合は、conditionsに1件のみ指定できます。<br> また、このフィールドはSETおよびREMOVE時に無視されます。</div> <div lang=\"en\">CampaignWebpageServiceWebpageOperator is a condition type of URL. <br>  This field can be specified only if the type is URL.<br>  If you specified EQUALS in operator, you can specify only one value in condition. <br> This field will be ignored in SET and REMOVE operation.</div> <dl class=term>   <dt class=\"term__item\">CONTAINS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値を含みます。</span><span lang=\"en\">Contains the selected value.</span></dd>   <dt class=\"term__item\">EQUALS</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定の値と一致します。</span><span lang=\"en\">Equal to selected value.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum CampaignWebpageServiceWebpageOperator {
  
  CONTAINS("CONTAINS"),
  
  EQUALS("EQUALS"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  CampaignWebpageServiceWebpageOperator(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CampaignWebpageServiceWebpageOperator fromValue(String value) {
    for (CampaignWebpageServiceWebpageOperator b : CampaignWebpageServiceWebpageOperator.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

