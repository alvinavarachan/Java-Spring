package com.face.service;



import org.springframework.beans.factory.annotation.Autowired;

import com.face.dao.UserDao;
import com.face.model.Login;
import com.face.model.Register;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;        // Creating object same as that of Bean id
	
	public void registerUser(Register register) {
		// TODO Auto-generated method stub
		userDao.registerUser(register);
		
	}

	public Register validateUser(Login login) {
		// TODO Auto-generated method stub
		
		return userDao.validateUser(login);
	}

	

	
	

}
