package com.springreact.reactspring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springreact.reactspring.controller.UserController;
import com.springreact.reactspring.models.User;

@SpringBootTest
class ReactspringApplicationTests {


	@Autowired
	UserController userController;


	@Test
	public void testCreate()
	{
		User user =new User();
		user.setEmail("vijay@gmail.com");
		user.setEmpid("k23335");
		user.setPassword("123456");
		user.setPhone("641350333");
		user.setUsername("Vijay");

		int n=userController.postRegister(user);

		assertEquals(0, n);
	}

	@Test
	public void testLogin()
	{
		User user =new User();
		user.setEmail("vijay@gmail.com");
		user.setPassword("123456");

		int n=userController.postLogin(user);

		assertEquals(1, n);
	}

}
