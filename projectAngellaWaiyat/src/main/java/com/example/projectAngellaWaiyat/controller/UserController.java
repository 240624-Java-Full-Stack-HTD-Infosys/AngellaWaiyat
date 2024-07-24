package com.example.projectAngellaWaiyat.controller;

import com.example.projectAngellaWaiyat.DTO.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "/users")
//@CrossOrigin(origins = "http://localhost:63342")
public class UserController {

    @PostMapping
    @CrossOrigin
    public UserDTO postuser(@RequestBody UserDTO user){
        if(user != null ){
            user.setLastname("Angella and Waiyat ");
            user.setFirstname("We took over this website !!!");
            user.setAge(20);
            return user;
        }
        return null;
    }

}
