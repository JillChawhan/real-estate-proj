package com.axis.realestatesellerservice.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axis.realestatesellerservice.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository<UserDetails, Long> {
	@Modifying
	@Query("UPDATE UserDetails SET firstName=?1,lastName=?2,emailId=?3,phoneNumber=?4,password=?5 WHERE userId=?6")
	public void updateUserInfo(String firstName, String lastName, String emailId, 
			String phoneNumber, String password,
			long userId);

}
