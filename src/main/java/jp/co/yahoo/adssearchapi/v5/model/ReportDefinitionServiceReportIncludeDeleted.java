package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">ReportDefinitionServiceReportIncludeDeletedオブジェクトは、削除済みの項目をレポートに出力するかを選択します。<br> レポートタイプがCAMPAIGN, ADGROUP, AD, KEYWORDS, FEED_ITEM, AD_CUSTOMIZERS, WEBPAGE_CRITERIONの場合のみ、ADD時にこのフィールドは省略可能となります。<br> それ以外のレポートタイプの場合、ADD時、このフィールドは無視されます。<br> reportIncludeDeletedがFALSEの場合、以下エンティティはレポートに出力されません。</div> <div lang=\"en\">ReportDefinitionServiceReportIncludeDeleted object describes whether to output deleted items on the report or not.<br> If the report type is CAMPAIGN, ADGROUP, AD, KEYWORDS, FEED_ITEM, AD_CUSTOMIZERS or WEBPAGE_CRITERION, this field is optional in ADD operation.<br> For other report type, this field will be ignored in ADD operation.<br> If reportIncludeDeleted is \"FALSE\", the following entities will not be output in the report. </div> <table border=\"1\"> <tr><th>reportType</th><th>entity</th></tr> <tr><td>CAMPAIGN</td><td>CAMPAIGN</td></tr> <tr><td>ADGROUP</td><td>CAMPAIGN, ADGROUP</td></tr> <tr><td>AD</td><td>CAMPAIGN, ADGROUP, AD</td></tr> <tr><td>KEYWORD</td><td>CAMPAIGN, ADGROUP, KEYWORD</td></tr> <tr><td>FEED_ITEM</td><td>FEED_ITEM</td></tr> <tr><td>AD_CUSTOMIZERS</td><td>FEED_ITEM</td></tr> <tr><td>WEBPAGE_CRITERION</td><td>CAMPAIGN, ADGROUP, CRITERION</td></tr> </table> <dl class=term>   <dt class=\"term__item\">TRUE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">出力します。<br>※デフォルトに設定されます。</span><span lang=\"en\">Output.<br>*Default setting.</span></dd>   <dt class=\"term__item\">FALSE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">出力しません。</span><span lang=\"en\">Do not output.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum ReportDefinitionServiceReportIncludeDeleted {
  
  TRUE("TRUE"),
  
  FALSE("FALSE"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReportDefinitionServiceReportIncludeDeleted(String value) {
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
  public static ReportDefinitionServiceReportIncludeDeleted fromValue(String value) {
    for (ReportDefinitionServiceReportIncludeDeleted b : ReportDefinitionServiceReportIncludeDeleted.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

