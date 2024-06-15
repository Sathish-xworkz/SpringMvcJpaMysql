package com.sathish.service;

import java.util.List;

import com.sathish.entity.User;

public interface UserService {

 void accountCreate(User user);
 List<User> getAllUsers();
	void  deleteUser(int id);
	User getUserById(int id);
	void updateUser(User user);
}
