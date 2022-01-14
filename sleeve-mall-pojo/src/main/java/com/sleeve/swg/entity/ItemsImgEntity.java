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
 * 商品图片 
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("mall_items_img")
@ApiModel(value="ItemsImgEntity对象", description="商品图片 ")
public class ItemsImgEntity implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "图片主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品外键id 商品外键id")
    private String itemId;

    @ApiModelProperty(value = "图片地址 图片地址")
    private String url;

    @ApiModelProperty(value = "顺序 图片顺序，从小到大")
    private Integer sort;

    @ApiModelProperty(value = "是否主图 是否主图，1：是，0：否")
    private Integer isMain;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;


}
