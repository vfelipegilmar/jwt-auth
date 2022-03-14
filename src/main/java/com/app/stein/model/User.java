package com.app.stein.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;
import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class User {
    @Id @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}

