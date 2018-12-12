package headsaid.learn.mongoembeddedspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import headsaid.learn.mongoembeddedspringboot.model.Request;
import headsaid.learn.mongoembeddedspringboot.repository.RequestRepository;

@Service
public class RequestService 
{
	@Autowired
	private RequestRepository requestRepository;
	
	
	public String createRequest (String type,String applicant,String status)
	{
		 
		return requestRepository.insert(new Request( type, applicant, status)).toString();
		 
	}
	
	public String getAll()
	{
		StringBuffer result = new StringBuffer("");
		
		List<Request> requests = requestRepository.findAll();
		
		for(Request r : requests)
		{
			result.append(r.toString() +"  \n\r");
		}
		
		
		return result.toString();
			
	}

}
