package com.suresh.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suresh.bindings.User;
import com.suresh.service.RegistrationService;

@RestController
public class RegistrationController {

	@Autowired
	private RegistrationService service;

	@GetMapping("/checkemail/{email}")
	public String emailVerification(@PathVariable("email") String email) {
		boolean uniqueEmail = service.uniqueEmail(email);
		if (uniqueEmail)
			return "Success";
		else
			return "failed";
	}

	@GetMapping("/allCountries")
	public Map<Integer, String> getCountries() {
		return service.getCountries();
	}

	@GetMapping("/states/{countryId}")
	public Map<Integer, String> getStates(@PathVariable("countryId") Integer countryId) {
		return service.getStates(countryId);

	}
	@GetMapping("/cities/{stateId}")
	public Map<Integer, String> getCities(@PathVariable("stateId") Integer stateId) {
		return service.getCities(stateId)	;
	}
	
	@PostMapping("/saveUser")
	public String registerUser(@RequestBody User user) {
		boolean registerUser = service.registerUser(user);
		return registerUser ? "user saved" : "user not saved";
	}
	

}
