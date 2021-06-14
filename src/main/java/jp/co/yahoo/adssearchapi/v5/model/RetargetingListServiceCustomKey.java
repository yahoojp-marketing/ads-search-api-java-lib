package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;RetargetingListServiceCustomKeyは、カスタムキールールの評価式を保持するオブジェクトです。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;RetargetingListServiceCustomKey is an object that holds evaluation of custom key rules.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">RetargetingListServiceCustomKeyは、カスタムキールールの評価式を保持するオブジェクトです。</div> <div lang=\"en\">RetargetingListServiceCustomKey is an object that holds evaluation of custom key rules.</div> ")

public class RetargetingListServiceCustomKey   {
  @JsonProperty("textKey")
  @Valid
  private JsonNullable<List<String>> textKey = JsonNullable.undefined();

  public RetargetingListServiceCustomKey textKey(List<String> textKey) {
    this.textKey = JsonNullable.of(textKey);
    return this;
  }

  public RetargetingListServiceCustomKey addTextKeyItem(String textKeyItem) {
    if (this.textKey == null || !this.textKey.isPresent()) {
      this.textKey = JsonNullable.of(new ArrayList<>());
    }
    this.textKey.get().add(textKeyItem);
    return this;
  }

  /**
   * <div lang=\"ja\">評価項目</div> <div lang=\"en\">Evaluation items.</div> 
   * @return textKey
  */
  @ApiModelProperty(value = "<div lang=\"ja\">評価項目</div> <div lang=\"en\">Evaluation items.</div> ")


  public JsonNullable<List<String>> getTextKey() {
    return textKey;
  }

  public void setTextKey(JsonNullable<List<String>> textKey) {
    this.textKey = textKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetargetingListServiceCustomKey retargetingListServiceCustomKey = (RetargetingListServiceCustomKey) o;
    return Objects.equals(this.textKey, retargetingListServiceCustomKey.textKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetargetingListServiceCustomKey {\n");
    
    sb.append("    textKey: ").append(toIndentedString(textKey)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

