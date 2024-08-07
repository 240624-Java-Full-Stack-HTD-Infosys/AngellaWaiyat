package com.example.projectAngellaWaiyat.controller;

import com.example.projectAngellaWaiyat.DTO.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "/user")
public class UserController {

    @PostMapping
    @CrossOrigin
    @ResponseStatus(HttpStatus.OK)
    public UserDTO postUser(@RequestBody UserDTO user){
        if(user != null ){
            user.setLastname("funny");
            user.setFirstname("so");
            user.setAge(20);
            return user;
        }
        return null;
    }

}
