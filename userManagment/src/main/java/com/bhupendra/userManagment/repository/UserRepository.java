package com.bhupendra.userManagment.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.bhupendra.userManagment.entity.User;


public interface UserRepository extends MongoRepository<User, String> {

}
