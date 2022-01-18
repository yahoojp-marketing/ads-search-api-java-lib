package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceTextAssetApprovalStatusは、審査状況を表します。<br> このフィールドは、レスポンスの際に返却されますが、リクエストの際には無視されます。</div> <div lang=\"en\">AdGroupAdServiceTextAssetApprovalStatus displays Editorial Status.<br> Although this field will be returned in the response, it will be ignored on input.</div> <dl class=term>   <dt class=\"term__item\">APPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">承認済です。</span><span lang=\"en\">The item is approved</span></dd>   <dt class=\"term__item\">REVIEW</dt>   <dd class=\"term__desc\"><span lang=\"ja\">審査中です。<br>新しく追加した広告テキストアセットが審査中となり、広告テキストアセットは未掲載です。</span><span lang=\"en\">Under editorial review<br>Newly added ad text asset are under review, and not displayed yet</span></dd>   <dt class=\"term__item\">PRE_DISAPPROVED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">掲載不可です。<br>新しく追加した広告テキストアセットが審査で承認されず非掲載です。</span><span lang=\"en\">The item was rejected<br>Newly added ad text asset have been rejected, so it cannot be displayed</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceTextAssetApprovalStatus {
  
  APPROVED("APPROVED"),
  
  REVIEW("REVIEW"),
  
  PRE_DISAPPROVED("PRE_DISAPPROVED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceTextAssetApprovalStatus(String value) {
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
  public static AdGroupAdServiceTextAssetApprovalStatus fromValue(String value) {
    for (AdGroupAdServiceTextAssetApprovalStatus b : AdGroupAdServiceTextAssetApprovalStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

