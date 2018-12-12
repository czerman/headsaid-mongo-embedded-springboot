package headsaid.learn.mongoembeddedspringboot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document

public class Request 
{
	@Id
	private String id;
	private String type;
	private String applicant;
	private String status;
	
	
	public Request()
	{
		
	}
	
	public Request(String type,String applicant,String status)
	{
	
		this.type = type;
		this.status = status;
		this.applicant = applicant;
		
	}
	
	
	
	
	 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		 
		return "[id :"+id+",type:"+type+",status:"+status+",applicant:"+applicant+"]";
	}
	
	
	
	

}
