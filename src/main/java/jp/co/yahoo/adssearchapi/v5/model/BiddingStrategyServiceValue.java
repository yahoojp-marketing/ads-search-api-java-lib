package jp.co.yahoo.adssearchapi.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import jp.co.yahoo.adssearchapi.v5.model.BiddingStrategy;
import jp.co.yahoo.adssearchapi.v5.model.Error;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * &lt;div lang&#x3D;\&quot;ja\&quot;&gt;BiddingStrategyServiceValueオブジェクトは、自動入札設定の実行をしたときの結果に関する情報を表します。&lt;/div&gt; &lt;div lang&#x3D;\&quot;en\&quot;&gt;BiddingStrategyServiceValue object displays the results of auto bidding settings.&lt;/div&gt; 
 */
@ApiModel(description = "<div lang=\"ja\">BiddingStrategyServiceValueオブジェクトは、自動入札設定の実行をしたときの結果に関する情報を表します。</div> <div lang=\"en\">BiddingStrategyServiceValue object displays the results of auto bidding settings.</div> ")

public class BiddingStrategyServiceValue   {
  @JsonProperty("biddingStrategy")
  private JsonNullable<BiddingStrategy> biddingStrategy = JsonNullable.undefined();

  @JsonProperty("errors")
  @Valid
  private JsonNullable<List<Error>> errors = JsonNullable.undefined();

  @JsonProperty("operationSucceeded")
  private JsonNullable<Boolean> operationSucceeded = JsonNullable.undefined();

  public BiddingStrategyServiceValue biddingStrategy(BiddingStrategy biddingStrategy) {
    this.biddingStrategy = JsonNullable.of(biddingStrategy);
    return this;
  }

  /**
   * Get biddingStrategy
   * @return biddingStrategy
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<BiddingStrategy> getBiddingStrategy() {
    return biddingStrategy;
  }

  public void setBiddingStrategy(JsonNullable<BiddingStrategy> biddingStrategy) {
    this.biddingStrategy = biddingStrategy;
  }

  public BiddingStrategyServiceValue errors(List<Error> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public BiddingStrategyServiceValue addErrorsItem(Error errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<List<Error>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<Error>> errors) {
    this.errors = errors;
  }

  public BiddingStrategyServiceValue operationSucceeded(Boolean operationSucceeded) {
    this.operationSucceeded = JsonNullable.of(operationSucceeded);
    return this;
  }

  /**
   * <div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">Result of process.<br>- true: Process succeeded.<br>- false: Process failed.</div> 
   * @return operationSucceeded
  */
  @ApiModelProperty(value = "<div lang=\"ja\">処理結果です。trueの場合は、処理は成功しました。falseの場合は処理が失敗しています。</div> <div lang=\"en\">Result of process.<br>- true: Process succeeded.<br>- false: Process failed.</div> ")


  public JsonNullable<Boolean> getOperationSucceeded() {
    return operationSucceeded;
  }

  public void setOperationSucceeded(JsonNullable<Boolean> operationSucceeded) {
    this.operationSucceeded = operationSucceeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiddingStrategyServiceValue biddingStrategyServiceValue = (BiddingStrategyServiceValue) o;
    return Objects.equals(this.biddingStrategy, biddingStrategyServiceValue.biddingStrategy) &&
        Objects.equals(this.errors, biddingStrategyServiceValue.errors) &&
        Objects.equals(this.operationSucceeded, biddingStrategyServiceValue.operationSucceeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biddingStrategy, errors, operationSucceeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiddingStrategyServiceValue {\n");
    
    sb.append("    biddingStrategy: ").append(toIndentedString(biddingStrategy)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    operationSucceeded: ").append(toIndentedString(operationSucceeded)).append("\n");
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

