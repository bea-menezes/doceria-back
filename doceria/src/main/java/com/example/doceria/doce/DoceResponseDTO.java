package com.example.doceria.doce;

public record DoceResponseDTO(Long id, String name, String image, Integer valor) {

    public DoceResponseDTO(Doce doce){
        this(doce.getId(), doce.getNome(), doce.getImage(), doce.getValor());
    }

}
