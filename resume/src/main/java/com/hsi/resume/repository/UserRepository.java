package com.hsi.resume.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.hsi.resume.model.UserDetails;

public interface UserRepository extends MongoRepository<UserDetails,Integer> {

}
