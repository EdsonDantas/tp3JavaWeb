package br.edu.infnet.springsecurity.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.infnet.springsecurity.model.User;
import br.edu.infnet.springsecurity.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}
