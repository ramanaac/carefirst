package com.ramanaac.carefirst.user.controller;

import com.ramanaac.carefirst.user.VO.ResponseTemplateVO;
import com.ramanaac.carefirst.user.entity.User;
import com.ramanaac.carefirst.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
        log.info("Inside getUserWithDepartment of UserController");
        return userService.getUserWithDepartment(userId);
    }

    @GetMapping("")
    public List<User> fetchUserList() {
        return userService.fetchUserList();
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable("id") Long departmentId) {
        userService.deleteUserById(departmentId);
        return "Users deleted Successfully!!";
    }

//    @PostMapping("/dept/")
//    public User saveDepartment(@Valid @RequestBody User user) {
//        log.info("Inside save user of UserController");
//        return userService.saveDepartment(user);
//    }

}
