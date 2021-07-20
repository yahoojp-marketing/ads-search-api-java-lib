package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AdGroupServiceAdRotationModeは、広告表示の最適化設定を表します。<br> ADDおよびSET時、このフィールドは省略可能となります。</div> <div lang=\"en\">AdGroupServiceAdRotationMode describes Ad Rotation settings for optimizing and displaying ads.<br> This field is optional in ADD and SET operation.</div> <dl class=term>   <dt class=\"term__item\">OPTIMIZE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">最適化して配信します。</span><span lang=\"en\">Optimizes and display ads</span></dd>   <dt class=\"term__item\">ROTATE_FOREVER</dt>   <dd class=\"term__desc\"><span lang=\"ja\">常に均等に配信します（最適化しない）。</span><span lang=\"en\">Always rotates ads evenly (not optimized)</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AdGroupServiceAdRotationMode {
  
  OPTIMIZE("OPTIMIZE"),
  
  ROTATE_FOREVER("ROTATE_FOREVER"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AdGroupServiceAdRotationMode(String value) {
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
  public static AdGroupServiceAdRotationMode fromValue(String value) {
    for (AdGroupServiceAdRotationMode b : AdGroupServiceAdRotationMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

