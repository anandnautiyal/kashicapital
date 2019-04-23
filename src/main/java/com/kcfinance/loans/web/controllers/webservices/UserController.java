package com.kcfinance.loans.web.controllers.webservices;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kcfinance.loans.Exceptions.UserNotFoundException;
import com.kcfinance.loans.app.modals.Lead;
import com.kcfinance.loans.app.modals.User;
import com.kcfinance.loans.dao.LeadRepository;
import com.kcfinance.loans.dao.UserRepository;

@RestController
public class UserController {

	private final LeadRepository leadReposittory;

	UserController(LeadRepository leadReposittory) {
		this.leadReposittory = leadReposittory;
	}

	// Aggregate root
	@GetMapping("/leads")
	List<Lead> all() {
		return leadReposittory.findAll();
	}

	/*@PostMapping("/users")
	User newUser(@RequestBody User newUser) {
		return userRepository.save(newUser);
	}

	@GetMapping("/users/{id}")
	User one(@PathVariable Long id) {

		return userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}
*/
	/*@PutMapping("/users/{id}")
	User replaceUser(@RequestBody User newUser, @PathVariable Long id) {		
		return userRepository.findById(id).map(user -> {
			user.setFirstName(newUser.getFirstName());
			user.setLastName(newUser.getLastName());
			user.setUsername(newUser.getUsername());
			user.setPassword(newUser.getPassword());			
			return userRepository.save(user);
		}).orElseGet(() -> {
			newUser.setId(id);
			return userRepository.save(newUser);
		});
	}
*/
	/*@DeleteMapping("/users/{id}")
	void deleteUser(@PathVariable Long id) {
		userRepository.deleteById(id);
	}*/
}
