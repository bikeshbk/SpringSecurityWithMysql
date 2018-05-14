package com.security.mysql.springSecurityMysql.services;

import com.security.mysql.springSecurityMysql.models.CustomUserDetail;
import com.security.mysql.springSecurityMysql.models.UserModels;
import com.security.mysql.springSecurityMysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServices implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModels> optionalUserModels = userRepository.findByUsername(username);
        optionalUserModels.orElseThrow(() -> new UsernameNotFoundException("Username not found"));
        return optionalUserModels.map(CustomUserDetail::new).get();
    }
}
