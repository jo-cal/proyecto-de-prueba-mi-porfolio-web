/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.porfolioweb.porfolio.security;

import javax.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;

/**
 *
 * @author Nueva
 */
public class AuthRequest {
    
    @Email
    @Length(min = 5, max = 50)
    private String email;
    @Length(min = 5, max = 50)
    private String password;

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
