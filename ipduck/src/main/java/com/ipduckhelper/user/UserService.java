package com.ipduckhelper.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public User mainSer(User entity) {
		entity.setOffset(0);
		User U = userRepository.mainRep(entity);
		System.out.println(entity);
		return U;
	}
}
