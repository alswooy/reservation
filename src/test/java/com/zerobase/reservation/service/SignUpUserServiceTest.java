package com.zerobase.reservation.service;

import com.zerobase.reservation.model.SignUpForm;
import com.zerobase.reservation.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class SignUpUserServiceTest {
    @Autowired
    private SignUpUserService service;

    @Test
    void signUp() {
        SignUpForm from = SignUpForm.builder()
            .name("name")
            .email("abc@gmail.com")
            .password("1")
            .phone("01000000000")
            .build();
        User user = service.signUp(from);
        assertNotNull(user.getId());
        assertNotNull(user.getName());
        Assert.isTrue(user.getId() != null);


    }
}