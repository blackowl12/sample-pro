package kr.co.hta.board.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import kr.co.hta.board.exception.SimpleBoardException;
import kr.co.hta.board.vo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:/META-INF/spring/test-root-context.xml")
@Transactional//커밋 전 상태까지만 실행
public class UserServiceTest {
	@Autowired
	UserService userService;
	
	@Test
	public void testConfig() {
		assertThat(userService, notNullValue());
	}
	
	@Test
	public void testDetailUser() {
		
	}
	
	@Test(expected=SimpleBoardException.class)
	public void testDuplicateUserAdd() {
		User user = new User();
		user.setId("hong");
		user.setPwd("zxcv1234");
		user.setName("홍");	
		
		userService.addNewUser(user);
	}
	
	@Test
	public void testAddNewUser() {
		User user = new User();
		user.setId("moon");
		user.setPwd("zxcv1234");
		user.setName("문");
		
		userService.addNewUser(user);
		User savedUser = userService.getUserDetail(user.getId());
		assertThat(savedUser, notNullValue());
	}
}
