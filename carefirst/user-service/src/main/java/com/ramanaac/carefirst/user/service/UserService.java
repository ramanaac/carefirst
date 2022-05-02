package com.ramanaac.carefirst.user.service;

import com.ramanaac.carefirst.user.VO.Department;
import com.ramanaac.carefirst.user.VO.ResponseTemplateVO;
import com.ramanaac.carefirst.user.entity.User;

import java.util.List;


public interface UserService {


    public User saveUser(User user) ;

    public ResponseTemplateVO getUserWithDepartment(Long userId) ;

    List<User> fetchUserList();

    void deleteUserById(Long departmentId);

    User saveDepartment(User user);
}
