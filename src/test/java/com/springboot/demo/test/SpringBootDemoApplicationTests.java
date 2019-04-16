package com.springboot.demo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest (classes = com.springboot.demo.main.SpringBootDemoApplication.class)
public class SpringBootDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
