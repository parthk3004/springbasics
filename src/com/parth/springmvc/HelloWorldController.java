package com.parth.springmvc;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
// read a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "Helloworld-form";
		
	}
	//read contrtoller method to process the html form

	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
		
	}
	
	// new controller method to read from data and to add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShout( HttpServletRequest request,Model model)
	{
		//read the request parameter from the html form 
		
		String theName = request.getParameter("studentname");
		
		// convert the data to all caps
		
		theName = theName.toUpperCase();
		
		//create message
		
		String result = "Yo1 " + theName;
		
		//add message to model
		
		model.addAttribute("message", result);
	
		return "helloworld";

	}
	
	// using requestparameter
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree( @RequestParam("studentname")String theName,Model model)
	{	
		// convert the data to all caps
		
		theName = theName.toUpperCase();
		
		//create message
		
		String result = "HEY! " + theName;
		
		//add message to model
		
		model.addAttribute("message", result);
	
		return "helloworld";

	}
	
}