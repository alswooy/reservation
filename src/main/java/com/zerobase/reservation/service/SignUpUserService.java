package com.zerobase.reservation.service;

import com.zerobase.reservation.model.SignUpForm;
import com.zerobase.reservation.model.User;
import com.zerobase.reservation.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpUserService {
    private final UserRepository userRepository;
    public User signUp(SignUpForm form) {
        return userRepository.save(User.from(form));
    }
}
