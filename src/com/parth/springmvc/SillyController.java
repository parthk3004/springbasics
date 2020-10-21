package com.parth.springmvc;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
public class SillyController {
	
	// read a controller method to show initial form
		@RequestMapping("/showForm")
		public String displayForm()
		{
			return "You Silly";
			
		}
	

}
