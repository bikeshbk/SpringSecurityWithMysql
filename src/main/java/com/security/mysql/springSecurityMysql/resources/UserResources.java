package com.security.mysql.springSecurityMysql.resources;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserResources {

    @GetMapping("/users")
    public String getUsers(){
        return "Ram Kumar";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/user")
    public String getUser(){
        return "Anil Kapoor";
    }
}
