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
 * 订单表;
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_orders")
@ApiModel(value="OrdersEntity对象", description="订单表;")
public class OrdersEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "订单主键")
    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    @ApiModelProperty(value = "商户订单号")
    private String merchantOrderId;

    @ApiModelProperty(value = "商户方的发起用户的用户主键id")
    private String merchantUserId;

    @ApiModelProperty(value = "实际支付总金额（包含商户所支付的订单费邮费总额）")
    private Integer amount;

    @ApiModelProperty(value = "支付方式")
    private Integer payMethod;

    @ApiModelProperty(value = "支付状态 10：未支付 20：已支付 30：支付失败 40：已退款")
    private Integer payStatus;

    @ApiModelProperty(value = "从哪一端来的，比如从天天吃货这门实战过来的")
    private String comeFrom;

    @ApiModelProperty(value = "支付成功后的通知地址，这个是开发者那一段的，不是第三方支付通知的地址")
    private String returnUrl;

    @ApiModelProperty(value = "逻辑删除状态;1: 删除 0:未删除")
    private Integer isDelete;

    @ApiModelProperty(value = "创建时间（成交时间）")
    private Date createdTime;


}
