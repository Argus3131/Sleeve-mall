package com.sleeve.swg.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 轮播图 
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_carousel")
@ApiModel(value="CarouselEntity对象", description="轮播图 ")
public class CarouselEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "图片 图片地址")
    private String imageUrl;

    @ApiModelProperty(value = "背景色")
    private String backgroundColor;

    @ApiModelProperty(value = "商品id 商品id")
    private String itemId;

    @ApiModelProperty(value = "商品分类id 商品分类id")
    private String catId;

    @ApiModelProperty(value = "轮播图类型 轮播图类型，用于判断，可以根据商品id或者分类进行页面跳转，1：商品 2：分类")
    private Integer type;

    @ApiModelProperty(value = "轮播图展示顺序")
    private Integer sort;

    @ApiModelProperty(value = "是否展示")
    private Integer isShow;

    @ApiModelProperty(value = "创建时间 创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "更新时间 更新")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;


}
