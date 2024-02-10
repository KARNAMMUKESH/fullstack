package com.birthdayeventmanagement.mukesh.config;

import static com.birthdayeventmanagement.mukesh.enumerated.Role.ADMIN;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.birthdayeventmanagement.mukesh.Repository.UserRepository;
import com.birthdayeventmanagement.mukesh.model.User;

import lombok.RequiredArgsConstructor;


@Component  //creating a container inside spring bean
@RequiredArgsConstructor //final key word
@SuppressWarnings("")
public class UserCLI implements CommandLineRunner {
    
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @SuppressWarnings("null")
    @Override
    public void run(String... args) throws Exception {
        if (userRepository.count()>0) 
            return;
        
        var user=User.builder() //import user from usermodel
            .name("mukesh")
            .email("mukesh@gmail.com")
            .password(passwordEncoder.encode("12345"))
            .role(ADMIN)
            .build();
        
        userRepository.save(user);
    }
}
