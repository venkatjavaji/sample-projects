package com.venkatj.springmvc.service;

import java.util.List;

import com.venkatj.springmvc.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
