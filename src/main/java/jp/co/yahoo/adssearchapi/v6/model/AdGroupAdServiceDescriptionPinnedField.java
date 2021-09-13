package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceDescriptionPinnedFieldは、説明文の表示位置を固定する箇所を指定するフィールドです。<br> このフィールドは、ADD時は省略可能となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupAdServiceDescriptionPinnedField object is a field that specifies where to fix the display position of the description.<br> This field is optional in ADD operation, and will be ignored in SET operation.</div> <dl class=term>   <dt class=\"term__item\">UNSPECIFIED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定なしです。</span><span lang=\"en\">unspecified.</span></dd>   <dt class=\"term__item\">DESCRIPTION1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">説明文1です。</span><span lang=\"en\">description1.</span></dd>   <dt class=\"term__item\">DESCRIPTION2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">説明文2です。</span><span lang=\"en\">description2.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceDescriptionPinnedField {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  DESCRIPTION1("DESCRIPTION1"),
  
  DESCRIPTION2("DESCRIPTION2"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceDescriptionPinnedField(String value) {
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
  public static AdGroupAdServiceDescriptionPinnedField fromValue(String value) {
    for (AdGroupAdServiceDescriptionPinnedField b : AdGroupAdServiceDescriptionPinnedField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

