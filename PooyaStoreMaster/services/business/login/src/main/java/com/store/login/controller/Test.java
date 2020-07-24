package com.store.login.controller;

import com.store.login.client.RemoteCallService;
import com.store.login.domain.user_registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class Test {
    @Autowired
    RemoteCallService service;

    @GetMapping
    public String met(){
        return service.get();
    }
    @GetMapping("/{name}/{na}")
    public user_registration getinformation(@PathVariable String name,@PathVariable String na){
    return service.getlogininfo(name,na);
}
}
