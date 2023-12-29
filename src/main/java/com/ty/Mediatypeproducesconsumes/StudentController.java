package com.ty.Mediatypeproducesconsumes;
import java.awt.PageAttributes.MediaType;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	
	@GetMapping(value="/get",produces =org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public StudentInfo getStudent() 
	{
		return new StudentInfo(1, "ABC", 98.5);	
	}
	
	@PostMapping(value="/save",produces =org.springframework.http.MediaType.APPLICATION_XML_VALUE)
	public String save(String name)
	{
	   return name; 
	}
	
}