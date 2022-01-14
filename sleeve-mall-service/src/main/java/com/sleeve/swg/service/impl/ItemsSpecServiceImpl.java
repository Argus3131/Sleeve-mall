package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.ItemsSpecEntity;
import com.sleeve.swg.mapper.ItemsSpecMapper;
import com.sleeve.swg.service.ItemsSpecService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计 服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class ItemsSpecServiceImpl extends ServiceImpl<ItemsSpecMapper, ItemsSpecEntity> implements ItemsSpecService {

}
