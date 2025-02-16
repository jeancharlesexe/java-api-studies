package br.com.exemplo.studies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // saying "here is a controller"
@RequestMapping("/api/v1/user") // mapping at "user/"
public class UserController {
    @GetMapping // first route as like "user/" -> "/"
    public String index(){
        return "A list of users";
    }

    @GetMapping("/{id}") // using parameters
    public String getUserById(@PathVariable int id) { // path variable is responsible to "look at" parameters
        return "User ID " + id + " found";
    }


}
