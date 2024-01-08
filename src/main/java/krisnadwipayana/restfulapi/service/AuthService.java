package krisnadwipayana.restfulapi.service;

import krisnadwipayana.restfulapi.model.LoginUserRequest;
import krisnadwipayana.restfulapi.model.TokenResponse;
import krisnadwipayana.restfulapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public TokenResponse login(LoginUserRequest request){

    }
}
