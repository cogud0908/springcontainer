package com.douzone.springcontainer;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.douzone.springcontainer.user.User;

import config.user.AppConfig01;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig01.class)
public class MainTest {
	
	@Autowired
	private User user;
	
	@Test
	public void testUserNotNull() {
		assertNotNull(user);
	}
}
