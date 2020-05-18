package com.example.conferencemanagementsystem.model;

import com.example.conferencemanagementsystem.model.dto.UserDto;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class User {
    @Id
    private String username;
    private String password;

    public User(int id, String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public User(UserDto userDto) {
        this.username=userDto.getUsername();
        this.password=userDto.getPassword();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
