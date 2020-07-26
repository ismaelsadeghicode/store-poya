<<<<<<< HEAD
package com.store.login.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
=======
>>>>>>> 7dbeb2abc1aba7e511083013239cf8a4b6b3e3e0
import javax.persistence.Id;
import javax.persistence.Table;
//git
@Entity
@Table
public class user_registration {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String familyname;
    private String email;
    private String password;
    public String role;
    public user_registration() {
    }
    public user_registration(String name, String familyname, String email, String password) {
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
