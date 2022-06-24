package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomeUserDetailService implements UserDetailsService {

    private final AuthRepo authRepo;

    public CustomeUserDetailService(AuthRepo authRepo) {
        this.authRepo = authRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = authRepo.findAuthByUsername(username);
        if(username == null){
            throw new UsernameNotFoundException("User not found");
        }
        return new CustomeUserDetails(user);
    }
}
