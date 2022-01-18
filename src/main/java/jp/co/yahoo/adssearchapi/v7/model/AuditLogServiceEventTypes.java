package jp.co.yahoo.adssearchapi.v7.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * <div lang=\"ja\">AuditLogServiceEventTypesは、操作履歴で取得する操作タイプを表します。</div> <div lang=\"en\">AuditLogServiceEventTypes describes the operation type to be acquired the operation history data.</div> <dl class=term>   <dt class=\"term__item\">ADD</dt>   <dd class=\"term__desc\"><span lang=\"ja\">追加</span><span lang=\"en\">add</span></dd>   <dt class=\"term__item\">SET</dt>   <dd class=\"term__desc\"><span lang=\"ja\">更新</span><span lang=\"en\">update</span></dd>   <dt class=\"term__item\">REMOVE</dt>   <dd class=\"term__desc\"><span lang=\"ja\">削除</span><span lang=\"en\">delete</span></dd>   <dt class=\"term__item\">ALL</dt>   <dd class=\"term__desc\"><span lang=\"ja\">すべての操作タイプ</span><span lang=\"en\">all operation types</span></dd>   <dt class=\"term__item\">UNKNOWN</dt>   <dd class=\"term__desc\"><span lang=\"ja\">未知の値です。</span><span lang=\"en\">Unknown Value</span></dd> </dl> 
 */
public enum AuditLogServiceEventTypes {
  
  ADD("ADD"),
  
  SET("SET"),
  
  REMOVE("REMOVE"),
  
  ALL("ALL"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  AuditLogServiceEventTypes(String value) {
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
  public static AuditLogServiceEventTypes fromValue(String value) {
    for (AuditLogServiceEventTypes b : AuditLogServiceEventTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

