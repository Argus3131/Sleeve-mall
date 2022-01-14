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

/**
 * <p>
 * 订单商品关联表 
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_order_items")
@ApiModel(value="OrderItemsEntity对象", description="订单商品关联表 ")
public class OrderItemsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "归属订单id")
    private String orderId;

    @ApiModelProperty(value = "商品id")
    private String itemId;

    @ApiModelProperty(value = "商品图片")
    private String itemImg;

    @ApiModelProperty(value = "商品名称")
    private String itemName;

    @ApiModelProperty(value = "规格id")
    private String itemSpecId;

    @ApiModelProperty(value = "规格名称")
    private String itemSpecName;

    @ApiModelProperty(value = "成交价格")
    private Integer price;

    @ApiModelProperty(value = "购买数量")
    private Integer buyCounts;


}
