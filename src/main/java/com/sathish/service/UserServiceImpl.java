package com.sathish.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathish.entity.User;
import com.sathish.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;// internall SimpleJpaRepositor run time 
	@Override
	public void accountCreate(User user) {
		userRepository.save(user);
	}

}
