package com.store.register.repository;

import com.store.register.domain.user_registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface UserRegistration extends JpaRepository<user_registration,Integer> {
    public  user_registration findByEmailAndPassword(String name,String nam);
    }

