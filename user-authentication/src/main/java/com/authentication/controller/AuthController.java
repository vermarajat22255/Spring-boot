package com.authentication.controller;

import com.authentication.model.AuthRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @PostMapping
    public String authUser(@RequestBody AuthRequest authRequest){
        return "user";
    }
    @PostMapping("/validate")
    public boolean validateToken(@RequestHeader(value = "Authorization") String authToken){
        return true;
    }

    /*
    authUser(username, password) -->
        1. Validation -- userService getUser should get User
        2. TokenGenerate -- return token
    validateToken(token) -->
        return boolean based on validation logic
    * */
}
