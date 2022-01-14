package com.sleeve.swg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.sleeve.swg.entity.ItemsSpecEntity;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 Mapper 接口
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
public interface ItemsSpecMapper extends BaseMapper<ItemsSpecEntity> {

}
