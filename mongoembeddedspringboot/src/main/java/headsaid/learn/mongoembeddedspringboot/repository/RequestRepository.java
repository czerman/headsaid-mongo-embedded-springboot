package headsaid.learn.mongoembeddedspringboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import headsaid.learn.mongoembeddedspringboot.model.Request;

public interface RequestRepository extends MongoRepository<Request, String> 
{

}
