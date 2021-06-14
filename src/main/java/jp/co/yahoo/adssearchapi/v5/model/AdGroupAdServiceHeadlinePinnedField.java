package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupAdServiceHeadlinePinnedFieldは、タイトルの表示位置を固定する箇所を指定するフィールドです。<br> このフィールドは、ADD時は省略可能となり、SET時は無視されます。</div> <div lang=\"en\">AdGroupAdServiceHeadlinePinnedField object is a field that specifies where to fix the display position of the title.<br> This field is optional in ADD operation, and will be ignored in SET operation.</div> <dl class=term>   <dt class=\"term__item\">UNSPECIFIED</dt>   <dd class=\"term__desc\"><span lang=\"ja\">指定なしです。</span><span lang=\"en\">unspecified.</span></dd>   <dt class=\"term__item\">HEADLINE1</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイトル1です。</span><span lang=\"en\">headline1.</span></dd>   <dt class=\"term__item\">HEADLINE2</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイトル2です。</span><span lang=\"en\">headline2.</span></dd>   <dt class=\"term__item\">HEADLINE3</dt>   <dd class=\"term__desc\"><span lang=\"ja\">タイトル3です。</span><span lang=\"en\">headline3.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupAdServiceHeadlinePinnedField {
  
  UNSPECIFIED("UNSPECIFIED"),
  
  HEADLINE1("HEADLINE1"),
  
  HEADLINE2("HEADLINE2"),
  
  HEADLINE3("HEADLINE3"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupAdServiceHeadlinePinnedField(String value) {
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
  public static AdGroupAdServiceHeadlinePinnedField fromValue(String value) {
    for (AdGroupAdServiceHeadlinePinnedField b : AdGroupAdServiceHeadlinePinnedField.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

