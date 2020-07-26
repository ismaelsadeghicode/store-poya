package com.store.login.repository;

import com.store.login.domain.user_registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRegistration extends JpaRepository<user_registration,Integer> {
    public  user_registration findByEmailAndPassword(String name,String nam);
    }

