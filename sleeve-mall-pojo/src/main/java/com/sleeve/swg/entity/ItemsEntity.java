package com.sleeve.swg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_items")
@ApiModel(value="ItemsEntity对象", description="商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表")
public class ItemsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "商品主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品id")
    private String itemId;

    @ApiModelProperty(value = "商品名称 商品名称")
    private String itemName;

    @ApiModelProperty(value = "分类外键id 分类id")
    private Integer catId;

    @ApiModelProperty(value = "一级分类外键id")
    private Integer rootCatId;

    @ApiModelProperty(value = "累计销售 累计销售")
    private Integer sellCounts;

    @ApiModelProperty(value = "上下架状态 上下架状态,1:上架 2:下架")
    private Integer onOffStatus;

    @ApiModelProperty(value = "商品内容 商品内容")
    private String content;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;


}
