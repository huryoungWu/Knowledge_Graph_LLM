package com.warmer.meta.entity;

import com.warmer.base.common.BaseEntity;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * (MetaDataTable)实体类
 *
 */
@Data
public class MetaDataTable extends BaseEntity implements Serializable {

  private static final long serialVersionUID = 146313789945681038L;
  /**
   * 数据表主键
   */
  private Integer dataTableId;
  /**
   * 数据源id
   */
  private Integer datasourceId;
  /**
   * 表名
   */
  private String dataTableCode;
  /**
   * 表别名
   */
  private String dataTableName;
}
