package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ValidatorInstantiationTest {

    @Autowired
    private DemoEntityRepository demoEntityRepository;

    @Test
    public void shouldInitiateAndCallDemoEntityValidator() {
        DemoEntity demoEntity = new DemoEntity();
        demoEntityRepository.save(demoEntity);
    }

}