package com.faith.app.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.faith.app.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query("FROM User WHERE userName=?1 and password=?2 and isActive=true")
	public User findUserByUsernameAndPassword(String userName,String password);

}
