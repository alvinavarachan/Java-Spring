package com.face.dao;

import com.face.model.Login;
import com.face.model.Register;

public interface UserDao {
	
	  void registerUser (Register register);
	  Register validateUser (Login login);
	
}
