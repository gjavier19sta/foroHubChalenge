package com.foroHubChalenge.foroHubChalenge.domain.curso.dto;

import com.foroHubChalenge.foroHubChalenge.domain.curso.Categoria;
import com.foroHubChalenge.foroHubChalenge.domain.curso.Curso;

public record DetalleCursoDTO(
        Long id,
        String name,
        Categoria categoria,
        Boolean activo) {

    public DetalleCursoDTO(Curso curso){
        this(
                curso.getId(),
                curso.getName(),
                curso.getCategoria(),
                curso.getActivo());
    }
}