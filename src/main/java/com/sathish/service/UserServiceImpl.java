package com.sathish.service;

import java.util.List;
import java.util.Optional;

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
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	
	}
	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	@Override
	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}
	@Override
	public void updateUser(User user) {
		userRepository.save(user);
	}

}
