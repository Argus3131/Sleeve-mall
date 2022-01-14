package com.sleeve.swg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sleeve.swg.entity.UsersEntity;
import com.sleeve.swg.mapper.UsersMapper;
import com.sleeve.swg.service.UsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表  服务实现类
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, UsersEntity> implements UsersService {
    @Resource
    private UsersMapper usersMapper;

    public void saveParent() {
        UsersEntity userUpdate = new UsersEntity();
        userUpdate.setRealname("张三");
        UpdateWrapper<UsersEntity> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("nickname","imooc");
        usersMapper.update(userUpdate,updateWrapper);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public UsersEntity saveSon() {
        UsersEntity usersEntity = saveSon1();
        int a = 1/0;
        UsersEntity usersEntity2 = saveSon2();
        return usersEntity2;
    }

    public UsersEntity saveSon1() {
        UsersEntity userUpdate = new UsersEntity();
        userUpdate.setRealname("张三");
        UpdateWrapper<UsersEntity> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("nickname","imooc");
        usersMapper.update(userUpdate,updateWrapper);
        return usersMapper.selectOne(new QueryWrapper<UsersEntity>().eq("nickname", "imooc"));
    }

    public UsersEntity saveSon2() {
        UsersEntity userUpdate = new UsersEntity();
        userUpdate.setRealname("李四");
        UpdateWrapper<UsersEntity> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("nickname","imooc");
        usersMapper.update(userUpdate,updateWrapper);
        return usersMapper.selectOne(new QueryWrapper<UsersEntity>().eq("nickname", "imooc"));

    }
}
