package com.template.lml.demo.domain;

import com.template.lml.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class TestTemplate {
    @Autowired
    YamlEntity yamlEntity;


    @Test
    public void test() throws ClassNotFoundException {
        User user=new User();
        user.setAccount(222L);

        System.out.println(user.getAccount());
        System.out.println(yamlEntity.getStr());
    }


}
