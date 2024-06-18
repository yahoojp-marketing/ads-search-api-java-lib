/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v14/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v14.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v14.model.Error;
import jp.co.yahoo.adssearchapi.v14.model.LearningDataExclusionServicePage;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * LearningDataExclusionServiceGetResponse
 */
@JsonPropertyOrder({
  LearningDataExclusionServiceGetResponse.JSON_PROPERTY_ERRORS,
  LearningDataExclusionServiceGetResponse.JSON_PROPERTY_RID,
  LearningDataExclusionServiceGetResponse.JSON_PROPERTY_RVAL
})
@JsonTypeName("LearningDataExclusionServiceGetResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LearningDataExclusionServiceGetResponse {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_RID = "rid";
  private String rid;

  public static final String JSON_PROPERTY_RVAL = "rval";
  private LearningDataExclusionServicePage rval;

  public LearningDataExclusionServiceGetResponse() { 
  }

  public LearningDataExclusionServiceGetResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public LearningDataExclusionServiceGetResponse addErrorsItem(Error errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Error> getErrors() {
    return errors;
  }


  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }


  public LearningDataExclusionServiceGetResponse rid(String rid) {
    
    this.rid = rid;
    return this;
  }

   /**
   * Get rid
   * @return rid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRid() {
    return rid;
  }


  @JsonProperty(JSON_PROPERTY_RID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRid(String rid) {
    this.rid = rid;
  }


  public LearningDataExclusionServiceGetResponse rval(LearningDataExclusionServicePage rval) {
    
    this.rval = rval;
    return this;
  }

   /**
   * Get rval
   * @return rval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LearningDataExclusionServicePage getRval() {
    return rval;
  }


  @JsonProperty(JSON_PROPERTY_RVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRval(LearningDataExclusionServicePage rval) {
    this.rval = rval;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningDataExclusionServiceGetResponse learningDataExclusionServiceGetResponse = (LearningDataExclusionServiceGetResponse) o;
    return Objects.equals(this.errors, learningDataExclusionServiceGetResponse.errors) &&
        Objects.equals(this.rid, learningDataExclusionServiceGetResponse.rid) &&
        Objects.equals(this.rval, learningDataExclusionServiceGetResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningDataExclusionServiceGetResponse {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    rid: ").append(toIndentedString(rid)).append("\n");
    sb.append("    rval: ").append(toIndentedString(rval)).append("\n");
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

