package com.niit.backend.dao;

import java.util.List;


import com.niit.backend.model.User;

public interface UserDao {

	public boolean save(User user);

	public boolean update(User user);

	public User findById(int id);

	public boolean delete(User user);

	public List<User> getAllUsers();

}
