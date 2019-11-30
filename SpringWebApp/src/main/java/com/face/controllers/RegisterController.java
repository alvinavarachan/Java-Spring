package com.face.controllers;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.face.model.Login;
import com.face.model.Register;
import com.face.service.UserService;

@Controller
public class RegisterController {
	
@Autowired
UserService userService;   // Creating object same as that of Bean id


	//Action performed when page loads and redirect to home page 

	@RequestMapping(value="/")
	public ModelAndView first() {

		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	
	// Action performed when we click the home button and redirect to home page 
	
	@RequestMapping(value = "/home")

	public ModelAndView home() {

		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	

	
	// Action performed when we click the register button and redirect to register page 
	
	@RequestMapping(value = "/register" )

	public ModelAndView register() {

		ModelAndView mv = new ModelAndView("register");
		return mv;
	}

	
	// Action performed when we click the login button and redirect to login page 
	
	@RequestMapping(value = "/login")

	public ModelAndView login() {

		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	
	// Action performed when we click the register submit button
	
	@RequestMapping(value="/registerprocess", method = RequestMethod.POST)
	public ModelAndView adduser(HttpServletRequest request,HttpServletResponse response,Register register)
	{
		//Collect Data from form and send to bo class
		
		userService.registerUser(register);
		return new ModelAndView("welcome","name",register.getUname());
	}
	
	
	

	//Action Performed when we click Login Submit button 
	
	@RequestMapping(value="/loginprocess",method = RequestMethod.POST)
	public ModelAndView loginprocess(HttpServletRequest request,HttpServletResponse response, Login login)
	{
		ModelAndView mv=null;
		Register register = userService.validateUser(login);
		if(null!= register)
		{
			//when data is available redirect to home page with username
			
			mv=new ModelAndView("welcome");
			mv.addObject("name", login.getEmail());
			
		}
		else
		{
			//when data is not available redirect to login page with Error
			
			
			mv=new ModelAndView("login");
			mv.addObject("message","User name or password is wrong !");
		}
		return mv;
	}
	
	

}
