package com.cg.bookstore.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

import java.util.Objects;


public class UserDTO {

    /*
    regex for email
    *1) A-Z characters allowed
    2) a-z characters allowed
    3) 0-9 numbers allowed
    4) Additionally email may contain only dot(.), dash(-) and underscore(_)
    5) Rest all characters are not allowed
    * */
    @Email(regexp = "^[A-Za-z0-9+_.-]+@(.+)$")
    @NotBlank(message = "email cant be null")
    private String email;

    /*
    *     ^ represents starting character of the string.
    (?=.*[0-9]) represents a digit must occur at least once.
    (?=.*[a-z]) represents a lower case alphabet must occur at least once.
    (?=.*[A-Z]) represents an upper case alphabet that must occur at least once.
    (?=.*[@#$%^&-+=()] represents a special character that must occur at least once.
    (?=\\S+$) white spaces don’t allowed in the entire string.
    .{8,} represents at least 8 characters.
    $ represents the end of the string.
    * */
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[#$@!%&*?])[A-Za-z\\d#$@!%&*?]{8,}$", message = "password must be within given parameters")
    @NotBlank(message = "password cant be null")
    private String password;
    private String role;


    public UserDTO() {
    }

    public UserDTO(String email, String password, String role) {
        this.email = email;
        this.password = password;
        this.role = role;
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

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
