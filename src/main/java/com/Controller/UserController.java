package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Bean.UserBean;
import com.Repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping()
	public String getUsers() {
		return "Get request was sent";
	}

	@PostMapping
	public String createUser() {
		UserBean userBean = new UserBean();
		userBean.setFirstName("shail");
		userBean.setLastName("patel");
		userBean.setEmail("shaileng181@gmail.com");
		userBean.setPassword("123456");
		userBean.setPhoneNumber("123456789");
		userRepository.save(userBean);
		return "Post request was sent";
	}

	@DeleteMapping
	public String deleteUser() {
		return "Delete request was sent";
	}

	@PutMapping
	public String putUser() {
		return "Put request was sent";
	}

}
