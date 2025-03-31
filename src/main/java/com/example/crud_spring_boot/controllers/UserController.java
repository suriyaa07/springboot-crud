package com.example.crud_spring_boot.controllers;

import com.example.crud_spring_boot.models.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    //get method
    @GetMapping("/getmethod")
    public String getHelloWorld(){
        return "Helo , this is GET method";
    }

    //post method
    @PostMapping("/postmethod")
    public String postData(@RequestBody String Message){
        return "Received Message says : " + Message;

    }

    //bringing user data
    @GetMapping("/user")
    public List<User> userFunction(){
       return Arrays.asList(new User(9L, "John" , "john123@gmail.com"),
               new User(18L, "SkullX2" , "skullskull999@gmail.com"),
               new User(27L, "MattMurdock" , "mmdk666@gmail.com"),
               new User(99L, "DuckDumbbell" , "dumble222@gmail.com"));
    }


}
