package com.cjt.quantity.authentication.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Users implements Serializable {
    private String id;

    private String username;

    private String firstName;

    private String lastName;

    private String roles;

    private String country;

    private String lastSeen;

    private Date dateCreated;

    private Login login;

}