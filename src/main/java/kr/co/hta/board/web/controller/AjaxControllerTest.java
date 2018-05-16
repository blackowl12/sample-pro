package kr.co.hta.board.web.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.hta.board.vo.User;

public class AjaxControllerTest {
	
	@RequestMapping("/user.do")
	public @ResponseBody User getUser() {
		User user = null;
		/*User user = new User();
		user.setId("hong");
		user.setPwd("zxcv1234");
		user.setName("홍길동");*/
		return user;
	}
	
	/*@RequestMapping("/user2.do")
	@ResponseBody
	public User getUser2() {
		User user = new User();
		user.setId("hong");
		user.setPwd("zxcv1234");
		user.setName("홍길동");
		return user;
	}*/
	
	@RequestMapping("/user2.do")
	public @ResponseBody ResponseEntity<User> getUser2() {
		//응답 컨텐츠 있는 경우
		User user = new User();
		user.setId("hong");
		user.setPwd("zxcv1234");
		user.setName("홍길동");
		//return new ResponseEntity<User>(user, HttpStatus.OK);
		
		//없는 경우
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping("/user3.do")
	public @ResponseBody Map<String, Object> getUser3() {
		Map<String, Object> map = new HashMap<>();
		User user = new User();
		user.setId("hong");
		user.setPwd("zxcv1234");
		user.setName("홍길동");

		if(user != null) {
			map.put("success", true);
			map.put("items",Arrays.asList(user));
		} else {
			map.put("success", false);
		}
		
		return map;
	}
}
