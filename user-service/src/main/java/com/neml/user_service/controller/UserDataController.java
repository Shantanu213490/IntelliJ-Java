package com.neml.user_service.controller;

import com.neml.user_service.model.UserDataResponse;
import com.neml.user_service.model.UserModel;
import com.neml.user_service.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @PostMapping("/add")
    public ResponseEntity<UserDataResponse> CreateUser(@RequestBody UserModel userModel){
        UserDataResponse userDataResponse = userDataService.saveUserData(userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDataResponse);

    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserModel> getUserById(@PathVariable String userId){
        UserModel userModel = userDataService.getUserDataByUserId(userId);
        return ResponseEntity.ok(userModel);

    }

    @GetMapping("/getAll")
    public ResponseEntity<List<UserModel>> getAllUsers(){
        List<UserModel> userModels = userDataService.getAllUserData();
        return ResponseEntity.ok(userModels);

    }
}
