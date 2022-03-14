package com.app.stein.model;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.AUTO;

@Entity @Data @AllArgsConstructor @NoArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    private Integer id;
    private String name;
}
