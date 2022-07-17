package net.psentaur.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.psentaur.springboot.model.User;
import net.psentaur.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
