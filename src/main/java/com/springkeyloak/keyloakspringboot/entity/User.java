package com.springkeyloak.keyloakspringboot.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(
            unique = true,
            nullable = false
    )
    private String username;

    @Column(
            nullable = false
    )
    private String password;

    @Column(nullable = false)
    private String email;

    private String address;

}
