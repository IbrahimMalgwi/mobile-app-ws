package com.ganzymalgwi.mobileappws.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
public class UserDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String EncryptedPassword;
    private String emailVerificationToken;
    private String emailVerificationStatus = "false";
}
