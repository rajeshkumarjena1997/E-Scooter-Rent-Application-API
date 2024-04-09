package com.E_Scooter.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_Scooter.Entiti.User;
import com.E_Scooter.Service.UserService;

//UserController.java
@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{embg}")
	public ResponseEntity<User> getUserByEmbq(@PathVariable String embg) {
		User user = userService.getUserByEmbq(embg);
		return ResponseEntity.ok(user);
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}

	@PutMapping("/{embg}")
	public ResponseEntity<User> updateUser(@PathVariable String embg, @RequestBody User user) {
		User updatedUser = userService.updateUser(embg, user);
		return ResponseEntity.ok(updatedUser);
	}

	@DeleteMapping("/{embg}")
	public ResponseEntity<Void> deleteUser(@PathVariable String embg) {
		userService.deleteUser(embg);
		return ResponseEntity.noContent().build();
	}
}
