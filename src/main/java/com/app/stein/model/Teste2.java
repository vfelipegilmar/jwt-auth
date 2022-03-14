package com.app.stein.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "teste")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Teste2 {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private String nome;

}
