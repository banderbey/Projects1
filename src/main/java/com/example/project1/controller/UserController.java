package com.example.project1.controller;


import com.example.project1.model.UserDAO;
import com.example.project1.model.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class UserController {

    private  final UserRepository userRepository;
    //private final UserService userService;

    @PostMapping(path = "/addUser")
    public ResponseEntity<String> addUser(@RequestBody UserDAO userDAO){
     // userService.addUser(userDTO);
        userRepository.save(userDAO);
      return ResponseEntity.ok("User saved");
    }
}
