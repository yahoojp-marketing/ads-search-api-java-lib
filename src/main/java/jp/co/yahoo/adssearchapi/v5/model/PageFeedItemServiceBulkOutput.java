package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">PageFeedItemServiceBulkOutputは、ページフィードアイテムファイル形式を指定します。<br> このフィールドは省略可能です。<br>デフォルト設定値はCSVとなります。</div> <div lang=\"en\">PageFeedItemServiceBulkOutput specifies format of Page feed item file.<br> This field is optional.<br> The default value will be CSV.</div> <dl class=term>   <dt class=\"term__item\">CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">CSV形式</span><span lang=\"en\">Format of CSV</span></dd>   <dt class=\"term__item\">TSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">TSV形式</span><span lang=\"en\">Format of TSV</span></dd>   <dt class=\"term__item\">ZIPPED_CSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP圧縮されたCSV形式</span><span lang=\"en\">Zipped CSV.</span></dd>   <dt class=\"term__item\">ZIPPED_TSV</dt>   <dd class=\"term__desc\"><span lang=\"ja\">ZIP圧縮されたTSV形式</span><span lang=\"en\">Zipped TSV.</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum PageFeedItemServiceBulkOutput {
  
  CSV("CSV"),
  
  TSV("TSV"),
  
  ZIPPED_CSV("ZIPPED_CSV"),
  
  ZIPPED_TSV("ZIPPED_TSV"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  PageFeedItemServiceBulkOutput(String value) {
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
  public static PageFeedItemServiceBulkOutput fromValue(String value) {
    for (PageFeedItemServiceBulkOutput b : PageFeedItemServiceBulkOutput.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

