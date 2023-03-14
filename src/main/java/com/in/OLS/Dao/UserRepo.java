package com.in.OLS.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//import com.in.OLS.entity.UserPK;
import com.in.OLS.entity.*;;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	//@Query(value ="SELECT  FROM User u WHERE u.user =:user and u.Password= :password",nativeQuery = true)
	//public List<String> findByUserAndPassword(@Param("user") String user,@Param("password")String password);

	Optional<User> findByUsername(String username);
}

