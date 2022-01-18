package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;KeywordPlanIdeaServiceSiteSeedオブジェクトは、キーワード候補作成条件としてサイト（ドメインURL）を指定するオブジェクトです。&lt;br&gt;seedTypeが&lt;code&gt;SITE&lt;/code&gt;の場合は必須です。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;KeywordPlanIdeaServiceSiteSeed object is for specifying site (domain URL) as related keywords creation conditions.&lt;br&gt;If seedType is &lt;code&gt;SITE&lt;/code&gt;, this field is required.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">KeywordPlanIdeaServiceSiteSeedオブジェクトは、キーワード候補作成条件としてサイト（ドメインURL）を指定するオブジェクトです。<br>seedTypeが<code>SITE</code>の場合は必須です。</div> <div lang=\"en\">KeywordPlanIdeaServiceSiteSeed object is for specifying site (domain URL) as related keywords creation conditions.<br>If seedType is <code>SITE</code>, this field is required.</div> ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public class KeywordPlanIdeaServiceSiteSeed   {
  @JsonProperty("site")
  private String site = null;

  public KeywordPlanIdeaServiceSiteSeed site(String site) {
    this.site = site;
    return this;
  }

  /**
   * <div lang=\"ja\">サイト（ドメインURL）です。</div> <div lang=\"en\">Site (domain URL).</div> 
   * @return site
  */
  @ApiModelProperty(value = "<div lang=\"ja\">サイト（ドメインURL）です。</div> <div lang=\"en\">Site (domain URL).</div> ")


  public String getSite() {
    return site;
  }

  public void setSite(String site) {
    this.site = site;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordPlanIdeaServiceSiteSeed keywordPlanIdeaServiceSiteSeed = (KeywordPlanIdeaServiceSiteSeed) o;
    return Objects.equals(this.site, keywordPlanIdeaServiceSiteSeed.site);
  }

  @Override
  public int hashCode() {
    return Objects.hash(site);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordPlanIdeaServiceSiteSeed {\n");
    
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
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

