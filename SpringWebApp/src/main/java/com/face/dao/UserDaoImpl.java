package com.face.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.activation.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.face.model.Login;
import com.face.model.Register;

public class UserDaoImpl implements UserDao {

	
	DataSource datasource;
	@Autowired
	JdbcTemplate jdbctemplate;

	public void registerUser(Register register) {
		// TODO Auto-generated method stub
		String sql = "insert into register (name, username,email, mobile, password) values (?,?,?,?,?)";

		jdbctemplate.update(sql, new Object[] { register.getName(), register.getUname(), register.getEmail(),
				register.getMob(), register.getPswd() });
	}

	public Register validateUser(Login login) {
		// TODO Auto-generated method stub

		String sql = "select * from register where email= '" + login.getEmail() + "' and password= '" + login.getPswd()
				+ "' ";
		List<Register> reg = jdbctemplate. query (sql, new UserMapper());
		

		return reg.size() > 0 ? reg.get(0) : null ;
		
	}

}




class UserMapper implements RowMapper <Register> 
{
	
	
	public Register mapRow(ResultSet rs, int arg1)

	{
		Register register = new Register();

		register.setName("name");
		register.setUname("uname");
		register.setEmail("email");
		register.setMob("mob");
		register.setPswd("pswd");
		return register;

	}

}
