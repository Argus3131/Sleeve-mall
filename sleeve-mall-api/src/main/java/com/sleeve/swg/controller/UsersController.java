package com.sleeve.swg.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sleeve.swg.entity.UsersEntity;
import com.sleeve.swg.service.UsersService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 用户表  前端控制器
 * </p>
 *
 * @author argus
 * @since 2022-01-13
 */
@RestController
@RequestMapping("/swg")
public class UsersController {
    private UsersService usersService;

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @ApiOperation(value = "查找全部用户 测试接口")
    @GetMapping("/all")
    public List<UsersEntity> findAll() {
        List<UsersEntity> list = usersService.list();
        return list;
    }

    /**
     * 如果其他bean调用这个方法,在其他bean中声明事务,
     * 那就用事务.如果其他bean没有声明事务,那就不用事务
     * @param name
     * @return
     */
    @Transactional(propagation = Propagation.SUPPORTS)
    @ApiOperation(value = "通过姓名查询用户 测试接口")
    @PostMapping("/find/{name}")
    public UsersEntity findUserByName(@ApiParam(name = "name", value = "需要查询的用户名称", required = true)
                                          @PathVariable("name") String name) {
        QueryWrapper<UsersEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("username",name);
        UsersEntity usersEntity = usersService.getOne(wrapper);
        return usersEntity;
    }

    @ApiOperation(value = "通过姓名更新用户 测试接口")
    @PostMapping("/update/{name}")
    public UsersEntity updateUser(@ApiParam(name = "name", value = "需要查询的用户名称", required = true)
                                      @PathVariable("name") String name) {
        UsersEntity usersEntity = usersService.saveSon();
        return usersEntity;
    }
}

