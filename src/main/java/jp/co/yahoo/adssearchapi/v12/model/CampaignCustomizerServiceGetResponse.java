/*
 * Yahoo!広告 検索広告 API リファレンス / Yahoo! JAPAN Ads Search Ads API Reference
 * <div lang=\"ja\">Yahoo!広告 検索広告 APIのWebサービスについて説明します。</div> <div lang=\"en\">Search Ads API Web Services supported in Yahoo! JAPAN Ads API.</div> <div><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/design/v12/Route.yaml\">OpenAPI Specification</a></div> <div lang=\"ja\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/ja\">Best Practice</a></div> <div lang=\"en\"><a target=\"_blank\" href=\"https://github.com/yahoojp-marketing/ads-search-api-documents/blob/master/bestpractice/en\">Best Practice</a></div> 
 *
 * The version of the OpenAPI document: v12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.yahoo.adssearchapi.v12.model;

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
import jp.co.yahoo.adssearchapi.v12.model.CampaignCustomizerServicePage;
import jp.co.yahoo.adssearchapi.v12.model.Error;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CampaignCustomizerServiceGetResponse
 */
@JsonPropertyOrder({
  CampaignCustomizerServiceGetResponse.JSON_PROPERTY_ERRORS,
  CampaignCustomizerServiceGetResponse.JSON_PROPERTY_RID,
  CampaignCustomizerServiceGetResponse.JSON_PROPERTY_RVAL
})
@JsonTypeName("CampaignCustomizerServiceGetResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignCustomizerServiceGetResponse {
  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<Error> errors = null;

  public static final String JSON_PROPERTY_RID = "rid";
  private String rid;

  public static final String JSON_PROPERTY_RVAL = "rval";
  private CampaignCustomizerServicePage rval;

  public CampaignCustomizerServiceGetResponse() { 
  }

  public CampaignCustomizerServiceGetResponse errors(List<Error> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignCustomizerServiceGetResponse addErrorsItem(Error errorsItem) {
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


  public CampaignCustomizerServiceGetResponse rid(String rid) {
    
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


  public CampaignCustomizerServiceGetResponse rval(CampaignCustomizerServicePage rval) {
    
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

  public CampaignCustomizerServicePage getRval() {
    return rval;
  }


  @JsonProperty(JSON_PROPERTY_RVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRval(CampaignCustomizerServicePage rval) {
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
    CampaignCustomizerServiceGetResponse campaignCustomizerServiceGetResponse = (CampaignCustomizerServiceGetResponse) o;
    return Objects.equals(this.errors, campaignCustomizerServiceGetResponse.errors) &&
        Objects.equals(this.rid, campaignCustomizerServiceGetResponse.rid) &&
        Objects.equals(this.rval, campaignCustomizerServiceGetResponse.rval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, rid, rval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCustomizerServiceGetResponse {\n");
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

