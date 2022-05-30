package com.springkeyloak.keyloakspringboot.controller;

import com.springkeyloak.keyloakspringboot.entity.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    @GetMapping("/users")
    ResponseEntity<?> getUsers() {

        return ResponseEntity.ok().contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                .body(User.builder()
                        .name("Malaka")
                        .build());
    }

    @GetMapping("/admin")
    ResponseEntity<?> getAdmin() {

        return ResponseEntity.ok().contentType(MediaType.valueOf(MediaType.APPLICATION_JSON_VALUE))
                .body(User.builder()
                        .name("Sanduni")
                        .build());
    }
}
