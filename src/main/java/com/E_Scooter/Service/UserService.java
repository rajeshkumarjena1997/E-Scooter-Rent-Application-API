package com.E_Scooter.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_Scooter.Entiti.User;
import com.E_Scooter.Exception.ResourceNotFoundException;
import com.E_Scooter.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUserByEmbq(String embg) {
		return userRepository.findById(embg).orElse(null);
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(String embg, User user) {
		if (!userRepository.existsById(embg)) {
			throw new ResourceNotFoundException("User with embg " + embg + " not found");
		}
		user.setEmbg(embg); // Ensure the ID in the request body matches the URL
		return userRepository.save(user);
	}

	public void deleteUser(String embg) {
		if (!userRepository.existsById(embg)) {
			throw new ResourceNotFoundException("User with embg " + embg + " not found");
		}
		userRepository.deleteById(embg);
	}
}
