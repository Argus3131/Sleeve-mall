package com.sleeve.swg.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sleeve.swg.entity.UsersEntity;

/**
 * <p>
 * 用户表  服务类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
public interface UsersService extends IService<UsersEntity> {

    UsersEntity saveSon();

}
