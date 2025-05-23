package com.hjj.lingxibi.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 图表信息表
 * @TableName chart_history
 */
@TableName(value ="chart_history")
@Data
public class ChartHistory implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 图表名称
     */
    private String name;

    /**
     * 分析目标
     */
    private String goal;

    /**
     * 图表数据
     */
    private String chartData;

    /**
     * 图表类型
     */
    private String chartType;

    /**
     * AI生成的图表信息
     */
    private String genChart;

    /**
     * AI生成的分析结果
     */
    private String genResult;

    /**
     * 图表的状态（wait,succeed,failed,running）
     */
    private String status;

    /**
     * 执行信息
     */
    private String execMessage;

    /**
     * 创建的用户Id
     */
    private Long userId;

    /**
     * 关联的图表id
     */
    private Long relatedChartId;

    private Integer type;

    private Integer allowModify;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除（0-不删除 1-删除）
     */
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}