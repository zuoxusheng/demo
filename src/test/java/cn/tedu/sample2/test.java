package cn.tedu.sample2;

import cn.tedu.sample2.entity.User;
import cn.tedu.sample2.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by ZXS on 2020-07-14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class test {


    @Resource
    UserMapper userMapper;

    @Test
    public void findByUsername() {
        String username = "admin";
        User result = userMapper.findByUsername(username);
        System.err.println(result);
    }

}
