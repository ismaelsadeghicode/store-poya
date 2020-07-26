package com.store.register.controller;

import com.store.register.repository.UserRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import  com.store.register.domain.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pooya")
public class Test {
    @Autowired
    UserRegistration userRegistration;
    @GetMapping
    public String eth(){
        return "ROLE_user";
    }
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    @PostMapping
    public ResponseEntity save(@Valid @RequestBody user_registration user, BindingResult bindingResult){
if(bindingResult.hasErrors()) {
 return ResponseEntity.ok(bindingResult.getFieldError());
}
else { user.setRole("pooya");
    return ResponseEntity.ok(userRegistration.save(user));
}
    }

    @GetMapping("/login/{name}/{na}")
    public ResponseEntity getinfo(@PathVariable String name,@PathVariable String na){
        return ResponseEntity.ok(userRegistration.findByEmailAndPassword(name,na));
    }

        }