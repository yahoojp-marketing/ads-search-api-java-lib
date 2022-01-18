package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceTargetListOwnerは、ターゲットリストの所有状態を表します。</div> <div lang=\"en\">RetargetingListServiceTargetListOwner describes the owner information of the target list.</div> <dl class=term>   <dt class=\"term__item\">OWNER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">アカウントで専有されているターゲットリストです。</span><span lang=\"en\">The exclusive target list owned by an account.</span></dd>   <dt class=\"term__item\">SHARED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">複数のアカウント間で共有されているターゲットリストです。</span><span lang=\"en\">The target list shared by multiple accounts.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceTargetListOwner {
  
  OWNER("OWNER"),
  
  SHARED("SHARED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceTargetListOwner(String value) {
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
  public static RetargetingListServiceTargetListOwner fromValue(String value) {
    for (RetargetingListServiceTargetListOwner b : RetargetingListServiceTargetListOwner.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

