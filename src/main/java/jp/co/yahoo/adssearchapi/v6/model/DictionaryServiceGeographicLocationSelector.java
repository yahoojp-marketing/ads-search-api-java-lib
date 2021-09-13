package jp.co.yahoo.adssearchapi.v6.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import jp.co.yahoo.adssearchapi.v6.model.DictionaryServiceLang;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;DictionaryServiceGeographicLocationSelectorオブジェクトは、取得したい地域情報に必要な情報を格納します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;DictionaryServiceGeographicLocationSelector contain information to retrieve geographic location information.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">DictionaryServiceGeographicLocationSelectorオブジェクトは、取得したい地域情報に必要な情報を格納します。</div> <div lang=\"en\">DictionaryServiceGeographicLocationSelector contain information to retrieve geographic location information.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class DictionaryServiceGeographicLocationSelector   {
  @JsonProperty("lang")
  private DictionaryServiceLang lang = null;

  public DictionaryServiceGeographicLocationSelector lang(DictionaryServiceLang lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DictionaryServiceLang getLang() {
    return lang;
  }

  public void setLang(DictionaryServiceLang lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DictionaryServiceGeographicLocationSelector dictionaryServiceGeographicLocationSelector = (DictionaryServiceGeographicLocationSelector) o;
    return Objects.equals(this.lang, dictionaryServiceGeographicLocationSelector.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DictionaryServiceGeographicLocationSelector {\n");
    
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

