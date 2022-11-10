package com.example.bookmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmanagementsystem.dao.UserRepository;
import com.example.bookmanagementsystem.entity.Admin;
import com.example.bookmanagementsystem.entity.User;


@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User findUserBynameAndPassword(String name, String password) {
		// TODO Auto-generated method stub
		return userRepository.findUserBynameAndPassword(name,password);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Optional<User> result = userRepository.findById(id);
		
		User theUser=null;
		try {
			if(result.isPresent())
			{
				theUser = result.get();
			}
			else {
				throw new Exception("User id not found : "+id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return theUser;
	}

	@Override
	public User saveUser(@Valid User theUser) throws Exception {
		// TODO Auto-generated method stub
		User result = userRepository.findByName(theUser.getName());
		if (result != null) {
			throw new Exception("Username Already registerd, Try with different username ?");
		} else {
			return userRepository.save(theUser);
		}
	}
	
	

}
