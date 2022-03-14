package com.app.stein.model;

import lombok.*;
import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;

@Entity @Data @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Teste {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
}
