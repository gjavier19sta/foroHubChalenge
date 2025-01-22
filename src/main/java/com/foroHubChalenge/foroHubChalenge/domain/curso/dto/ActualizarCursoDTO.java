package com.foroHubChalenge.foroHubChalenge.domain.curso.dto;

import com.foroHubChalenge.foroHubChalenge.domain.curso.Categoria;

public record ActualizarCursoDTO(
        String name,
        Categoria categoria,
        Boolean activo) {
}