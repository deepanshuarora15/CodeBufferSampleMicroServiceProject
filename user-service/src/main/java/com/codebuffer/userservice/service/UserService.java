package com.codebuffer.userservice.service;

import com.codebuffer.userservice.VO.Department;
import com.codebuffer.userservice.VO.ResponseTemplateVO;
import com.codebuffer.userservice.entity.User;
import com.codebuffer.userservice.repository.UserRepsoitory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepsoitory userRepsoitory;
    @Autowired
    private RestTemplate restTemplate;
    public User saveUser(User user) {
        return userRepsoitory.save(user);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside ResponseTemplateVO of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        User user = userRepsoitory.findUserById(userId);
        Department department= restTemplate.getForObject("http://localhost:9001/departments/" + user.getDepartmentId(), Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
