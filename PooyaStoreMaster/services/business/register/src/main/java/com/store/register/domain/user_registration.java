package com.store.register.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class user_registration {
    @Id
    @GeneratedValue
    private int id;
    @Size(min = 5, message = "less that 3")
    private String name;
    @Size(min = 5, message = "less that 4")
    private String familyname;
    @Size(min = 5, message = "less that 5")
    private String email;
    @Size(min = 7, message = "less that 6")
  //  @Pattern(flags = {""})
    private String password;

    public user_registration() {
    }

    public user_registration( String name, String familyname, String email, String password) {
        this.name = name;
        this.familyname = familyname;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
