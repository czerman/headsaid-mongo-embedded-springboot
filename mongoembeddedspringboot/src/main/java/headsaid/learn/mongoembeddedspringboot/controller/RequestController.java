package headsaid.learn.mongoembeddedspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import headsaid.learn.mongoembeddedspringboot.service.RequestService;

@RestController
public class RequestController 
{
	@Autowired
	private RequestService requestService;
	
	
	@RequestMapping ("/create")
	public String createRequest (@RequestParam String type,@RequestParam String applicant,@RequestParam String status)
	{
		return requestService.createRequest (  type, applicant, status);
	}
	
	@RequestMapping("/get")
	public String getAll()
	{
		return requestService.getAll();
	}

}
