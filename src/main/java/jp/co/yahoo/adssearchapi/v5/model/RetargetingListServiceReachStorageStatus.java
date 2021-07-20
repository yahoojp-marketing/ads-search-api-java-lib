package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">RetargetingListServiceReachStorageStatusは、ターゲットリストの種別です。<br> このフィールドは省略可能となります。<br> ※LogicalTargetListの場合、このフィールドはレスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">RetargetingListServiceReachStorageStatus is the flag status to store Cookie reach.<br> This field is optional.<br> *For logicalTargetList, this field will be returned  in the response, but it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">OPEN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">有効です。<br>リーチを蓄積します。</span><span lang=\"en\">Valid status.<br>Reach will be stored.</span></dd>   <dt class=\"term__item\">CLOSED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">無効です。<br>リーチを蓄積しません。</span><span lang=\"en\">Invalid status.<br>Reach will not be stored.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum RetargetingListServiceReachStorageStatus {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  RetargetingListServiceReachStorageStatus(String value) {
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
  public static RetargetingListServiceReachStorageStatus fromValue(String value) {
    for (RetargetingListServiceReachStorageStatus b : RetargetingListServiceReachStorageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

