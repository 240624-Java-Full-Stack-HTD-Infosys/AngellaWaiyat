package com.example.projectAngellaWaiyat.controller;

import com.example.projectAngellaWaiyat.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "/user")
public class UserController {

    @PostMapping
    @CrossOrigin
    public UserDTO postuser(@RequestBody UserDTO user){
        if(user != null ){
            user.setLastname("funny");
            user.setFirstname("so");
            user.setAge(20);
            return user;
        }
        return null;
    }

}
