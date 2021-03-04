package com.example.mybatisplus.demo;

import com.example.mybatisplus.demo.mapper.BladeCodeMapper;
import com.example.mybatisplus.demo.model.BladeCode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest

class DemoBaseApplicationTests {

    @Autowired
    private BladeCodeMapper bladeCodeMapper;

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        List<BladeCode> bladeCodes = bladeCodeMapper.selectList(null);
        System.out.println("bladeCodes = " + bladeCodes);
    }

}
