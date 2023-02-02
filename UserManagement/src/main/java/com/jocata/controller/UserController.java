package com.jocata.controller;

import com.jocata.entity.UserDetails;
import com.jocata.request.UserRequest;
import com.jocata.request.response.UserResponse;
import com.jocata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/saveUser")
    public ResponseEntity<?> userSave(@RequestBody UserRequest request){
        UserDetails details=new UserDetails();
        details.setUserFname(request.getUserFname());
        details.setUserLname(request.getUserLname());
        details.setUserMobile(request.getUserMobile());
        details.setUserEmailId(request.getUserEmailId());
        details.setUserName(request.getUserName());
        details.setUserPassword(request.getUserPassword());
        userService.save(details);

        UserResponse response=new UserResponse();
        response.setUserId(details.getUserId());
        response.setUserFname(details.getUserFname());
        response.setUserLname(details.getUserLname());
        response.setUserMobile(details.getUserMobile());
        response.setUserEmailId(details.getUserEmailId());
        response.setUserName(details.getUserName());
        response.setUserPassword(details.getUserPassword());
        response.setResult("Record successfully saved in Database: "+details.getUserId());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping("/userUpdate")
    public ResponseEntity<?> userUpdate(@RequestBody UserRequest request){
        UserDetails details=new UserDetails();
        details.setUserId(request.getUserId());
        details.setUserFname(request.getUserFname());
        details.setUserLname(request.getUserLname());
        details.setUserMobile(request.getUserMobile());
        details.setUserEmailId(request.getUserEmailId());
        details.setUserName(request.getUserName());
        details.setUserPassword(request.getUserPassword());
        userService.update(details);

        UserResponse response=new UserResponse();
        response.setUserId(details.getUserId());
        response.setUserFname(details.getUserFname());
        response.setUserLname(details.getUserLname());
        response.setUserMobile(details.getUserMobile());
        response.setUserEmailId(details.getUserEmailId());
        response.setUserName(details.getUserName());
        response.setUserPassword(details.getUserPassword());
        response.setResult("Update successfully saved in Database: "+details.getUserId());

        return new ResponseEntity<>(response, HttpStatus.OK);

    }
    @DeleteMapping("/deleteUser")
    public ResponseEntity<?> userDelete(@RequestBody UserRequest request){
        UserDetails details=new UserDetails();
        details.setUserId(request.getUserId());
        userService.delete(request.getUserId());

        UserResponse response=new UserResponse();
        response.setUserId(details.getUserId());
        response.setResult("Successfully Delete Record : " +details.getUserId());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/getAllUser")
    public ResponseEntity<?> getAllUser(){
        List<UserDetails> list=userService.loadEntityByHql();
        return new ResponseEntity<List<UserDetails>>(list,HttpStatus.OK);
    }
//    @GetMapping("/getById/{id}")
//    public UserDetails get(@PathVariable int id){
//        UserDetails userDetails = userService.getEntityById(id);
//        if(userDetails==null) {
//            throw new RuntimeException("User with id " + id + " is not found");
//        }
//        return userDetails;
//    }
    @GetMapping("getById")
    public ResponseEntity<?> getUserId(@RequestBody UserRequest request){
        UserDetails details=new UserDetails();
        details.setUserId(request.getUserId());
       details= userService.getById(request.getUserId());

        UserResponse response=new UserResponse();
        response.setUserId(details.getUserId());
        response.setUserFname(details.getUserFname());
        response.setUserLname(details.getUserLname());
        response.setUserMobile(details.getUserMobile());
        response.setUserEmailId(details.getUserEmailId());
        response.setUserName(details.getUserName());
        response.setUserPassword(details.getUserPassword());

        response.setResult("UserDetails Access With Id "+details.getUserId());

        return new ResponseEntity<UserResponse>(response,HttpStatus.OK);

    }
    @GetMapping("getUserByName")
    public ResponseEntity<?> getUserByName(@RequestBody UserRequest request){
        UserDetails details = new UserDetails();

        details.setUserName(request.getUserName());

        details=userService.getEntityByName(request.getUserName());

        UserResponse response=new UserResponse();
        response.setUserId(details.getUserId());
        response.setUserFname(details.getUserFname());
        response.setUserLname(details.getUserLname());
        response.setUserMobile(details.getUserMobile());
        response.setUserEmailId(details.getUserEmailId());
        response.setUserName(details.getUserName());
        response.setUserPassword(details.getUserPassword());

        response.setResult("User information got whatever you want to see "+details.getUserId());

        return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
    }

}
