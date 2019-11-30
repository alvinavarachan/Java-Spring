package com.face.service;

import com.face.model.Login;
import com.face.model.Register;

public interface UserService {

	void registerUser(Register register);

	Register validateUser(Login login);

}
