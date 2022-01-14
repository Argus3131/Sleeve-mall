package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.ItemsEntity;
import com.sleeve.swg.mapper.ItemsMapper;
import com.sleeve.swg.service.ItemsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 商品信息相关表：分类表，商品图片表，商品规格表，商品参数表 服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class ItemsServiceImpl extends ServiceImpl<ItemsMapper, ItemsEntity> implements ItemsService {

}
