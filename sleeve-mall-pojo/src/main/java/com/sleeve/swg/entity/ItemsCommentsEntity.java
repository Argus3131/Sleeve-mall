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
 * 商品评价表 
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_items_comments")
@ApiModel(value="ItemsCommentsEntity对象", description="商品评价表 ")
public class ItemsCommentsEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "id主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户id 用户名须脱敏")
    private String userId;

    @ApiModelProperty(value = "商品id")
    private String itemId;

    @ApiModelProperty(value = "商品名称")
    private String itemName;

    @ApiModelProperty(value = "商品规格id 可为空")
    private String itemSpecId;

    @ApiModelProperty(value = "规格名称 可为空")
    private String sepcName;

    @ApiModelProperty(value = "评价等级 1：好评 2：中评 3：差评")
    private Integer commentLevel;

    @ApiModelProperty(value = "评价内容")
    private String content;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;


}
