package com.example.doceria.doce;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "doces")
@Entity(name = "doces")
@Getter //pedindo pro lombok gerar todos os gets e sets
@NoArgsConstructor //declara um constructor que nao recebe nenhum argumento
@EqualsAndHashCode(of="id") //indica que o id é a representação unica do doce

public class Doce {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //primary key
    private String nome;
    private String image;
    private Integer valor;

    public  Doce(DoceRequestDTO data){
        this.image = data.image();
        this.valor = data.valor();
        this.nome = data.nome();
    }
}
