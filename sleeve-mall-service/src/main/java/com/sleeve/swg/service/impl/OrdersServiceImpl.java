package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.OrdersEntity;
import com.sleeve.swg.mapper.OrdersMapper;
import com.sleeve.swg.service.OrdersService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表; 服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, OrdersEntity> implements OrdersService {

}
