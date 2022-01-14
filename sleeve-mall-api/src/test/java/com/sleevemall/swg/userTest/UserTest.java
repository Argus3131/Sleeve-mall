package com.sleevemall.swg.userTest;

import com.sleeve.SleeveApplication;
import com.sleeve.swg.controller.UsersController;
import com.sleeve.swg.entity.UsersEntity;
import com.sleeve.swg.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Argus
 * @className UserTest
 * @description: TODO
 * @date 2022/1/14 16:30
 * @Version V1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SleeveApplication.class)
public class UserTest {
    @Autowired
    private UsersService usersService;


    @Test
    public void testUpdatePropagationREQUIRED() {
        UsersEntity usersEntity = usersService.saveSon();
        System.out.println(usersEntity);
    }
}