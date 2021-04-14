package com.cjt.authentication.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Login {
    private int id;
    private String userId;
    private String email;
    private String password;
    private String salt;
    private Date reminderTokenExpiryDate;
    private String reminderToke;
    private String newemail;
    private String newemailToken;
    private Date newemailTokenExpiryDate;
    private String accessToken;
    private String provider;
}
