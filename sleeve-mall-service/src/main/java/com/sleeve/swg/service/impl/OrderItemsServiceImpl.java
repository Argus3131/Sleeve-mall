package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.OrderItemsEntity;
import com.sleeve.swg.mapper.OrderItemsMapper;
import com.sleeve.swg.service.OrderItemsService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单商品关联表  服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class OrderItemsServiceImpl extends ServiceImpl<OrderItemsMapper, OrderItemsEntity> implements OrderItemsService {

}
