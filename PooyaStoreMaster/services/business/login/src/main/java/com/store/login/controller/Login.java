package com.store.login.controller;

import com.store.login.client.RemoteCallService;
import com.store.login.domain.user_registration;
import com.store.login.repository.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class Login {
    @Autowired
    UserRegistration userRegistration;
    @GetMapping("/{name}/{na}")
    public ResponseEntity getinfo(@PathVariable String name, @PathVariable String na){
        return ResponseEntity.ok(userRegistration.findByEmailAndPassword(name,na));
    }

}
