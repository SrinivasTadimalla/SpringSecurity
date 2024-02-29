package com.srikar.oauth.controller;

import com.srikar.oauth.response.UserRest;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/keycloak")
public class UsersController {

    @GetMapping("/access/check")
    public String status() {
        return "Srikar KeyCloak Open Id Connect Working";
    }

    @PreAuthorize("hasAuthority('ROLE_developer') #id == #jwt.subject")
    @DeleteMapping(path="/{id}")
    public String deleteUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        System.out.println("Sri Delete User from the UsersController Class");
        return "Deleted user with id " + id + " and JWT Subject " + jwt.getSubject();
    }

    @PostAuthorize("returnObject.userId == #jwt.subject")
    @GetMapping(path="/{id}")
    public UserRest getUser(@PathVariable String id, @AuthenticationPrincipal Jwt jwt) {
        System.out.println("Sri Get User Details..");
        return new UserRest("Lalitha",
                "Tadimalla",
                "064aa58c-4184-44a9-bf37-9f84e823933c");
    }

}


